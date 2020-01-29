# DeliveryConfig Schema

```txt
https://keel-prestaging.us-west-2.spinnaker.mgmt.netflix.net/schema/
```




| Abstract            | Extensible | Status         | Identifiable | Custom Properties | Additional Properties | Access Restrictions | Defined In                                                  |
| :------------------ | ---------- | -------------- | ------------ | :---------------- | --------------------- | ------------------- | ----------------------------------------------------------- |
| Can be instantiated | No         | Unknown status | No           | Forbidden         | Allowed               | none                | [keel.schema.json](keel.schema.json "open original schema") |

## DeliveryConfig Type

`object` ([DeliveryConfig](keel.md))

# DeliveryConfig Definitions

## Definitions group Action

Reference this group by using

```json
{"$ref":"https://keel-prestaging.us-west-2.spinnaker.mgmt.netflix.net/schema/#/$defs/Action"}
```

| Property                            | Type     | Required | Nullable       | Defined by                                                                                                                                                                            |
| :---------------------------------- | -------- | -------- | -------------- | :------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------ |
| [type](#type)                       | `string` | Required | cannot be null | [DeliveryConfig](keel-defs-action-properties-type.md "https&#x3A;//keel-prestaging.us-west-2.spinnaker.mgmt.netflix.net/schema/#/$defs/Action/properties/type")                       |
| [order](#order)                     | `number` | Required | cannot be null | [DeliveryConfig](keel-defs-action-properties-order.md "https&#x3A;//keel-prestaging.us-west-2.spinnaker.mgmt.netflix.net/schema/#/$defs/Action/properties/order")                     |
| [targetGroupName](#targetGroupName) | `string` | Required | cannot be null | [DeliveryConfig](keel-defs-action-properties-targetgroupname.md "https&#x3A;//keel-prestaging.us-west-2.spinnaker.mgmt.netflix.net/schema/#/$defs/Action/properties/targetGroupName") |
| [redirectConfig](#redirectConfig)   | `object` | Optional | cannot be null | [DeliveryConfig](keel-defs-redirectconfig.md "https&#x3A;//keel-prestaging.us-west-2.spinnaker.mgmt.netflix.net/schema/#/$defs/Action/properties/redirectConfig")                     |

### type




`type`

-   is required
-   Type: `string`
-   cannot be null
-   defined in: [DeliveryConfig](keel-defs-action-properties-type.md "https&#x3A;//keel-prestaging.us-west-2.spinnaker.mgmt.netflix.net/schema/#/$defs/Action/properties/type")

#### type Type

`string`

### order




`order`

-   is required
-   Type: `number`
-   cannot be null
-   defined in: [DeliveryConfig](keel-defs-action-properties-order.md "https&#x3A;//keel-prestaging.us-west-2.spinnaker.mgmt.netflix.net/schema/#/$defs/Action/properties/order")

#### order Type

`number`

### targetGroupName




`targetGroupName`

-   is required
-   Type: `string`
-   cannot be null
-   defined in: [DeliveryConfig](keel-defs-action-properties-targetgroupname.md "https&#x3A;//keel-prestaging.us-west-2.spinnaker.mgmt.netflix.net/schema/#/$defs/Action/properties/targetGroupName")

#### targetGroupName Type

`string`

### redirectConfig




`redirectConfig`

-   is optional
-   Type: `object` ([Details](keel-defs-redirectconfig.md))
-   cannot be null
-   defined in: [DeliveryConfig](keel-defs-redirectconfig.md "https&#x3A;//keel-prestaging.us-west-2.spinnaker.mgmt.netflix.net/schema/#/$defs/Action/properties/redirectConfig")

#### redirectConfig Type

`object` ([Details](keel-defs-redirectconfig.md))

## Definitions group ApplicationLoadBalancerSpec

Reference this group by using

```json
{"$ref":"https://keel-prestaging.us-west-2.spinnaker.mgmt.netflix.net/schema/#/$defs/ApplicationLoadBalancerSpec"}
```

| Property                      | Type      | Required | Nullable       | Defined by                                                                                                                                                                                                                |
| :---------------------------- | --------- | -------- | -------------- | :------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------ |
| [moniker](#moniker)           | `object`  | Required | cannot be null | [DeliveryConfig](keel-defs-moniker.md "https&#x3A;//keel-prestaging.us-west-2.spinnaker.mgmt.netflix.net/schema/#/$defs/ApplicationLoadBalancerSpec/properties/moniker")                                                  |
| [locations](#locations)       | `object`  | Required | cannot be null | [DeliveryConfig](keel-defs-subnetawarelocations.md "https&#x3A;//keel-prestaging.us-west-2.spinnaker.mgmt.netflix.net/schema/#/$defs/ApplicationLoadBalancerSpec/properties/locations")                                   |
| [internal](#internal)         | `boolean` | Optional | cannot be null | [DeliveryConfig](keel-defs-applicationloadbalancerspec-properties-internal.md "https&#x3A;//keel-prestaging.us-west-2.spinnaker.mgmt.netflix.net/schema/#/$defs/ApplicationLoadBalancerSpec/properties/internal")         |
| [dependencies](#dependencies) | `object`  | Optional | cannot be null | [DeliveryConfig](keel-defs-loadbalancerdependencies.md "https&#x3A;//keel-prestaging.us-west-2.spinnaker.mgmt.netflix.net/schema/#/$defs/ApplicationLoadBalancerSpec/properties/dependencies")                            |
| [idleTimeout](#idleTimeout)   | `string`  | Optional | cannot be null | [DeliveryConfig](keel-defs-applicationloadbalancerspec-properties-idletimeout.md "https&#x3A;//keel-prestaging.us-west-2.spinnaker.mgmt.netflix.net/schema/#/$defs/ApplicationLoadBalancerSpec/properties/idleTimeout")   |
| [listeners](#listeners)       | `array`   | Required | cannot be null | [DeliveryConfig](keel-defs-applicationloadbalancerspec-properties-listeners.md "https&#x3A;//keel-prestaging.us-west-2.spinnaker.mgmt.netflix.net/schema/#/$defs/ApplicationLoadBalancerSpec/properties/listeners")       |
| [targetGroups](#targetGroups) | `array`   | Required | cannot be null | [DeliveryConfig](keel-defs-applicationloadbalancerspec-properties-targetgroups.md "https&#x3A;//keel-prestaging.us-west-2.spinnaker.mgmt.netflix.net/schema/#/$defs/ApplicationLoadBalancerSpec/properties/targetGroups") |
| [overrides](#overrides)       | `object`  | Optional | cannot be null | [DeliveryConfig](keel-defs-applicationloadbalancerspec-properties-overrides.md "https&#x3A;//keel-prestaging.us-west-2.spinnaker.mgmt.netflix.net/schema/#/$defs/ApplicationLoadBalancerSpec/properties/overrides")       |

### moniker




`moniker`

-   is required
-   Type: `object` ([Details](keel-defs-moniker.md))
-   cannot be null
-   defined in: [DeliveryConfig](keel-defs-moniker.md "https&#x3A;//keel-prestaging.us-west-2.spinnaker.mgmt.netflix.net/schema/#/$defs/ApplicationLoadBalancerSpec/properties/moniker")

#### moniker Type

`object` ([Details](keel-defs-moniker.md))

### locations




`locations`

-   is required
-   Type: `object` ([Details](keel-defs-subnetawarelocations.md))
-   cannot be null
-   defined in: [DeliveryConfig](keel-defs-subnetawarelocations.md "https&#x3A;//keel-prestaging.us-west-2.spinnaker.mgmt.netflix.net/schema/#/$defs/ApplicationLoadBalancerSpec/properties/locations")

#### locations Type

`object` ([Details](keel-defs-subnetawarelocations.md))

### internal




`internal`

-   is optional
-   Type: `boolean`
-   cannot be null
-   defined in: [DeliveryConfig](keel-defs-applicationloadbalancerspec-properties-internal.md "https&#x3A;//keel-prestaging.us-west-2.spinnaker.mgmt.netflix.net/schema/#/$defs/ApplicationLoadBalancerSpec/properties/internal")

#### internal Type

`boolean`

### dependencies




`dependencies`

-   is optional
-   Type: `object` ([Details](keel-defs-loadbalancerdependencies.md))
-   cannot be null
-   defined in: [DeliveryConfig](keel-defs-loadbalancerdependencies.md "https&#x3A;//keel-prestaging.us-west-2.spinnaker.mgmt.netflix.net/schema/#/$defs/ApplicationLoadBalancerSpec/properties/dependencies")

#### dependencies Type

`object` ([Details](keel-defs-loadbalancerdependencies.md))

### idleTimeout




`idleTimeout`

-   is optional
-   Type: `string`
-   cannot be null
-   defined in: [DeliveryConfig](keel-defs-applicationloadbalancerspec-properties-idletimeout.md "https&#x3A;//keel-prestaging.us-west-2.spinnaker.mgmt.netflix.net/schema/#/$defs/ApplicationLoadBalancerSpec/properties/idleTimeout")

#### idleTimeout Type

`string`

#### idleTimeout Constraints

**duration**: the string must be a duration string, according to [RFC 3339, section 5.6](https://tools.ietf.org/html/rfc3339 "check the specification")

### listeners




`listeners`

-   is required
-   Type: `object[]` ([Details](keel-defs-listener.md))
-   cannot be null
-   defined in: [DeliveryConfig](keel-defs-applicationloadbalancerspec-properties-listeners.md "https&#x3A;//keel-prestaging.us-west-2.spinnaker.mgmt.netflix.net/schema/#/$defs/ApplicationLoadBalancerSpec/properties/listeners")

#### listeners Type

`object[]` ([Details](keel-defs-listener.md))

#### listeners Constraints

**unique items**: all items in this array must be unique. Duplicates are not allowed.

### targetGroups




`targetGroups`

-   is required
-   Type: `object[]` ([Details](keel-defs-targetgroup.md))
-   cannot be null
-   defined in: [DeliveryConfig](keel-defs-applicationloadbalancerspec-properties-targetgroups.md "https&#x3A;//keel-prestaging.us-west-2.spinnaker.mgmt.netflix.net/schema/#/$defs/ApplicationLoadBalancerSpec/properties/targetGroups")

#### targetGroups Type

`object[]` ([Details](keel-defs-targetgroup.md))

#### targetGroups Constraints

**unique items**: all items in this array must be unique. Duplicates are not allowed.

### overrides




`overrides`

-   is optional
-   Type: `object` ([Details](keel-defs-applicationloadbalancerspec-properties-overrides.md))
-   cannot be null
-   defined in: [DeliveryConfig](keel-defs-applicationloadbalancerspec-properties-overrides.md "https&#x3A;//keel-prestaging.us-west-2.spinnaker.mgmt.netflix.net/schema/#/$defs/ApplicationLoadBalancerSpec/properties/overrides")

#### overrides Type

`object` ([Details](keel-defs-applicationloadbalancerspec-properties-overrides.md))

## Definitions group ArtifactImageProvider

Reference this group by using

```json
{"$ref":"https://keel-prestaging.us-west-2.spinnaker.mgmt.netflix.net/schema/#/$defs/ArtifactImageProvider"}
```

| Property                              | Type    | Required | Nullable       | Defined by                                                                                                                                                                                                            |
| :------------------------------------ | ------- | -------- | -------------- | :-------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------- |
| [deliveryArtifact](#deliveryArtifact) | Merged  | Required | cannot be null | [DeliveryConfig](keel-defs-deliveryartifact.md "https&#x3A;//keel-prestaging.us-west-2.spinnaker.mgmt.netflix.net/schema/#/$defs/ArtifactImageProvider/properties/deliveryArtifact")                                  |
| [artifactStatuses](#artifactStatuses) | `array` | Optional | cannot be null | [DeliveryConfig](keel-defs-artifactimageprovider-properties-artifactstatuses.md "https&#x3A;//keel-prestaging.us-west-2.spinnaker.mgmt.netflix.net/schema/#/$defs/ArtifactImageProvider/properties/artifactStatuses") |

### deliveryArtifact




`deliveryArtifact`

-   is required
-   Type: merged type ([Details](keel-defs-deliveryartifact.md))
-   cannot be null
-   defined in: [DeliveryConfig](keel-defs-deliveryartifact.md "https&#x3A;//keel-prestaging.us-west-2.spinnaker.mgmt.netflix.net/schema/#/$defs/ArtifactImageProvider/properties/deliveryArtifact")

#### deliveryArtifact Type

merged type ([Details](keel-defs-deliveryartifact.md))

one (and only one) of

-   [Untitled object in DeliveryConfig](keel-defs-debianartifact.md "check type definition")
-   [Untitled object in DeliveryConfig](keel-defs-dockerartifact.md "check type definition")

### artifactStatuses




`artifactStatuses`

-   is optional
-   Type: unknown\[]
-   cannot be null
-   defined in: [DeliveryConfig](keel-defs-artifactimageprovider-properties-artifactstatuses.md "https&#x3A;//keel-prestaging.us-west-2.spinnaker.mgmt.netflix.net/schema/#/$defs/ArtifactImageProvider/properties/artifactStatuses")

#### artifactStatuses Type

unknown\[]

## Definitions group CanaryConstraint

Reference this group by using

```json
{"$ref":"https://keel-prestaging.us-west-2.spinnaker.mgmt.netflix.net/schema/#/$defs/CanaryConstraint"}
```

| Property                                                      | Type      | Required | Nullable       | Defined by                                                                                                                                                                                                                          |
| :------------------------------------------------------------ | --------- | -------- | -------------- | :---------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------- |
| [timeout](#timeout)                                           | `string`  | Optional | cannot be null | [DeliveryConfig](keel-defs-canaryconstraint-properties-timeout.md "https&#x3A;//keel-prestaging.us-west-2.spinnaker.mgmt.netflix.net/schema/#/$defs/CanaryConstraint/properties/timeout")                                           |
| [canaryConfigId](#canaryConfigId)                             | `string`  | Required | cannot be null | [DeliveryConfig](keel-defs-canaryconstraint-properties-canaryconfigid.md "https&#x3A;//keel-prestaging.us-west-2.spinnaker.mgmt.netflix.net/schema/#/$defs/CanaryConstraint/properties/canaryConfigId")                             |
| [beginAnalysisAfter](#beginAnalysisAfter)                     | `string`  | Optional | cannot be null | [DeliveryConfig](keel-defs-canaryconstraint-properties-beginanalysisafter.md "https&#x3A;//keel-prestaging.us-west-2.spinnaker.mgmt.netflix.net/schema/#/$defs/CanaryConstraint/properties/beginAnalysisAfter")                     |
| [canaryAnalysisInterval](#canaryAnalysisInterval)             | `string`  | Optional | cannot be null | [DeliveryConfig](keel-defs-canaryconstraint-properties-canaryanalysisinterval.md "https&#x3A;//keel-prestaging.us-west-2.spinnaker.mgmt.netflix.net/schema/#/$defs/CanaryConstraint/properties/canaryAnalysisInterval")             |
| [cleanupDelay](#cleanupDelay)                                 | `string`  | Optional | cannot be null | [DeliveryConfig](keel-defs-canaryconstraint-properties-cleanupdelay.md "https&#x3A;//keel-prestaging.us-west-2.spinnaker.mgmt.netflix.net/schema/#/$defs/CanaryConstraint/properties/cleanupDelay")                                 |
| [lifetime](#lifetime)                                         | `string`  | Required | cannot be null | [DeliveryConfig](keel-defs-canaryconstraint-properties-lifetime.md "https&#x3A;//keel-prestaging.us-west-2.spinnaker.mgmt.netflix.net/schema/#/$defs/CanaryConstraint/properties/lifetime")                                         |
| [metricsAccount](#metricsAccount)                             | `string`  | Optional | cannot be null | [DeliveryConfig](keel-defs-canaryconstraint-properties-metricsaccount.md "https&#x3A;//keel-prestaging.us-west-2.spinnaker.mgmt.netflix.net/schema/#/$defs/CanaryConstraint/properties/metricsAccount")                             |
| [storageAccount](#storageAccount)                             | `string`  | Optional | cannot be null | [DeliveryConfig](keel-defs-canaryconstraint-properties-storageaccount.md "https&#x3A;//keel-prestaging.us-west-2.spinnaker.mgmt.netflix.net/schema/#/$defs/CanaryConstraint/properties/storageAccount")                             |
| [marginalScore](#marginalScore)                               | `number`  | Required | cannot be null | [DeliveryConfig](keel-defs-canaryconstraint-properties-marginalscore.md "https&#x3A;//keel-prestaging.us-west-2.spinnaker.mgmt.netflix.net/schema/#/$defs/CanaryConstraint/properties/marginalScore")                               |
| [passScore](#passScore)                                       | `number`  | Required | cannot be null | [DeliveryConfig](keel-defs-canaryconstraint-properties-passscore.md "https&#x3A;//keel-prestaging.us-west-2.spinnaker.mgmt.netflix.net/schema/#/$defs/CanaryConstraint/properties/passScore")                                       |
| [source](#source)                                             | `object`  | Required | cannot be null | [DeliveryConfig](keel-defs-canarysource.md "https&#x3A;//keel-prestaging.us-west-2.spinnaker.mgmt.netflix.net/schema/#/$defs/CanaryConstraint/properties/source")                                                                   |
| [regions](#regions)                                           | `array`   | Required | cannot be null | [DeliveryConfig](keel-defs-canaryconstraint-properties-regions.md "https&#x3A;//keel-prestaging.us-west-2.spinnaker.mgmt.netflix.net/schema/#/$defs/CanaryConstraint/properties/regions")                                           |
| [capacity](#capacity)                                         | `number`  | Required | cannot be null | [DeliveryConfig](keel-defs-canaryconstraint-properties-capacity.md "https&#x3A;//keel-prestaging.us-west-2.spinnaker.mgmt.netflix.net/schema/#/$defs/CanaryConstraint/properties/capacity")                                         |
| [failureCancelsRunningRegions](#failureCancelsRunningRegions) | `boolean` | Optional | cannot be null | [DeliveryConfig](keel-defs-canaryconstraint-properties-failurecancelsrunningregions.md "https&#x3A;//keel-prestaging.us-west-2.spinnaker.mgmt.netflix.net/schema/#/$defs/CanaryConstraint/properties/failureCancelsRunningRegions") |
| [minSuccessfulRegions](#minSuccessfulRegions)                 | `number`  | Optional | cannot be null | [DeliveryConfig](keel-defs-canaryconstraint-properties-minsuccessfulregions.md "https&#x3A;//keel-prestaging.us-west-2.spinnaker.mgmt.netflix.net/schema/#/$defs/CanaryConstraint/properties/minSuccessfulRegions")                 |

### timeout




`timeout`

-   is optional
-   Type: `string`
-   cannot be null
-   defined in: [DeliveryConfig](keel-defs-canaryconstraint-properties-timeout.md "https&#x3A;//keel-prestaging.us-west-2.spinnaker.mgmt.netflix.net/schema/#/$defs/CanaryConstraint/properties/timeout")

#### timeout Type

`string`

#### timeout Constraints

**duration**: the string must be a duration string, according to [RFC 3339, section 5.6](https://tools.ietf.org/html/rfc3339 "check the specification")

### canaryConfigId




`canaryConfigId`

-   is required
-   Type: `string`
-   cannot be null
-   defined in: [DeliveryConfig](keel-defs-canaryconstraint-properties-canaryconfigid.md "https&#x3A;//keel-prestaging.us-west-2.spinnaker.mgmt.netflix.net/schema/#/$defs/CanaryConstraint/properties/canaryConfigId")

#### canaryConfigId Type

`string`

### beginAnalysisAfter




`beginAnalysisAfter`

-   is optional
-   Type: `string`
-   cannot be null
-   defined in: [DeliveryConfig](keel-defs-canaryconstraint-properties-beginanalysisafter.md "https&#x3A;//keel-prestaging.us-west-2.spinnaker.mgmt.netflix.net/schema/#/$defs/CanaryConstraint/properties/beginAnalysisAfter")

#### beginAnalysisAfter Type

`string`

#### beginAnalysisAfter Constraints

**duration**: the string must be a duration string, according to [RFC 3339, section 5.6](https://tools.ietf.org/html/rfc3339 "check the specification")

### canaryAnalysisInterval




`canaryAnalysisInterval`

-   is optional
-   Type: `string`
-   cannot be null
-   defined in: [DeliveryConfig](keel-defs-canaryconstraint-properties-canaryanalysisinterval.md "https&#x3A;//keel-prestaging.us-west-2.spinnaker.mgmt.netflix.net/schema/#/$defs/CanaryConstraint/properties/canaryAnalysisInterval")

#### canaryAnalysisInterval Type

`string`

#### canaryAnalysisInterval Constraints

**duration**: the string must be a duration string, according to [RFC 3339, section 5.6](https://tools.ietf.org/html/rfc3339 "check the specification")

### cleanupDelay




`cleanupDelay`

-   is optional
-   Type: `string`
-   cannot be null
-   defined in: [DeliveryConfig](keel-defs-canaryconstraint-properties-cleanupdelay.md "https&#x3A;//keel-prestaging.us-west-2.spinnaker.mgmt.netflix.net/schema/#/$defs/CanaryConstraint/properties/cleanupDelay")

#### cleanupDelay Type

`string`

#### cleanupDelay Constraints

**duration**: the string must be a duration string, according to [RFC 3339, section 5.6](https://tools.ietf.org/html/rfc3339 "check the specification")

### lifetime




`lifetime`

-   is required
-   Type: `string`
-   cannot be null
-   defined in: [DeliveryConfig](keel-defs-canaryconstraint-properties-lifetime.md "https&#x3A;//keel-prestaging.us-west-2.spinnaker.mgmt.netflix.net/schema/#/$defs/CanaryConstraint/properties/lifetime")

#### lifetime Type

`string`

#### lifetime Constraints

**duration**: the string must be a duration string, according to [RFC 3339, section 5.6](https://tools.ietf.org/html/rfc3339 "check the specification")

### metricsAccount




`metricsAccount`

-   is optional
-   Type: `string`
-   cannot be null
-   defined in: [DeliveryConfig](keel-defs-canaryconstraint-properties-metricsaccount.md "https&#x3A;//keel-prestaging.us-west-2.spinnaker.mgmt.netflix.net/schema/#/$defs/CanaryConstraint/properties/metricsAccount")

#### metricsAccount Type

`string`

### storageAccount




`storageAccount`

-   is optional
-   Type: `string`
-   cannot be null
-   defined in: [DeliveryConfig](keel-defs-canaryconstraint-properties-storageaccount.md "https&#x3A;//keel-prestaging.us-west-2.spinnaker.mgmt.netflix.net/schema/#/$defs/CanaryConstraint/properties/storageAccount")

#### storageAccount Type

`string`

### marginalScore




`marginalScore`

-   is required
-   Type: `number`
-   cannot be null
-   defined in: [DeliveryConfig](keel-defs-canaryconstraint-properties-marginalscore.md "https&#x3A;//keel-prestaging.us-west-2.spinnaker.mgmt.netflix.net/schema/#/$defs/CanaryConstraint/properties/marginalScore")

#### marginalScore Type

`number`

### passScore




`passScore`

-   is required
-   Type: `number`
-   cannot be null
-   defined in: [DeliveryConfig](keel-defs-canaryconstraint-properties-passscore.md "https&#x3A;//keel-prestaging.us-west-2.spinnaker.mgmt.netflix.net/schema/#/$defs/CanaryConstraint/properties/passScore")

#### passScore Type

`number`

### source




`source`

-   is required
-   Type: `object` ([Details](keel-defs-canarysource.md))
-   cannot be null
-   defined in: [DeliveryConfig](keel-defs-canarysource.md "https&#x3A;//keel-prestaging.us-west-2.spinnaker.mgmt.netflix.net/schema/#/$defs/CanaryConstraint/properties/source")

#### source Type

`object` ([Details](keel-defs-canarysource.md))

### regions




`regions`

-   is required
-   Type: `string[]`
-   cannot be null
-   defined in: [DeliveryConfig](keel-defs-canaryconstraint-properties-regions.md "https&#x3A;//keel-prestaging.us-west-2.spinnaker.mgmt.netflix.net/schema/#/$defs/CanaryConstraint/properties/regions")

#### regions Type

`string[]`

#### regions Constraints

**unique items**: all items in this array must be unique. Duplicates are not allowed.

### capacity




`capacity`

-   is required
-   Type: `number`
-   cannot be null
-   defined in: [DeliveryConfig](keel-defs-canaryconstraint-properties-capacity.md "https&#x3A;//keel-prestaging.us-west-2.spinnaker.mgmt.netflix.net/schema/#/$defs/CanaryConstraint/properties/capacity")

#### capacity Type

`number`

### failureCancelsRunningRegions




`failureCancelsRunningRegions`

-   is optional
-   Type: `boolean`
-   cannot be null
-   defined in: [DeliveryConfig](keel-defs-canaryconstraint-properties-failurecancelsrunningregions.md "https&#x3A;//keel-prestaging.us-west-2.spinnaker.mgmt.netflix.net/schema/#/$defs/CanaryConstraint/properties/failureCancelsRunningRegions")

#### failureCancelsRunningRegions Type

`boolean`

### minSuccessfulRegions




`minSuccessfulRegions`

-   is optional
-   Type: `number`
-   cannot be null
-   defined in: [DeliveryConfig](keel-defs-canaryconstraint-properties-minsuccessfulregions.md "https&#x3A;//keel-prestaging.us-west-2.spinnaker.mgmt.netflix.net/schema/#/$defs/CanaryConstraint/properties/minSuccessfulRegions")

#### minSuccessfulRegions Type

`number`

## Definitions group CanarySource

Reference this group by using

```json
{"$ref":"https://keel-prestaging.us-west-2.spinnaker.mgmt.netflix.net/schema/#/$defs/CanarySource"}
```

| Property                        | Type     | Required | Nullable       | Defined by                                                                                                                                                                                    |
| :------------------------------ | -------- | -------- | -------------- | :-------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------- |
| [account](#account)             | `string` | Required | cannot be null | [DeliveryConfig](keel-defs-canarysource-properties-account.md "https&#x3A;//keel-prestaging.us-west-2.spinnaker.mgmt.netflix.net/schema/#/$defs/CanarySource/properties/account")             |
| [cloudProvider](#cloudProvider) | `string` | Required | cannot be null | [DeliveryConfig](keel-defs-canarysource-properties-cloudprovider.md "https&#x3A;//keel-prestaging.us-west-2.spinnaker.mgmt.netflix.net/schema/#/$defs/CanarySource/properties/cloudProvider") |
| [cluster](#cluster)             | `string` | Required | cannot be null | [DeliveryConfig](keel-defs-canarysource-properties-cluster.md "https&#x3A;//keel-prestaging.us-west-2.spinnaker.mgmt.netflix.net/schema/#/$defs/CanarySource/properties/cluster")             |

### account




`account`

-   is required
-   Type: `string`
-   cannot be null
-   defined in: [DeliveryConfig](keel-defs-canarysource-properties-account.md "https&#x3A;//keel-prestaging.us-west-2.spinnaker.mgmt.netflix.net/schema/#/$defs/CanarySource/properties/account")

#### account Type

`string`

### cloudProvider




`cloudProvider`

-   is required
-   Type: `string`
-   cannot be null
-   defined in: [DeliveryConfig](keel-defs-canarysource-properties-cloudprovider.md "https&#x3A;//keel-prestaging.us-west-2.spinnaker.mgmt.netflix.net/schema/#/$defs/CanarySource/properties/cloudProvider")

#### cloudProvider Type

`string`

### cluster




`cluster`

-   is required
-   Type: `string`
-   cannot be null
-   defined in: [DeliveryConfig](keel-defs-canarysource-properties-cluster.md "https&#x3A;//keel-prestaging.us-west-2.spinnaker.mgmt.netflix.net/schema/#/$defs/CanarySource/properties/cluster")

#### cluster Type

`string`

## Definitions group Capacity

Reference this group by using

```json
{"$ref":"https://keel-prestaging.us-west-2.spinnaker.mgmt.netflix.net/schema/#/$defs/Capacity"}
```

| Property            | Type     | Required | Nullable       | Defined by                                                                                                                                                                |
| :------------------ | -------- | -------- | -------------- | :------------------------------------------------------------------------------------------------------------------------------------------------------------------------ |
| [min](#min)         | `number` | Required | cannot be null | [DeliveryConfig](keel-defs-capacity-properties-min.md "https&#x3A;//keel-prestaging.us-west-2.spinnaker.mgmt.netflix.net/schema/#/$defs/Capacity/properties/min")         |
| [max](#max)         | `number` | Required | cannot be null | [DeliveryConfig](keel-defs-capacity-properties-max.md "https&#x3A;//keel-prestaging.us-west-2.spinnaker.mgmt.netflix.net/schema/#/$defs/Capacity/properties/max")         |
| [desired](#desired) | `number` | Optional | cannot be null | [DeliveryConfig](keel-defs-capacity-properties-desired.md "https&#x3A;//keel-prestaging.us-west-2.spinnaker.mgmt.netflix.net/schema/#/$defs/Capacity/properties/desired") |

### min




`min`

-   is required
-   Type: `number`
-   cannot be null
-   defined in: [DeliveryConfig](keel-defs-capacity-properties-min.md "https&#x3A;//keel-prestaging.us-west-2.spinnaker.mgmt.netflix.net/schema/#/$defs/Capacity/properties/min")

#### min Type

`number`

### max




`max`

-   is required
-   Type: `number`
-   cannot be null
-   defined in: [DeliveryConfig](keel-defs-capacity-properties-max.md "https&#x3A;//keel-prestaging.us-west-2.spinnaker.mgmt.netflix.net/schema/#/$defs/Capacity/properties/max")

#### max Type

`number`

### desired




`desired`

-   is optional
-   Type: `number`
-   cannot be null
-   defined in: [DeliveryConfig](keel-defs-capacity-properties-desired.md "https&#x3A;//keel-prestaging.us-west-2.spinnaker.mgmt.netflix.net/schema/#/$defs/Capacity/properties/desired")

#### desired Type

`number`

## Definitions group CidrRule

Reference this group by using

```json
{"$ref":"https://keel-prestaging.us-west-2.spinnaker.mgmt.netflix.net/schema/#/$defs/CidrRule"}
```

| Property                  | Type          | Required | Nullable       | Defined by                                                                                                                                                                      |
| :------------------------ | ------------- | -------- | -------------- | :------------------------------------------------------------------------------------------------------------------------------------------------------------------------------ |
| [protocol](#protocol)     | Not specified | Required | cannot be null | [DeliveryConfig](keel-defs-cidrrule-properties-protocol.md "https&#x3A;//keel-prestaging.us-west-2.spinnaker.mgmt.netflix.net/schema/#/$defs/CidrRule/properties/protocol")     |
| [portRange](#portRange)   | `object`      | Required | cannot be null | [DeliveryConfig](keel-defs-portrange.md "https&#x3A;//keel-prestaging.us-west-2.spinnaker.mgmt.netflix.net/schema/#/$defs/CidrRule/properties/portRange")                       |
| [blockRange](#blockRange) | `string`      | Required | cannot be null | [DeliveryConfig](keel-defs-cidrrule-properties-blockrange.md "https&#x3A;//keel-prestaging.us-west-2.spinnaker.mgmt.netflix.net/schema/#/$defs/CidrRule/properties/blockRange") |

### protocol




`protocol`

-   is required
-   Type: unknown
-   cannot be null
-   defined in: [DeliveryConfig](keel-defs-cidrrule-properties-protocol.md "https&#x3A;//keel-prestaging.us-west-2.spinnaker.mgmt.netflix.net/schema/#/$defs/CidrRule/properties/protocol")

#### protocol Type

unknown

#### protocol Constraints

**enum**: the value of this property must be equal to one of the following values:

| Value    | Explanation |
| :------- | ----------- |
| `"TCP"`  |             |
| `"UDP"`  |             |
| `"ICMP"` |             |

### portRange




`portRange`

-   is required
-   Type: `object` ([Details](keel-defs-portrange.md))
-   cannot be null
-   defined in: [DeliveryConfig](keel-defs-portrange.md "https&#x3A;//keel-prestaging.us-west-2.spinnaker.mgmt.netflix.net/schema/#/$defs/CidrRule/properties/portRange")

#### portRange Type

`object` ([Details](keel-defs-portrange.md))

### blockRange




`blockRange`

-   is required
-   Type: `string`
-   cannot be null
-   defined in: [DeliveryConfig](keel-defs-cidrrule-properties-blockrange.md "https&#x3A;//keel-prestaging.us-west-2.spinnaker.mgmt.netflix.net/schema/#/$defs/CidrRule/properties/blockRange")

#### blockRange Type

`string`

## Definitions group ClassicLoadBalancerHealthCheck

Reference this group by using

```json
{"$ref":"https://keel-prestaging.us-west-2.spinnaker.mgmt.netflix.net/schema/#/$defs/ClassicLoadBalancerHealthCheck"}
```

| Property                                  | Type     | Required | Nullable       | Defined by                                                                                                                                                                                                                                  |
| :---------------------------------------- | -------- | -------- | -------------- | :------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------ |
| [target](#target)                         | `string` | Required | cannot be null | [DeliveryConfig](keel-defs-classicloadbalancerhealthcheck-properties-target.md "https&#x3A;//keel-prestaging.us-west-2.spinnaker.mgmt.netflix.net/schema/#/$defs/ClassicLoadBalancerHealthCheck/properties/target")                         |
| [interval](#interval)                     | `string` | Optional | cannot be null | [DeliveryConfig](keel-defs-classicloadbalancerhealthcheck-properties-interval.md "https&#x3A;//keel-prestaging.us-west-2.spinnaker.mgmt.netflix.net/schema/#/$defs/ClassicLoadBalancerHealthCheck/properties/interval")                     |
| [healthyThreshold](#healthyThreshold)     | `number` | Optional | cannot be null | [DeliveryConfig](keel-defs-classicloadbalancerhealthcheck-properties-healthythreshold.md "https&#x3A;//keel-prestaging.us-west-2.spinnaker.mgmt.netflix.net/schema/#/$defs/ClassicLoadBalancerHealthCheck/properties/healthyThreshold")     |
| [unhealthyThreshold](#unhealthyThreshold) | `number` | Optional | cannot be null | [DeliveryConfig](keel-defs-classicloadbalancerhealthcheck-properties-unhealthythreshold.md "https&#x3A;//keel-prestaging.us-west-2.spinnaker.mgmt.netflix.net/schema/#/$defs/ClassicLoadBalancerHealthCheck/properties/unhealthyThreshold") |
| [timeout](#timeout)                       | `string` | Optional | cannot be null | [DeliveryConfig](keel-defs-classicloadbalancerhealthcheck-properties-timeout.md "https&#x3A;//keel-prestaging.us-west-2.spinnaker.mgmt.netflix.net/schema/#/$defs/ClassicLoadBalancerHealthCheck/properties/timeout")                       |

### target




`target`

-   is required
-   Type: `string`
-   cannot be null
-   defined in: [DeliveryConfig](keel-defs-classicloadbalancerhealthcheck-properties-target.md "https&#x3A;//keel-prestaging.us-west-2.spinnaker.mgmt.netflix.net/schema/#/$defs/ClassicLoadBalancerHealthCheck/properties/target")

#### target Type

`string`

### interval




`interval`

-   is optional
-   Type: `string`
-   cannot be null
-   defined in: [DeliveryConfig](keel-defs-classicloadbalancerhealthcheck-properties-interval.md "https&#x3A;//keel-prestaging.us-west-2.spinnaker.mgmt.netflix.net/schema/#/$defs/ClassicLoadBalancerHealthCheck/properties/interval")

#### interval Type

`string`

#### interval Constraints

**duration**: the string must be a duration string, according to [RFC 3339, section 5.6](https://tools.ietf.org/html/rfc3339 "check the specification")

### healthyThreshold




`healthyThreshold`

-   is optional
-   Type: `number`
-   cannot be null
-   defined in: [DeliveryConfig](keel-defs-classicloadbalancerhealthcheck-properties-healthythreshold.md "https&#x3A;//keel-prestaging.us-west-2.spinnaker.mgmt.netflix.net/schema/#/$defs/ClassicLoadBalancerHealthCheck/properties/healthyThreshold")

#### healthyThreshold Type

`number`

### unhealthyThreshold




`unhealthyThreshold`

-   is optional
-   Type: `number`
-   cannot be null
-   defined in: [DeliveryConfig](keel-defs-classicloadbalancerhealthcheck-properties-unhealthythreshold.md "https&#x3A;//keel-prestaging.us-west-2.spinnaker.mgmt.netflix.net/schema/#/$defs/ClassicLoadBalancerHealthCheck/properties/unhealthyThreshold")

#### unhealthyThreshold Type

`number`

### timeout




`timeout`

-   is optional
-   Type: `string`
-   cannot be null
-   defined in: [DeliveryConfig](keel-defs-classicloadbalancerhealthcheck-properties-timeout.md "https&#x3A;//keel-prestaging.us-west-2.spinnaker.mgmt.netflix.net/schema/#/$defs/ClassicLoadBalancerHealthCheck/properties/timeout")

#### timeout Type

`string`

#### timeout Constraints

**duration**: the string must be a duration string, according to [RFC 3339, section 5.6](https://tools.ietf.org/html/rfc3339 "check the specification")

## Definitions group ClassicLoadBalancerListener

Reference this group by using

```json
{"$ref":"https://keel-prestaging.us-west-2.spinnaker.mgmt.netflix.net/schema/#/$defs/ClassicLoadBalancerListener"}
```

| Property                              | Type     | Required | Nullable       | Defined by                                                                                                                                                                                                                        |
| :------------------------------------ | -------- | -------- | -------------- | :-------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------- |
| [internalProtocol](#internalProtocol) | `string` | Required | cannot be null | [DeliveryConfig](keel-defs-classicloadbalancerlistener-properties-internalprotocol.md "https&#x3A;//keel-prestaging.us-west-2.spinnaker.mgmt.netflix.net/schema/#/$defs/ClassicLoadBalancerListener/properties/internalProtocol") |
| [internalPort](#internalPort)         | `number` | Required | cannot be null | [DeliveryConfig](keel-defs-classicloadbalancerlistener-properties-internalport.md "https&#x3A;//keel-prestaging.us-west-2.spinnaker.mgmt.netflix.net/schema/#/$defs/ClassicLoadBalancerListener/properties/internalPort")         |
| [externalProtocol](#externalProtocol) | `string` | Required | cannot be null | [DeliveryConfig](keel-defs-classicloadbalancerlistener-properties-externalprotocol.md "https&#x3A;//keel-prestaging.us-west-2.spinnaker.mgmt.netflix.net/schema/#/$defs/ClassicLoadBalancerListener/properties/externalProtocol") |
| [externalPort](#externalPort)         | `number` | Required | cannot be null | [DeliveryConfig](keel-defs-classicloadbalancerlistener-properties-externalport.md "https&#x3A;//keel-prestaging.us-west-2.spinnaker.mgmt.netflix.net/schema/#/$defs/ClassicLoadBalancerListener/properties/externalPort")         |
| [sslCertificateId](#sslCertificateId) | `string` | Optional | cannot be null | [DeliveryConfig](keel-defs-classicloadbalancerlistener-properties-sslcertificateid.md "https&#x3A;//keel-prestaging.us-west-2.spinnaker.mgmt.netflix.net/schema/#/$defs/ClassicLoadBalancerListener/properties/sslCertificateId") |

### internalProtocol




`internalProtocol`

-   is required
-   Type: `string`
-   cannot be null
-   defined in: [DeliveryConfig](keel-defs-classicloadbalancerlistener-properties-internalprotocol.md "https&#x3A;//keel-prestaging.us-west-2.spinnaker.mgmt.netflix.net/schema/#/$defs/ClassicLoadBalancerListener/properties/internalProtocol")

#### internalProtocol Type

`string`

### internalPort




`internalPort`

-   is required
-   Type: `number`
-   cannot be null
-   defined in: [DeliveryConfig](keel-defs-classicloadbalancerlistener-properties-internalport.md "https&#x3A;//keel-prestaging.us-west-2.spinnaker.mgmt.netflix.net/schema/#/$defs/ClassicLoadBalancerListener/properties/internalPort")

#### internalPort Type

`number`

### externalProtocol




`externalProtocol`

-   is required
-   Type: `string`
-   cannot be null
-   defined in: [DeliveryConfig](keel-defs-classicloadbalancerlistener-properties-externalprotocol.md "https&#x3A;//keel-prestaging.us-west-2.spinnaker.mgmt.netflix.net/schema/#/$defs/ClassicLoadBalancerListener/properties/externalProtocol")

#### externalProtocol Type

`string`

### externalPort




`externalPort`

-   is required
-   Type: `number`
-   cannot be null
-   defined in: [DeliveryConfig](keel-defs-classicloadbalancerlistener-properties-externalport.md "https&#x3A;//keel-prestaging.us-west-2.spinnaker.mgmt.netflix.net/schema/#/$defs/ClassicLoadBalancerListener/properties/externalPort")

#### externalPort Type

`number`

### sslCertificateId




`sslCertificateId`

-   is optional
-   Type: `string`
-   cannot be null
-   defined in: [DeliveryConfig](keel-defs-classicloadbalancerlistener-properties-sslcertificateid.md "https&#x3A;//keel-prestaging.us-west-2.spinnaker.mgmt.netflix.net/schema/#/$defs/ClassicLoadBalancerListener/properties/sslCertificateId")

#### sslCertificateId Type

`string`

## Definitions group ClassicLoadBalancerSpec

Reference this group by using

```json
{"$ref":"https://keel-prestaging.us-west-2.spinnaker.mgmt.netflix.net/schema/#/$defs/ClassicLoadBalancerSpec"}
```

| Property                      | Type      | Required | Nullable       | Defined by                                                                                                                                                                                                      |
| :---------------------------- | --------- | -------- | -------------- | :-------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------- |
| [moniker](#moniker)           | `object`  | Required | cannot be null | [DeliveryConfig](keel-defs-moniker.md "https&#x3A;//keel-prestaging.us-west-2.spinnaker.mgmt.netflix.net/schema/#/$defs/ClassicLoadBalancerSpec/properties/moniker")                                            |
| [locations](#locations)       | `object`  | Required | cannot be null | [DeliveryConfig](keel-defs-subnetawarelocations.md "https&#x3A;//keel-prestaging.us-west-2.spinnaker.mgmt.netflix.net/schema/#/$defs/ClassicLoadBalancerSpec/properties/locations")                             |
| [internal](#internal)         | `boolean` | Optional | cannot be null | [DeliveryConfig](keel-defs-classicloadbalancerspec-properties-internal.md "https&#x3A;//keel-prestaging.us-west-2.spinnaker.mgmt.netflix.net/schema/#/$defs/ClassicLoadBalancerSpec/properties/internal")       |
| [dependencies](#dependencies) | `object`  | Optional | cannot be null | [DeliveryConfig](keel-defs-loadbalancerdependencies.md "https&#x3A;//keel-prestaging.us-west-2.spinnaker.mgmt.netflix.net/schema/#/$defs/ClassicLoadBalancerSpec/properties/dependencies")                      |
| [idleTimeout](#idleTimeout)   | `string`  | Optional | cannot be null | [DeliveryConfig](keel-defs-classicloadbalancerspec-properties-idletimeout.md "https&#x3A;//keel-prestaging.us-west-2.spinnaker.mgmt.netflix.net/schema/#/$defs/ClassicLoadBalancerSpec/properties/idleTimeout") |
| [listeners](#listeners)       | `array`   | Optional | cannot be null | [DeliveryConfig](keel-defs-classicloadbalancerspec-properties-listeners.md "https&#x3A;//keel-prestaging.us-west-2.spinnaker.mgmt.netflix.net/schema/#/$defs/ClassicLoadBalancerSpec/properties/listeners")     |
| [healthCheck](#healthCheck)   | `object`  | Required | cannot be null | [DeliveryConfig](keel-defs-classicloadbalancerhealthcheck.md "https&#x3A;//keel-prestaging.us-west-2.spinnaker.mgmt.netflix.net/schema/#/$defs/ClassicLoadBalancerSpec/properties/healthCheck")                 |
| [overrides](#overrides)       | `object`  | Optional | cannot be null | [DeliveryConfig](keel-defs-classicloadbalancerspec-properties-overrides.md "https&#x3A;//keel-prestaging.us-west-2.spinnaker.mgmt.netflix.net/schema/#/$defs/ClassicLoadBalancerSpec/properties/overrides")     |

### moniker




`moniker`

-   is required
-   Type: `object` ([Details](keel-defs-moniker.md))
-   cannot be null
-   defined in: [DeliveryConfig](keel-defs-moniker.md "https&#x3A;//keel-prestaging.us-west-2.spinnaker.mgmt.netflix.net/schema/#/$defs/ClassicLoadBalancerSpec/properties/moniker")

#### moniker Type

`object` ([Details](keel-defs-moniker.md))

### locations




`locations`

-   is required
-   Type: `object` ([Details](keel-defs-subnetawarelocations.md))
-   cannot be null
-   defined in: [DeliveryConfig](keel-defs-subnetawarelocations.md "https&#x3A;//keel-prestaging.us-west-2.spinnaker.mgmt.netflix.net/schema/#/$defs/ClassicLoadBalancerSpec/properties/locations")

#### locations Type

`object` ([Details](keel-defs-subnetawarelocations.md))

### internal




`internal`

-   is optional
-   Type: `boolean`
-   cannot be null
-   defined in: [DeliveryConfig](keel-defs-classicloadbalancerspec-properties-internal.md "https&#x3A;//keel-prestaging.us-west-2.spinnaker.mgmt.netflix.net/schema/#/$defs/ClassicLoadBalancerSpec/properties/internal")

#### internal Type

`boolean`

### dependencies




`dependencies`

-   is optional
-   Type: `object` ([Details](keel-defs-loadbalancerdependencies.md))
-   cannot be null
-   defined in: [DeliveryConfig](keel-defs-loadbalancerdependencies.md "https&#x3A;//keel-prestaging.us-west-2.spinnaker.mgmt.netflix.net/schema/#/$defs/ClassicLoadBalancerSpec/properties/dependencies")

#### dependencies Type

`object` ([Details](keel-defs-loadbalancerdependencies.md))

### idleTimeout




`idleTimeout`

-   is optional
-   Type: `string`
-   cannot be null
-   defined in: [DeliveryConfig](keel-defs-classicloadbalancerspec-properties-idletimeout.md "https&#x3A;//keel-prestaging.us-west-2.spinnaker.mgmt.netflix.net/schema/#/$defs/ClassicLoadBalancerSpec/properties/idleTimeout")

#### idleTimeout Type

`string`

#### idleTimeout Constraints

**duration**: the string must be a duration string, according to [RFC 3339, section 5.6](https://tools.ietf.org/html/rfc3339 "check the specification")

### listeners




`listeners`

-   is optional
-   Type: `object[]` ([Details](keel-defs-classicloadbalancerlistener.md))
-   cannot be null
-   defined in: [DeliveryConfig](keel-defs-classicloadbalancerspec-properties-listeners.md "https&#x3A;//keel-prestaging.us-west-2.spinnaker.mgmt.netflix.net/schema/#/$defs/ClassicLoadBalancerSpec/properties/listeners")

#### listeners Type

`object[]` ([Details](keel-defs-classicloadbalancerlistener.md))

#### listeners Constraints

**unique items**: all items in this array must be unique. Duplicates are not allowed.

### healthCheck




`healthCheck`

-   is required
-   Type: `object` ([Details](keel-defs-classicloadbalancerhealthcheck.md))
-   cannot be null
-   defined in: [DeliveryConfig](keel-defs-classicloadbalancerhealthcheck.md "https&#x3A;//keel-prestaging.us-west-2.spinnaker.mgmt.netflix.net/schema/#/$defs/ClassicLoadBalancerSpec/properties/healthCheck")

#### healthCheck Type

`object` ([Details](keel-defs-classicloadbalancerhealthcheck.md))

### overrides




`overrides`

-   is optional
-   Type: `object` ([Details](keel-defs-classicloadbalancerspec-properties-overrides.md))
-   cannot be null
-   defined in: [DeliveryConfig](keel-defs-classicloadbalancerspec-properties-overrides.md "https&#x3A;//keel-prestaging.us-west-2.spinnaker.mgmt.netflix.net/schema/#/$defs/ClassicLoadBalancerSpec/properties/overrides")

#### overrides Type

`object` ([Details](keel-defs-classicloadbalancerspec-properties-overrides.md))

## Definitions group ClusterDependencies

Reference this group by using

```json
{"$ref":"https://keel-prestaging.us-west-2.spinnaker.mgmt.netflix.net/schema/#/$defs/ClusterDependencies"}
```

| Property                                  | Type    | Required | Nullable       | Defined by                                                                                                                                                                                                            |
| :---------------------------------------- | ------- | -------- | -------------- | :-------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------- |
| [loadBalancerNames](#loadBalancerNames)   | `array` | Optional | cannot be null | [DeliveryConfig](keel-defs-clusterdependencies-properties-loadbalancernames.md "https&#x3A;//keel-prestaging.us-west-2.spinnaker.mgmt.netflix.net/schema/#/$defs/ClusterDependencies/properties/loadBalancerNames")   |
| [securityGroupNames](#securityGroupNames) | `array` | Optional | cannot be null | [DeliveryConfig](keel-defs-clusterdependencies-properties-securitygroupnames.md "https&#x3A;//keel-prestaging.us-west-2.spinnaker.mgmt.netflix.net/schema/#/$defs/ClusterDependencies/properties/securityGroupNames") |
| [targetGroups](#targetGroups)             | `array` | Optional | cannot be null | [DeliveryConfig](keel-defs-clusterdependencies-properties-targetgroups.md "https&#x3A;//keel-prestaging.us-west-2.spinnaker.mgmt.netflix.net/schema/#/$defs/ClusterDependencies/properties/targetGroups")             |

### loadBalancerNames




`loadBalancerNames`

-   is optional
-   Type: `string[]`
-   cannot be null
-   defined in: [DeliveryConfig](keel-defs-clusterdependencies-properties-loadbalancernames.md "https&#x3A;//keel-prestaging.us-west-2.spinnaker.mgmt.netflix.net/schema/#/$defs/ClusterDependencies/properties/loadBalancerNames")

#### loadBalancerNames Type

`string[]`

#### loadBalancerNames Constraints

**unique items**: all items in this array must be unique. Duplicates are not allowed.

### securityGroupNames




`securityGroupNames`

-   is optional
-   Type: `string[]`
-   cannot be null
-   defined in: [DeliveryConfig](keel-defs-clusterdependencies-properties-securitygroupnames.md "https&#x3A;//keel-prestaging.us-west-2.spinnaker.mgmt.netflix.net/schema/#/$defs/ClusterDependencies/properties/securityGroupNames")

#### securityGroupNames Type

`string[]`

#### securityGroupNames Constraints

**unique items**: all items in this array must be unique. Duplicates are not allowed.

### targetGroups




`targetGroups`

-   is optional
-   Type: `string[]`
-   cannot be null
-   defined in: [DeliveryConfig](keel-defs-clusterdependencies-properties-targetgroups.md "https&#x3A;//keel-prestaging.us-west-2.spinnaker.mgmt.netflix.net/schema/#/$defs/ClusterDependencies/properties/targetGroups")

#### targetGroups Type

`string[]`

#### targetGroups Constraints

**unique items**: all items in this array must be unique. Duplicates are not allowed.

## Definitions group ClusterDeployStrategy

Reference this group by using

```json
{"$ref":"https://keel-prestaging.us-west-2.spinnaker.mgmt.netflix.net/schema/#/$defs/ClusterDeployStrategy"}
```

| Property | Type | Required | Nullable | Defined by |
| :------- | ---- | -------- | -------- | :--------- |

## Definitions group ClusterSpec

Reference this group by using

```json
{"$ref":"https://keel-prestaging.us-west-2.spinnaker.mgmt.netflix.net/schema/#/$defs/ClusterSpec"}
```

| Property                                    | Type     | Required | Nullable       | Defined by                                                                                                                                                                           |
| :------------------------------------------ | -------- | -------- | -------------- | :----------------------------------------------------------------------------------------------------------------------------------------------------------------------------------- |
| [moniker](#moniker)                         | `object` | Required | cannot be null | [DeliveryConfig](keel-defs-moniker.md "https&#x3A;//keel-prestaging.us-west-2.spinnaker.mgmt.netflix.net/schema/#/$defs/ClusterSpec/properties/moniker")                             |
| [imageProvider](#imageProvider)             | Merged   | Required | cannot be null | [DeliveryConfig](keel-defs-imageprovider.md "https&#x3A;//keel-prestaging.us-west-2.spinnaker.mgmt.netflix.net/schema/#/$defs/ClusterSpec/properties/imageProvider")                 |
| [deployWith](#deployWith)                   | Merged   | Optional | cannot be null | [DeliveryConfig](keel-defs-clusterdeploystrategy.md "https&#x3A;//keel-prestaging.us-west-2.spinnaker.mgmt.netflix.net/schema/#/$defs/ClusterSpec/properties/deployWith")            |
| [locations](#locations)                     | `object` | Required | cannot be null | [DeliveryConfig](keel-defs-subnetawarelocations.md "https&#x3A;//keel-prestaging.us-west-2.spinnaker.mgmt.netflix.net/schema/#/$defs/ClusterSpec/properties/locations")              |
| [launchConfiguration](#launchConfiguration) | `object` | Optional | cannot be null | [DeliveryConfig](keel-defs-launchconfigurationspec.md "https&#x3A;//keel-prestaging.us-west-2.spinnaker.mgmt.netflix.net/schema/#/$defs/ClusterSpec/properties/launchConfiguration") |
| [capacity](#capacity)                       | `object` | Optional | cannot be null | [DeliveryConfig](keel-defs-capacity.md "https&#x3A;//keel-prestaging.us-west-2.spinnaker.mgmt.netflix.net/schema/#/$defs/ClusterSpec/properties/capacity")                           |
| [dependencies](#dependencies)               | `object` | Optional | cannot be null | [DeliveryConfig](keel-defs-clusterdependencies.md "https&#x3A;//keel-prestaging.us-west-2.spinnaker.mgmt.netflix.net/schema/#/$defs/ClusterSpec/properties/dependencies")            |
| [health](#health)                           | `object` | Optional | cannot be null | [DeliveryConfig](keel-defs-healthspec.md "https&#x3A;//keel-prestaging.us-west-2.spinnaker.mgmt.netflix.net/schema/#/$defs/ClusterSpec/properties/health")                           |
| [scaling](#scaling)                         | `object` | Optional | cannot be null | [DeliveryConfig](keel-defs-scaling.md "https&#x3A;//keel-prestaging.us-west-2.spinnaker.mgmt.netflix.net/schema/#/$defs/ClusterSpec/properties/scaling")                             |
| [tags](#tags)                               | `object` | Optional | cannot be null | [DeliveryConfig](keel-defs-clusterspec-properties-tags.md "https&#x3A;//keel-prestaging.us-west-2.spinnaker.mgmt.netflix.net/schema/#/$defs/ClusterSpec/properties/tags")            |
| [overrides](#overrides)                     | `object` | Optional | cannot be null | [DeliveryConfig](keel-defs-clusterspec-properties-overrides.md "https&#x3A;//keel-prestaging.us-west-2.spinnaker.mgmt.netflix.net/schema/#/$defs/ClusterSpec/properties/overrides")  |

### moniker




`moniker`

-   is required
-   Type: `object` ([Details](keel-defs-moniker.md))
-   cannot be null
-   defined in: [DeliveryConfig](keel-defs-moniker.md "https&#x3A;//keel-prestaging.us-west-2.spinnaker.mgmt.netflix.net/schema/#/$defs/ClusterSpec/properties/moniker")

#### moniker Type

`object` ([Details](keel-defs-moniker.md))

### imageProvider




`imageProvider`

-   is required
-   Type: merged type ([Details](keel-defs-imageprovider.md))
-   cannot be null
-   defined in: [DeliveryConfig](keel-defs-imageprovider.md "https&#x3A;//keel-prestaging.us-west-2.spinnaker.mgmt.netflix.net/schema/#/$defs/ClusterSpec/properties/imageProvider")

#### imageProvider Type

merged type ([Details](keel-defs-imageprovider.md))

one (and only one) of

-   [Untitled object in DeliveryConfig](keel-defs-artifactimageprovider.md "check type definition")
-   [Untitled object in DeliveryConfig](keel-defs-referenceartifactimageprovider.md "check type definition")
-   [Untitled object in DeliveryConfig](keel-defs-jenkinsimageprovider.md "check type definition")

### deployWith




`deployWith`

-   is optional
-   Type: merged type ([Details](keel-defs-clusterdeploystrategy.md))
-   cannot be null
-   defined in: [DeliveryConfig](keel-defs-clusterdeploystrategy.md "https&#x3A;//keel-prestaging.us-west-2.spinnaker.mgmt.netflix.net/schema/#/$defs/ClusterSpec/properties/deployWith")

#### deployWith Type

merged type ([Details](keel-defs-clusterdeploystrategy.md))

one (and only one) of

-   [Untitled object in DeliveryConfig](keel-defs-redblack.md "check type definition")
-   [Untitled object in DeliveryConfig](keel-defs-highlander.md "check type definition")

### locations




`locations`

-   is required
-   Type: `object` ([Details](keel-defs-subnetawarelocations.md))
-   cannot be null
-   defined in: [DeliveryConfig](keel-defs-subnetawarelocations.md "https&#x3A;//keel-prestaging.us-west-2.spinnaker.mgmt.netflix.net/schema/#/$defs/ClusterSpec/properties/locations")

#### locations Type

`object` ([Details](keel-defs-subnetawarelocations.md))

### launchConfiguration




`launchConfiguration`

-   is optional
-   Type: `object` ([Details](keel-defs-launchconfigurationspec.md))
-   cannot be null
-   defined in: [DeliveryConfig](keel-defs-launchconfigurationspec.md "https&#x3A;//keel-prestaging.us-west-2.spinnaker.mgmt.netflix.net/schema/#/$defs/ClusterSpec/properties/launchConfiguration")

#### launchConfiguration Type

`object` ([Details](keel-defs-launchconfigurationspec.md))

### capacity




`capacity`

-   is optional
-   Type: `object` ([Details](keel-defs-capacity.md))
-   cannot be null
-   defined in: [DeliveryConfig](keel-defs-capacity.md "https&#x3A;//keel-prestaging.us-west-2.spinnaker.mgmt.netflix.net/schema/#/$defs/ClusterSpec/properties/capacity")

#### capacity Type

`object` ([Details](keel-defs-capacity.md))

### dependencies




`dependencies`

-   is optional
-   Type: `object` ([Details](keel-defs-clusterdependencies.md))
-   cannot be null
-   defined in: [DeliveryConfig](keel-defs-clusterdependencies.md "https&#x3A;//keel-prestaging.us-west-2.spinnaker.mgmt.netflix.net/schema/#/$defs/ClusterSpec/properties/dependencies")

#### dependencies Type

`object` ([Details](keel-defs-clusterdependencies.md))

### health




`health`

-   is optional
-   Type: `object` ([Details](keel-defs-healthspec.md))
-   cannot be null
-   defined in: [DeliveryConfig](keel-defs-healthspec.md "https&#x3A;//keel-prestaging.us-west-2.spinnaker.mgmt.netflix.net/schema/#/$defs/ClusterSpec/properties/health")

#### health Type

`object` ([Details](keel-defs-healthspec.md))

### scaling




`scaling`

-   is optional
-   Type: `object` ([Details](keel-defs-scaling.md))
-   cannot be null
-   defined in: [DeliveryConfig](keel-defs-scaling.md "https&#x3A;//keel-prestaging.us-west-2.spinnaker.mgmt.netflix.net/schema/#/$defs/ClusterSpec/properties/scaling")

#### scaling Type

`object` ([Details](keel-defs-scaling.md))

### tags




`tags`

-   is optional
-   Type: `object` ([Details](keel-defs-clusterspec-properties-tags.md))
-   cannot be null
-   defined in: [DeliveryConfig](keel-defs-clusterspec-properties-tags.md "https&#x3A;//keel-prestaging.us-west-2.spinnaker.mgmt.netflix.net/schema/#/$defs/ClusterSpec/properties/tags")

#### tags Type

`object` ([Details](keel-defs-clusterspec-properties-tags.md))

### overrides




`overrides`

-   is optional
-   Type: `object` ([Details](keel-defs-clusterspec-properties-overrides.md))
-   cannot be null
-   defined in: [DeliveryConfig](keel-defs-clusterspec-properties-overrides.md "https&#x3A;//keel-prestaging.us-west-2.spinnaker.mgmt.netflix.net/schema/#/$defs/ClusterSpec/properties/overrides")

#### overrides Type

`object` ([Details](keel-defs-clusterspec-properties-overrides.md))

## Definitions group Condition

Reference this group by using

```json
{"$ref":"https://keel-prestaging.us-west-2.spinnaker.mgmt.netflix.net/schema/#/$defs/Condition"}
```

| Property          | Type     | Required | Nullable       | Defined by                                                                                                                                                                |
| :---------------- | -------- | -------- | -------------- | :------------------------------------------------------------------------------------------------------------------------------------------------------------------------ |
| [field](#field)   | `string` | Required | cannot be null | [DeliveryConfig](keel-defs-condition-properties-field.md "https&#x3A;//keel-prestaging.us-west-2.spinnaker.mgmt.netflix.net/schema/#/$defs/Condition/properties/field")   |
| [values](#values) | `array`  | Required | cannot be null | [DeliveryConfig](keel-defs-condition-properties-values.md "https&#x3A;//keel-prestaging.us-west-2.spinnaker.mgmt.netflix.net/schema/#/$defs/Condition/properties/values") |

### field




`field`

-   is required
-   Type: `string`
-   cannot be null
-   defined in: [DeliveryConfig](keel-defs-condition-properties-field.md "https&#x3A;//keel-prestaging.us-west-2.spinnaker.mgmt.netflix.net/schema/#/$defs/Condition/properties/field")

#### field Type

`string`

### values




`values`

-   is required
-   Type: `string[]`
-   cannot be null
-   defined in: [DeliveryConfig](keel-defs-condition-properties-values.md "https&#x3A;//keel-prestaging.us-west-2.spinnaker.mgmt.netflix.net/schema/#/$defs/Condition/properties/values")

#### values Type

`string[]`

## Definitions group Constraint

Reference this group by using

```json
{"$ref":"https://keel-prestaging.us-west-2.spinnaker.mgmt.netflix.net/schema/#/$defs/Constraint"}
```

| Property | Type | Required | Nullable | Defined by |
| :------- | ---- | -------- | -------- | :--------- |

## Definitions group Constraints

Reference this group by using

```json
{"$ref":"https://keel-prestaging.us-west-2.spinnaker.mgmt.netflix.net/schema/#/$defs/Constraints"}
```

| Property      | Type     | Required | Nullable       | Defined by                                                                                                                                                                |
| :------------ | -------- | -------- | -------------- | :------------------------------------------------------------------------------------------------------------------------------------------------------------------------ |
| [hard](#hard) | `object` | Optional | cannot be null | [DeliveryConfig](keel-defs-constraints-properties-hard.md "https&#x3A;//keel-prestaging.us-west-2.spinnaker.mgmt.netflix.net/schema/#/$defs/Constraints/properties/hard") |
| [soft](#soft) | `object` | Optional | cannot be null | [DeliveryConfig](keel-defs-constraints-properties-soft.md "https&#x3A;//keel-prestaging.us-west-2.spinnaker.mgmt.netflix.net/schema/#/$defs/Constraints/properties/soft") |

### hard




`hard`

-   is optional
-   Type: `object` ([Details](keel-defs-constraints-properties-hard.md))
-   cannot be null
-   defined in: [DeliveryConfig](keel-defs-constraints-properties-hard.md "https&#x3A;//keel-prestaging.us-west-2.spinnaker.mgmt.netflix.net/schema/#/$defs/Constraints/properties/hard")

#### hard Type

`object` ([Details](keel-defs-constraints-properties-hard.md))

### soft




`soft`

-   is optional
-   Type: `object` ([Details](keel-defs-constraints-properties-soft.md))
-   cannot be null
-   defined in: [DeliveryConfig](keel-defs-constraints-properties-soft.md "https&#x3A;//keel-prestaging.us-west-2.spinnaker.mgmt.netflix.net/schema/#/$defs/Constraints/properties/soft")

#### soft Type

`object` ([Details](keel-defs-constraints-properties-soft.md))

## Definitions group ContainerProvider

Reference this group by using

```json
{"$ref":"https://keel-prestaging.us-west-2.spinnaker.mgmt.netflix.net/schema/#/$defs/ContainerProvider"}
```

| Property | Type | Required | Nullable | Defined by |
| :------- | ---- | -------- | -------- | :--------- |

## Definitions group CrossAccountReferenceRule

Reference this group by using

```json
{"$ref":"https://keel-prestaging.us-west-2.spinnaker.mgmt.netflix.net/schema/#/$defs/CrossAccountReferenceRule"}
```

| Property                | Type          | Required | Nullable       | Defined by                                                                                                                                                                                                    |
| :---------------------- | ------------- | -------- | -------------- | :------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------ |
| [protocol](#protocol)   | Not specified | Required | cannot be null | [DeliveryConfig](keel-defs-crossaccountreferencerule-properties-protocol.md "https&#x3A;//keel-prestaging.us-west-2.spinnaker.mgmt.netflix.net/schema/#/$defs/CrossAccountReferenceRule/properties/protocol") |
| [name](#name)           | `string`      | Required | cannot be null | [DeliveryConfig](keel-defs-crossaccountreferencerule-properties-name.md "https&#x3A;//keel-prestaging.us-west-2.spinnaker.mgmt.netflix.net/schema/#/$defs/CrossAccountReferenceRule/properties/name")         |
| [account](#account)     | `string`      | Required | cannot be null | [DeliveryConfig](keel-defs-crossaccountreferencerule-properties-account.md "https&#x3A;//keel-prestaging.us-west-2.spinnaker.mgmt.netflix.net/schema/#/$defs/CrossAccountReferenceRule/properties/account")   |
| [vpc](#vpc)             | `string`      | Required | cannot be null | [DeliveryConfig](keel-defs-crossaccountreferencerule-properties-vpc.md "https&#x3A;//keel-prestaging.us-west-2.spinnaker.mgmt.netflix.net/schema/#/$defs/CrossAccountReferenceRule/properties/vpc")           |
| [portRange](#portRange) | `object`      | Required | cannot be null | [DeliveryConfig](keel-defs-portrange.md "https&#x3A;//keel-prestaging.us-west-2.spinnaker.mgmt.netflix.net/schema/#/$defs/CrossAccountReferenceRule/properties/portRange")                                    |

### protocol




`protocol`

-   is required
-   Type: unknown
-   cannot be null
-   defined in: [DeliveryConfig](keel-defs-crossaccountreferencerule-properties-protocol.md "https&#x3A;//keel-prestaging.us-west-2.spinnaker.mgmt.netflix.net/schema/#/$defs/CrossAccountReferenceRule/properties/protocol")

#### protocol Type

unknown

#### protocol Constraints

**enum**: the value of this property must be equal to one of the following values:

| Value    | Explanation |
| :------- | ----------- |
| `"TCP"`  |             |
| `"UDP"`  |             |
| `"ICMP"` |             |

### name




`name`

-   is required
-   Type: `string`
-   cannot be null
-   defined in: [DeliveryConfig](keel-defs-crossaccountreferencerule-properties-name.md "https&#x3A;//keel-prestaging.us-west-2.spinnaker.mgmt.netflix.net/schema/#/$defs/CrossAccountReferenceRule/properties/name")

#### name Type

`string`

### account




`account`

-   is required
-   Type: `string`
-   cannot be null
-   defined in: [DeliveryConfig](keel-defs-crossaccountreferencerule-properties-account.md "https&#x3A;//keel-prestaging.us-west-2.spinnaker.mgmt.netflix.net/schema/#/$defs/CrossAccountReferenceRule/properties/account")

#### account Type

`string`

### vpc




`vpc`

-   is required
-   Type: `string`
-   cannot be null
-   defined in: [DeliveryConfig](keel-defs-crossaccountreferencerule-properties-vpc.md "https&#x3A;//keel-prestaging.us-west-2.spinnaker.mgmt.netflix.net/schema/#/$defs/CrossAccountReferenceRule/properties/vpc")

#### vpc Type

`string`

### portRange




`portRange`

-   is required
-   Type: `object` ([Details](keel-defs-portrange.md))
-   cannot be null
-   defined in: [DeliveryConfig](keel-defs-portrange.md "https&#x3A;//keel-prestaging.us-west-2.spinnaker.mgmt.netflix.net/schema/#/$defs/CrossAccountReferenceRule/properties/portRange")

#### portRange Type

`object` ([Details](keel-defs-portrange.md))

## Definitions group CustomizedMetricSpecification

Reference this group by using

```json
{"$ref":"https://keel-prestaging.us-west-2.spinnaker.mgmt.netflix.net/schema/#/$defs/CustomizedMetricSpecification"}
```

| Property                  | Type     | Required | Nullable       | Defined by                                                                                                                                                                                                                |
| :------------------------ | -------- | -------- | -------------- | :------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------ |
| [name](#name)             | `string` | Required | cannot be null | [DeliveryConfig](keel-defs-customizedmetricspecification-properties-name.md "https&#x3A;//keel-prestaging.us-west-2.spinnaker.mgmt.netflix.net/schema/#/$defs/CustomizedMetricSpecification/properties/name")             |
| [namespace](#namespace)   | `string` | Required | cannot be null | [DeliveryConfig](keel-defs-customizedmetricspecification-properties-namespace.md "https&#x3A;//keel-prestaging.us-west-2.spinnaker.mgmt.netflix.net/schema/#/$defs/CustomizedMetricSpecification/properties/namespace")   |
| [statistic](#statistic)   | `string` | Required | cannot be null | [DeliveryConfig](keel-defs-customizedmetricspecification-properties-statistic.md "https&#x3A;//keel-prestaging.us-west-2.spinnaker.mgmt.netflix.net/schema/#/$defs/CustomizedMetricSpecification/properties/statistic")   |
| [unit](#unit)             | `string` | Optional | cannot be null | [DeliveryConfig](keel-defs-customizedmetricspecification-properties-unit.md "https&#x3A;//keel-prestaging.us-west-2.spinnaker.mgmt.netflix.net/schema/#/$defs/CustomizedMetricSpecification/properties/unit")             |
| [dimensions](#dimensions) | `array`  | Optional | cannot be null | [DeliveryConfig](keel-defs-customizedmetricspecification-properties-dimensions.md "https&#x3A;//keel-prestaging.us-west-2.spinnaker.mgmt.netflix.net/schema/#/$defs/CustomizedMetricSpecification/properties/dimensions") |

### name




`name`

-   is required
-   Type: `string`
-   cannot be null
-   defined in: [DeliveryConfig](keel-defs-customizedmetricspecification-properties-name.md "https&#x3A;//keel-prestaging.us-west-2.spinnaker.mgmt.netflix.net/schema/#/$defs/CustomizedMetricSpecification/properties/name")

#### name Type

`string`

### namespace




`namespace`

-   is required
-   Type: `string`
-   cannot be null
-   defined in: [DeliveryConfig](keel-defs-customizedmetricspecification-properties-namespace.md "https&#x3A;//keel-prestaging.us-west-2.spinnaker.mgmt.netflix.net/schema/#/$defs/CustomizedMetricSpecification/properties/namespace")

#### namespace Type

`string`

### statistic




`statistic`

-   is required
-   Type: `string`
-   cannot be null
-   defined in: [DeliveryConfig](keel-defs-customizedmetricspecification-properties-statistic.md "https&#x3A;//keel-prestaging.us-west-2.spinnaker.mgmt.netflix.net/schema/#/$defs/CustomizedMetricSpecification/properties/statistic")

#### statistic Type

`string`

### unit




`unit`

-   is optional
-   Type: `string`
-   cannot be null
-   defined in: [DeliveryConfig](keel-defs-customizedmetricspecification-properties-unit.md "https&#x3A;//keel-prestaging.us-west-2.spinnaker.mgmt.netflix.net/schema/#/$defs/CustomizedMetricSpecification/properties/unit")

#### unit Type

`string`

### dimensions




`dimensions`

-   is optional
-   Type: `object[]` ([Details](keel-defs-metricdimension.md))
-   cannot be null
-   defined in: [DeliveryConfig](keel-defs-customizedmetricspecification-properties-dimensions.md "https&#x3A;//keel-prestaging.us-west-2.spinnaker.mgmt.netflix.net/schema/#/$defs/CustomizedMetricSpecification/properties/dimensions")

#### dimensions Type

`object[]` ([Details](keel-defs-metricdimension.md))

#### dimensions Constraints

**unique items**: all items in this array must be unique. Duplicates are not allowed.

## Definitions group DebianArtifact

Reference this group by using

```json
{"$ref":"https://keel-prestaging.us-west-2.spinnaker.mgmt.netflix.net/schema/#/$defs/DebianArtifact"}
```

| Property                                  | Type     | Required | Nullable       | Defined by                                                                                                                                                                                                  |
| :---------------------------------------- | -------- | -------- | -------------- | :---------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------- |
| [name](#name)                             | `string` | Required | cannot be null | [DeliveryConfig](keel-defs-debianartifact-properties-name.md "https&#x3A;//keel-prestaging.us-west-2.spinnaker.mgmt.netflix.net/schema/#/$defs/DebianArtifact/properties/name")                             |
| [deliveryConfigName](#deliveryConfigName) | `string` | Optional | cannot be null | [DeliveryConfig](keel-defs-debianartifact-properties-deliveryconfigname.md "https&#x3A;//keel-prestaging.us-west-2.spinnaker.mgmt.netflix.net/schema/#/$defs/DebianArtifact/properties/deliveryConfigName") |
| [reference](#reference)                   | `string` | Optional | cannot be null | [DeliveryConfig](keel-defs-debianartifact-properties-reference.md "https&#x3A;//keel-prestaging.us-west-2.spinnaker.mgmt.netflix.net/schema/#/$defs/DebianArtifact/properties/reference")                   |
| [statuses](#statuses)                     | `array`  | Optional | cannot be null | [DeliveryConfig](keel-defs-debianartifact-properties-statuses.md "https&#x3A;//keel-prestaging.us-west-2.spinnaker.mgmt.netflix.net/schema/#/$defs/DebianArtifact/properties/statuses")                     |
| [versioningStrategy](#versioningStrategy) | Merged   | Optional | cannot be null | [DeliveryConfig](keel-defs-versioningstrategy.md "https&#x3A;//keel-prestaging.us-west-2.spinnaker.mgmt.netflix.net/schema/#/$defs/DebianArtifact/properties/versioningStrategy")                           |

### name




`name`

-   is required
-   Type: `string`
-   cannot be null
-   defined in: [DeliveryConfig](keel-defs-debianartifact-properties-name.md "https&#x3A;//keel-prestaging.us-west-2.spinnaker.mgmt.netflix.net/schema/#/$defs/DebianArtifact/properties/name")

#### name Type

`string`

### deliveryConfigName




`deliveryConfigName`

-   is optional
-   Type: `string`
-   cannot be null
-   defined in: [DeliveryConfig](keel-defs-debianartifact-properties-deliveryconfigname.md "https&#x3A;//keel-prestaging.us-west-2.spinnaker.mgmt.netflix.net/schema/#/$defs/DebianArtifact/properties/deliveryConfigName")

#### deliveryConfigName Type

`string`

### reference




`reference`

-   is optional
-   Type: `string`
-   cannot be null
-   defined in: [DeliveryConfig](keel-defs-debianartifact-properties-reference.md "https&#x3A;//keel-prestaging.us-west-2.spinnaker.mgmt.netflix.net/schema/#/$defs/DebianArtifact/properties/reference")

#### reference Type

`string`

### statuses




`statuses`

-   is optional
-   Type: unknown\[]
-   cannot be null
-   defined in: [DeliveryConfig](keel-defs-debianartifact-properties-statuses.md "https&#x3A;//keel-prestaging.us-west-2.spinnaker.mgmt.netflix.net/schema/#/$defs/DebianArtifact/properties/statuses")

#### statuses Type

unknown\[]

### versioningStrategy




`versioningStrategy`

-   is optional
-   Type: merged type ([Details](keel-defs-versioningstrategy.md))
-   cannot be null
-   defined in: [DeliveryConfig](keel-defs-versioningstrategy.md "https&#x3A;//keel-prestaging.us-west-2.spinnaker.mgmt.netflix.net/schema/#/$defs/DebianArtifact/properties/versioningStrategy")

#### versioningStrategy Type

merged type ([Details](keel-defs-versioningstrategy.md))

one (and only one) of

-   [Untitled object in DeliveryConfig](keel-defs-debiansemverversioningstrategy.md "check type definition")
-   [Untitled object in DeliveryConfig](keel-defs-dockerversioningstrategy.md "check type definition")

## Definitions group DebianSemVerVersioningStrategy

Reference this group by using

```json
{"$ref":"https://keel-prestaging.us-west-2.spinnaker.mgmt.netflix.net/schema/#/$defs/DebianSemVerVersioningStrategy"}
```

| Property | Type | Required | Nullable | Defined by |
| :------- | ---- | -------- | -------- | :--------- |

## Definitions group DeliveryArtifact

Reference this group by using

```json
{"$ref":"https://keel-prestaging.us-west-2.spinnaker.mgmt.netflix.net/schema/#/$defs/DeliveryArtifact"}
```

| Property | Type | Required | Nullable | Defined by |
| :------- | ---- | -------- | -------- | :--------- |

## Definitions group DependsOnConstraint

Reference this group by using

```json
{"$ref":"https://keel-prestaging.us-west-2.spinnaker.mgmt.netflix.net/schema/#/$defs/DependsOnConstraint"}
```

| Property                    | Type     | Required | Nullable       | Defined by                                                                                                                                                                                              |
| :-------------------------- | -------- | -------- | -------------- | :------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------ |
| [environment](#environment) | `string` | Required | cannot be null | [DeliveryConfig](keel-defs-dependsonconstraint-properties-environment.md "https&#x3A;//keel-prestaging.us-west-2.spinnaker.mgmt.netflix.net/schema/#/$defs/DependsOnConstraint/properties/environment") |

### environment




`environment`

-   is required
-   Type: `string`
-   cannot be null
-   defined in: [DeliveryConfig](keel-defs-dependsonconstraint-properties-environment.md "https&#x3A;//keel-prestaging.us-west-2.spinnaker.mgmt.netflix.net/schema/#/$defs/DependsOnConstraint/properties/environment")

#### environment Type

`string`

## Definitions group DigestProvider

Reference this group by using

```json
{"$ref":"https://keel-prestaging.us-west-2.spinnaker.mgmt.netflix.net/schema/#/$defs/DigestProvider"}
```

| Property                      | Type     | Required | Nullable       | Defined by                                                                                                                                                                                      |
| :---------------------------- | -------- | -------- | -------------- | :---------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------- |
| [organization](#organization) | `string` | Required | cannot be null | [DeliveryConfig](keel-defs-digestprovider-properties-organization.md "https&#x3A;//keel-prestaging.us-west-2.spinnaker.mgmt.netflix.net/schema/#/$defs/DigestProvider/properties/organization") |
| [image](#image)               | `string` | Required | cannot be null | [DeliveryConfig](keel-defs-digestprovider-properties-image.md "https&#x3A;//keel-prestaging.us-west-2.spinnaker.mgmt.netflix.net/schema/#/$defs/DigestProvider/properties/image")               |
| [digest](#digest)             | `string` | Required | cannot be null | [DeliveryConfig](keel-defs-digestprovider-properties-digest.md "https&#x3A;//keel-prestaging.us-west-2.spinnaker.mgmt.netflix.net/schema/#/$defs/DigestProvider/properties/digest")             |

### organization




`organization`

-   is required
-   Type: `string`
-   cannot be null
-   defined in: [DeliveryConfig](keel-defs-digestprovider-properties-organization.md "https&#x3A;//keel-prestaging.us-west-2.spinnaker.mgmt.netflix.net/schema/#/$defs/DigestProvider/properties/organization")

#### organization Type

`string`

### image




`image`

-   is required
-   Type: `string`
-   cannot be null
-   defined in: [DeliveryConfig](keel-defs-digestprovider-properties-image.md "https&#x3A;//keel-prestaging.us-west-2.spinnaker.mgmt.netflix.net/schema/#/$defs/DigestProvider/properties/image")

#### image Type

`string`

### digest




`digest`

-   is required
-   Type: `string`
-   cannot be null
-   defined in: [DeliveryConfig](keel-defs-digestprovider-properties-digest.md "https&#x3A;//keel-prestaging.us-west-2.spinnaker.mgmt.netflix.net/schema/#/$defs/DigestProvider/properties/digest")

#### digest Type

`string`

## Definitions group DockerArtifact

Reference this group by using

```json
{"$ref":"https://keel-prestaging.us-west-2.spinnaker.mgmt.netflix.net/schema/#/$defs/DockerArtifact"}
```

| Property                                  | Type          | Required | Nullable       | Defined by                                                                                                                                                                                                  |
| :---------------------------------------- | ------------- | -------- | -------------- | :---------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------- |
| [name](#name)                             | `string`      | Required | cannot be null | [DeliveryConfig](keel-defs-dockerartifact-properties-name.md "https&#x3A;//keel-prestaging.us-west-2.spinnaker.mgmt.netflix.net/schema/#/$defs/DockerArtifact/properties/name")                             |
| [deliveryConfigName](#deliveryConfigName) | `string`      | Optional | cannot be null | [DeliveryConfig](keel-defs-dockerartifact-properties-deliveryconfigname.md "https&#x3A;//keel-prestaging.us-west-2.spinnaker.mgmt.netflix.net/schema/#/$defs/DockerArtifact/properties/deliveryConfigName") |
| [reference](#reference)                   | `string`      | Optional | cannot be null | [DeliveryConfig](keel-defs-dockerartifact-properties-reference.md "https&#x3A;//keel-prestaging.us-west-2.spinnaker.mgmt.netflix.net/schema/#/$defs/DockerArtifact/properties/reference")                   |
| [tagVersionStrategy](#tagVersionStrategy) | Not specified | Optional | cannot be null | [DeliveryConfig](keel-defs-dockerartifact-properties-tagversionstrategy.md "https&#x3A;//keel-prestaging.us-west-2.spinnaker.mgmt.netflix.net/schema/#/$defs/DockerArtifact/properties/tagVersionStrategy") |
| [captureGroupRegex](#captureGroupRegex)   | `string`      | Optional | cannot be null | [DeliveryConfig](keel-defs-dockerartifact-properties-capturegroupregex.md "https&#x3A;//keel-prestaging.us-west-2.spinnaker.mgmt.netflix.net/schema/#/$defs/DockerArtifact/properties/captureGroupRegex")   |
| [versioningStrategy](#versioningStrategy) | Merged        | Optional | cannot be null | [DeliveryConfig](keel-defs-versioningstrategy.md "https&#x3A;//keel-prestaging.us-west-2.spinnaker.mgmt.netflix.net/schema/#/$defs/DockerArtifact/properties/versioningStrategy")                           |

### name




`name`

-   is required
-   Type: `string`
-   cannot be null
-   defined in: [DeliveryConfig](keel-defs-dockerartifact-properties-name.md "https&#x3A;//keel-prestaging.us-west-2.spinnaker.mgmt.netflix.net/schema/#/$defs/DockerArtifact/properties/name")

#### name Type

`string`

### deliveryConfigName




`deliveryConfigName`

-   is optional
-   Type: `string`
-   cannot be null
-   defined in: [DeliveryConfig](keel-defs-dockerartifact-properties-deliveryconfigname.md "https&#x3A;//keel-prestaging.us-west-2.spinnaker.mgmt.netflix.net/schema/#/$defs/DockerArtifact/properties/deliveryConfigName")

#### deliveryConfigName Type

`string`

### reference




`reference`

-   is optional
-   Type: `string`
-   cannot be null
-   defined in: [DeliveryConfig](keel-defs-dockerartifact-properties-reference.md "https&#x3A;//keel-prestaging.us-west-2.spinnaker.mgmt.netflix.net/schema/#/$defs/DockerArtifact/properties/reference")

#### reference Type

`string`

### tagVersionStrategy




`tagVersionStrategy`

-   is optional
-   Type: unknown
-   cannot be null
-   defined in: [DeliveryConfig](keel-defs-dockerartifact-properties-tagversionstrategy.md "https&#x3A;//keel-prestaging.us-west-2.spinnaker.mgmt.netflix.net/schema/#/$defs/DockerArtifact/properties/tagVersionStrategy")

#### tagVersionStrategy Type

unknown

#### tagVersionStrategy Constraints

**enum**: the value of this property must be equal to one of the following values:

| Value                           | Explanation |
| :------------------------------ | ----------- |
| `"increasing-tag"`              |             |
| `"semver-tag"`                  |             |
| `"branch-job-commit-by-job"`    |             |
| `"semver-job-commit-by-job"`    |             |
| `"semver-job-commit-by-semver"` |             |

### captureGroupRegex




`captureGroupRegex`

-   is optional
-   Type: `string`
-   cannot be null
-   defined in: [DeliveryConfig](keel-defs-dockerartifact-properties-capturegroupregex.md "https&#x3A;//keel-prestaging.us-west-2.spinnaker.mgmt.netflix.net/schema/#/$defs/DockerArtifact/properties/captureGroupRegex")

#### captureGroupRegex Type

`string`

### versioningStrategy




`versioningStrategy`

-   is optional
-   Type: merged type ([Details](keel-defs-versioningstrategy.md))
-   cannot be null
-   defined in: [DeliveryConfig](keel-defs-versioningstrategy.md "https&#x3A;//keel-prestaging.us-west-2.spinnaker.mgmt.netflix.net/schema/#/$defs/DockerArtifact/properties/versioningStrategy")

#### versioningStrategy Type

merged type ([Details](keel-defs-versioningstrategy.md))

one (and only one) of

-   [Untitled object in DeliveryConfig](keel-defs-debiansemverversioningstrategy.md "check type definition")
-   [Untitled object in DeliveryConfig](keel-defs-dockerversioningstrategy.md "check type definition")

## Definitions group DockerVersioningStrategy

Reference this group by using

```json
{"$ref":"https://keel-prestaging.us-west-2.spinnaker.mgmt.netflix.net/schema/#/$defs/DockerVersioningStrategy"}
```

| Property                                | Type          | Required | Nullable       | Defined by                                                                                                                                                                                                                    |
| :-------------------------------------- | ------------- | -------- | -------------- | :---------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------- |
| [strategy](#strategy)                   | Not specified | Required | cannot be null | [DeliveryConfig](keel-defs-dockerversioningstrategy-properties-strategy.md "https&#x3A;//keel-prestaging.us-west-2.spinnaker.mgmt.netflix.net/schema/#/$defs/DockerVersioningStrategy/properties/strategy")                   |
| [captureGroupRegex](#captureGroupRegex) | `string`      | Optional | cannot be null | [DeliveryConfig](keel-defs-dockerversioningstrategy-properties-capturegroupregex.md "https&#x3A;//keel-prestaging.us-west-2.spinnaker.mgmt.netflix.net/schema/#/$defs/DockerVersioningStrategy/properties/captureGroupRegex") |

### strategy




`strategy`

-   is required
-   Type: unknown
-   cannot be null
-   defined in: [DeliveryConfig](keel-defs-dockerversioningstrategy-properties-strategy.md "https&#x3A;//keel-prestaging.us-west-2.spinnaker.mgmt.netflix.net/schema/#/$defs/DockerVersioningStrategy/properties/strategy")

#### strategy Type

unknown

#### strategy Constraints

**enum**: the value of this property must be equal to one of the following values:

| Value                           | Explanation |
| :------------------------------ | ----------- |
| `"increasing-tag"`              |             |
| `"semver-tag"`                  |             |
| `"branch-job-commit-by-job"`    |             |
| `"semver-job-commit-by-job"`    |             |
| `"semver-job-commit-by-semver"` |             |

### captureGroupRegex




`captureGroupRegex`

-   is optional
-   Type: `string`
-   cannot be null
-   defined in: [DeliveryConfig](keel-defs-dockerversioningstrategy-properties-capturegroupregex.md "https&#x3A;//keel-prestaging.us-west-2.spinnaker.mgmt.netflix.net/schema/#/$defs/DockerVersioningStrategy/properties/captureGroupRegex")

#### captureGroupRegex Type

`string`

## Definitions group Environment

Reference this group by using

```json
{"$ref":"https://keel-prestaging.us-west-2.spinnaker.mgmt.netflix.net/schema/#/$defs/Environment"}
```

| Property                        | Type     | Required | Nullable       | Defined by                                                                                                                                                                                  |
| :------------------------------ | -------- | -------- | -------------- | :------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------ |
| [name](#name)                   | `string` | Required | cannot be null | [DeliveryConfig](keel-defs-environment-properties-name.md "https&#x3A;//keel-prestaging.us-west-2.spinnaker.mgmt.netflix.net/schema/#/$defs/Environment/properties/name")                   |
| [resources](#resources)         | `array`  | Optional | cannot be null | [DeliveryConfig](keel-defs-environment-properties-resources.md "https&#x3A;//keel-prestaging.us-west-2.spinnaker.mgmt.netflix.net/schema/#/$defs/Environment/properties/resources")         |
| [constraints](#constraints)     | `array`  | Optional | cannot be null | [DeliveryConfig](keel-defs-environment-properties-constraints.md "https&#x3A;//keel-prestaging.us-west-2.spinnaker.mgmt.netflix.net/schema/#/$defs/Environment/properties/constraints")     |
| [notifications](#notifications) | `array`  | Optional | cannot be null | [DeliveryConfig](keel-defs-environment-properties-notifications.md "https&#x3A;//keel-prestaging.us-west-2.spinnaker.mgmt.netflix.net/schema/#/$defs/Environment/properties/notifications") |

### name




`name`

-   is required
-   Type: `string`
-   cannot be null
-   defined in: [DeliveryConfig](keel-defs-environment-properties-name.md "https&#x3A;//keel-prestaging.us-west-2.spinnaker.mgmt.netflix.net/schema/#/$defs/Environment/properties/name")

#### name Type

`string`

### resources




`resources`

-   is optional
-   Type: `object[]` ([Details](keel-defs-resource.md))
-   cannot be null
-   defined in: [DeliveryConfig](keel-defs-environment-properties-resources.md "https&#x3A;//keel-prestaging.us-west-2.spinnaker.mgmt.netflix.net/schema/#/$defs/Environment/properties/resources")

#### resources Type

`object[]` ([Details](keel-defs-resource.md))

#### resources Constraints

**unique items**: all items in this array must be unique. Duplicates are not allowed.

### constraints




`constraints`

-   is optional
-   Type: an array of merged types ([Details](keel-defs-constraint.md))
-   cannot be null
-   defined in: [DeliveryConfig](keel-defs-environment-properties-constraints.md "https&#x3A;//keel-prestaging.us-west-2.spinnaker.mgmt.netflix.net/schema/#/$defs/Environment/properties/constraints")

#### constraints Type

an array of merged types ([Details](keel-defs-constraint.md))

#### constraints Constraints

**unique items**: all items in this array must be unique. Duplicates are not allowed.

### notifications




`notifications`

-   is optional
-   Type: `object[]` ([Details](keel-defs-notificationconfig.md))
-   cannot be null
-   defined in: [DeliveryConfig](keel-defs-environment-properties-notifications.md "https&#x3A;//keel-prestaging.us-west-2.spinnaker.mgmt.netflix.net/schema/#/$defs/Environment/properties/notifications")

#### notifications Type

`object[]` ([Details](keel-defs-notificationconfig.md))

#### notifications Constraints

**unique items**: all items in this array must be unique. Duplicates are not allowed.

## Definitions group HealthSpec

Reference this group by using

```json
{"$ref":"https://keel-prestaging.us-west-2.spinnaker.mgmt.netflix.net/schema/#/$defs/HealthSpec"}
```

| Property                                    | Type          | Required | Nullable       | Defined by                                                                                                                                                                                            |
| :------------------------------------------ | ------------- | -------- | -------------- | :---------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------- |
| [cooldown](#cooldown)                       | `string`      | Optional | cannot be null | [DeliveryConfig](keel-defs-healthspec-properties-cooldown.md "https&#x3A;//keel-prestaging.us-west-2.spinnaker.mgmt.netflix.net/schema/#/$defs/HealthSpec/properties/cooldown")                       |
| [warmup](#warmup)                           | `string`      | Optional | cannot be null | [DeliveryConfig](keel-defs-healthspec-properties-warmup.md "https&#x3A;//keel-prestaging.us-west-2.spinnaker.mgmt.netflix.net/schema/#/$defs/HealthSpec/properties/warmup")                           |
| [healthCheckType](#healthCheckType)         | Not specified | Optional | cannot be null | [DeliveryConfig](keel-defs-healthspec-properties-healthchecktype.md "https&#x3A;//keel-prestaging.us-west-2.spinnaker.mgmt.netflix.net/schema/#/$defs/HealthSpec/properties/healthCheckType")         |
| [enabledMetrics](#enabledMetrics)           | `array`       | Optional | cannot be null | [DeliveryConfig](keel-defs-healthspec-properties-enabledmetrics.md "https&#x3A;//keel-prestaging.us-west-2.spinnaker.mgmt.netflix.net/schema/#/$defs/HealthSpec/properties/enabledMetrics")           |
| [terminationPolicies](#terminationPolicies) | `array`       | Optional | cannot be null | [DeliveryConfig](keel-defs-healthspec-properties-terminationpolicies.md "https&#x3A;//keel-prestaging.us-west-2.spinnaker.mgmt.netflix.net/schema/#/$defs/HealthSpec/properties/terminationPolicies") |

### cooldown




`cooldown`

-   is optional
-   Type: `string`
-   cannot be null
-   defined in: [DeliveryConfig](keel-defs-healthspec-properties-cooldown.md "https&#x3A;//keel-prestaging.us-west-2.spinnaker.mgmt.netflix.net/schema/#/$defs/HealthSpec/properties/cooldown")

#### cooldown Type

`string`

#### cooldown Constraints

**duration**: the string must be a duration string, according to [RFC 3339, section 5.6](https://tools.ietf.org/html/rfc3339 "check the specification")

### warmup




`warmup`

-   is optional
-   Type: `string`
-   cannot be null
-   defined in: [DeliveryConfig](keel-defs-healthspec-properties-warmup.md "https&#x3A;//keel-prestaging.us-west-2.spinnaker.mgmt.netflix.net/schema/#/$defs/HealthSpec/properties/warmup")

#### warmup Type

`string`

#### warmup Constraints

**duration**: the string must be a duration string, according to [RFC 3339, section 5.6](https://tools.ietf.org/html/rfc3339 "check the specification")

### healthCheckType




`healthCheckType`

-   is optional
-   Type: unknown
-   cannot be null
-   defined in: [DeliveryConfig](keel-defs-healthspec-properties-healthchecktype.md "https&#x3A;//keel-prestaging.us-west-2.spinnaker.mgmt.netflix.net/schema/#/$defs/HealthSpec/properties/healthCheckType")

#### healthCheckType Type

unknown

#### healthCheckType Constraints

**enum**: the value of this property must be equal to one of the following values:

| Value   | Explanation |
| :------ | ----------- |
| `"EC2"` |             |
| `"ELB"` |             |

### enabledMetrics




`enabledMetrics`

-   is optional
-   Type: unknown\[]
-   cannot be null
-   defined in: [DeliveryConfig](keel-defs-healthspec-properties-enabledmetrics.md "https&#x3A;//keel-prestaging.us-west-2.spinnaker.mgmt.netflix.net/schema/#/$defs/HealthSpec/properties/enabledMetrics")

#### enabledMetrics Type

unknown\[]

#### enabledMetrics Constraints

**unique items**: all items in this array must be unique. Duplicates are not allowed.

### terminationPolicies




`terminationPolicies`

-   is optional
-   Type: unknown\[]
-   cannot be null
-   defined in: [DeliveryConfig](keel-defs-healthspec-properties-terminationpolicies.md "https&#x3A;//keel-prestaging.us-west-2.spinnaker.mgmt.netflix.net/schema/#/$defs/HealthSpec/properties/terminationPolicies")

#### terminationPolicies Type

unknown\[]

#### terminationPolicies Constraints

**unique items**: all items in this array must be unique. Duplicates are not allowed.

## Definitions group Highlander

Reference this group by using

```json
{"$ref":"https://keel-prestaging.us-west-2.spinnaker.mgmt.netflix.net/schema/#/$defs/Highlander"}
```

| Property              | Type          | Required | Nullable       | Defined by                                                                                                                                                                      |
| :-------------------- | ------------- | -------- | -------------- | :------------------------------------------------------------------------------------------------------------------------------------------------------------------------------ |
| [strategy](#strategy) | Not specified | Required | cannot be null | [DeliveryConfig](keel-defs-highlander-properties-strategy.md "https&#x3A;//keel-prestaging.us-west-2.spinnaker.mgmt.netflix.net/schema/#/$defs/Highlander/properties/strategy") |

### strategy




`strategy`

-   is required
-   Type: unknown
-   cannot be null
-   defined in: [DeliveryConfig](keel-defs-highlander-properties-strategy.md "https&#x3A;//keel-prestaging.us-west-2.spinnaker.mgmt.netflix.net/schema/#/$defs/Highlander/properties/strategy")

#### strategy Type

unknown

#### strategy Constraints

**enum**: the value of this property must be equal to one of the following values:

| Value          | Explanation |
| :------------- | ----------- |
| `"highlander"` |             |

## Definitions group ImageProvider

Reference this group by using

```json
{"$ref":"https://keel-prestaging.us-west-2.spinnaker.mgmt.netflix.net/schema/#/$defs/ImageProvider"}
```

| Property | Type | Required | Nullable | Defined by |
| :------- | ---- | -------- | -------- | :--------- |

## Definitions group ImageSpec

Reference this group by using

```json
{"$ref":"https://keel-prestaging.us-west-2.spinnaker.mgmt.netflix.net/schema/#/$defs/ImageSpec"}
```

| Property                              | Type          | Required | Nullable       | Defined by                                                                                                                                                                                    |
| :------------------------------------ | ------------- | -------- | -------------- | :-------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------- |
| [artifactName](#artifactName)         | `string`      | Required | cannot be null | [DeliveryConfig](keel-defs-imagespec-properties-artifactname.md "https&#x3A;//keel-prestaging.us-west-2.spinnaker.mgmt.netflix.net/schema/#/$defs/ImageSpec/properties/artifactName")         |
| [baseLabel](#baseLabel)               | Not specified | Required | cannot be null | [DeliveryConfig](keel-defs-imagespec-properties-baselabel.md "https&#x3A;//keel-prestaging.us-west-2.spinnaker.mgmt.netflix.net/schema/#/$defs/ImageSpec/properties/baseLabel")               |
| [baseOs](#baseOs)                     | `string`      | Required | cannot be null | [DeliveryConfig](keel-defs-imagespec-properties-baseos.md "https&#x3A;//keel-prestaging.us-west-2.spinnaker.mgmt.netflix.net/schema/#/$defs/ImageSpec/properties/baseOs")                     |
| [regions](#regions)                   | `array`       | Required | cannot be null | [DeliveryConfig](keel-defs-imagespec-properties-regions.md "https&#x3A;//keel-prestaging.us-west-2.spinnaker.mgmt.netflix.net/schema/#/$defs/ImageSpec/properties/regions")                   |
| [storeType](#storeType)               | Not specified | Required | cannot be null | [DeliveryConfig](keel-defs-imagespec-properties-storetype.md "https&#x3A;//keel-prestaging.us-west-2.spinnaker.mgmt.netflix.net/schema/#/$defs/ImageSpec/properties/storeType")               |
| [artifactStatuses](#artifactStatuses) | `array`       | Optional | cannot be null | [DeliveryConfig](keel-defs-imagespec-properties-artifactstatuses.md "https&#x3A;//keel-prestaging.us-west-2.spinnaker.mgmt.netflix.net/schema/#/$defs/ImageSpec/properties/artifactStatuses") |
| [application](#application)           | `string`      | Required | cannot be null | [DeliveryConfig](keel-defs-imagespec-properties-application.md "https&#x3A;//keel-prestaging.us-west-2.spinnaker.mgmt.netflix.net/schema/#/$defs/ImageSpec/properties/application")           |

### artifactName




`artifactName`

-   is required
-   Type: `string`
-   cannot be null
-   defined in: [DeliveryConfig](keel-defs-imagespec-properties-artifactname.md "https&#x3A;//keel-prestaging.us-west-2.spinnaker.mgmt.netflix.net/schema/#/$defs/ImageSpec/properties/artifactName")

#### artifactName Type

`string`

### baseLabel




`baseLabel`

-   is required
-   Type: unknown
-   cannot be null
-   defined in: [DeliveryConfig](keel-defs-imagespec-properties-baselabel.md "https&#x3A;//keel-prestaging.us-west-2.spinnaker.mgmt.netflix.net/schema/#/$defs/ImageSpec/properties/baseLabel")

#### baseLabel Type

unknown

#### baseLabel Constraints

**enum**: the value of this property must be equal to one of the following values:

| Value         | Explanation |
| :------------ | ----------- |
| `"RELEASE"`   |             |
| `"CANDIDATE"` |             |
| `"PREVIOUS"`  |             |
| `"UNSTABLE"`  |             |

### baseOs




`baseOs`

-   is required
-   Type: `string`
-   cannot be null
-   defined in: [DeliveryConfig](keel-defs-imagespec-properties-baseos.md "https&#x3A;//keel-prestaging.us-west-2.spinnaker.mgmt.netflix.net/schema/#/$defs/ImageSpec/properties/baseOs")

#### baseOs Type

`string`

### regions




`regions`

-   is required
-   Type: `string[]`
-   cannot be null
-   defined in: [DeliveryConfig](keel-defs-imagespec-properties-regions.md "https&#x3A;//keel-prestaging.us-west-2.spinnaker.mgmt.netflix.net/schema/#/$defs/ImageSpec/properties/regions")

#### regions Type

`string[]`

#### regions Constraints

**unique items**: all items in this array must be unique. Duplicates are not allowed.

### storeType




`storeType`

-   is required
-   Type: unknown
-   cannot be null
-   defined in: [DeliveryConfig](keel-defs-imagespec-properties-storetype.md "https&#x3A;//keel-prestaging.us-west-2.spinnaker.mgmt.netflix.net/schema/#/$defs/ImageSpec/properties/storeType")

#### storeType Type

unknown

#### storeType Constraints

**enum**: the value of this property must be equal to one of the following values:

| Value      | Explanation |
| :--------- | ----------- |
| `"EBS"`    |             |
| `"S3"`     |             |
| `"DOCKER"` |             |

### artifactStatuses




`artifactStatuses`

-   is optional
-   Type: unknown\[]
-   cannot be null
-   defined in: [DeliveryConfig](keel-defs-imagespec-properties-artifactstatuses.md "https&#x3A;//keel-prestaging.us-west-2.spinnaker.mgmt.netflix.net/schema/#/$defs/ImageSpec/properties/artifactStatuses")

#### artifactStatuses Type

unknown\[]

### application




`application`

-   is required
-   Type: `string`
-   cannot be null
-   defined in: [DeliveryConfig](keel-defs-imagespec-properties-application.md "https&#x3A;//keel-prestaging.us-west-2.spinnaker.mgmt.netflix.net/schema/#/$defs/ImageSpec/properties/application")

#### application Type

`string`

## Definitions group JenkinsImageProvider

Reference this group by using

```json
{"$ref":"https://keel-prestaging.us-west-2.spinnaker.mgmt.netflix.net/schema/#/$defs/JenkinsImageProvider"}
```

| Property                    | Type     | Required | Nullable       | Defined by                                                                                                                                                                                                |
| :-------------------------- | -------- | -------- | -------------- | :-------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------- |
| [packageName](#packageName) | `string` | Required | cannot be null | [DeliveryConfig](keel-defs-jenkinsimageprovider-properties-packagename.md "https&#x3A;//keel-prestaging.us-west-2.spinnaker.mgmt.netflix.net/schema/#/$defs/JenkinsImageProvider/properties/packageName") |
| [buildHost](#buildHost)     | `string` | Required | cannot be null | [DeliveryConfig](keel-defs-jenkinsimageprovider-properties-buildhost.md "https&#x3A;//keel-prestaging.us-west-2.spinnaker.mgmt.netflix.net/schema/#/$defs/JenkinsImageProvider/properties/buildHost")     |
| [buildName](#buildName)     | `string` | Required | cannot be null | [DeliveryConfig](keel-defs-jenkinsimageprovider-properties-buildname.md "https&#x3A;//keel-prestaging.us-west-2.spinnaker.mgmt.netflix.net/schema/#/$defs/JenkinsImageProvider/properties/buildName")     |
| [buildNumber](#buildNumber) | `string` | Required | cannot be null | [DeliveryConfig](keel-defs-jenkinsimageprovider-properties-buildnumber.md "https&#x3A;//keel-prestaging.us-west-2.spinnaker.mgmt.netflix.net/schema/#/$defs/JenkinsImageProvider/properties/buildNumber") |

### packageName




`packageName`

-   is required
-   Type: `string`
-   cannot be null
-   defined in: [DeliveryConfig](keel-defs-jenkinsimageprovider-properties-packagename.md "https&#x3A;//keel-prestaging.us-west-2.spinnaker.mgmt.netflix.net/schema/#/$defs/JenkinsImageProvider/properties/packageName")

#### packageName Type

`string`

### buildHost




`buildHost`

-   is required
-   Type: `string`
-   cannot be null
-   defined in: [DeliveryConfig](keel-defs-jenkinsimageprovider-properties-buildhost.md "https&#x3A;//keel-prestaging.us-west-2.spinnaker.mgmt.netflix.net/schema/#/$defs/JenkinsImageProvider/properties/buildHost")

#### buildHost Type

`string`

### buildName




`buildName`

-   is required
-   Type: `string`
-   cannot be null
-   defined in: [DeliveryConfig](keel-defs-jenkinsimageprovider-properties-buildname.md "https&#x3A;//keel-prestaging.us-west-2.spinnaker.mgmt.netflix.net/schema/#/$defs/JenkinsImageProvider/properties/buildName")

#### buildName Type

`string`

### buildNumber




`buildNumber`

-   is required
-   Type: `string`
-   cannot be null
-   defined in: [DeliveryConfig](keel-defs-jenkinsimageprovider-properties-buildnumber.md "https&#x3A;//keel-prestaging.us-west-2.spinnaker.mgmt.netflix.net/schema/#/$defs/JenkinsImageProvider/properties/buildNumber")

#### buildNumber Type

`string`

## Definitions group LaunchConfigurationSpec

Reference this group by using

```json
{"$ref":"https://keel-prestaging.us-west-2.spinnaker.mgmt.netflix.net/schema/#/$defs/LaunchConfigurationSpec"}
```

| Property                                  | Type      | Required | Nullable       | Defined by                                                                                                                                                                                                                    |
| :---------------------------------------- | --------- | -------- | -------------- | :---------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------- |
| [image](#image)                           | `object`  | Optional | cannot be null | [DeliveryConfig](keel-defs-virtualmachineimage.md "https&#x3A;//keel-prestaging.us-west-2.spinnaker.mgmt.netflix.net/schema/#/$defs/LaunchConfigurationSpec/properties/image")                                                |
| [instanceType](#instanceType)             | `string`  | Optional | cannot be null | [DeliveryConfig](keel-defs-launchconfigurationspec-properties-instancetype.md "https&#x3A;//keel-prestaging.us-west-2.spinnaker.mgmt.netflix.net/schema/#/$defs/LaunchConfigurationSpec/properties/instanceType")             |
| [ebsOptimized](#ebsOptimized)             | `boolean` | Optional | cannot be null | [DeliveryConfig](keel-defs-launchconfigurationspec-properties-ebsoptimized.md "https&#x3A;//keel-prestaging.us-west-2.spinnaker.mgmt.netflix.net/schema/#/$defs/LaunchConfigurationSpec/properties/ebsOptimized")             |
| [iamRole](#iamRole)                       | `string`  | Optional | cannot be null | [DeliveryConfig](keel-defs-launchconfigurationspec-properties-iamrole.md "https&#x3A;//keel-prestaging.us-west-2.spinnaker.mgmt.netflix.net/schema/#/$defs/LaunchConfigurationSpec/properties/iamRole")                       |
| [keyPair](#keyPair)                       | `string`  | Optional | cannot be null | [DeliveryConfig](keel-defs-launchconfigurationspec-properties-keypair.md "https&#x3A;//keel-prestaging.us-west-2.spinnaker.mgmt.netflix.net/schema/#/$defs/LaunchConfigurationSpec/properties/keyPair")                       |
| [instanceMonitoring](#instanceMonitoring) | `boolean` | Optional | cannot be null | [DeliveryConfig](keel-defs-launchconfigurationspec-properties-instancemonitoring.md "https&#x3A;//keel-prestaging.us-west-2.spinnaker.mgmt.netflix.net/schema/#/$defs/LaunchConfigurationSpec/properties/instanceMonitoring") |
| [ramdiskId](#ramdiskId)                   | `string`  | Optional | cannot be null | [DeliveryConfig](keel-defs-launchconfigurationspec-properties-ramdiskid.md "https&#x3A;//keel-prestaging.us-west-2.spinnaker.mgmt.netflix.net/schema/#/$defs/LaunchConfigurationSpec/properties/ramdiskId")                   |

### image




`image`

-   is optional
-   Type: `object` ([Details](keel-defs-virtualmachineimage.md))
-   cannot be null
-   defined in: [DeliveryConfig](keel-defs-virtualmachineimage.md "https&#x3A;//keel-prestaging.us-west-2.spinnaker.mgmt.netflix.net/schema/#/$defs/LaunchConfigurationSpec/properties/image")

#### image Type

`object` ([Details](keel-defs-virtualmachineimage.md))

### instanceType




`instanceType`

-   is optional
-   Type: `string`
-   cannot be null
-   defined in: [DeliveryConfig](keel-defs-launchconfigurationspec-properties-instancetype.md "https&#x3A;//keel-prestaging.us-west-2.spinnaker.mgmt.netflix.net/schema/#/$defs/LaunchConfigurationSpec/properties/instanceType")

#### instanceType Type

`string`

### ebsOptimized




`ebsOptimized`

-   is optional
-   Type: `boolean`
-   cannot be null
-   defined in: [DeliveryConfig](keel-defs-launchconfigurationspec-properties-ebsoptimized.md "https&#x3A;//keel-prestaging.us-west-2.spinnaker.mgmt.netflix.net/schema/#/$defs/LaunchConfigurationSpec/properties/ebsOptimized")

#### ebsOptimized Type

`boolean`

### iamRole




`iamRole`

-   is optional
-   Type: `string`
-   cannot be null
-   defined in: [DeliveryConfig](keel-defs-launchconfigurationspec-properties-iamrole.md "https&#x3A;//keel-prestaging.us-west-2.spinnaker.mgmt.netflix.net/schema/#/$defs/LaunchConfigurationSpec/properties/iamRole")

#### iamRole Type

`string`

### keyPair




`keyPair`

-   is optional
-   Type: `string`
-   cannot be null
-   defined in: [DeliveryConfig](keel-defs-launchconfigurationspec-properties-keypair.md "https&#x3A;//keel-prestaging.us-west-2.spinnaker.mgmt.netflix.net/schema/#/$defs/LaunchConfigurationSpec/properties/keyPair")

#### keyPair Type

`string`

### instanceMonitoring




`instanceMonitoring`

-   is optional
-   Type: `boolean`
-   cannot be null
-   defined in: [DeliveryConfig](keel-defs-launchconfigurationspec-properties-instancemonitoring.md "https&#x3A;//keel-prestaging.us-west-2.spinnaker.mgmt.netflix.net/schema/#/$defs/LaunchConfigurationSpec/properties/instanceMonitoring")

#### instanceMonitoring Type

`boolean`

### ramdiskId




`ramdiskId`

-   is optional
-   Type: `string`
-   cannot be null
-   defined in: [DeliveryConfig](keel-defs-launchconfigurationspec-properties-ramdiskid.md "https&#x3A;//keel-prestaging.us-west-2.spinnaker.mgmt.netflix.net/schema/#/$defs/LaunchConfigurationSpec/properties/ramdiskId")

#### ramdiskId Type

`string`

## Definitions group Listener

Reference this group by using

```json
{"$ref":"https://keel-prestaging.us-west-2.spinnaker.mgmt.netflix.net/schema/#/$defs/Listener"}
```

| Property                          | Type     | Required | Nullable       | Defined by                                                                                                                                                                              |
| :-------------------------------- | -------- | -------- | -------------- | :-------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------- |
| [port](#port)                     | `number` | Required | cannot be null | [DeliveryConfig](keel-defs-listener-properties-port.md "https&#x3A;//keel-prestaging.us-west-2.spinnaker.mgmt.netflix.net/schema/#/$defs/Listener/properties/port")                     |
| [protocol](#protocol)             | `string` | Required | cannot be null | [DeliveryConfig](keel-defs-listener-properties-protocol.md "https&#x3A;//keel-prestaging.us-west-2.spinnaker.mgmt.netflix.net/schema/#/$defs/Listener/properties/protocol")             |
| [certificateArn](#certificateArn) | `string` | Optional | cannot be null | [DeliveryConfig](keel-defs-listener-properties-certificatearn.md "https&#x3A;//keel-prestaging.us-west-2.spinnaker.mgmt.netflix.net/schema/#/$defs/Listener/properties/certificateArn") |
| [rules](#rules)                   | `array`  | Optional | cannot be null | [DeliveryConfig](keel-defs-listener-properties-rules.md "https&#x3A;//keel-prestaging.us-west-2.spinnaker.mgmt.netflix.net/schema/#/$defs/Listener/properties/rules")                   |
| [defaultActions](#defaultActions) | `array`  | Optional | cannot be null | [DeliveryConfig](keel-defs-listener-properties-defaultactions.md "https&#x3A;//keel-prestaging.us-west-2.spinnaker.mgmt.netflix.net/schema/#/$defs/Listener/properties/defaultActions") |

### port




`port`

-   is required
-   Type: `number`
-   cannot be null
-   defined in: [DeliveryConfig](keel-defs-listener-properties-port.md "https&#x3A;//keel-prestaging.us-west-2.spinnaker.mgmt.netflix.net/schema/#/$defs/Listener/properties/port")

#### port Type

`number`

### protocol




`protocol`

-   is required
-   Type: `string`
-   cannot be null
-   defined in: [DeliveryConfig](keel-defs-listener-properties-protocol.md "https&#x3A;//keel-prestaging.us-west-2.spinnaker.mgmt.netflix.net/schema/#/$defs/Listener/properties/protocol")

#### protocol Type

`string`

### certificateArn




`certificateArn`

-   is optional
-   Type: `string`
-   cannot be null
-   defined in: [DeliveryConfig](keel-defs-listener-properties-certificatearn.md "https&#x3A;//keel-prestaging.us-west-2.spinnaker.mgmt.netflix.net/schema/#/$defs/Listener/properties/certificateArn")

#### certificateArn Type

`string`

### rules




`rules`

-   is optional
-   Type: `object[]` ([Details](keel-defs-rule.md))
-   cannot be null
-   defined in: [DeliveryConfig](keel-defs-listener-properties-rules.md "https&#x3A;//keel-prestaging.us-west-2.spinnaker.mgmt.netflix.net/schema/#/$defs/Listener/properties/rules")

#### rules Type

`object[]` ([Details](keel-defs-rule.md))

#### rules Constraints

**unique items**: all items in this array must be unique. Duplicates are not allowed.

### defaultActions




`defaultActions`

-   is optional
-   Type: `object[]` ([Details](keel-defs-action.md))
-   cannot be null
-   defined in: [DeliveryConfig](keel-defs-listener-properties-defaultactions.md "https&#x3A;//keel-prestaging.us-west-2.spinnaker.mgmt.netflix.net/schema/#/$defs/Listener/properties/defaultActions")

#### defaultActions Type

`object[]` ([Details](keel-defs-action.md))

#### defaultActions Constraints

**unique items**: all items in this array must be unique. Duplicates are not allowed.

## Definitions group LoadBalancerDependencies

Reference this group by using

```json
{"$ref":"https://keel-prestaging.us-west-2.spinnaker.mgmt.netflix.net/schema/#/$defs/LoadBalancerDependencies"}
```

| Property                                  | Type    | Required | Nullable       | Defined by                                                                                                                                                                                                                      |
| :---------------------------------------- | ------- | -------- | -------------- | :------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------ |
| [securityGroupNames](#securityGroupNames) | `array` | Optional | cannot be null | [DeliveryConfig](keel-defs-loadbalancerdependencies-properties-securitygroupnames.md "https&#x3A;//keel-prestaging.us-west-2.spinnaker.mgmt.netflix.net/schema/#/$defs/LoadBalancerDependencies/properties/securityGroupNames") |

### securityGroupNames




`securityGroupNames`

-   is optional
-   Type: `string[]`
-   cannot be null
-   defined in: [DeliveryConfig](keel-defs-loadbalancerdependencies-properties-securitygroupnames.md "https&#x3A;//keel-prestaging.us-west-2.spinnaker.mgmt.netflix.net/schema/#/$defs/LoadBalancerDependencies/properties/securityGroupNames")

#### securityGroupNames Type

`string[]`

#### securityGroupNames Constraints

**unique items**: all items in this array must be unique. Duplicates are not allowed.

## Definitions group ManualJudgementConstraint

Reference this group by using

```json
{"$ref":"https://keel-prestaging.us-west-2.spinnaker.mgmt.netflix.net/schema/#/$defs/ManualJudgementConstraint"}
```

| Property            | Type     | Required | Nullable       | Defined by                                                                                                                                                                                                  |
| :------------------ | -------- | -------- | -------------- | :---------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------- |
| [timeout](#timeout) | `string` | Optional | cannot be null | [DeliveryConfig](keel-defs-manualjudgementconstraint-properties-timeout.md "https&#x3A;//keel-prestaging.us-west-2.spinnaker.mgmt.netflix.net/schema/#/$defs/ManualJudgementConstraint/properties/timeout") |

### timeout




`timeout`

-   is optional
-   Type: `string`
-   cannot be null
-   defined in: [DeliveryConfig](keel-defs-manualjudgementconstraint-properties-timeout.md "https&#x3A;//keel-prestaging.us-west-2.spinnaker.mgmt.netflix.net/schema/#/$defs/ManualJudgementConstraint/properties/timeout")

#### timeout Type

`string`

#### timeout Constraints

**duration**: the string must be a duration string, according to [RFC 3339, section 5.6](https://tools.ietf.org/html/rfc3339 "check the specification")

## Definitions group MetricDimension

Reference this group by using

```json
{"$ref":"https://keel-prestaging.us-west-2.spinnaker.mgmt.netflix.net/schema/#/$defs/MetricDimension"}
```

| Property        | Type     | Required | Nullable       | Defined by                                                                                                                                                                          |
| :-------------- | -------- | -------- | -------------- | :---------------------------------------------------------------------------------------------------------------------------------------------------------------------------------- |
| [name](#name)   | `string` | Required | cannot be null | [DeliveryConfig](keel-defs-metricdimension-properties-name.md "https&#x3A;//keel-prestaging.us-west-2.spinnaker.mgmt.netflix.net/schema/#/$defs/MetricDimension/properties/name")   |
| [value](#value) | `string` | Required | cannot be null | [DeliveryConfig](keel-defs-metricdimension-properties-value.md "https&#x3A;//keel-prestaging.us-west-2.spinnaker.mgmt.netflix.net/schema/#/$defs/MetricDimension/properties/value") |

### name




`name`

-   is required
-   Type: `string`
-   cannot be null
-   defined in: [DeliveryConfig](keel-defs-metricdimension-properties-name.md "https&#x3A;//keel-prestaging.us-west-2.spinnaker.mgmt.netflix.net/schema/#/$defs/MetricDimension/properties/name")

#### name Type

`string`

### value




`value`

-   is required
-   Type: `string`
-   cannot be null
-   defined in: [DeliveryConfig](keel-defs-metricdimension-properties-value.md "https&#x3A;//keel-prestaging.us-west-2.spinnaker.mgmt.netflix.net/schema/#/$defs/MetricDimension/properties/value")

#### value Type

`string`

## Definitions group MigrationPolicy

Reference this group by using

```json
{"$ref":"https://keel-prestaging.us-west-2.spinnaker.mgmt.netflix.net/schema/#/$defs/MigrationPolicy"}
```

| Property      | Type     | Required | Nullable       | Defined by                                                                                                                                                                        |
| :------------ | -------- | -------- | -------------- | :-------------------------------------------------------------------------------------------------------------------------------------------------------------------------------- |
| [type](#type) | `string` | Optional | cannot be null | [DeliveryConfig](keel-defs-migrationpolicy-properties-type.md "https&#x3A;//keel-prestaging.us-west-2.spinnaker.mgmt.netflix.net/schema/#/$defs/MigrationPolicy/properties/type") |

### type




`type`

-   is optional
-   Type: `string`
-   cannot be null
-   defined in: [DeliveryConfig](keel-defs-migrationpolicy-properties-type.md "https&#x3A;//keel-prestaging.us-west-2.spinnaker.mgmt.netflix.net/schema/#/$defs/MigrationPolicy/properties/type")

#### type Type

`string`

## Definitions group Moniker

Reference this group by using

```json
{"$ref":"https://keel-prestaging.us-west-2.spinnaker.mgmt.netflix.net/schema/#/$defs/Moniker"}
```

| Property              | Type     | Required | Nullable       | Defined by                                                                                                                                                                |
| :-------------------- | -------- | -------- | -------------- | :------------------------------------------------------------------------------------------------------------------------------------------------------------------------ |
| [app](#app)           | `string` | Required | cannot be null | [DeliveryConfig](keel-defs-moniker-properties-app.md "https&#x3A;//keel-prestaging.us-west-2.spinnaker.mgmt.netflix.net/schema/#/$defs/Moniker/properties/app")           |
| [stack](#stack)       | `string` | Optional | cannot be null | [DeliveryConfig](keel-defs-moniker-properties-stack.md "https&#x3A;//keel-prestaging.us-west-2.spinnaker.mgmt.netflix.net/schema/#/$defs/Moniker/properties/stack")       |
| [detail](#detail)     | `string` | Optional | cannot be null | [DeliveryConfig](keel-defs-moniker-properties-detail.md "https&#x3A;//keel-prestaging.us-west-2.spinnaker.mgmt.netflix.net/schema/#/$defs/Moniker/properties/detail")     |
| [sequence](#sequence) | `number` | Optional | cannot be null | [DeliveryConfig](keel-defs-moniker-properties-sequence.md "https&#x3A;//keel-prestaging.us-west-2.spinnaker.mgmt.netflix.net/schema/#/$defs/Moniker/properties/sequence") |

### app




`app`

-   is required
-   Type: `string`
-   cannot be null
-   defined in: [DeliveryConfig](keel-defs-moniker-properties-app.md "https&#x3A;//keel-prestaging.us-west-2.spinnaker.mgmt.netflix.net/schema/#/$defs/Moniker/properties/app")

#### app Type

`string`

### stack




`stack`

-   is optional
-   Type: `string`
-   cannot be null
-   defined in: [DeliveryConfig](keel-defs-moniker-properties-stack.md "https&#x3A;//keel-prestaging.us-west-2.spinnaker.mgmt.netflix.net/schema/#/$defs/Moniker/properties/stack")

#### stack Type

`string`

### detail




`detail`

-   is optional
-   Type: `string`
-   cannot be null
-   defined in: [DeliveryConfig](keel-defs-moniker-properties-detail.md "https&#x3A;//keel-prestaging.us-west-2.spinnaker.mgmt.netflix.net/schema/#/$defs/Moniker/properties/detail")

#### detail Type

`string`

### sequence




`sequence`

-   is optional
-   Type: `number`
-   cannot be null
-   defined in: [DeliveryConfig](keel-defs-moniker-properties-sequence.md "https&#x3A;//keel-prestaging.us-west-2.spinnaker.mgmt.netflix.net/schema/#/$defs/Moniker/properties/sequence")

#### sequence Type

`number`

## Definitions group NotificationConfig

Reference this group by using

```json
{"$ref":"https://keel-prestaging.us-west-2.spinnaker.mgmt.netflix.net/schema/#/$defs/NotificationConfig"}
```

| Property                | Type          | Required | Nullable       | Defined by                                                                                                                                                                                        |
| :---------------------- | ------------- | -------- | -------------- | :------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------ |
| [type](#type)           | Not specified | Required | cannot be null | [DeliveryConfig](keel-defs-notificationconfig-properties-type.md "https&#x3A;//keel-prestaging.us-west-2.spinnaker.mgmt.netflix.net/schema/#/$defs/NotificationConfig/properties/type")           |
| [address](#address)     | `string`      | Required | cannot be null | [DeliveryConfig](keel-defs-notificationconfig-properties-address.md "https&#x3A;//keel-prestaging.us-west-2.spinnaker.mgmt.netflix.net/schema/#/$defs/NotificationConfig/properties/address")     |
| [frequency](#frequency) | Not specified | Required | cannot be null | [DeliveryConfig](keel-defs-notificationconfig-properties-frequency.md "https&#x3A;//keel-prestaging.us-west-2.spinnaker.mgmt.netflix.net/schema/#/$defs/NotificationConfig/properties/frequency") |

### type




`type`

-   is required
-   Type: unknown
-   cannot be null
-   defined in: [DeliveryConfig](keel-defs-notificationconfig-properties-type.md "https&#x3A;//keel-prestaging.us-west-2.spinnaker.mgmt.netflix.net/schema/#/$defs/NotificationConfig/properties/type")

#### type Type

unknown

#### type Constraints

**enum**: the value of this property must be equal to one of the following values:

| Value     | Explanation |
| :-------- | ----------- |
| `"slack"` |             |
| `"email"` |             |

### address




`address`

-   is required
-   Type: `string`
-   cannot be null
-   defined in: [DeliveryConfig](keel-defs-notificationconfig-properties-address.md "https&#x3A;//keel-prestaging.us-west-2.spinnaker.mgmt.netflix.net/schema/#/$defs/NotificationConfig/properties/address")

#### address Type

`string`

### frequency




`frequency`

-   is required
-   Type: unknown
-   cannot be null
-   defined in: [DeliveryConfig](keel-defs-notificationconfig-properties-frequency.md "https&#x3A;//keel-prestaging.us-west-2.spinnaker.mgmt.netflix.net/schema/#/$defs/NotificationConfig/properties/frequency")

#### frequency Type

unknown

#### frequency Constraints

**enum**: the value of this property must be equal to one of the following values:

| Value       | Explanation |
| :---------- | ----------- |
| `"verbose"` |             |
| `"normal"`  |             |
| `"quiet"`   |             |

## Definitions group PipelineConstraint

Reference this group by using

```json
{"$ref":"https://keel-prestaging.us-west-2.spinnaker.mgmt.netflix.net/schema/#/$defs/PipelineConstraint"}
```

| Property                  | Type     | Required | Nullable       | Defined by                                                                                                                                                                                          |
| :------------------------ | -------- | -------- | -------------- | :-------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------- |
| [timeout](#timeout)       | `string` | Optional | cannot be null | [DeliveryConfig](keel-defs-pipelineconstraint-properties-timeout.md "https&#x3A;//keel-prestaging.us-west-2.spinnaker.mgmt.netflix.net/schema/#/$defs/PipelineConstraint/properties/timeout")       |
| [pipelineId](#pipelineId) | `string` | Required | cannot be null | [DeliveryConfig](keel-defs-pipelineconstraint-properties-pipelineid.md "https&#x3A;//keel-prestaging.us-west-2.spinnaker.mgmt.netflix.net/schema/#/$defs/PipelineConstraint/properties/pipelineId") |
| [retries](#retries)       | `number` | Optional | cannot be null | [DeliveryConfig](keel-defs-pipelineconstraint-properties-retries.md "https&#x3A;//keel-prestaging.us-west-2.spinnaker.mgmt.netflix.net/schema/#/$defs/PipelineConstraint/properties/retries")       |
| [parameters](#parameters) | `object` | Optional | cannot be null | [DeliveryConfig](keel-defs-pipelineconstraint-properties-parameters.md "https&#x3A;//keel-prestaging.us-west-2.spinnaker.mgmt.netflix.net/schema/#/$defs/PipelineConstraint/properties/parameters") |

### timeout




`timeout`

-   is optional
-   Type: `string`
-   cannot be null
-   defined in: [DeliveryConfig](keel-defs-pipelineconstraint-properties-timeout.md "https&#x3A;//keel-prestaging.us-west-2.spinnaker.mgmt.netflix.net/schema/#/$defs/PipelineConstraint/properties/timeout")

#### timeout Type

`string`

#### timeout Constraints

**duration**: the string must be a duration string, according to [RFC 3339, section 5.6](https://tools.ietf.org/html/rfc3339 "check the specification")

### pipelineId




`pipelineId`

-   is required
-   Type: `string`
-   cannot be null
-   defined in: [DeliveryConfig](keel-defs-pipelineconstraint-properties-pipelineid.md "https&#x3A;//keel-prestaging.us-west-2.spinnaker.mgmt.netflix.net/schema/#/$defs/PipelineConstraint/properties/pipelineId")

#### pipelineId Type

`string`

### retries




`retries`

-   is optional
-   Type: `number`
-   cannot be null
-   defined in: [DeliveryConfig](keel-defs-pipelineconstraint-properties-retries.md "https&#x3A;//keel-prestaging.us-west-2.spinnaker.mgmt.netflix.net/schema/#/$defs/PipelineConstraint/properties/retries")

#### retries Type

`number`

### parameters




`parameters`

-   is optional
-   Type: `object` ([Details](keel-defs-pipelineconstraint-properties-parameters.md))
-   cannot be null
-   defined in: [DeliveryConfig](keel-defs-pipelineconstraint-properties-parameters.md "https&#x3A;//keel-prestaging.us-west-2.spinnaker.mgmt.netflix.net/schema/#/$defs/PipelineConstraint/properties/parameters")

#### parameters Type

`object` ([Details](keel-defs-pipelineconstraint-properties-parameters.md))

## Definitions group PortRange

Reference this group by using

```json
{"$ref":"https://keel-prestaging.us-west-2.spinnaker.mgmt.netflix.net/schema/#/$defs/PortRange"}
```

| Property                | Type     | Required | Nullable       | Defined by                                                                                                                                                                      |
| :---------------------- | -------- | -------- | -------------- | :------------------------------------------------------------------------------------------------------------------------------------------------------------------------------ |
| [startPort](#startPort) | `number` | Required | cannot be null | [DeliveryConfig](keel-defs-portrange-properties-startport.md "https&#x3A;//keel-prestaging.us-west-2.spinnaker.mgmt.netflix.net/schema/#/$defs/PortRange/properties/startPort") |
| [endPort](#endPort)     | `number` | Required | cannot be null | [DeliveryConfig](keel-defs-portrange-properties-endport.md "https&#x3A;//keel-prestaging.us-west-2.spinnaker.mgmt.netflix.net/schema/#/$defs/PortRange/properties/endPort")     |

### startPort




`startPort`

-   is required
-   Type: `number`
-   cannot be null
-   defined in: [DeliveryConfig](keel-defs-portrange-properties-startport.md "https&#x3A;//keel-prestaging.us-west-2.spinnaker.mgmt.netflix.net/schema/#/$defs/PortRange/properties/startPort")

#### startPort Type

`number`

### endPort




`endPort`

-   is required
-   Type: `number`
-   cannot be null
-   defined in: [DeliveryConfig](keel-defs-portrange-properties-endport.md "https&#x3A;//keel-prestaging.us-west-2.spinnaker.mgmt.netflix.net/schema/#/$defs/PortRange/properties/endPort")

#### endPort Type

`number`

## Definitions group PredefinedMetricSpecification

Reference this group by using

```json
{"$ref":"https://keel-prestaging.us-west-2.spinnaker.mgmt.netflix.net/schema/#/$defs/PredefinedMetricSpecification"}
```

| Property        | Type     | Required | Nullable       | Defined by                                                                                                                                                                                                      |
| :-------------- | -------- | -------- | -------------- | :-------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------- |
| [type](#type)   | `string` | Required | cannot be null | [DeliveryConfig](keel-defs-predefinedmetricspecification-properties-type.md "https&#x3A;//keel-prestaging.us-west-2.spinnaker.mgmt.netflix.net/schema/#/$defs/PredefinedMetricSpecification/properties/type")   |
| [label](#label) | `string` | Optional | cannot be null | [DeliveryConfig](keel-defs-predefinedmetricspecification-properties-label.md "https&#x3A;//keel-prestaging.us-west-2.spinnaker.mgmt.netflix.net/schema/#/$defs/PredefinedMetricSpecification/properties/label") |

### type




`type`

-   is required
-   Type: `string`
-   cannot be null
-   defined in: [DeliveryConfig](keel-defs-predefinedmetricspecification-properties-type.md "https&#x3A;//keel-prestaging.us-west-2.spinnaker.mgmt.netflix.net/schema/#/$defs/PredefinedMetricSpecification/properties/type")

#### type Type

`string`

### label




`label`

-   is optional
-   Type: `string`
-   cannot be null
-   defined in: [DeliveryConfig](keel-defs-predefinedmetricspecification-properties-label.md "https&#x3A;//keel-prestaging.us-west-2.spinnaker.mgmt.netflix.net/schema/#/$defs/PredefinedMetricSpecification/properties/label")

#### label Type

`string`

## Definitions group RedBlack

Reference this group by using

```json
{"$ref":"https://keel-prestaging.us-west-2.spinnaker.mgmt.netflix.net/schema/#/$defs/RedBlack"}
```

| Property                                      | Type          | Required | Nullable       | Defined by                                                                                                                                                                                          |
| :-------------------------------------------- | ------------- | -------- | -------------- | :-------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------- |
| [strategy](#strategy)                         | Not specified | Required | cannot be null | [DeliveryConfig](keel-defs-redblack-properties-strategy.md "https&#x3A;//keel-prestaging.us-west-2.spinnaker.mgmt.netflix.net/schema/#/$defs/RedBlack/properties/strategy")                         |
| [rollbackOnFailure](#rollbackOnFailure)       | `boolean`     | Optional | cannot be null | [DeliveryConfig](keel-defs-redblack-properties-rollbackonfailure.md "https&#x3A;//keel-prestaging.us-west-2.spinnaker.mgmt.netflix.net/schema/#/$defs/RedBlack/properties/rollbackOnFailure")       |
| [resizePreviousToZero](#resizePreviousToZero) | `boolean`     | Optional | cannot be null | [DeliveryConfig](keel-defs-redblack-properties-resizeprevioustozero.md "https&#x3A;//keel-prestaging.us-west-2.spinnaker.mgmt.netflix.net/schema/#/$defs/RedBlack/properties/resizePreviousToZero") |
| [maxServerGroups](#maxServerGroups)           | `number`      | Optional | cannot be null | [DeliveryConfig](keel-defs-redblack-properties-maxservergroups.md "https&#x3A;//keel-prestaging.us-west-2.spinnaker.mgmt.netflix.net/schema/#/$defs/RedBlack/properties/maxServerGroups")           |
| [delayBeforeDisable](#delayBeforeDisable)     | `string`      | Optional | cannot be null | [DeliveryConfig](keel-defs-redblack-properties-delaybeforedisable.md "https&#x3A;//keel-prestaging.us-west-2.spinnaker.mgmt.netflix.net/schema/#/$defs/RedBlack/properties/delayBeforeDisable")     |
| [delayBeforeScaleDown](#delayBeforeScaleDown) | `string`      | Optional | cannot be null | [DeliveryConfig](keel-defs-redblack-properties-delaybeforescaledown.md "https&#x3A;//keel-prestaging.us-west-2.spinnaker.mgmt.netflix.net/schema/#/$defs/RedBlack/properties/delayBeforeScaleDown") |
| [stagger](#stagger)                           | `array`       | Optional | cannot be null | [DeliveryConfig](keel-defs-redblack-properties-stagger.md "https&#x3A;//keel-prestaging.us-west-2.spinnaker.mgmt.netflix.net/schema/#/$defs/RedBlack/properties/stagger")                           |

### strategy




`strategy`

-   is required
-   Type: unknown
-   cannot be null
-   defined in: [DeliveryConfig](keel-defs-redblack-properties-strategy.md "https&#x3A;//keel-prestaging.us-west-2.spinnaker.mgmt.netflix.net/schema/#/$defs/RedBlack/properties/strategy")

#### strategy Type

unknown

#### strategy Constraints

**enum**: the value of this property must be equal to one of the following values:

| Value         | Explanation |
| :------------ | ----------- |
| `"red-black"` |             |

### rollbackOnFailure




`rollbackOnFailure`

-   is optional
-   Type: `boolean`
-   cannot be null
-   defined in: [DeliveryConfig](keel-defs-redblack-properties-rollbackonfailure.md "https&#x3A;//keel-prestaging.us-west-2.spinnaker.mgmt.netflix.net/schema/#/$defs/RedBlack/properties/rollbackOnFailure")

#### rollbackOnFailure Type

`boolean`

### resizePreviousToZero




`resizePreviousToZero`

-   is optional
-   Type: `boolean`
-   cannot be null
-   defined in: [DeliveryConfig](keel-defs-redblack-properties-resizeprevioustozero.md "https&#x3A;//keel-prestaging.us-west-2.spinnaker.mgmt.netflix.net/schema/#/$defs/RedBlack/properties/resizePreviousToZero")

#### resizePreviousToZero Type

`boolean`

### maxServerGroups




`maxServerGroups`

-   is optional
-   Type: `number`
-   cannot be null
-   defined in: [DeliveryConfig](keel-defs-redblack-properties-maxservergroups.md "https&#x3A;//keel-prestaging.us-west-2.spinnaker.mgmt.netflix.net/schema/#/$defs/RedBlack/properties/maxServerGroups")

#### maxServerGroups Type

`number`

### delayBeforeDisable




`delayBeforeDisable`

-   is optional
-   Type: `string`
-   cannot be null
-   defined in: [DeliveryConfig](keel-defs-redblack-properties-delaybeforedisable.md "https&#x3A;//keel-prestaging.us-west-2.spinnaker.mgmt.netflix.net/schema/#/$defs/RedBlack/properties/delayBeforeDisable")

#### delayBeforeDisable Type

`string`

#### delayBeforeDisable Constraints

**duration**: the string must be a duration string, according to [RFC 3339, section 5.6](https://tools.ietf.org/html/rfc3339 "check the specification")

### delayBeforeScaleDown




`delayBeforeScaleDown`

-   is optional
-   Type: `string`
-   cannot be null
-   defined in: [DeliveryConfig](keel-defs-redblack-properties-delaybeforescaledown.md "https&#x3A;//keel-prestaging.us-west-2.spinnaker.mgmt.netflix.net/schema/#/$defs/RedBlack/properties/delayBeforeScaleDown")

#### delayBeforeScaleDown Type

`string`

#### delayBeforeScaleDown Constraints

**duration**: the string must be a duration string, according to [RFC 3339, section 5.6](https://tools.ietf.org/html/rfc3339 "check the specification")

### stagger




`stagger`

-   is optional
-   Type: `object[]` ([Details](keel-defs-staggeredregion.md))
-   cannot be null
-   defined in: [DeliveryConfig](keel-defs-redblack-properties-stagger.md "https&#x3A;//keel-prestaging.us-west-2.spinnaker.mgmt.netflix.net/schema/#/$defs/RedBlack/properties/stagger")

#### stagger Type

`object[]` ([Details](keel-defs-staggeredregion.md))

## Definitions group RedirectConfig

Reference this group by using

```json
{"$ref":"https://keel-prestaging.us-west-2.spinnaker.mgmt.netflix.net/schema/#/$defs/RedirectConfig"}
```

| Property                  | Type     | Required | Nullable       | Defined by                                                                                                                                                                                  |
| :------------------------ | -------- | -------- | -------------- | :------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------ |
| [protocol](#protocol)     | `string` | Required | cannot be null | [DeliveryConfig](keel-defs-redirectconfig-properties-protocol.md "https&#x3A;//keel-prestaging.us-west-2.spinnaker.mgmt.netflix.net/schema/#/$defs/RedirectConfig/properties/protocol")     |
| [port](#port)             | `string` | Optional | cannot be null | [DeliveryConfig](keel-defs-redirectconfig-properties-port.md "https&#x3A;//keel-prestaging.us-west-2.spinnaker.mgmt.netflix.net/schema/#/$defs/RedirectConfig/properties/port")             |
| [host](#host)             | `string` | Required | cannot be null | [DeliveryConfig](keel-defs-redirectconfig-properties-host.md "https&#x3A;//keel-prestaging.us-west-2.spinnaker.mgmt.netflix.net/schema/#/$defs/RedirectConfig/properties/host")             |
| [path](#path)             | `string` | Required | cannot be null | [DeliveryConfig](keel-defs-redirectconfig-properties-path.md "https&#x3A;//keel-prestaging.us-west-2.spinnaker.mgmt.netflix.net/schema/#/$defs/RedirectConfig/properties/path")             |
| [query](#query)           | `string` | Optional | cannot be null | [DeliveryConfig](keel-defs-redirectconfig-properties-query.md "https&#x3A;//keel-prestaging.us-west-2.spinnaker.mgmt.netflix.net/schema/#/$defs/RedirectConfig/properties/query")           |
| [statusCode](#statusCode) | `string` | Required | cannot be null | [DeliveryConfig](keel-defs-redirectconfig-properties-statuscode.md "https&#x3A;//keel-prestaging.us-west-2.spinnaker.mgmt.netflix.net/schema/#/$defs/RedirectConfig/properties/statusCode") |

### protocol




`protocol`

-   is required
-   Type: `string`
-   cannot be null
-   defined in: [DeliveryConfig](keel-defs-redirectconfig-properties-protocol.md "https&#x3A;//keel-prestaging.us-west-2.spinnaker.mgmt.netflix.net/schema/#/$defs/RedirectConfig/properties/protocol")

#### protocol Type

`string`

### port




`port`

-   is optional
-   Type: `string`
-   cannot be null
-   defined in: [DeliveryConfig](keel-defs-redirectconfig-properties-port.md "https&#x3A;//keel-prestaging.us-west-2.spinnaker.mgmt.netflix.net/schema/#/$defs/RedirectConfig/properties/port")

#### port Type

`string`

### host




`host`

-   is required
-   Type: `string`
-   cannot be null
-   defined in: [DeliveryConfig](keel-defs-redirectconfig-properties-host.md "https&#x3A;//keel-prestaging.us-west-2.spinnaker.mgmt.netflix.net/schema/#/$defs/RedirectConfig/properties/host")

#### host Type

`string`

### path




`path`

-   is required
-   Type: `string`
-   cannot be null
-   defined in: [DeliveryConfig](keel-defs-redirectconfig-properties-path.md "https&#x3A;//keel-prestaging.us-west-2.spinnaker.mgmt.netflix.net/schema/#/$defs/RedirectConfig/properties/path")

#### path Type

`string`

### query




`query`

-   is optional
-   Type: `string`
-   cannot be null
-   defined in: [DeliveryConfig](keel-defs-redirectconfig-properties-query.md "https&#x3A;//keel-prestaging.us-west-2.spinnaker.mgmt.netflix.net/schema/#/$defs/RedirectConfig/properties/query")

#### query Type

`string`

### statusCode




`statusCode`

-   is required
-   Type: `string`
-   cannot be null
-   defined in: [DeliveryConfig](keel-defs-redirectconfig-properties-statuscode.md "https&#x3A;//keel-prestaging.us-west-2.spinnaker.mgmt.netflix.net/schema/#/$defs/RedirectConfig/properties/statusCode")

#### statusCode Type

`string`

## Definitions group ReferenceArtifactImageProvider

Reference this group by using

```json
{"$ref":"https://keel-prestaging.us-west-2.spinnaker.mgmt.netflix.net/schema/#/$defs/ReferenceArtifactImageProvider"}
```

| Property                | Type     | Required | Nullable       | Defined by                                                                                                                                                                                                                |
| :---------------------- | -------- | -------- | -------------- | :------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------ |
| [reference](#reference) | `string` | Required | cannot be null | [DeliveryConfig](keel-defs-referenceartifactimageprovider-properties-reference.md "https&#x3A;//keel-prestaging.us-west-2.spinnaker.mgmt.netflix.net/schema/#/$defs/ReferenceArtifactImageProvider/properties/reference") |

### reference




`reference`

-   is required
-   Type: `string`
-   cannot be null
-   defined in: [DeliveryConfig](keel-defs-referenceartifactimageprovider-properties-reference.md "https&#x3A;//keel-prestaging.us-west-2.spinnaker.mgmt.netflix.net/schema/#/$defs/ReferenceArtifactImageProvider/properties/reference")

#### reference Type

`string`

## Definitions group ReferenceProvider

Reference this group by using

```json
{"$ref":"https://keel-prestaging.us-west-2.spinnaker.mgmt.netflix.net/schema/#/$defs/ReferenceProvider"}
```

| Property                | Type     | Required | Nullable       | Defined by                                                                                                                                                                                      |
| :---------------------- | -------- | -------- | -------------- | :---------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------- |
| [reference](#reference) | `string` | Required | cannot be null | [DeliveryConfig](keel-defs-referenceprovider-properties-reference.md "https&#x3A;//keel-prestaging.us-west-2.spinnaker.mgmt.netflix.net/schema/#/$defs/ReferenceProvider/properties/reference") |

### reference




`reference`

-   is required
-   Type: `string`
-   cannot be null
-   defined in: [DeliveryConfig](keel-defs-referenceprovider-properties-reference.md "https&#x3A;//keel-prestaging.us-west-2.spinnaker.mgmt.netflix.net/schema/#/$defs/ReferenceProvider/properties/reference")

#### reference Type

`string`

## Definitions group ReferenceRule

Reference this group by using

```json
{"$ref":"https://keel-prestaging.us-west-2.spinnaker.mgmt.netflix.net/schema/#/$defs/ReferenceRule"}
```

| Property                | Type          | Required | Nullable       | Defined by                                                                                                                                                                            |
| :---------------------- | ------------- | -------- | -------------- | :------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------ |
| [protocol](#protocol)   | Not specified | Required | cannot be null | [DeliveryConfig](keel-defs-referencerule-properties-protocol.md "https&#x3A;//keel-prestaging.us-west-2.spinnaker.mgmt.netflix.net/schema/#/$defs/ReferenceRule/properties/protocol") |
| [name](#name)           | `string`      | Required | cannot be null | [DeliveryConfig](keel-defs-referencerule-properties-name.md "https&#x3A;//keel-prestaging.us-west-2.spinnaker.mgmt.netflix.net/schema/#/$defs/ReferenceRule/properties/name")         |
| [portRange](#portRange) | `object`      | Required | cannot be null | [DeliveryConfig](keel-defs-portrange.md "https&#x3A;//keel-prestaging.us-west-2.spinnaker.mgmt.netflix.net/schema/#/$defs/ReferenceRule/properties/portRange")                        |

### protocol




`protocol`

-   is required
-   Type: unknown
-   cannot be null
-   defined in: [DeliveryConfig](keel-defs-referencerule-properties-protocol.md "https&#x3A;//keel-prestaging.us-west-2.spinnaker.mgmt.netflix.net/schema/#/$defs/ReferenceRule/properties/protocol")

#### protocol Type

unknown

#### protocol Constraints

**enum**: the value of this property must be equal to one of the following values:

| Value    | Explanation |
| :------- | ----------- |
| `"TCP"`  |             |
| `"UDP"`  |             |
| `"ICMP"` |             |

### name




`name`

-   is required
-   Type: `string`
-   cannot be null
-   defined in: [DeliveryConfig](keel-defs-referencerule-properties-name.md "https&#x3A;//keel-prestaging.us-west-2.spinnaker.mgmt.netflix.net/schema/#/$defs/ReferenceRule/properties/name")

#### name Type

`string`

### portRange




`portRange`

-   is required
-   Type: `object` ([Details](keel-defs-portrange.md))
-   cannot be null
-   defined in: [DeliveryConfig](keel-defs-portrange.md "https&#x3A;//keel-prestaging.us-west-2.spinnaker.mgmt.netflix.net/schema/#/$defs/ReferenceRule/properties/portRange")

#### portRange Type

`object` ([Details](keel-defs-portrange.md))

## Definitions group Resource

Reference this group by using

```json
{"$ref":"https://keel-prestaging.us-west-2.spinnaker.mgmt.netflix.net/schema/#/$defs/Resource"}
```

| Property                  | Type     | Required | Nullable       | Defined by                                                                                                                                                                      |
| :------------------------ | -------- | -------- | -------------- | :------------------------------------------------------------------------------------------------------------------------------------------------------------------------------ |
| [apiVersion](#apiVersion) | `string` | Required | cannot be null | [DeliveryConfig](keel-defs-resource-properties-apiversion.md "https&#x3A;//keel-prestaging.us-west-2.spinnaker.mgmt.netflix.net/schema/#/$defs/Resource/properties/apiVersion") |
| [kind](#kind)             | `string` | Required | cannot be null | [DeliveryConfig](keel-defs-resource-properties-kind.md "https&#x3A;//keel-prestaging.us-west-2.spinnaker.mgmt.netflix.net/schema/#/$defs/Resource/properties/kind")             |
| [metadata](#metadata)     | `object` | Required | cannot be null | [DeliveryConfig](keel-defs-resource-properties-metadata.md "https&#x3A;//keel-prestaging.us-west-2.spinnaker.mgmt.netflix.net/schema/#/$defs/Resource/properties/metadata")     |
| [spec](#spec)             | Merged   | Required | cannot be null | [DeliveryConfig](keel-defs-resourcespec.md "https&#x3A;//keel-prestaging.us-west-2.spinnaker.mgmt.netflix.net/schema/#/$defs/Resource/properties/spec")                         |

### apiVersion




`apiVersion`

-   is required
-   Type: `string`
-   cannot be null
-   defined in: [DeliveryConfig](keel-defs-resource-properties-apiversion.md "https&#x3A;//keel-prestaging.us-west-2.spinnaker.mgmt.netflix.net/schema/#/$defs/Resource/properties/apiVersion")

#### apiVersion Type

`string`

### kind




`kind`

-   is required
-   Type: `string`
-   cannot be null
-   defined in: [DeliveryConfig](keel-defs-resource-properties-kind.md "https&#x3A;//keel-prestaging.us-west-2.spinnaker.mgmt.netflix.net/schema/#/$defs/Resource/properties/kind")

#### kind Type

`string`

### metadata




`metadata`

-   is required
-   Type: `object` ([Details](keel-defs-resource-properties-metadata.md))
-   cannot be null
-   defined in: [DeliveryConfig](keel-defs-resource-properties-metadata.md "https&#x3A;//keel-prestaging.us-west-2.spinnaker.mgmt.netflix.net/schema/#/$defs/Resource/properties/metadata")

#### metadata Type

`object` ([Details](keel-defs-resource-properties-metadata.md))

### spec




`spec`

-   is required
-   Type: merged type ([Details](keel-defs-resourcespec.md))
-   cannot be null
-   defined in: [DeliveryConfig](keel-defs-resourcespec.md "https&#x3A;//keel-prestaging.us-west-2.spinnaker.mgmt.netflix.net/schema/#/$defs/Resource/properties/spec")

#### spec Type

merged type ([Details](keel-defs-resourcespec.md))

one (and only one) of

-   [Untitled object in DeliveryConfig](keel-defs-imagespec.md "check type definition")
-   [Untitled object in DeliveryConfig](keel-defs-clusterspec.md "check type definition")
-   [Untitled object in DeliveryConfig](keel-defs-securitygroupspec.md "check type definition")
-   [Untitled object in DeliveryConfig](keel-defs-classicloadbalancerspec.md "check type definition")
-   [Untitled object in DeliveryConfig](keel-defs-applicationloadbalancerspec.md "check type definition")
-   [Untitled object in DeliveryConfig](keel-defs-titusclusterspec.md "check type definition")

## Definitions group ResourceSpec

Reference this group by using

```json
{"$ref":"https://keel-prestaging.us-west-2.spinnaker.mgmt.netflix.net/schema/#/$defs/ResourceSpec"}
```

| Property | Type | Required | Nullable | Defined by |
| :------- | ---- | -------- | -------- | :--------- |

## Definitions group ResourcesSpec

Reference this group by using

```json
{"$ref":"https://keel-prestaging.us-west-2.spinnaker.mgmt.netflix.net/schema/#/$defs/ResourcesSpec"}
```

| Property                    | Type     | Required | Nullable       | Defined by                                                                                                                                                                                  |
| :-------------------------- | -------- | -------- | -------------- | :------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------ |
| [cpu](#cpu)                 | `number` | Optional | cannot be null | [DeliveryConfig](keel-defs-resourcesspec-properties-cpu.md "https&#x3A;//keel-prestaging.us-west-2.spinnaker.mgmt.netflix.net/schema/#/$defs/ResourcesSpec/properties/cpu")                 |
| [disk](#disk)               | `number` | Optional | cannot be null | [DeliveryConfig](keel-defs-resourcesspec-properties-disk.md "https&#x3A;//keel-prestaging.us-west-2.spinnaker.mgmt.netflix.net/schema/#/$defs/ResourcesSpec/properties/disk")               |
| [gpu](#gpu)                 | `number` | Optional | cannot be null | [DeliveryConfig](keel-defs-resourcesspec-properties-gpu.md "https&#x3A;//keel-prestaging.us-west-2.spinnaker.mgmt.netflix.net/schema/#/$defs/ResourcesSpec/properties/gpu")                 |
| [memory](#memory)           | `number` | Optional | cannot be null | [DeliveryConfig](keel-defs-resourcesspec-properties-memory.md "https&#x3A;//keel-prestaging.us-west-2.spinnaker.mgmt.netflix.net/schema/#/$defs/ResourcesSpec/properties/memory")           |
| [networkMbps](#networkMbps) | `number` | Optional | cannot be null | [DeliveryConfig](keel-defs-resourcesspec-properties-networkmbps.md "https&#x3A;//keel-prestaging.us-west-2.spinnaker.mgmt.netflix.net/schema/#/$defs/ResourcesSpec/properties/networkMbps") |

### cpu




`cpu`

-   is optional
-   Type: `number`
-   cannot be null
-   defined in: [DeliveryConfig](keel-defs-resourcesspec-properties-cpu.md "https&#x3A;//keel-prestaging.us-west-2.spinnaker.mgmt.netflix.net/schema/#/$defs/ResourcesSpec/properties/cpu")

#### cpu Type

`number`

### disk




`disk`

-   is optional
-   Type: `number`
-   cannot be null
-   defined in: [DeliveryConfig](keel-defs-resourcesspec-properties-disk.md "https&#x3A;//keel-prestaging.us-west-2.spinnaker.mgmt.netflix.net/schema/#/$defs/ResourcesSpec/properties/disk")

#### disk Type

`number`

### gpu




`gpu`

-   is optional
-   Type: `number`
-   cannot be null
-   defined in: [DeliveryConfig](keel-defs-resourcesspec-properties-gpu.md "https&#x3A;//keel-prestaging.us-west-2.spinnaker.mgmt.netflix.net/schema/#/$defs/ResourcesSpec/properties/gpu")

#### gpu Type

`number`

### memory




`memory`

-   is optional
-   Type: `number`
-   cannot be null
-   defined in: [DeliveryConfig](keel-defs-resourcesspec-properties-memory.md "https&#x3A;//keel-prestaging.us-west-2.spinnaker.mgmt.netflix.net/schema/#/$defs/ResourcesSpec/properties/memory")

#### memory Type

`number`

### networkMbps




`networkMbps`

-   is optional
-   Type: `number`
-   cannot be null
-   defined in: [DeliveryConfig](keel-defs-resourcesspec-properties-networkmbps.md "https&#x3A;//keel-prestaging.us-west-2.spinnaker.mgmt.netflix.net/schema/#/$defs/ResourcesSpec/properties/networkMbps")

#### networkMbps Type

`number`

## Definitions group Rule

Reference this group by using

```json
{"$ref":"https://keel-prestaging.us-west-2.spinnaker.mgmt.netflix.net/schema/#/$defs/Rule"}
```

| Property                  | Type      | Required | Nullable       | Defined by                                                                                                                                                              |
| :------------------------ | --------- | -------- | -------------- | :---------------------------------------------------------------------------------------------------------------------------------------------------------------------- |
| [priority](#priority)     | `string`  | Required | cannot be null | [DeliveryConfig](keel-defs-rule-properties-priority.md "https&#x3A;//keel-prestaging.us-west-2.spinnaker.mgmt.netflix.net/schema/#/$defs/Rule/properties/priority")     |
| [conditions](#conditions) | `array`   | Optional | cannot be null | [DeliveryConfig](keel-defs-rule-properties-conditions.md "https&#x3A;//keel-prestaging.us-west-2.spinnaker.mgmt.netflix.net/schema/#/$defs/Rule/properties/conditions") |
| [actions](#actions)       | `array`   | Required | cannot be null | [DeliveryConfig](keel-defs-rule-properties-actions.md "https&#x3A;//keel-prestaging.us-west-2.spinnaker.mgmt.netflix.net/schema/#/$defs/Rule/properties/actions")       |
| [default](#default)       | `boolean` | Required | cannot be null | [DeliveryConfig](keel-defs-rule-properties-default.md "https&#x3A;//keel-prestaging.us-west-2.spinnaker.mgmt.netflix.net/schema/#/$defs/Rule/properties/default")       |

### priority




`priority`

-   is required
-   Type: `string`
-   cannot be null
-   defined in: [DeliveryConfig](keel-defs-rule-properties-priority.md "https&#x3A;//keel-prestaging.us-west-2.spinnaker.mgmt.netflix.net/schema/#/$defs/Rule/properties/priority")

#### priority Type

`string`

### conditions




`conditions`

-   is optional
-   Type: `object[]` ([Details](keel-defs-condition.md))
-   cannot be null
-   defined in: [DeliveryConfig](keel-defs-rule-properties-conditions.md "https&#x3A;//keel-prestaging.us-west-2.spinnaker.mgmt.netflix.net/schema/#/$defs/Rule/properties/conditions")

#### conditions Type

`object[]` ([Details](keel-defs-condition.md))

### actions




`actions`

-   is required
-   Type: `object[]` ([Details](keel-defs-action.md))
-   cannot be null
-   defined in: [DeliveryConfig](keel-defs-rule-properties-actions.md "https&#x3A;//keel-prestaging.us-west-2.spinnaker.mgmt.netflix.net/schema/#/$defs/Rule/properties/actions")

#### actions Type

`object[]` ([Details](keel-defs-action.md))

### default




`default`

-   is required
-   Type: `boolean`
-   cannot be null
-   defined in: [DeliveryConfig](keel-defs-rule-properties-default.md "https&#x3A;//keel-prestaging.us-west-2.spinnaker.mgmt.netflix.net/schema/#/$defs/Rule/properties/default")

#### default Type

`boolean`

## Definitions group Scaling

Reference this group by using

```json
{"$ref":"https://keel-prestaging.us-west-2.spinnaker.mgmt.netflix.net/schema/#/$defs/Scaling"}
```

| Property                                          | Type    | Required | Nullable       | Defined by                                                                                                                                                                                            |
| :------------------------------------------------ | ------- | -------- | -------------- | :---------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------- |
| [suspendedProcesses](#suspendedProcesses)         | `array` | Optional | cannot be null | [DeliveryConfig](keel-defs-scaling-properties-suspendedprocesses.md "https&#x3A;//keel-prestaging.us-west-2.spinnaker.mgmt.netflix.net/schema/#/$defs/Scaling/properties/suspendedProcesses")         |
| [targetTrackingPolicies](#targetTrackingPolicies) | `array` | Optional | cannot be null | [DeliveryConfig](keel-defs-scaling-properties-targettrackingpolicies.md "https&#x3A;//keel-prestaging.us-west-2.spinnaker.mgmt.netflix.net/schema/#/$defs/Scaling/properties/targetTrackingPolicies") |
| [stepScalingPolicies](#stepScalingPolicies)       | `array` | Optional | cannot be null | [DeliveryConfig](keel-defs-scaling-properties-stepscalingpolicies.md "https&#x3A;//keel-prestaging.us-west-2.spinnaker.mgmt.netflix.net/schema/#/$defs/Scaling/properties/stepScalingPolicies")       |

### suspendedProcesses




`suspendedProcesses`

-   is optional
-   Type: unknown\[]
-   cannot be null
-   defined in: [DeliveryConfig](keel-defs-scaling-properties-suspendedprocesses.md "https&#x3A;//keel-prestaging.us-west-2.spinnaker.mgmt.netflix.net/schema/#/$defs/Scaling/properties/suspendedProcesses")

#### suspendedProcesses Type

unknown\[]

#### suspendedProcesses Constraints

**unique items**: all items in this array must be unique. Duplicates are not allowed.

### targetTrackingPolicies




`targetTrackingPolicies`

-   is optional
-   Type: `object[]` ([Details](keel-defs-targettrackingpolicy.md))
-   cannot be null
-   defined in: [DeliveryConfig](keel-defs-scaling-properties-targettrackingpolicies.md "https&#x3A;//keel-prestaging.us-west-2.spinnaker.mgmt.netflix.net/schema/#/$defs/Scaling/properties/targetTrackingPolicies")

#### targetTrackingPolicies Type

`object[]` ([Details](keel-defs-targettrackingpolicy.md))

#### targetTrackingPolicies Constraints

**unique items**: all items in this array must be unique. Duplicates are not allowed.

### stepScalingPolicies




`stepScalingPolicies`

-   is optional
-   Type: `object[]` ([Details](keel-defs-stepscalingpolicy.md))
-   cannot be null
-   defined in: [DeliveryConfig](keel-defs-scaling-properties-stepscalingpolicies.md "https&#x3A;//keel-prestaging.us-west-2.spinnaker.mgmt.netflix.net/schema/#/$defs/Scaling/properties/stepScalingPolicies")

#### stepScalingPolicies Type

`object[]` ([Details](keel-defs-stepscalingpolicy.md))

#### stepScalingPolicies Constraints

**unique items**: all items in this array must be unique. Duplicates are not allowed.

## Definitions group SecurityGroupRule

Reference this group by using

```json
{"$ref":"https://keel-prestaging.us-west-2.spinnaker.mgmt.netflix.net/schema/#/$defs/SecurityGroupRule"}
```

| Property | Type | Required | Nullable | Defined by |
| :------- | ---- | -------- | -------- | :--------- |

## Definitions group SecurityGroupSpec

Reference this group by using

```json
{"$ref":"https://keel-prestaging.us-west-2.spinnaker.mgmt.netflix.net/schema/#/$defs/SecurityGroupSpec"}
```

| Property                      | Type     | Required | Nullable       | Defined by                                                                                                                                                                                            |
| :---------------------------- | -------- | -------- | -------------- | :---------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------- |
| [moniker](#moniker)           | `object` | Required | cannot be null | [DeliveryConfig](keel-defs-moniker.md "https&#x3A;//keel-prestaging.us-west-2.spinnaker.mgmt.netflix.net/schema/#/$defs/SecurityGroupSpec/properties/moniker")                                        |
| [locations](#locations)       | `object` | Required | cannot be null | [DeliveryConfig](keel-defs-simplelocations.md "https&#x3A;//keel-prestaging.us-west-2.spinnaker.mgmt.netflix.net/schema/#/$defs/SecurityGroupSpec/properties/locations")                              |
| [description](#description)   | `string` | Optional | cannot be null | [DeliveryConfig](keel-defs-securitygroupspec-properties-description.md "https&#x3A;//keel-prestaging.us-west-2.spinnaker.mgmt.netflix.net/schema/#/$defs/SecurityGroupSpec/properties/description")   |
| [inboundRules](#inboundRules) | `array`  | Optional | cannot be null | [DeliveryConfig](keel-defs-securitygroupspec-properties-inboundrules.md "https&#x3A;//keel-prestaging.us-west-2.spinnaker.mgmt.netflix.net/schema/#/$defs/SecurityGroupSpec/properties/inboundRules") |
| [overrides](#overrides)       | `object` | Optional | cannot be null | [DeliveryConfig](keel-defs-securitygroupspec-properties-overrides.md "https&#x3A;//keel-prestaging.us-west-2.spinnaker.mgmt.netflix.net/schema/#/$defs/SecurityGroupSpec/properties/overrides")       |

### moniker




`moniker`

-   is required
-   Type: `object` ([Details](keel-defs-moniker.md))
-   cannot be null
-   defined in: [DeliveryConfig](keel-defs-moniker.md "https&#x3A;//keel-prestaging.us-west-2.spinnaker.mgmt.netflix.net/schema/#/$defs/SecurityGroupSpec/properties/moniker")

#### moniker Type

`object` ([Details](keel-defs-moniker.md))

### locations




`locations`

-   is required
-   Type: `object` ([Details](keel-defs-simplelocations.md))
-   cannot be null
-   defined in: [DeliveryConfig](keel-defs-simplelocations.md "https&#x3A;//keel-prestaging.us-west-2.spinnaker.mgmt.netflix.net/schema/#/$defs/SecurityGroupSpec/properties/locations")

#### locations Type

`object` ([Details](keel-defs-simplelocations.md))

### description




`description`

-   is optional
-   Type: `string`
-   cannot be null
-   defined in: [DeliveryConfig](keel-defs-securitygroupspec-properties-description.md "https&#x3A;//keel-prestaging.us-west-2.spinnaker.mgmt.netflix.net/schema/#/$defs/SecurityGroupSpec/properties/description")

#### description Type

`string`

### inboundRules




`inboundRules`

-   is optional
-   Type: an array of merged types ([Details](keel-defs-securitygrouprule.md))
-   cannot be null
-   defined in: [DeliveryConfig](keel-defs-securitygroupspec-properties-inboundrules.md "https&#x3A;//keel-prestaging.us-west-2.spinnaker.mgmt.netflix.net/schema/#/$defs/SecurityGroupSpec/properties/inboundRules")

#### inboundRules Type

an array of merged types ([Details](keel-defs-securitygrouprule.md))

#### inboundRules Constraints

**unique items**: all items in this array must be unique. Duplicates are not allowed.

### overrides




`overrides`

-   is optional
-   Type: `object` ([Details](keel-defs-securitygroupspec-properties-overrides.md))
-   cannot be null
-   defined in: [DeliveryConfig](keel-defs-securitygroupspec-properties-overrides.md "https&#x3A;//keel-prestaging.us-west-2.spinnaker.mgmt.netflix.net/schema/#/$defs/SecurityGroupSpec/properties/overrides")

#### overrides Type

`object` ([Details](keel-defs-securitygroupspec-properties-overrides.md))

## Definitions group SelfReferenceRule

Reference this group by using

```json
{"$ref":"https://keel-prestaging.us-west-2.spinnaker.mgmt.netflix.net/schema/#/$defs/SelfReferenceRule"}
```

| Property                | Type          | Required | Nullable       | Defined by                                                                                                                                                                                    |
| :---------------------- | ------------- | -------- | -------------- | :-------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------- |
| [protocol](#protocol)   | Not specified | Required | cannot be null | [DeliveryConfig](keel-defs-selfreferencerule-properties-protocol.md "https&#x3A;//keel-prestaging.us-west-2.spinnaker.mgmt.netflix.net/schema/#/$defs/SelfReferenceRule/properties/protocol") |
| [portRange](#portRange) | `object`      | Required | cannot be null | [DeliveryConfig](keel-defs-portrange.md "https&#x3A;//keel-prestaging.us-west-2.spinnaker.mgmt.netflix.net/schema/#/$defs/SelfReferenceRule/properties/portRange")                            |

### protocol




`protocol`

-   is required
-   Type: unknown
-   cannot be null
-   defined in: [DeliveryConfig](keel-defs-selfreferencerule-properties-protocol.md "https&#x3A;//keel-prestaging.us-west-2.spinnaker.mgmt.netflix.net/schema/#/$defs/SelfReferenceRule/properties/protocol")

#### protocol Type

unknown

#### protocol Constraints

**enum**: the value of this property must be equal to one of the following values:

| Value    | Explanation |
| :------- | ----------- |
| `"TCP"`  |             |
| `"UDP"`  |             |
| `"ICMP"` |             |

### portRange




`portRange`

-   is required
-   Type: `object` ([Details](keel-defs-portrange.md))
-   cannot be null
-   defined in: [DeliveryConfig](keel-defs-portrange.md "https&#x3A;//keel-prestaging.us-west-2.spinnaker.mgmt.netflix.net/schema/#/$defs/SelfReferenceRule/properties/portRange")

#### portRange Type

`object` ([Details](keel-defs-portrange.md))

## Definitions group SimpleLocations

Reference this group by using

```json
{"$ref":"https://keel-prestaging.us-west-2.spinnaker.mgmt.netflix.net/schema/#/$defs/SimpleLocations"}
```

| Property            | Type     | Required | Nullable       | Defined by                                                                                                                                                                              |
| :------------------ | -------- | -------- | -------------- | :-------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------- |
| [account](#account) | `string` | Required | cannot be null | [DeliveryConfig](keel-defs-simplelocations-properties-account.md "https&#x3A;//keel-prestaging.us-west-2.spinnaker.mgmt.netflix.net/schema/#/$defs/SimpleLocations/properties/account") |
| [vpc](#vpc)         | `string` | Optional | cannot be null | [DeliveryConfig](keel-defs-simplelocations-properties-vpc.md "https&#x3A;//keel-prestaging.us-west-2.spinnaker.mgmt.netflix.net/schema/#/$defs/SimpleLocations/properties/vpc")         |
| [regions](#regions) | `array`  | Required | cannot be null | [DeliveryConfig](keel-defs-simplelocations-properties-regions.md "https&#x3A;//keel-prestaging.us-west-2.spinnaker.mgmt.netflix.net/schema/#/$defs/SimpleLocations/properties/regions") |

### account




`account`

-   is required
-   Type: `string`
-   cannot be null
-   defined in: [DeliveryConfig](keel-defs-simplelocations-properties-account.md "https&#x3A;//keel-prestaging.us-west-2.spinnaker.mgmt.netflix.net/schema/#/$defs/SimpleLocations/properties/account")

#### account Type

`string`

### vpc




`vpc`

-   is optional
-   Type: `string`
-   cannot be null
-   defined in: [DeliveryConfig](keel-defs-simplelocations-properties-vpc.md "https&#x3A;//keel-prestaging.us-west-2.spinnaker.mgmt.netflix.net/schema/#/$defs/SimpleLocations/properties/vpc")

#### vpc Type

`string`

### regions




`regions`

-   is required
-   Type: `object[]` ([Details](keel-defs-simpleregionspec.md))
-   cannot be null
-   defined in: [DeliveryConfig](keel-defs-simplelocations-properties-regions.md "https&#x3A;//keel-prestaging.us-west-2.spinnaker.mgmt.netflix.net/schema/#/$defs/SimpleLocations/properties/regions")

#### regions Type

`object[]` ([Details](keel-defs-simpleregionspec.md))

#### regions Constraints

**unique items**: all items in this array must be unique. Duplicates are not allowed.

## Definitions group SimpleRegionSpec

Reference this group by using

```json
{"$ref":"https://keel-prestaging.us-west-2.spinnaker.mgmt.netflix.net/schema/#/$defs/SimpleRegionSpec"}
```

| Property      | Type     | Required | Nullable       | Defined by                                                                                                                                                                          |
| :------------ | -------- | -------- | -------------- | :---------------------------------------------------------------------------------------------------------------------------------------------------------------------------------- |
| [name](#name) | `string` | Required | cannot be null | [DeliveryConfig](keel-defs-simpleregionspec-properties-name.md "https&#x3A;//keel-prestaging.us-west-2.spinnaker.mgmt.netflix.net/schema/#/$defs/SimpleRegionSpec/properties/name") |

### name




`name`

-   is required
-   Type: `string`
-   cannot be null
-   defined in: [DeliveryConfig](keel-defs-simpleregionspec-properties-name.md "https&#x3A;//keel-prestaging.us-west-2.spinnaker.mgmt.netflix.net/schema/#/$defs/SimpleRegionSpec/properties/name")

#### name Type

`string`

## Definitions group StaggeredRegion

Reference this group by using

```json
{"$ref":"https://keel-prestaging.us-west-2.spinnaker.mgmt.netflix.net/schema/#/$defs/StaggeredRegion"}
```

| Property                | Type     | Required | Nullable       | Defined by                                                                                                                                                                                  |
| :---------------------- | -------- | -------- | -------------- | :------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------ |
| [region](#region)       | `string` | Required | cannot be null | [DeliveryConfig](keel-defs-staggeredregion-properties-region.md "https&#x3A;//keel-prestaging.us-west-2.spinnaker.mgmt.netflix.net/schema/#/$defs/StaggeredRegion/properties/region")       |
| [hours](#hours)         | `string` | Optional | cannot be null | [DeliveryConfig](keel-defs-staggeredregion-properties-hours.md "https&#x3A;//keel-prestaging.us-west-2.spinnaker.mgmt.netflix.net/schema/#/$defs/StaggeredRegion/properties/hours")         |
| [pauseTime](#pauseTime) | `string` | Optional | cannot be null | [DeliveryConfig](keel-defs-staggeredregion-properties-pausetime.md "https&#x3A;//keel-prestaging.us-west-2.spinnaker.mgmt.netflix.net/schema/#/$defs/StaggeredRegion/properties/pauseTime") |

### region




`region`

-   is required
-   Type: `string`
-   cannot be null
-   defined in: [DeliveryConfig](keel-defs-staggeredregion-properties-region.md "https&#x3A;//keel-prestaging.us-west-2.spinnaker.mgmt.netflix.net/schema/#/$defs/StaggeredRegion/properties/region")

#### region Type

`string`

### hours




`hours`

-   is optional
-   Type: `string`
-   cannot be null
-   defined in: [DeliveryConfig](keel-defs-staggeredregion-properties-hours.md "https&#x3A;//keel-prestaging.us-west-2.spinnaker.mgmt.netflix.net/schema/#/$defs/StaggeredRegion/properties/hours")

#### hours Type

`string`

### pauseTime




`pauseTime`

-   is optional
-   Type: `string`
-   cannot be null
-   defined in: [DeliveryConfig](keel-defs-staggeredregion-properties-pausetime.md "https&#x3A;//keel-prestaging.us-west-2.spinnaker.mgmt.netflix.net/schema/#/$defs/StaggeredRegion/properties/pauseTime")

#### pauseTime Type

`string`

#### pauseTime Constraints

**duration**: the string must be a duration string, according to [RFC 3339, section 5.6](https://tools.ietf.org/html/rfc3339 "check the specification")

## Definitions group StepAdjustment

Reference this group by using

```json
{"$ref":"https://keel-prestaging.us-west-2.spinnaker.mgmt.netflix.net/schema/#/$defs/StepAdjustment"}
```

| Property                                | Type     | Required | Nullable       | Defined by                                                                                                                                                                                                |
| :-------------------------------------- | -------- | -------- | -------------- | :-------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------- |
| [lowerBound](#lowerBound)               | `number` | Optional | cannot be null | [DeliveryConfig](keel-defs-stepadjustment-properties-lowerbound.md "https&#x3A;//keel-prestaging.us-west-2.spinnaker.mgmt.netflix.net/schema/#/$defs/StepAdjustment/properties/lowerBound")               |
| [upperBound](#upperBound)               | `number` | Optional | cannot be null | [DeliveryConfig](keel-defs-stepadjustment-properties-upperbound.md "https&#x3A;//keel-prestaging.us-west-2.spinnaker.mgmt.netflix.net/schema/#/$defs/StepAdjustment/properties/upperBound")               |
| [scalingAdjustment](#scalingAdjustment) | `number` | Required | cannot be null | [DeliveryConfig](keel-defs-stepadjustment-properties-scalingadjustment.md "https&#x3A;//keel-prestaging.us-west-2.spinnaker.mgmt.netflix.net/schema/#/$defs/StepAdjustment/properties/scalingAdjustment") |

### lowerBound




`lowerBound`

-   is optional
-   Type: `number`
-   cannot be null
-   defined in: [DeliveryConfig](keel-defs-stepadjustment-properties-lowerbound.md "https&#x3A;//keel-prestaging.us-west-2.spinnaker.mgmt.netflix.net/schema/#/$defs/StepAdjustment/properties/lowerBound")

#### lowerBound Type

`number`

### upperBound




`upperBound`

-   is optional
-   Type: `number`
-   cannot be null
-   defined in: [DeliveryConfig](keel-defs-stepadjustment-properties-upperbound.md "https&#x3A;//keel-prestaging.us-west-2.spinnaker.mgmt.netflix.net/schema/#/$defs/StepAdjustment/properties/upperBound")

#### upperBound Type

`number`

### scalingAdjustment




`scalingAdjustment`

-   is required
-   Type: `number`
-   cannot be null
-   defined in: [DeliveryConfig](keel-defs-stepadjustment-properties-scalingadjustment.md "https&#x3A;//keel-prestaging.us-west-2.spinnaker.mgmt.netflix.net/schema/#/$defs/StepAdjustment/properties/scalingAdjustment")

#### scalingAdjustment Type

`number`

## Definitions group StepScalingPolicy

Reference this group by using

```json
{"$ref":"https://keel-prestaging.us-west-2.spinnaker.mgmt.netflix.net/schema/#/$defs/StepScalingPolicy"}
```

| Property                                        | Type      | Required | Nullable       | Defined by                                                                                                                                                                                                              |
| :---------------------------------------------- | --------- | -------- | -------------- | :---------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------- |
| [name](#name)                                   | `string`  | Optional | cannot be null | [DeliveryConfig](keel-defs-stepscalingpolicy-properties-name.md "https&#x3A;//keel-prestaging.us-west-2.spinnaker.mgmt.netflix.net/schema/#/$defs/StepScalingPolicy/properties/name")                                   |
| [adjustmentType](#adjustmentType)               | `string`  | Required | cannot be null | [DeliveryConfig](keel-defs-stepscalingpolicy-properties-adjustmenttype.md "https&#x3A;//keel-prestaging.us-west-2.spinnaker.mgmt.netflix.net/schema/#/$defs/StepScalingPolicy/properties/adjustmentType")               |
| [actionsEnabled](#actionsEnabled)               | `boolean` | Required | cannot be null | [DeliveryConfig](keel-defs-stepscalingpolicy-properties-actionsenabled.md "https&#x3A;//keel-prestaging.us-west-2.spinnaker.mgmt.netflix.net/schema/#/$defs/StepScalingPolicy/properties/actionsEnabled")               |
| [comparisonOperator](#comparisonOperator)       | `string`  | Required | cannot be null | [DeliveryConfig](keel-defs-stepscalingpolicy-properties-comparisonoperator.md "https&#x3A;//keel-prestaging.us-west-2.spinnaker.mgmt.netflix.net/schema/#/$defs/StepScalingPolicy/properties/comparisonOperator")       |
| [dimensions](#dimensions)                       | `array`   | Optional | cannot be null | [DeliveryConfig](keel-defs-stepscalingpolicy-properties-dimensions.md "https&#x3A;//keel-prestaging.us-west-2.spinnaker.mgmt.netflix.net/schema/#/$defs/StepScalingPolicy/properties/dimensions")                       |
| [evaluationPeriods](#evaluationPeriods)         | `number`  | Required | cannot be null | [DeliveryConfig](keel-defs-stepscalingpolicy-properties-evaluationperiods.md "https&#x3A;//keel-prestaging.us-west-2.spinnaker.mgmt.netflix.net/schema/#/$defs/StepScalingPolicy/properties/evaluationPeriods")         |
| [period](#period)                               | `string`  | Required | cannot be null | [DeliveryConfig](keel-defs-stepscalingpolicy-properties-period.md "https&#x3A;//keel-prestaging.us-west-2.spinnaker.mgmt.netflix.net/schema/#/$defs/StepScalingPolicy/properties/period")                               |
| [threshold](#threshold)                         | `number`  | Required | cannot be null | [DeliveryConfig](keel-defs-stepscalingpolicy-properties-threshold.md "https&#x3A;//keel-prestaging.us-west-2.spinnaker.mgmt.netflix.net/schema/#/$defs/StepScalingPolicy/properties/threshold")                         |
| [metricName](#metricName)                       | `string`  | Required | cannot be null | [DeliveryConfig](keel-defs-stepscalingpolicy-properties-metricname.md "https&#x3A;//keel-prestaging.us-west-2.spinnaker.mgmt.netflix.net/schema/#/$defs/StepScalingPolicy/properties/metricName")                       |
| [namespace](#namespace)                         | `string`  | Required | cannot be null | [DeliveryConfig](keel-defs-stepscalingpolicy-properties-namespace.md "https&#x3A;//keel-prestaging.us-west-2.spinnaker.mgmt.netflix.net/schema/#/$defs/StepScalingPolicy/properties/namespace")                         |
| [statistic](#statistic)                         | `string`  | Required | cannot be null | [DeliveryConfig](keel-defs-stepscalingpolicy-properties-statistic.md "https&#x3A;//keel-prestaging.us-west-2.spinnaker.mgmt.netflix.net/schema/#/$defs/StepScalingPolicy/properties/statistic")                         |
| [warmup](#warmup)                               | `string`  | Optional | cannot be null | [DeliveryConfig](keel-defs-stepscalingpolicy-properties-warmup.md "https&#x3A;//keel-prestaging.us-west-2.spinnaker.mgmt.netflix.net/schema/#/$defs/StepScalingPolicy/properties/warmup")                               |
| [metricAggregationType](#metricAggregationType) | `string`  | Optional | cannot be null | [DeliveryConfig](keel-defs-stepscalingpolicy-properties-metricaggregationtype.md "https&#x3A;//keel-prestaging.us-west-2.spinnaker.mgmt.netflix.net/schema/#/$defs/StepScalingPolicy/properties/metricAggregationType") |
| [stepAdjustments](#stepAdjustments)             | `array`   | Required | cannot be null | [DeliveryConfig](keel-defs-stepscalingpolicy-properties-stepadjustments.md "https&#x3A;//keel-prestaging.us-west-2.spinnaker.mgmt.netflix.net/schema/#/$defs/StepScalingPolicy/properties/stepAdjustments")             |

### name




`name`

-   is optional
-   Type: `string`
-   cannot be null
-   defined in: [DeliveryConfig](keel-defs-stepscalingpolicy-properties-name.md "https&#x3A;//keel-prestaging.us-west-2.spinnaker.mgmt.netflix.net/schema/#/$defs/StepScalingPolicy/properties/name")

#### name Type

`string`

### adjustmentType




`adjustmentType`

-   is required
-   Type: `string`
-   cannot be null
-   defined in: [DeliveryConfig](keel-defs-stepscalingpolicy-properties-adjustmenttype.md "https&#x3A;//keel-prestaging.us-west-2.spinnaker.mgmt.netflix.net/schema/#/$defs/StepScalingPolicy/properties/adjustmentType")

#### adjustmentType Type

`string`

### actionsEnabled




`actionsEnabled`

-   is required
-   Type: `boolean`
-   cannot be null
-   defined in: [DeliveryConfig](keel-defs-stepscalingpolicy-properties-actionsenabled.md "https&#x3A;//keel-prestaging.us-west-2.spinnaker.mgmt.netflix.net/schema/#/$defs/StepScalingPolicy/properties/actionsEnabled")

#### actionsEnabled Type

`boolean`

### comparisonOperator




`comparisonOperator`

-   is required
-   Type: `string`
-   cannot be null
-   defined in: [DeliveryConfig](keel-defs-stepscalingpolicy-properties-comparisonoperator.md "https&#x3A;//keel-prestaging.us-west-2.spinnaker.mgmt.netflix.net/schema/#/$defs/StepScalingPolicy/properties/comparisonOperator")

#### comparisonOperator Type

`string`

### dimensions




`dimensions`

-   is optional
-   Type: `object[]` ([Details](keel-defs-metricdimension.md))
-   cannot be null
-   defined in: [DeliveryConfig](keel-defs-stepscalingpolicy-properties-dimensions.md "https&#x3A;//keel-prestaging.us-west-2.spinnaker.mgmt.netflix.net/schema/#/$defs/StepScalingPolicy/properties/dimensions")

#### dimensions Type

`object[]` ([Details](keel-defs-metricdimension.md))

#### dimensions Constraints

**unique items**: all items in this array must be unique. Duplicates are not allowed.

### evaluationPeriods




`evaluationPeriods`

-   is required
-   Type: `number`
-   cannot be null
-   defined in: [DeliveryConfig](keel-defs-stepscalingpolicy-properties-evaluationperiods.md "https&#x3A;//keel-prestaging.us-west-2.spinnaker.mgmt.netflix.net/schema/#/$defs/StepScalingPolicy/properties/evaluationPeriods")

#### evaluationPeriods Type

`number`

### period




`period`

-   is required
-   Type: `string`
-   cannot be null
-   defined in: [DeliveryConfig](keel-defs-stepscalingpolicy-properties-period.md "https&#x3A;//keel-prestaging.us-west-2.spinnaker.mgmt.netflix.net/schema/#/$defs/StepScalingPolicy/properties/period")

#### period Type

`string`

#### period Constraints

**duration**: the string must be a duration string, according to [RFC 3339, section 5.6](https://tools.ietf.org/html/rfc3339 "check the specification")

### threshold




`threshold`

-   is required
-   Type: `number`
-   cannot be null
-   defined in: [DeliveryConfig](keel-defs-stepscalingpolicy-properties-threshold.md "https&#x3A;//keel-prestaging.us-west-2.spinnaker.mgmt.netflix.net/schema/#/$defs/StepScalingPolicy/properties/threshold")

#### threshold Type

`number`

### metricName




`metricName`

-   is required
-   Type: `string`
-   cannot be null
-   defined in: [DeliveryConfig](keel-defs-stepscalingpolicy-properties-metricname.md "https&#x3A;//keel-prestaging.us-west-2.spinnaker.mgmt.netflix.net/schema/#/$defs/StepScalingPolicy/properties/metricName")

#### metricName Type

`string`

### namespace




`namespace`

-   is required
-   Type: `string`
-   cannot be null
-   defined in: [DeliveryConfig](keel-defs-stepscalingpolicy-properties-namespace.md "https&#x3A;//keel-prestaging.us-west-2.spinnaker.mgmt.netflix.net/schema/#/$defs/StepScalingPolicy/properties/namespace")

#### namespace Type

`string`

### statistic




`statistic`

-   is required
-   Type: `string`
-   cannot be null
-   defined in: [DeliveryConfig](keel-defs-stepscalingpolicy-properties-statistic.md "https&#x3A;//keel-prestaging.us-west-2.spinnaker.mgmt.netflix.net/schema/#/$defs/StepScalingPolicy/properties/statistic")

#### statistic Type

`string`

### warmup




`warmup`

-   is optional
-   Type: `string`
-   cannot be null
-   defined in: [DeliveryConfig](keel-defs-stepscalingpolicy-properties-warmup.md "https&#x3A;//keel-prestaging.us-west-2.spinnaker.mgmt.netflix.net/schema/#/$defs/StepScalingPolicy/properties/warmup")

#### warmup Type

`string`

#### warmup Constraints

**duration**: the string must be a duration string, according to [RFC 3339, section 5.6](https://tools.ietf.org/html/rfc3339 "check the specification")

### metricAggregationType




`metricAggregationType`

-   is optional
-   Type: `string`
-   cannot be null
-   defined in: [DeliveryConfig](keel-defs-stepscalingpolicy-properties-metricaggregationtype.md "https&#x3A;//keel-prestaging.us-west-2.spinnaker.mgmt.netflix.net/schema/#/$defs/StepScalingPolicy/properties/metricAggregationType")

#### metricAggregationType Type

`string`

### stepAdjustments




`stepAdjustments`

-   is required
-   Type: `object[]` ([Details](keel-defs-stepadjustment.md))
-   cannot be null
-   defined in: [DeliveryConfig](keel-defs-stepscalingpolicy-properties-stepadjustments.md "https&#x3A;//keel-prestaging.us-west-2.spinnaker.mgmt.netflix.net/schema/#/$defs/StepScalingPolicy/properties/stepAdjustments")

#### stepAdjustments Type

`object[]` ([Details](keel-defs-stepadjustment.md))

#### stepAdjustments Constraints

**unique items**: all items in this array must be unique. Duplicates are not allowed.

## Definitions group SubnetAwareLocations

Reference this group by using

```json
{"$ref":"https://keel-prestaging.us-west-2.spinnaker.mgmt.netflix.net/schema/#/$defs/SubnetAwareLocations"}
```

| Property            | Type     | Required | Nullable       | Defined by                                                                                                                                                                                        |
| :------------------ | -------- | -------- | -------------- | :------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------ |
| [account](#account) | `string` | Required | cannot be null | [DeliveryConfig](keel-defs-subnetawarelocations-properties-account.md "https&#x3A;//keel-prestaging.us-west-2.spinnaker.mgmt.netflix.net/schema/#/$defs/SubnetAwareLocations/properties/account") |
| [subnet](#subnet)   | `string` | Optional | cannot be null | [DeliveryConfig](keel-defs-subnetawarelocations-properties-subnet.md "https&#x3A;//keel-prestaging.us-west-2.spinnaker.mgmt.netflix.net/schema/#/$defs/SubnetAwareLocations/properties/subnet")   |
| [vpc](#vpc)         | `string` | Optional | cannot be null | [DeliveryConfig](keel-defs-subnetawarelocations-properties-vpc.md "https&#x3A;//keel-prestaging.us-west-2.spinnaker.mgmt.netflix.net/schema/#/$defs/SubnetAwareLocations/properties/vpc")         |
| [regions](#regions) | `array`  | Required | cannot be null | [DeliveryConfig](keel-defs-subnetawarelocations-properties-regions.md "https&#x3A;//keel-prestaging.us-west-2.spinnaker.mgmt.netflix.net/schema/#/$defs/SubnetAwareLocations/properties/regions") |

### account




`account`

-   is required
-   Type: `string`
-   cannot be null
-   defined in: [DeliveryConfig](keel-defs-subnetawarelocations-properties-account.md "https&#x3A;//keel-prestaging.us-west-2.spinnaker.mgmt.netflix.net/schema/#/$defs/SubnetAwareLocations/properties/account")

#### account Type

`string`

### subnet




`subnet`

-   is optional
-   Type: `string`
-   cannot be null
-   defined in: [DeliveryConfig](keel-defs-subnetawarelocations-properties-subnet.md "https&#x3A;//keel-prestaging.us-west-2.spinnaker.mgmt.netflix.net/schema/#/$defs/SubnetAwareLocations/properties/subnet")

#### subnet Type

`string`

### vpc




`vpc`

-   is optional
-   Type: `string`
-   cannot be null
-   defined in: [DeliveryConfig](keel-defs-subnetawarelocations-properties-vpc.md "https&#x3A;//keel-prestaging.us-west-2.spinnaker.mgmt.netflix.net/schema/#/$defs/SubnetAwareLocations/properties/vpc")

#### vpc Type

`string`

### regions




`regions`

-   is required
-   Type: `object[]` ([Details](keel-defs-subnetawareregionspec.md))
-   cannot be null
-   defined in: [DeliveryConfig](keel-defs-subnetawarelocations-properties-regions.md "https&#x3A;//keel-prestaging.us-west-2.spinnaker.mgmt.netflix.net/schema/#/$defs/SubnetAwareLocations/properties/regions")

#### regions Type

`object[]` ([Details](keel-defs-subnetawareregionspec.md))

#### regions Constraints

**unique items**: all items in this array must be unique. Duplicates are not allowed.

## Definitions group SubnetAwareRegionSpec

Reference this group by using

```json
{"$ref":"https://keel-prestaging.us-west-2.spinnaker.mgmt.netflix.net/schema/#/$defs/SubnetAwareRegionSpec"}
```

| Property                                | Type     | Required | Nullable       | Defined by                                                                                                                                                                                                              |
| :-------------------------------------- | -------- | -------- | -------------- | :---------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------- |
| [name](#name)                           | `string` | Required | cannot be null | [DeliveryConfig](keel-defs-subnetawareregionspec-properties-name.md "https&#x3A;//keel-prestaging.us-west-2.spinnaker.mgmt.netflix.net/schema/#/$defs/SubnetAwareRegionSpec/properties/name")                           |
| [availabilityZones](#availabilityZones) | `array`  | Optional | cannot be null | [DeliveryConfig](keel-defs-subnetawareregionspec-properties-availabilityzones.md "https&#x3A;//keel-prestaging.us-west-2.spinnaker.mgmt.netflix.net/schema/#/$defs/SubnetAwareRegionSpec/properties/availabilityZones") |

### name




`name`

-   is required
-   Type: `string`
-   cannot be null
-   defined in: [DeliveryConfig](keel-defs-subnetawareregionspec-properties-name.md "https&#x3A;//keel-prestaging.us-west-2.spinnaker.mgmt.netflix.net/schema/#/$defs/SubnetAwareRegionSpec/properties/name")

#### name Type

`string`

### availabilityZones




`availabilityZones`

-   is optional
-   Type: `string[]`
-   cannot be null
-   defined in: [DeliveryConfig](keel-defs-subnetawareregionspec-properties-availabilityzones.md "https&#x3A;//keel-prestaging.us-west-2.spinnaker.mgmt.netflix.net/schema/#/$defs/SubnetAwareRegionSpec/properties/availabilityZones")

#### availabilityZones Type

`string[]`

#### availabilityZones Constraints

**unique items**: all items in this array must be unique. Duplicates are not allowed.

## Definitions group TargetGroup

Reference this group by using

```json
{"$ref":"https://keel-prestaging.us-west-2.spinnaker.mgmt.netflix.net/schema/#/$defs/TargetGroup"}
```

| Property                                                  | Type      | Required | Nullable       | Defined by                                                                                                                                                                                                            |
| :-------------------------------------------------------- | --------- | -------- | -------------- | :-------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------- |
| [name](#name)                                             | `string`  | Required | cannot be null | [DeliveryConfig](keel-defs-targetgroup-properties-name.md "https&#x3A;//keel-prestaging.us-west-2.spinnaker.mgmt.netflix.net/schema/#/$defs/TargetGroup/properties/name")                                             |
| [targetType](#targetType)                                 | `string`  | Optional | cannot be null | [DeliveryConfig](keel-defs-targetgroup-properties-targettype.md "https&#x3A;//keel-prestaging.us-west-2.spinnaker.mgmt.netflix.net/schema/#/$defs/TargetGroup/properties/targetType")                                 |
| [protocol](#protocol)                                     | `string`  | Optional | cannot be null | [DeliveryConfig](keel-defs-targetgroup-properties-protocol.md "https&#x3A;//keel-prestaging.us-west-2.spinnaker.mgmt.netflix.net/schema/#/$defs/TargetGroup/properties/protocol")                                     |
| [port](#port)                                             | `number`  | Required | cannot be null | [DeliveryConfig](keel-defs-targetgroup-properties-port.md "https&#x3A;//keel-prestaging.us-west-2.spinnaker.mgmt.netflix.net/schema/#/$defs/TargetGroup/properties/port")                                             |
| [healthCheckEnabled](#healthCheckEnabled)                 | `boolean` | Optional | cannot be null | [DeliveryConfig](keel-defs-targetgroup-properties-healthcheckenabled.md "https&#x3A;//keel-prestaging.us-west-2.spinnaker.mgmt.netflix.net/schema/#/$defs/TargetGroup/properties/healthCheckEnabled")                 |
| [healthCheckTimeoutSeconds](#healthCheckTimeoutSeconds)   | `string`  | Optional | cannot be null | [DeliveryConfig](keel-defs-targetgroup-properties-healthchecktimeoutseconds.md "https&#x3A;//keel-prestaging.us-west-2.spinnaker.mgmt.netflix.net/schema/#/$defs/TargetGroup/properties/healthCheckTimeoutSeconds")   |
| [healthCheckPort](#healthCheckPort)                       | `number`  | Optional | cannot be null | [DeliveryConfig](keel-defs-targetgroup-properties-healthcheckport.md "https&#x3A;//keel-prestaging.us-west-2.spinnaker.mgmt.netflix.net/schema/#/$defs/TargetGroup/properties/healthCheckPort")                       |
| [healthCheckProtocol](#healthCheckProtocol)               | `string`  | Optional | cannot be null | [DeliveryConfig](keel-defs-targetgroup-properties-healthcheckprotocol.md "https&#x3A;//keel-prestaging.us-west-2.spinnaker.mgmt.netflix.net/schema/#/$defs/TargetGroup/properties/healthCheckProtocol")               |
| [healthCheckHttpCode](#healthCheckHttpCode)               | `string`  | Optional | cannot be null | [DeliveryConfig](keel-defs-targetgroup-properties-healthcheckhttpcode.md "https&#x3A;//keel-prestaging.us-west-2.spinnaker.mgmt.netflix.net/schema/#/$defs/TargetGroup/properties/healthCheckHttpCode")               |
| [healthCheckPath](#healthCheckPath)                       | `string`  | Optional | cannot be null | [DeliveryConfig](keel-defs-targetgroup-properties-healthcheckpath.md "https&#x3A;//keel-prestaging.us-west-2.spinnaker.mgmt.netflix.net/schema/#/$defs/TargetGroup/properties/healthCheckPath")                       |
| [healthCheckIntervalSeconds](#healthCheckIntervalSeconds) | `string`  | Optional | cannot be null | [DeliveryConfig](keel-defs-targetgroup-properties-healthcheckintervalseconds.md "https&#x3A;//keel-prestaging.us-west-2.spinnaker.mgmt.netflix.net/schema/#/$defs/TargetGroup/properties/healthCheckIntervalSeconds") |
| [healthyThresholdCount](#healthyThresholdCount)           | `number`  | Optional | cannot be null | [DeliveryConfig](keel-defs-targetgroup-properties-healthythresholdcount.md "https&#x3A;//keel-prestaging.us-west-2.spinnaker.mgmt.netflix.net/schema/#/$defs/TargetGroup/properties/healthyThresholdCount")           |
| [unhealthyThresholdCount](#unhealthyThresholdCount)       | `number`  | Optional | cannot be null | [DeliveryConfig](keel-defs-targetgroup-properties-unhealthythresholdcount.md "https&#x3A;//keel-prestaging.us-west-2.spinnaker.mgmt.netflix.net/schema/#/$defs/TargetGroup/properties/unhealthyThresholdCount")       |
| [attributes](#attributes)                                 | `object`  | Optional | cannot be null | [DeliveryConfig](keel-defs-targetgroupattributes.md "https&#x3A;//keel-prestaging.us-west-2.spinnaker.mgmt.netflix.net/schema/#/$defs/TargetGroup/properties/attributes")                                             |

### name




`name`

-   is required
-   Type: `string`
-   cannot be null
-   defined in: [DeliveryConfig](keel-defs-targetgroup-properties-name.md "https&#x3A;//keel-prestaging.us-west-2.spinnaker.mgmt.netflix.net/schema/#/$defs/TargetGroup/properties/name")

#### name Type

`string`

### targetType




`targetType`

-   is optional
-   Type: `string`
-   cannot be null
-   defined in: [DeliveryConfig](keel-defs-targetgroup-properties-targettype.md "https&#x3A;//keel-prestaging.us-west-2.spinnaker.mgmt.netflix.net/schema/#/$defs/TargetGroup/properties/targetType")

#### targetType Type

`string`

### protocol




`protocol`

-   is optional
-   Type: `string`
-   cannot be null
-   defined in: [DeliveryConfig](keel-defs-targetgroup-properties-protocol.md "https&#x3A;//keel-prestaging.us-west-2.spinnaker.mgmt.netflix.net/schema/#/$defs/TargetGroup/properties/protocol")

#### protocol Type

`string`

### port




`port`

-   is required
-   Type: `number`
-   cannot be null
-   defined in: [DeliveryConfig](keel-defs-targetgroup-properties-port.md "https&#x3A;//keel-prestaging.us-west-2.spinnaker.mgmt.netflix.net/schema/#/$defs/TargetGroup/properties/port")

#### port Type

`number`

### healthCheckEnabled




`healthCheckEnabled`

-   is optional
-   Type: `boolean`
-   cannot be null
-   defined in: [DeliveryConfig](keel-defs-targetgroup-properties-healthcheckenabled.md "https&#x3A;//keel-prestaging.us-west-2.spinnaker.mgmt.netflix.net/schema/#/$defs/TargetGroup/properties/healthCheckEnabled")

#### healthCheckEnabled Type

`boolean`

### healthCheckTimeoutSeconds




`healthCheckTimeoutSeconds`

-   is optional
-   Type: `string`
-   cannot be null
-   defined in: [DeliveryConfig](keel-defs-targetgroup-properties-healthchecktimeoutseconds.md "https&#x3A;//keel-prestaging.us-west-2.spinnaker.mgmt.netflix.net/schema/#/$defs/TargetGroup/properties/healthCheckTimeoutSeconds")

#### healthCheckTimeoutSeconds Type

`string`

#### healthCheckTimeoutSeconds Constraints

**duration**: the string must be a duration string, according to [RFC 3339, section 5.6](https://tools.ietf.org/html/rfc3339 "check the specification")

### healthCheckPort




`healthCheckPort`

-   is optional
-   Type: `number`
-   cannot be null
-   defined in: [DeliveryConfig](keel-defs-targetgroup-properties-healthcheckport.md "https&#x3A;//keel-prestaging.us-west-2.spinnaker.mgmt.netflix.net/schema/#/$defs/TargetGroup/properties/healthCheckPort")

#### healthCheckPort Type

`number`

### healthCheckProtocol




`healthCheckProtocol`

-   is optional
-   Type: `string`
-   cannot be null
-   defined in: [DeliveryConfig](keel-defs-targetgroup-properties-healthcheckprotocol.md "https&#x3A;//keel-prestaging.us-west-2.spinnaker.mgmt.netflix.net/schema/#/$defs/TargetGroup/properties/healthCheckProtocol")

#### healthCheckProtocol Type

`string`

### healthCheckHttpCode




`healthCheckHttpCode`

-   is optional
-   Type: `string`
-   cannot be null
-   defined in: [DeliveryConfig](keel-defs-targetgroup-properties-healthcheckhttpcode.md "https&#x3A;//keel-prestaging.us-west-2.spinnaker.mgmt.netflix.net/schema/#/$defs/TargetGroup/properties/healthCheckHttpCode")

#### healthCheckHttpCode Type

`string`

### healthCheckPath




`healthCheckPath`

-   is optional
-   Type: `string`
-   cannot be null
-   defined in: [DeliveryConfig](keel-defs-targetgroup-properties-healthcheckpath.md "https&#x3A;//keel-prestaging.us-west-2.spinnaker.mgmt.netflix.net/schema/#/$defs/TargetGroup/properties/healthCheckPath")

#### healthCheckPath Type

`string`

### healthCheckIntervalSeconds




`healthCheckIntervalSeconds`

-   is optional
-   Type: `string`
-   cannot be null
-   defined in: [DeliveryConfig](keel-defs-targetgroup-properties-healthcheckintervalseconds.md "https&#x3A;//keel-prestaging.us-west-2.spinnaker.mgmt.netflix.net/schema/#/$defs/TargetGroup/properties/healthCheckIntervalSeconds")

#### healthCheckIntervalSeconds Type

`string`

#### healthCheckIntervalSeconds Constraints

**duration**: the string must be a duration string, according to [RFC 3339, section 5.6](https://tools.ietf.org/html/rfc3339 "check the specification")

### healthyThresholdCount




`healthyThresholdCount`

-   is optional
-   Type: `number`
-   cannot be null
-   defined in: [DeliveryConfig](keel-defs-targetgroup-properties-healthythresholdcount.md "https&#x3A;//keel-prestaging.us-west-2.spinnaker.mgmt.netflix.net/schema/#/$defs/TargetGroup/properties/healthyThresholdCount")

#### healthyThresholdCount Type

`number`

### unhealthyThresholdCount




`unhealthyThresholdCount`

-   is optional
-   Type: `number`
-   cannot be null
-   defined in: [DeliveryConfig](keel-defs-targetgroup-properties-unhealthythresholdcount.md "https&#x3A;//keel-prestaging.us-west-2.spinnaker.mgmt.netflix.net/schema/#/$defs/TargetGroup/properties/unhealthyThresholdCount")

#### unhealthyThresholdCount Type

`number`

### attributes




`attributes`

-   is optional
-   Type: `object` ([Details](keel-defs-targetgroupattributes.md))
-   cannot be null
-   defined in: [DeliveryConfig](keel-defs-targetgroupattributes.md "https&#x3A;//keel-prestaging.us-west-2.spinnaker.mgmt.netflix.net/schema/#/$defs/TargetGroup/properties/attributes")

#### attributes Type

`object` ([Details](keel-defs-targetgroupattributes.md))

## Definitions group TargetGroupAttributes

Reference this group by using

```json
{"$ref":"https://keel-prestaging.us-west-2.spinnaker.mgmt.netflix.net/schema/#/$defs/TargetGroupAttributes"}
```

| Property                                              | Type      | Required | Nullable       | Defined by                                                                                                                                                                                                                            |
| :---------------------------------------------------- | --------- | -------- | -------------- | :------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------ |
| [stickinessEnabled](#stickinessEnabled)               | `boolean` | Optional | cannot be null | [DeliveryConfig](keel-defs-targetgroupattributes-properties-stickinessenabled.md "https&#x3A;//keel-prestaging.us-west-2.spinnaker.mgmt.netflix.net/schema/#/$defs/TargetGroupAttributes/properties/stickinessEnabled")               |
| [deregistrationDelay](#deregistrationDelay)           | `number`  | Optional | cannot be null | [DeliveryConfig](keel-defs-targetgroupattributes-properties-deregistrationdelay.md "https&#x3A;//keel-prestaging.us-west-2.spinnaker.mgmt.netflix.net/schema/#/$defs/TargetGroupAttributes/properties/deregistrationDelay")           |
| [stickinessType](#stickinessType)                     | `string`  | Optional | cannot be null | [DeliveryConfig](keel-defs-targetgroupattributes-properties-stickinesstype.md "https&#x3A;//keel-prestaging.us-west-2.spinnaker.mgmt.netflix.net/schema/#/$defs/TargetGroupAttributes/properties/stickinessType")                     |
| [stickinessDuration](#stickinessDuration)             | `number`  | Optional | cannot be null | [DeliveryConfig](keel-defs-targetgroupattributes-properties-stickinessduration.md "https&#x3A;//keel-prestaging.us-west-2.spinnaker.mgmt.netflix.net/schema/#/$defs/TargetGroupAttributes/properties/stickinessDuration")             |
| [slowStartDurationSeconds](#slowStartDurationSeconds) | `number`  | Optional | cannot be null | [DeliveryConfig](keel-defs-targetgroupattributes-properties-slowstartdurationseconds.md "https&#x3A;//keel-prestaging.us-west-2.spinnaker.mgmt.netflix.net/schema/#/$defs/TargetGroupAttributes/properties/slowStartDurationSeconds") |
| [properties](#properties)                             | `object`  | Optional | cannot be null | [DeliveryConfig](keel-defs-targetgroupattributes-properties-properties.md "https&#x3A;//keel-prestaging.us-west-2.spinnaker.mgmt.netflix.net/schema/#/$defs/TargetGroupAttributes/properties/properties")                             |

### stickinessEnabled




`stickinessEnabled`

-   is optional
-   Type: `boolean`
-   cannot be null
-   defined in: [DeliveryConfig](keel-defs-targetgroupattributes-properties-stickinessenabled.md "https&#x3A;//keel-prestaging.us-west-2.spinnaker.mgmt.netflix.net/schema/#/$defs/TargetGroupAttributes/properties/stickinessEnabled")

#### stickinessEnabled Type

`boolean`

### deregistrationDelay




`deregistrationDelay`

-   is optional
-   Type: `number`
-   cannot be null
-   defined in: [DeliveryConfig](keel-defs-targetgroupattributes-properties-deregistrationdelay.md "https&#x3A;//keel-prestaging.us-west-2.spinnaker.mgmt.netflix.net/schema/#/$defs/TargetGroupAttributes/properties/deregistrationDelay")

#### deregistrationDelay Type

`number`

### stickinessType




`stickinessType`

-   is optional
-   Type: `string`
-   cannot be null
-   defined in: [DeliveryConfig](keel-defs-targetgroupattributes-properties-stickinesstype.md "https&#x3A;//keel-prestaging.us-west-2.spinnaker.mgmt.netflix.net/schema/#/$defs/TargetGroupAttributes/properties/stickinessType")

#### stickinessType Type

`string`

### stickinessDuration




`stickinessDuration`

-   is optional
-   Type: `number`
-   cannot be null
-   defined in: [DeliveryConfig](keel-defs-targetgroupattributes-properties-stickinessduration.md "https&#x3A;//keel-prestaging.us-west-2.spinnaker.mgmt.netflix.net/schema/#/$defs/TargetGroupAttributes/properties/stickinessDuration")

#### stickinessDuration Type

`number`

### slowStartDurationSeconds




`slowStartDurationSeconds`

-   is optional
-   Type: `number`
-   cannot be null
-   defined in: [DeliveryConfig](keel-defs-targetgroupattributes-properties-slowstartdurationseconds.md "https&#x3A;//keel-prestaging.us-west-2.spinnaker.mgmt.netflix.net/schema/#/$defs/TargetGroupAttributes/properties/slowStartDurationSeconds")

#### slowStartDurationSeconds Type

`number`

### properties




`properties`

-   is optional
-   Type: `object` ([Details](keel-defs-targetgroupattributes-properties-properties.md))
-   cannot be null
-   defined in: [DeliveryConfig](keel-defs-targetgroupattributes-properties-properties.md "https&#x3A;//keel-prestaging.us-west-2.spinnaker.mgmt.netflix.net/schema/#/$defs/TargetGroupAttributes/properties/properties")

#### properties Type

`object` ([Details](keel-defs-targetgroupattributes-properties-properties.md))

## Definitions group TargetTrackingPolicy

Reference this group by using

```json
{"$ref":"https://keel-prestaging.us-west-2.spinnaker.mgmt.netflix.net/schema/#/$defs/TargetTrackingPolicy"}
```

| Property                                      | Type      | Required | Nullable       | Defined by                                                                                                                                                                                                      |
| :-------------------------------------------- | --------- | -------- | -------------- | :-------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------- |
| [name](#name)                                 | `string`  | Optional | cannot be null | [DeliveryConfig](keel-defs-targettrackingpolicy-properties-name.md "https&#x3A;//keel-prestaging.us-west-2.spinnaker.mgmt.netflix.net/schema/#/$defs/TargetTrackingPolicy/properties/name")                     |
| [warmup](#warmup)                             | `string`  | Optional | cannot be null | [DeliveryConfig](keel-defs-targettrackingpolicy-properties-warmup.md "https&#x3A;//keel-prestaging.us-west-2.spinnaker.mgmt.netflix.net/schema/#/$defs/TargetTrackingPolicy/properties/warmup")                 |
| [targetValue](#targetValue)                   | `number`  | Required | cannot be null | [DeliveryConfig](keel-defs-targettrackingpolicy-properties-targetvalue.md "https&#x3A;//keel-prestaging.us-west-2.spinnaker.mgmt.netflix.net/schema/#/$defs/TargetTrackingPolicy/properties/targetValue")       |
| [disableScaleIn](#disableScaleIn)             | `boolean` | Optional | cannot be null | [DeliveryConfig](keel-defs-targettrackingpolicy-properties-disablescalein.md "https&#x3A;//keel-prestaging.us-west-2.spinnaker.mgmt.netflix.net/schema/#/$defs/TargetTrackingPolicy/properties/disableScaleIn") |
| [predefinedMetricSpec](#predefinedMetricSpec) | `object`  | Optional | cannot be null | [DeliveryConfig](keel-defs-predefinedmetricspecification.md "https&#x3A;//keel-prestaging.us-west-2.spinnaker.mgmt.netflix.net/schema/#/$defs/TargetTrackingPolicy/properties/predefinedMetricSpec")            |
| [customMetricSpec](#customMetricSpec)         | `object`  | Optional | cannot be null | [DeliveryConfig](keel-defs-customizedmetricspecification.md "https&#x3A;//keel-prestaging.us-west-2.spinnaker.mgmt.netflix.net/schema/#/$defs/TargetTrackingPolicy/properties/customMetricSpec")                |

### name




`name`

-   is optional
-   Type: `string`
-   cannot be null
-   defined in: [DeliveryConfig](keel-defs-targettrackingpolicy-properties-name.md "https&#x3A;//keel-prestaging.us-west-2.spinnaker.mgmt.netflix.net/schema/#/$defs/TargetTrackingPolicy/properties/name")

#### name Type

`string`

### warmup




`warmup`

-   is optional
-   Type: `string`
-   cannot be null
-   defined in: [DeliveryConfig](keel-defs-targettrackingpolicy-properties-warmup.md "https&#x3A;//keel-prestaging.us-west-2.spinnaker.mgmt.netflix.net/schema/#/$defs/TargetTrackingPolicy/properties/warmup")

#### warmup Type

`string`

#### warmup Constraints

**duration**: the string must be a duration string, according to [RFC 3339, section 5.6](https://tools.ietf.org/html/rfc3339 "check the specification")

### targetValue




`targetValue`

-   is required
-   Type: `number`
-   cannot be null
-   defined in: [DeliveryConfig](keel-defs-targettrackingpolicy-properties-targetvalue.md "https&#x3A;//keel-prestaging.us-west-2.spinnaker.mgmt.netflix.net/schema/#/$defs/TargetTrackingPolicy/properties/targetValue")

#### targetValue Type

`number`

### disableScaleIn




`disableScaleIn`

-   is optional
-   Type: `boolean`
-   cannot be null
-   defined in: [DeliveryConfig](keel-defs-targettrackingpolicy-properties-disablescalein.md "https&#x3A;//keel-prestaging.us-west-2.spinnaker.mgmt.netflix.net/schema/#/$defs/TargetTrackingPolicy/properties/disableScaleIn")

#### disableScaleIn Type

`boolean`

### predefinedMetricSpec




`predefinedMetricSpec`

-   is optional
-   Type: `object` ([Details](keel-defs-predefinedmetricspecification.md))
-   cannot be null
-   defined in: [DeliveryConfig](keel-defs-predefinedmetricspecification.md "https&#x3A;//keel-prestaging.us-west-2.spinnaker.mgmt.netflix.net/schema/#/$defs/TargetTrackingPolicy/properties/predefinedMetricSpec")

#### predefinedMetricSpec Type

`object` ([Details](keel-defs-predefinedmetricspecification.md))

### customMetricSpec




`customMetricSpec`

-   is optional
-   Type: `object` ([Details](keel-defs-customizedmetricspecification.md))
-   cannot be null
-   defined in: [DeliveryConfig](keel-defs-customizedmetricspecification.md "https&#x3A;//keel-prestaging.us-west-2.spinnaker.mgmt.netflix.net/schema/#/$defs/TargetTrackingPolicy/properties/customMetricSpec")

#### customMetricSpec Type

`object` ([Details](keel-defs-customizedmetricspecification.md))

## Definitions group TimeWindow

Reference this group by using

```json
{"$ref":"https://keel-prestaging.us-west-2.spinnaker.mgmt.netflix.net/schema/#/$defs/TimeWindow"}
```

| Property        | Type     | Required | Nullable       | Defined by                                                                                                                                                                |
| :-------------- | -------- | -------- | -------------- | :------------------------------------------------------------------------------------------------------------------------------------------------------------------------ |
| [days](#days)   | `string` | Optional | cannot be null | [DeliveryConfig](keel-defs-timewindow-properties-days.md "https&#x3A;//keel-prestaging.us-west-2.spinnaker.mgmt.netflix.net/schema/#/$defs/TimeWindow/properties/days")   |
| [hours](#hours) | `string` | Optional | cannot be null | [DeliveryConfig](keel-defs-timewindow-properties-hours.md "https&#x3A;//keel-prestaging.us-west-2.spinnaker.mgmt.netflix.net/schema/#/$defs/TimeWindow/properties/hours") |

### days




`days`

-   is optional
-   Type: `string`
-   cannot be null
-   defined in: [DeliveryConfig](keel-defs-timewindow-properties-days.md "https&#x3A;//keel-prestaging.us-west-2.spinnaker.mgmt.netflix.net/schema/#/$defs/TimeWindow/properties/days")

#### days Type

`string`

### hours




`hours`

-   is optional
-   Type: `string`
-   cannot be null
-   defined in: [DeliveryConfig](keel-defs-timewindow-properties-hours.md "https&#x3A;//keel-prestaging.us-west-2.spinnaker.mgmt.netflix.net/schema/#/$defs/TimeWindow/properties/hours")

#### hours Type

`string`

## Definitions group TimeWindowConstraint

Reference this group by using

```json
{"$ref":"https://keel-prestaging.us-west-2.spinnaker.mgmt.netflix.net/schema/#/$defs/TimeWindowConstraint"}
```

| Property            | Type     | Required | Nullable       | Defined by                                                                                                                                                                                        |
| :------------------ | -------- | -------- | -------------- | :------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------ |
| [windows](#windows) | `array`  | Required | cannot be null | [DeliveryConfig](keel-defs-timewindowconstraint-properties-windows.md "https&#x3A;//keel-prestaging.us-west-2.spinnaker.mgmt.netflix.net/schema/#/$defs/TimeWindowConstraint/properties/windows") |
| [tz](#tz)           | `string` | Optional | cannot be null | [DeliveryConfig](keel-defs-timewindowconstraint-properties-tz.md "https&#x3A;//keel-prestaging.us-west-2.spinnaker.mgmt.netflix.net/schema/#/$defs/TimeWindowConstraint/properties/tz")           |

### windows




`windows`

-   is required
-   Type: `object[]` ([Details](keel-defs-timewindow.md))
-   cannot be null
-   defined in: [DeliveryConfig](keel-defs-timewindowconstraint-properties-windows.md "https&#x3A;//keel-prestaging.us-west-2.spinnaker.mgmt.netflix.net/schema/#/$defs/TimeWindowConstraint/properties/windows")

#### windows Type

`object[]` ([Details](keel-defs-timewindow.md))

### tz




`tz`

-   is optional
-   Type: `string`
-   cannot be null
-   defined in: [DeliveryConfig](keel-defs-timewindowconstraint-properties-tz.md "https&#x3A;//keel-prestaging.us-west-2.spinnaker.mgmt.netflix.net/schema/#/$defs/TimeWindowConstraint/properties/tz")

#### tz Type

`string`

## Definitions group TitusClusterSpec

Reference this group by using

```json
{"$ref":"https://keel-prestaging.us-west-2.spinnaker.mgmt.netflix.net/schema/#/$defs/TitusClusterSpec"}
```

| Property                                    | Type     | Required | Nullable       | Defined by                                                                                                                                                                                                        |
| :------------------------------------------ | -------- | -------- | -------------- | :---------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------- |
| [moniker](#moniker)                         | `object` | Required | cannot be null | [DeliveryConfig](keel-defs-moniker.md "https&#x3A;//keel-prestaging.us-west-2.spinnaker.mgmt.netflix.net/schema/#/$defs/TitusClusterSpec/properties/moniker")                                                     |
| [deployWith](#deployWith)                   | Merged   | Optional | cannot be null | [DeliveryConfig](keel-defs-clusterdeploystrategy.md "https&#x3A;//keel-prestaging.us-west-2.spinnaker.mgmt.netflix.net/schema/#/$defs/TitusClusterSpec/properties/deployWith")                                    |
| [locations](#locations)                     | `object` | Required | cannot be null | [DeliveryConfig](keel-defs-simplelocations.md "https&#x3A;//keel-prestaging.us-west-2.spinnaker.mgmt.netflix.net/schema/#/$defs/TitusClusterSpec/properties/locations")                                           |
| [container](#container)                     | Merged   | Required | cannot be null | [DeliveryConfig](keel-defs-containerprovider.md "https&#x3A;//keel-prestaging.us-west-2.spinnaker.mgmt.netflix.net/schema/#/$defs/TitusClusterSpec/properties/container")                                         |
| [capacity](#capacity)                       | `object` | Optional | cannot be null | [DeliveryConfig](keel-defs-capacity.md "https&#x3A;//keel-prestaging.us-west-2.spinnaker.mgmt.netflix.net/schema/#/$defs/TitusClusterSpec/properties/capacity")                                                   |
| [constraints](#constraints)                 | `object` | Optional | cannot be null | [DeliveryConfig](keel-defs-constraints.md "https&#x3A;//keel-prestaging.us-west-2.spinnaker.mgmt.netflix.net/schema/#/$defs/TitusClusterSpec/properties/constraints")                                             |
| [env](#env)                                 | `object` | Optional | cannot be null | [DeliveryConfig](keel-defs-titusclusterspec-properties-env.md "https&#x3A;//keel-prestaging.us-west-2.spinnaker.mgmt.netflix.net/schema/#/$defs/TitusClusterSpec/properties/env")                                 |
| [containerAttributes](#containerAttributes) | `object` | Optional | cannot be null | [DeliveryConfig](keel-defs-titusclusterspec-properties-containerattributes.md "https&#x3A;//keel-prestaging.us-west-2.spinnaker.mgmt.netflix.net/schema/#/$defs/TitusClusterSpec/properties/containerAttributes") |
| [resources](#resources)                     | `object` | Optional | cannot be null | [DeliveryConfig](keel-defs-resourcesspec.md "https&#x3A;//keel-prestaging.us-west-2.spinnaker.mgmt.netflix.net/schema/#/$defs/TitusClusterSpec/properties/resources")                                             |
| [iamProfile](#iamProfile)                   | `string` | Optional | cannot be null | [DeliveryConfig](keel-defs-titusclusterspec-properties-iamprofile.md "https&#x3A;//keel-prestaging.us-west-2.spinnaker.mgmt.netflix.net/schema/#/$defs/TitusClusterSpec/properties/iamProfile")                   |
| [entryPoint](#entryPoint)                   | `string` | Optional | cannot be null | [DeliveryConfig](keel-defs-titusclusterspec-properties-entrypoint.md "https&#x3A;//keel-prestaging.us-west-2.spinnaker.mgmt.netflix.net/schema/#/$defs/TitusClusterSpec/properties/entryPoint")                   |
| [capacityGroup](#capacityGroup)             | `string` | Optional | cannot be null | [DeliveryConfig](keel-defs-titusclusterspec-properties-capacitygroup.md "https&#x3A;//keel-prestaging.us-west-2.spinnaker.mgmt.netflix.net/schema/#/$defs/TitusClusterSpec/properties/capacityGroup")             |
| [migrationPolicy](#migrationPolicy)         | `object` | Optional | cannot be null | [DeliveryConfig](keel-defs-migrationpolicy.md "https&#x3A;//keel-prestaging.us-west-2.spinnaker.mgmt.netflix.net/schema/#/$defs/TitusClusterSpec/properties/migrationPolicy")                                     |
| [dependencies](#dependencies)               | `object` | Optional | cannot be null | [DeliveryConfig](keel-defs-clusterdependencies.md "https&#x3A;//keel-prestaging.us-west-2.spinnaker.mgmt.netflix.net/schema/#/$defs/TitusClusterSpec/properties/dependencies")                                    |
| [tags](#tags)                               | `object` | Optional | cannot be null | [DeliveryConfig](keel-defs-titusclusterspec-properties-tags.md "https&#x3A;//keel-prestaging.us-west-2.spinnaker.mgmt.netflix.net/schema/#/$defs/TitusClusterSpec/properties/tags")                               |
| [overrides](#overrides)                     | `object` | Optional | cannot be null | [DeliveryConfig](keel-defs-titusclusterspec-properties-overrides.md "https&#x3A;//keel-prestaging.us-west-2.spinnaker.mgmt.netflix.net/schema/#/$defs/TitusClusterSpec/properties/overrides")                     |

### moniker




`moniker`

-   is required
-   Type: `object` ([Details](keel-defs-moniker.md))
-   cannot be null
-   defined in: [DeliveryConfig](keel-defs-moniker.md "https&#x3A;//keel-prestaging.us-west-2.spinnaker.mgmt.netflix.net/schema/#/$defs/TitusClusterSpec/properties/moniker")

#### moniker Type

`object` ([Details](keel-defs-moniker.md))

### deployWith




`deployWith`

-   is optional
-   Type: merged type ([Details](keel-defs-clusterdeploystrategy.md))
-   cannot be null
-   defined in: [DeliveryConfig](keel-defs-clusterdeploystrategy.md "https&#x3A;//keel-prestaging.us-west-2.spinnaker.mgmt.netflix.net/schema/#/$defs/TitusClusterSpec/properties/deployWith")

#### deployWith Type

merged type ([Details](keel-defs-clusterdeploystrategy.md))

one (and only one) of

-   [Untitled object in DeliveryConfig](keel-defs-redblack.md "check type definition")
-   [Untitled object in DeliveryConfig](keel-defs-highlander.md "check type definition")

### locations




`locations`

-   is required
-   Type: `object` ([Details](keel-defs-simplelocations.md))
-   cannot be null
-   defined in: [DeliveryConfig](keel-defs-simplelocations.md "https&#x3A;//keel-prestaging.us-west-2.spinnaker.mgmt.netflix.net/schema/#/$defs/TitusClusterSpec/properties/locations")

#### locations Type

`object` ([Details](keel-defs-simplelocations.md))

### container




`container`

-   is required
-   Type: merged type ([Details](keel-defs-containerprovider.md))
-   cannot be null
-   defined in: [DeliveryConfig](keel-defs-containerprovider.md "https&#x3A;//keel-prestaging.us-west-2.spinnaker.mgmt.netflix.net/schema/#/$defs/TitusClusterSpec/properties/container")

#### container Type

merged type ([Details](keel-defs-containerprovider.md))

one (and only one) of

-   [Untitled object in DeliveryConfig](keel-defs-referenceprovider.md "check type definition")
-   [Untitled object in DeliveryConfig](keel-defs-digestprovider.md "check type definition")
-   [Untitled object in DeliveryConfig](keel-defs-versionedtagprovider.md "check type definition")

### capacity




`capacity`

-   is optional
-   Type: `object` ([Details](keel-defs-capacity.md))
-   cannot be null
-   defined in: [DeliveryConfig](keel-defs-capacity.md "https&#x3A;//keel-prestaging.us-west-2.spinnaker.mgmt.netflix.net/schema/#/$defs/TitusClusterSpec/properties/capacity")

#### capacity Type

`object` ([Details](keel-defs-capacity.md))

### constraints




`constraints`

-   is optional
-   Type: `object` ([Details](keel-defs-constraints.md))
-   cannot be null
-   defined in: [DeliveryConfig](keel-defs-constraints.md "https&#x3A;//keel-prestaging.us-west-2.spinnaker.mgmt.netflix.net/schema/#/$defs/TitusClusterSpec/properties/constraints")

#### constraints Type

`object` ([Details](keel-defs-constraints.md))

### env




`env`

-   is optional
-   Type: `object` ([Details](keel-defs-titusclusterspec-properties-env.md))
-   cannot be null
-   defined in: [DeliveryConfig](keel-defs-titusclusterspec-properties-env.md "https&#x3A;//keel-prestaging.us-west-2.spinnaker.mgmt.netflix.net/schema/#/$defs/TitusClusterSpec/properties/env")

#### env Type

`object` ([Details](keel-defs-titusclusterspec-properties-env.md))

### containerAttributes




`containerAttributes`

-   is optional
-   Type: `object` ([Details](keel-defs-titusclusterspec-properties-containerattributes.md))
-   cannot be null
-   defined in: [DeliveryConfig](keel-defs-titusclusterspec-properties-containerattributes.md "https&#x3A;//keel-prestaging.us-west-2.spinnaker.mgmt.netflix.net/schema/#/$defs/TitusClusterSpec/properties/containerAttributes")

#### containerAttributes Type

`object` ([Details](keel-defs-titusclusterspec-properties-containerattributes.md))

### resources




`resources`

-   is optional
-   Type: `object` ([Details](keel-defs-resourcesspec.md))
-   cannot be null
-   defined in: [DeliveryConfig](keel-defs-resourcesspec.md "https&#x3A;//keel-prestaging.us-west-2.spinnaker.mgmt.netflix.net/schema/#/$defs/TitusClusterSpec/properties/resources")

#### resources Type

`object` ([Details](keel-defs-resourcesspec.md))

### iamProfile




`iamProfile`

-   is optional
-   Type: `string`
-   cannot be null
-   defined in: [DeliveryConfig](keel-defs-titusclusterspec-properties-iamprofile.md "https&#x3A;//keel-prestaging.us-west-2.spinnaker.mgmt.netflix.net/schema/#/$defs/TitusClusterSpec/properties/iamProfile")

#### iamProfile Type

`string`

### entryPoint




`entryPoint`

-   is optional
-   Type: `string`
-   cannot be null
-   defined in: [DeliveryConfig](keel-defs-titusclusterspec-properties-entrypoint.md "https&#x3A;//keel-prestaging.us-west-2.spinnaker.mgmt.netflix.net/schema/#/$defs/TitusClusterSpec/properties/entryPoint")

#### entryPoint Type

`string`

### capacityGroup




`capacityGroup`

-   is optional
-   Type: `string`
-   cannot be null
-   defined in: [DeliveryConfig](keel-defs-titusclusterspec-properties-capacitygroup.md "https&#x3A;//keel-prestaging.us-west-2.spinnaker.mgmt.netflix.net/schema/#/$defs/TitusClusterSpec/properties/capacityGroup")

#### capacityGroup Type

`string`

### migrationPolicy




`migrationPolicy`

-   is optional
-   Type: `object` ([Details](keel-defs-migrationpolicy.md))
-   cannot be null
-   defined in: [DeliveryConfig](keel-defs-migrationpolicy.md "https&#x3A;//keel-prestaging.us-west-2.spinnaker.mgmt.netflix.net/schema/#/$defs/TitusClusterSpec/properties/migrationPolicy")

#### migrationPolicy Type

`object` ([Details](keel-defs-migrationpolicy.md))

### dependencies




`dependencies`

-   is optional
-   Type: `object` ([Details](keel-defs-clusterdependencies.md))
-   cannot be null
-   defined in: [DeliveryConfig](keel-defs-clusterdependencies.md "https&#x3A;//keel-prestaging.us-west-2.spinnaker.mgmt.netflix.net/schema/#/$defs/TitusClusterSpec/properties/dependencies")

#### dependencies Type

`object` ([Details](keel-defs-clusterdependencies.md))

### tags




`tags`

-   is optional
-   Type: `object` ([Details](keel-defs-titusclusterspec-properties-tags.md))
-   cannot be null
-   defined in: [DeliveryConfig](keel-defs-titusclusterspec-properties-tags.md "https&#x3A;//keel-prestaging.us-west-2.spinnaker.mgmt.netflix.net/schema/#/$defs/TitusClusterSpec/properties/tags")

#### tags Type

`object` ([Details](keel-defs-titusclusterspec-properties-tags.md))

### overrides




`overrides`

-   is optional
-   Type: `object` ([Details](keel-defs-titusclusterspec-properties-overrides.md))
-   cannot be null
-   defined in: [DeliveryConfig](keel-defs-titusclusterspec-properties-overrides.md "https&#x3A;//keel-prestaging.us-west-2.spinnaker.mgmt.netflix.net/schema/#/$defs/TitusClusterSpec/properties/overrides")

#### overrides Type

`object` ([Details](keel-defs-titusclusterspec-properties-overrides.md))

## Definitions group VersionedTagProvider

Reference this group by using

```json
{"$ref":"https://keel-prestaging.us-west-2.spinnaker.mgmt.netflix.net/schema/#/$defs/VersionedTagProvider"}
```

| Property                                  | Type          | Required | Nullable       | Defined by                                                                                                                                                                                                              |
| :---------------------------------------- | ------------- | -------- | -------------- | :---------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------- |
| [organization](#organization)             | `string`      | Required | cannot be null | [DeliveryConfig](keel-defs-versionedtagprovider-properties-organization.md "https&#x3A;//keel-prestaging.us-west-2.spinnaker.mgmt.netflix.net/schema/#/$defs/VersionedTagProvider/properties/organization")             |
| [image](#image)                           | `string`      | Required | cannot be null | [DeliveryConfig](keel-defs-versionedtagprovider-properties-image.md "https&#x3A;//keel-prestaging.us-west-2.spinnaker.mgmt.netflix.net/schema/#/$defs/VersionedTagProvider/properties/image")                           |
| [tagVersionStrategy](#tagVersionStrategy) | Not specified | Required | cannot be null | [DeliveryConfig](keel-defs-versionedtagprovider-properties-tagversionstrategy.md "https&#x3A;//keel-prestaging.us-west-2.spinnaker.mgmt.netflix.net/schema/#/$defs/VersionedTagProvider/properties/tagVersionStrategy") |
| [captureGroupRegex](#captureGroupRegex)   | `string`      | Optional | cannot be null | [DeliveryConfig](keel-defs-versionedtagprovider-properties-capturegroupregex.md "https&#x3A;//keel-prestaging.us-west-2.spinnaker.mgmt.netflix.net/schema/#/$defs/VersionedTagProvider/properties/captureGroupRegex")   |

### organization




`organization`

-   is required
-   Type: `string`
-   cannot be null
-   defined in: [DeliveryConfig](keel-defs-versionedtagprovider-properties-organization.md "https&#x3A;//keel-prestaging.us-west-2.spinnaker.mgmt.netflix.net/schema/#/$defs/VersionedTagProvider/properties/organization")

#### organization Type

`string`

### image




`image`

-   is required
-   Type: `string`
-   cannot be null
-   defined in: [DeliveryConfig](keel-defs-versionedtagprovider-properties-image.md "https&#x3A;//keel-prestaging.us-west-2.spinnaker.mgmt.netflix.net/schema/#/$defs/VersionedTagProvider/properties/image")

#### image Type

`string`

### tagVersionStrategy




`tagVersionStrategy`

-   is required
-   Type: unknown
-   cannot be null
-   defined in: [DeliveryConfig](keel-defs-versionedtagprovider-properties-tagversionstrategy.md "https&#x3A;//keel-prestaging.us-west-2.spinnaker.mgmt.netflix.net/schema/#/$defs/VersionedTagProvider/properties/tagVersionStrategy")

#### tagVersionStrategy Type

unknown

#### tagVersionStrategy Constraints

**enum**: the value of this property must be equal to one of the following values:

| Value                           | Explanation |
| :------------------------------ | ----------- |
| `"increasing-tag"`              |             |
| `"semver-tag"`                  |             |
| `"branch-job-commit-by-job"`    |             |
| `"semver-job-commit-by-job"`    |             |
| `"semver-job-commit-by-semver"` |             |

### captureGroupRegex




`captureGroupRegex`

-   is optional
-   Type: `string`
-   cannot be null
-   defined in: [DeliveryConfig](keel-defs-versionedtagprovider-properties-capturegroupregex.md "https&#x3A;//keel-prestaging.us-west-2.spinnaker.mgmt.netflix.net/schema/#/$defs/VersionedTagProvider/properties/captureGroupRegex")

#### captureGroupRegex Type

`string`

## Definitions group VersioningStrategy

Reference this group by using

```json
{"$ref":"https://keel-prestaging.us-west-2.spinnaker.mgmt.netflix.net/schema/#/$defs/VersioningStrategy"}
```

| Property | Type | Required | Nullable | Defined by |
| :------- | ---- | -------- | -------- | :--------- |

## Definitions group VirtualMachineImage

Reference this group by using

```json
{"$ref":"https://keel-prestaging.us-west-2.spinnaker.mgmt.netflix.net/schema/#/$defs/VirtualMachineImage"}
```

| Property                              | Type     | Required | Nullable       | Defined by                                                                                                                                                                                                        |
| :------------------------------------ | -------- | -------- | -------------- | :---------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------- |
| [id](#id)                             | `string` | Required | cannot be null | [DeliveryConfig](keel-defs-virtualmachineimage-properties-id.md "https&#x3A;//keel-prestaging.us-west-2.spinnaker.mgmt.netflix.net/schema/#/$defs/VirtualMachineImage/properties/id")                             |
| [appVersion](#appVersion)             | `string` | Required | cannot be null | [DeliveryConfig](keel-defs-virtualmachineimage-properties-appversion.md "https&#x3A;//keel-prestaging.us-west-2.spinnaker.mgmt.netflix.net/schema/#/$defs/VirtualMachineImage/properties/appVersion")             |
| [baseImageVersion](#baseImageVersion) | `string` | Required | cannot be null | [DeliveryConfig](keel-defs-virtualmachineimage-properties-baseimageversion.md "https&#x3A;//keel-prestaging.us-west-2.spinnaker.mgmt.netflix.net/schema/#/$defs/VirtualMachineImage/properties/baseImageVersion") |

### id




`id`

-   is required
-   Type: `string`
-   cannot be null
-   defined in: [DeliveryConfig](keel-defs-virtualmachineimage-properties-id.md "https&#x3A;//keel-prestaging.us-west-2.spinnaker.mgmt.netflix.net/schema/#/$defs/VirtualMachineImage/properties/id")

#### id Type

`string`

### appVersion




`appVersion`

-   is required
-   Type: `string`
-   cannot be null
-   defined in: [DeliveryConfig](keel-defs-virtualmachineimage-properties-appversion.md "https&#x3A;//keel-prestaging.us-west-2.spinnaker.mgmt.netflix.net/schema/#/$defs/VirtualMachineImage/properties/appVersion")

#### appVersion Type

`string`

### baseImageVersion




`baseImageVersion`

-   is required
-   Type: `string`
-   cannot be null
-   defined in: [DeliveryConfig](keel-defs-virtualmachineimage-properties-baseimageversion.md "https&#x3A;//keel-prestaging.us-west-2.spinnaker.mgmt.netflix.net/schema/#/$defs/VirtualMachineImage/properties/baseImageVersion")

#### baseImageVersion Type

`string`

# DeliveryConfig Properties

| Property                          | Type     | Required | Nullable       | Defined by                                                                                                                                                 |
| :-------------------------------- | -------- | -------- | -------------- | :--------------------------------------------------------------------------------------------------------------------------------------------------------- |
| [name](#name)                     | `string` | Required | cannot be null | [DeliveryConfig](keel-properties-name.md "https&#x3A;//keel-prestaging.us-west-2.spinnaker.mgmt.netflix.net/schema/#/properties/name")                     |
| [application](#application)       | `string` | Required | cannot be null | [DeliveryConfig](keel-properties-application.md "https&#x3A;//keel-prestaging.us-west-2.spinnaker.mgmt.netflix.net/schema/#/properties/application")       |
| [serviceAccount](#serviceAccount) | `string` | Required | cannot be null | [DeliveryConfig](keel-properties-serviceaccount.md "https&#x3A;//keel-prestaging.us-west-2.spinnaker.mgmt.netflix.net/schema/#/properties/serviceAccount") |
| [artifacts](#artifacts)           | `array`  | Optional | cannot be null | [DeliveryConfig](keel-properties-artifacts.md "https&#x3A;//keel-prestaging.us-west-2.spinnaker.mgmt.netflix.net/schema/#/properties/artifacts")           |
| [environments](#environments)     | `array`  | Optional | cannot be null | [DeliveryConfig](keel-properties-environments.md "https&#x3A;//keel-prestaging.us-west-2.spinnaker.mgmt.netflix.net/schema/#/properties/environments")     |
| [apiVersion](#apiVersion)         | `string` | Optional | cannot be null | [DeliveryConfig](keel-properties-apiversion.md "https&#x3A;//keel-prestaging.us-west-2.spinnaker.mgmt.netflix.net/schema/#/properties/apiVersion")         |

## name




`name`

-   is required
-   Type: `string`
-   cannot be null
-   defined in: [DeliveryConfig](keel-properties-name.md "https&#x3A;//keel-prestaging.us-west-2.spinnaker.mgmt.netflix.net/schema/#/properties/name")

### name Type

`string`

## application




`application`

-   is required
-   Type: `string`
-   cannot be null
-   defined in: [DeliveryConfig](keel-properties-application.md "https&#x3A;//keel-prestaging.us-west-2.spinnaker.mgmt.netflix.net/schema/#/properties/application")

### application Type

`string`

## serviceAccount




`serviceAccount`

-   is required
-   Type: `string`
-   cannot be null
-   defined in: [DeliveryConfig](keel-properties-serviceaccount.md "https&#x3A;//keel-prestaging.us-west-2.spinnaker.mgmt.netflix.net/schema/#/properties/serviceAccount")

### serviceAccount Type

`string`

## artifacts




`artifacts`

-   is optional
-   Type: an array of merged types ([Details](keel-defs-deliveryartifact.md))
-   cannot be null
-   defined in: [DeliveryConfig](keel-properties-artifacts.md "https&#x3A;//keel-prestaging.us-west-2.spinnaker.mgmt.netflix.net/schema/#/properties/artifacts")

### artifacts Type

an array of merged types ([Details](keel-defs-deliveryartifact.md))

### artifacts Constraints

**unique items**: all items in this array must be unique. Duplicates are not allowed.

## environments




`environments`

-   is optional
-   Type: `object[]` ([Details](keel-defs-environment.md))
-   cannot be null
-   defined in: [DeliveryConfig](keel-properties-environments.md "https&#x3A;//keel-prestaging.us-west-2.spinnaker.mgmt.netflix.net/schema/#/properties/environments")

### environments Type

`object[]` ([Details](keel-defs-environment.md))

### environments Constraints

**unique items**: all items in this array must be unique. Duplicates are not allowed.

## apiVersion




`apiVersion`

-   is optional
-   Type: `string`
-   cannot be null
-   defined in: [DeliveryConfig](keel-properties-apiversion.md "https&#x3A;//keel-prestaging.us-west-2.spinnaker.mgmt.netflix.net/schema/#/properties/apiVersion")

### apiVersion Type

`string`
