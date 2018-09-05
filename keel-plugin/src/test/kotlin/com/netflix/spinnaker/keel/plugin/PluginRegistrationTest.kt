package com.netflix.spinnaker.keel.plugin

import com.netflix.appinfo.InstanceInfo
import com.netflix.discovery.EurekaClient
import com.netflix.spinnaker.keel.api.GrpcStubManager
import com.netflix.spinnaker.keel.api.TypeMetadata
import com.netflix.spinnaker.keel.api.engine.PluginRegistryGrpc
import com.netflix.spinnaker.keel.api.engine.PluginRegistryGrpc.PluginRegistryImplBase
import com.netflix.spinnaker.keel.api.engine.RegisterAssetPluginRequest
import com.netflix.spinnaker.keel.api.engine.RegisterAssetPluginResponse
import com.netflix.spinnaker.keel.api.instanceInfo
import com.netflix.spinnaker.keel.platform.NoSuchVip
import com.nhaarman.mockito_kotlin.doReturn
import com.nhaarman.mockito_kotlin.doThrow
import com.nhaarman.mockito_kotlin.mock
import com.nhaarman.mockito_kotlin.reset
import com.nhaarman.mockito_kotlin.whenever
import io.grpc.stub.StreamObserver
import org.junit.jupiter.api.AfterEach
import org.junit.jupiter.api.BeforeEach
import org.junit.jupiter.api.Test
import strikt.api.expect
import strikt.assertions.containsExactlyInAnyOrder
import strikt.assertions.isEmpty
import strikt.assertions.throws

val registerSuccess = RegisterAssetPluginResponse.newBuilder().setSucceeded(true).build()

internal class PluginRegistrationTest {

  val grpc = GrpcStubManager(PluginRegistryGrpc::newBlockingStub)

  val registeredTypes = mutableListOf<String>()
  val registry: PluginRegistryImplBase = object : PluginRegistryImplBase() {
    override fun registerAssetPlugin(request: RegisterAssetPluginRequest, responseObserver: StreamObserver<RegisterAssetPluginResponse>) {
      registeredTypes.addAll(request.typesList.map(TypeMetadata::getKind))
      with(responseObserver) {
        onNext(registerSuccess)
        onCompleted()
      }
    }
  }
  val keelRegistryVip = "keel-test"
  val eurekaClient: EurekaClient = mock()
  val amazonAssetPlugin = mock<AssetPlugin>()
  val instanceInfo = InstanceInfo.Builder.newBuilder().run {
    setAppName("keelplugins")
    setASGName("keelplugins-test-aws-v005")
    setVIPAddress("keelplugins-test-aws")
    build()
  }
  lateinit var registrar: PluginRegistrar

  @BeforeEach
  fun startRegistry() {
    grpc.startServer {
      addService(registry)
    }
    whenever(amazonAssetPlugin.supportedTypes) doReturn listOf(
      "aws.SecurityGroup",
      "aws.ClassicLoadBalancer"
    ).map(::typeMetadataForKind)

    registrar = PluginRegistrar(
      eurekaClient,
      listOf(amazonAssetPlugin),
      keelRegistryVip,
      grpc.port,
      instanceInfo
    )
  }

  @AfterEach
  fun stopRegistry() {
    grpc.stopServer()
    reset(eurekaClient)
  }

  @Test
  fun `registers plugins on startup`() {
    whenever(eurekaClient.getNextServerFromEureka(keelRegistryVip, false)) doReturn grpc.instanceInfo

    registrar.onDiscoveryUp()

    expect(registeredTypes)
      .containsExactlyInAnyOrder(
        "aws.SecurityGroup",
        "aws.ClassicLoadBalancer"
      )
  }

  @Test
  fun `throws exception if Keel VIP is invalid`() {
    whenever(eurekaClient.getNextServerFromEureka(keelRegistryVip, false)) doThrow RuntimeException("No matches for the virtual host name :$keelRegistryVip")

    expect {
      registrar.onDiscoveryUp()
    }.throws<NoSuchVip>()

    expect(registeredTypes).isEmpty()
  }
}

fun typeMetadataForKind(it: String) =
  TypeMetadata.newBuilder().setKind(it).build()