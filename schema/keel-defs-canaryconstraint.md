# Untitled object in DeliveryConfig Schema

```txt
https://keel-prestaging.us-west-2.spinnaker.mgmt.netflix.net/schema/#/$defs/Constraint/oneOf/4
```




| Abstract            | Extensible | Status         | Identifiable | Custom Properties | Additional Properties | Access Restrictions | Defined In                                                    |
| :------------------ | ---------- | -------------- | ------------ | :---------------- | --------------------- | ------------------- | ------------------------------------------------------------- |
| Can be instantiated | No         | Unknown status | No           | Forbidden         | Allowed               | none                | [keel.schema.json\*](keel.schema.json "open original schema") |

## 4 Type

`object` ([Details](keel-defs-canaryconstraint.md))

# undefined Properties

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

## timeout




`timeout`

-   is optional
-   Type: `string`
-   cannot be null
-   defined in: [DeliveryConfig](keel-defs-canaryconstraint-properties-timeout.md "https&#x3A;//keel-prestaging.us-west-2.spinnaker.mgmt.netflix.net/schema/#/$defs/CanaryConstraint/properties/timeout")

### timeout Type

`string`

### timeout Constraints

**duration**: the string must be a duration string, according to [RFC 3339, section 5.6](https://tools.ietf.org/html/rfc3339 "check the specification")

## canaryConfigId




`canaryConfigId`

-   is required
-   Type: `string`
-   cannot be null
-   defined in: [DeliveryConfig](keel-defs-canaryconstraint-properties-canaryconfigid.md "https&#x3A;//keel-prestaging.us-west-2.spinnaker.mgmt.netflix.net/schema/#/$defs/CanaryConstraint/properties/canaryConfigId")

### canaryConfigId Type

`string`

## beginAnalysisAfter




`beginAnalysisAfter`

-   is optional
-   Type: `string`
-   cannot be null
-   defined in: [DeliveryConfig](keel-defs-canaryconstraint-properties-beginanalysisafter.md "https&#x3A;//keel-prestaging.us-west-2.spinnaker.mgmt.netflix.net/schema/#/$defs/CanaryConstraint/properties/beginAnalysisAfter")

### beginAnalysisAfter Type

`string`

### beginAnalysisAfter Constraints

**duration**: the string must be a duration string, according to [RFC 3339, section 5.6](https://tools.ietf.org/html/rfc3339 "check the specification")

## canaryAnalysisInterval




`canaryAnalysisInterval`

-   is optional
-   Type: `string`
-   cannot be null
-   defined in: [DeliveryConfig](keel-defs-canaryconstraint-properties-canaryanalysisinterval.md "https&#x3A;//keel-prestaging.us-west-2.spinnaker.mgmt.netflix.net/schema/#/$defs/CanaryConstraint/properties/canaryAnalysisInterval")

### canaryAnalysisInterval Type

`string`

### canaryAnalysisInterval Constraints

**duration**: the string must be a duration string, according to [RFC 3339, section 5.6](https://tools.ietf.org/html/rfc3339 "check the specification")

## cleanupDelay




`cleanupDelay`

-   is optional
-   Type: `string`
-   cannot be null
-   defined in: [DeliveryConfig](keel-defs-canaryconstraint-properties-cleanupdelay.md "https&#x3A;//keel-prestaging.us-west-2.spinnaker.mgmt.netflix.net/schema/#/$defs/CanaryConstraint/properties/cleanupDelay")

### cleanupDelay Type

`string`

### cleanupDelay Constraints

**duration**: the string must be a duration string, according to [RFC 3339, section 5.6](https://tools.ietf.org/html/rfc3339 "check the specification")

## lifetime




`lifetime`

-   is required
-   Type: `string`
-   cannot be null
-   defined in: [DeliveryConfig](keel-defs-canaryconstraint-properties-lifetime.md "https&#x3A;//keel-prestaging.us-west-2.spinnaker.mgmt.netflix.net/schema/#/$defs/CanaryConstraint/properties/lifetime")

### lifetime Type

`string`

### lifetime Constraints

**duration**: the string must be a duration string, according to [RFC 3339, section 5.6](https://tools.ietf.org/html/rfc3339 "check the specification")

## metricsAccount




`metricsAccount`

-   is optional
-   Type: `string`
-   cannot be null
-   defined in: [DeliveryConfig](keel-defs-canaryconstraint-properties-metricsaccount.md "https&#x3A;//keel-prestaging.us-west-2.spinnaker.mgmt.netflix.net/schema/#/$defs/CanaryConstraint/properties/metricsAccount")

### metricsAccount Type

`string`

## storageAccount




`storageAccount`

-   is optional
-   Type: `string`
-   cannot be null
-   defined in: [DeliveryConfig](keel-defs-canaryconstraint-properties-storageaccount.md "https&#x3A;//keel-prestaging.us-west-2.spinnaker.mgmt.netflix.net/schema/#/$defs/CanaryConstraint/properties/storageAccount")

### storageAccount Type

`string`

## marginalScore




`marginalScore`

-   is required
-   Type: `number`
-   cannot be null
-   defined in: [DeliveryConfig](keel-defs-canaryconstraint-properties-marginalscore.md "https&#x3A;//keel-prestaging.us-west-2.spinnaker.mgmt.netflix.net/schema/#/$defs/CanaryConstraint/properties/marginalScore")

### marginalScore Type

`number`

## passScore




`passScore`

-   is required
-   Type: `number`
-   cannot be null
-   defined in: [DeliveryConfig](keel-defs-canaryconstraint-properties-passscore.md "https&#x3A;//keel-prestaging.us-west-2.spinnaker.mgmt.netflix.net/schema/#/$defs/CanaryConstraint/properties/passScore")

### passScore Type

`number`

## source




`source`

-   is required
-   Type: `object` ([Details](keel-defs-canarysource.md))
-   cannot be null
-   defined in: [DeliveryConfig](keel-defs-canarysource.md "https&#x3A;//keel-prestaging.us-west-2.spinnaker.mgmt.netflix.net/schema/#/$defs/CanaryConstraint/properties/source")

### source Type

`object` ([Details](keel-defs-canarysource.md))

## regions




`regions`

-   is required
-   Type: `string[]`
-   cannot be null
-   defined in: [DeliveryConfig](keel-defs-canaryconstraint-properties-regions.md "https&#x3A;//keel-prestaging.us-west-2.spinnaker.mgmt.netflix.net/schema/#/$defs/CanaryConstraint/properties/regions")

### regions Type

`string[]`

### regions Constraints

**unique items**: all items in this array must be unique. Duplicates are not allowed.

## capacity




`capacity`

-   is required
-   Type: `number`
-   cannot be null
-   defined in: [DeliveryConfig](keel-defs-canaryconstraint-properties-capacity.md "https&#x3A;//keel-prestaging.us-west-2.spinnaker.mgmt.netflix.net/schema/#/$defs/CanaryConstraint/properties/capacity")

### capacity Type

`number`

## failureCancelsRunningRegions




`failureCancelsRunningRegions`

-   is optional
-   Type: `boolean`
-   cannot be null
-   defined in: [DeliveryConfig](keel-defs-canaryconstraint-properties-failurecancelsrunningregions.md "https&#x3A;//keel-prestaging.us-west-2.spinnaker.mgmt.netflix.net/schema/#/$defs/CanaryConstraint/properties/failureCancelsRunningRegions")

### failureCancelsRunningRegions Type

`boolean`

## minSuccessfulRegions




`minSuccessfulRegions`

-   is optional
-   Type: `number`
-   cannot be null
-   defined in: [DeliveryConfig](keel-defs-canaryconstraint-properties-minsuccessfulregions.md "https&#x3A;//keel-prestaging.us-west-2.spinnaker.mgmt.netflix.net/schema/#/$defs/CanaryConstraint/properties/minSuccessfulRegions")

### minSuccessfulRegions Type

`number`
