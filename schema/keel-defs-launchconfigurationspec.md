# Untitled object in DeliveryConfig Schema

```txt
https://keel-prestaging.us-west-2.spinnaker.mgmt.netflix.net/schema/#/$defs/ClusterSpec/properties/launchConfiguration
```




| Abstract            | Extensible | Status         | Identifiable | Custom Properties | Additional Properties | Access Restrictions | Defined In                                                    |
| :------------------ | ---------- | -------------- | ------------ | :---------------- | --------------------- | ------------------- | ------------------------------------------------------------- |
| Can be instantiated | No         | Unknown status | No           | Forbidden         | Allowed               | none                | [keel.schema.json\*](keel.schema.json "open original schema") |

## launchConfiguration Type

`object` ([Details](keel-defs-launchconfigurationspec.md))

# undefined Properties

| Property                                  | Type      | Required | Nullable       | Defined by                                                                                                                                                                                                                    |
| :---------------------------------------- | --------- | -------- | -------------- | :---------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------- |
| [image](#image)                           | `object`  | Optional | cannot be null | [DeliveryConfig](keel-defs-virtualmachineimage.md "https&#x3A;//keel-prestaging.us-west-2.spinnaker.mgmt.netflix.net/schema/#/$defs/LaunchConfigurationSpec/properties/image")                                                |
| [instanceType](#instanceType)             | `string`  | Optional | cannot be null | [DeliveryConfig](keel-defs-launchconfigurationspec-properties-instancetype.md "https&#x3A;//keel-prestaging.us-west-2.spinnaker.mgmt.netflix.net/schema/#/$defs/LaunchConfigurationSpec/properties/instanceType")             |
| [ebsOptimized](#ebsOptimized)             | `boolean` | Optional | cannot be null | [DeliveryConfig](keel-defs-launchconfigurationspec-properties-ebsoptimized.md "https&#x3A;//keel-prestaging.us-west-2.spinnaker.mgmt.netflix.net/schema/#/$defs/LaunchConfigurationSpec/properties/ebsOptimized")             |
| [iamRole](#iamRole)                       | `string`  | Optional | cannot be null | [DeliveryConfig](keel-defs-launchconfigurationspec-properties-iamrole.md "https&#x3A;//keel-prestaging.us-west-2.spinnaker.mgmt.netflix.net/schema/#/$defs/LaunchConfigurationSpec/properties/iamRole")                       |
| [keyPair](#keyPair)                       | `string`  | Optional | cannot be null | [DeliveryConfig](keel-defs-launchconfigurationspec-properties-keypair.md "https&#x3A;//keel-prestaging.us-west-2.spinnaker.mgmt.netflix.net/schema/#/$defs/LaunchConfigurationSpec/properties/keyPair")                       |
| [instanceMonitoring](#instanceMonitoring) | `boolean` | Optional | cannot be null | [DeliveryConfig](keel-defs-launchconfigurationspec-properties-instancemonitoring.md "https&#x3A;//keel-prestaging.us-west-2.spinnaker.mgmt.netflix.net/schema/#/$defs/LaunchConfigurationSpec/properties/instanceMonitoring") |
| [ramdiskId](#ramdiskId)                   | `string`  | Optional | cannot be null | [DeliveryConfig](keel-defs-launchconfigurationspec-properties-ramdiskid.md "https&#x3A;//keel-prestaging.us-west-2.spinnaker.mgmt.netflix.net/schema/#/$defs/LaunchConfigurationSpec/properties/ramdiskId")                   |

## image




`image`

-   is optional
-   Type: `object` ([Details](keel-defs-virtualmachineimage.md))
-   cannot be null
-   defined in: [DeliveryConfig](keel-defs-virtualmachineimage.md "https&#x3A;//keel-prestaging.us-west-2.spinnaker.mgmt.netflix.net/schema/#/$defs/LaunchConfigurationSpec/properties/image")

### image Type

`object` ([Details](keel-defs-virtualmachineimage.md))

## instanceType




`instanceType`

-   is optional
-   Type: `string`
-   cannot be null
-   defined in: [DeliveryConfig](keel-defs-launchconfigurationspec-properties-instancetype.md "https&#x3A;//keel-prestaging.us-west-2.spinnaker.mgmt.netflix.net/schema/#/$defs/LaunchConfigurationSpec/properties/instanceType")

### instanceType Type

`string`

## ebsOptimized




`ebsOptimized`

-   is optional
-   Type: `boolean`
-   cannot be null
-   defined in: [DeliveryConfig](keel-defs-launchconfigurationspec-properties-ebsoptimized.md "https&#x3A;//keel-prestaging.us-west-2.spinnaker.mgmt.netflix.net/schema/#/$defs/LaunchConfigurationSpec/properties/ebsOptimized")

### ebsOptimized Type

`boolean`

## iamRole




`iamRole`

-   is optional
-   Type: `string`
-   cannot be null
-   defined in: [DeliveryConfig](keel-defs-launchconfigurationspec-properties-iamrole.md "https&#x3A;//keel-prestaging.us-west-2.spinnaker.mgmt.netflix.net/schema/#/$defs/LaunchConfigurationSpec/properties/iamRole")

### iamRole Type

`string`

## keyPair




`keyPair`

-   is optional
-   Type: `string`
-   cannot be null
-   defined in: [DeliveryConfig](keel-defs-launchconfigurationspec-properties-keypair.md "https&#x3A;//keel-prestaging.us-west-2.spinnaker.mgmt.netflix.net/schema/#/$defs/LaunchConfigurationSpec/properties/keyPair")

### keyPair Type

`string`

## instanceMonitoring




`instanceMonitoring`

-   is optional
-   Type: `boolean`
-   cannot be null
-   defined in: [DeliveryConfig](keel-defs-launchconfigurationspec-properties-instancemonitoring.md "https&#x3A;//keel-prestaging.us-west-2.spinnaker.mgmt.netflix.net/schema/#/$defs/LaunchConfigurationSpec/properties/instanceMonitoring")

### instanceMonitoring Type

`boolean`

## ramdiskId




`ramdiskId`

-   is optional
-   Type: `string`
-   cannot be null
-   defined in: [DeliveryConfig](keel-defs-launchconfigurationspec-properties-ramdiskid.md "https&#x3A;//keel-prestaging.us-west-2.spinnaker.mgmt.netflix.net/schema/#/$defs/LaunchConfigurationSpec/properties/ramdiskId")

### ramdiskId Type

`string`
