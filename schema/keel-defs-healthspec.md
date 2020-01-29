# Untitled object in DeliveryConfig Schema

```txt
https://keel-prestaging.us-west-2.spinnaker.mgmt.netflix.net/schema/#/$defs/ClusterSpec/properties/health
```




| Abstract            | Extensible | Status         | Identifiable | Custom Properties | Additional Properties | Access Restrictions | Defined In                                                    |
| :------------------ | ---------- | -------------- | ------------ | :---------------- | --------------------- | ------------------- | ------------------------------------------------------------- |
| Can be instantiated | No         | Unknown status | No           | Forbidden         | Allowed               | none                | [keel.schema.json\*](keel.schema.json "open original schema") |

## health Type

`object` ([Details](keel-defs-healthspec.md))

# undefined Properties

| Property                                    | Type          | Required | Nullable       | Defined by                                                                                                                                                                                            |
| :------------------------------------------ | ------------- | -------- | -------------- | :---------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------- |
| [cooldown](#cooldown)                       | `string`      | Optional | cannot be null | [DeliveryConfig](keel-defs-healthspec-properties-cooldown.md "https&#x3A;//keel-prestaging.us-west-2.spinnaker.mgmt.netflix.net/schema/#/$defs/HealthSpec/properties/cooldown")                       |
| [warmup](#warmup)                           | `string`      | Optional | cannot be null | [DeliveryConfig](keel-defs-healthspec-properties-warmup.md "https&#x3A;//keel-prestaging.us-west-2.spinnaker.mgmt.netflix.net/schema/#/$defs/HealthSpec/properties/warmup")                           |
| [healthCheckType](#healthCheckType)         | Not specified | Optional | cannot be null | [DeliveryConfig](keel-defs-healthspec-properties-healthchecktype.md "https&#x3A;//keel-prestaging.us-west-2.spinnaker.mgmt.netflix.net/schema/#/$defs/HealthSpec/properties/healthCheckType")         |
| [enabledMetrics](#enabledMetrics)           | `array`       | Optional | cannot be null | [DeliveryConfig](keel-defs-healthspec-properties-enabledmetrics.md "https&#x3A;//keel-prestaging.us-west-2.spinnaker.mgmt.netflix.net/schema/#/$defs/HealthSpec/properties/enabledMetrics")           |
| [terminationPolicies](#terminationPolicies) | `array`       | Optional | cannot be null | [DeliveryConfig](keel-defs-healthspec-properties-terminationpolicies.md "https&#x3A;//keel-prestaging.us-west-2.spinnaker.mgmt.netflix.net/schema/#/$defs/HealthSpec/properties/terminationPolicies") |

## cooldown




`cooldown`

-   is optional
-   Type: `string`
-   cannot be null
-   defined in: [DeliveryConfig](keel-defs-healthspec-properties-cooldown.md "https&#x3A;//keel-prestaging.us-west-2.spinnaker.mgmt.netflix.net/schema/#/$defs/HealthSpec/properties/cooldown")

### cooldown Type

`string`

### cooldown Constraints

**duration**: the string must be a duration string, according to [RFC 3339, section 5.6](https://tools.ietf.org/html/rfc3339 "check the specification")

## warmup




`warmup`

-   is optional
-   Type: `string`
-   cannot be null
-   defined in: [DeliveryConfig](keel-defs-healthspec-properties-warmup.md "https&#x3A;//keel-prestaging.us-west-2.spinnaker.mgmt.netflix.net/schema/#/$defs/HealthSpec/properties/warmup")

### warmup Type

`string`

### warmup Constraints

**duration**: the string must be a duration string, according to [RFC 3339, section 5.6](https://tools.ietf.org/html/rfc3339 "check the specification")

## healthCheckType




`healthCheckType`

-   is optional
-   Type: unknown
-   cannot be null
-   defined in: [DeliveryConfig](keel-defs-healthspec-properties-healthchecktype.md "https&#x3A;//keel-prestaging.us-west-2.spinnaker.mgmt.netflix.net/schema/#/$defs/HealthSpec/properties/healthCheckType")

### healthCheckType Type

unknown

### healthCheckType Constraints

**enum**: the value of this property must be equal to one of the following values:

| Value   | Explanation |
| :------ | ----------- |
| `"EC2"` |             |
| `"ELB"` |             |

## enabledMetrics




`enabledMetrics`

-   is optional
-   Type: unknown\[]
-   cannot be null
-   defined in: [DeliveryConfig](keel-defs-healthspec-properties-enabledmetrics.md "https&#x3A;//keel-prestaging.us-west-2.spinnaker.mgmt.netflix.net/schema/#/$defs/HealthSpec/properties/enabledMetrics")

### enabledMetrics Type

unknown\[]

### enabledMetrics Constraints

**unique items**: all items in this array must be unique. Duplicates are not allowed.

## terminationPolicies




`terminationPolicies`

-   is optional
-   Type: unknown\[]
-   cannot be null
-   defined in: [DeliveryConfig](keel-defs-healthspec-properties-terminationpolicies.md "https&#x3A;//keel-prestaging.us-west-2.spinnaker.mgmt.netflix.net/schema/#/$defs/HealthSpec/properties/terminationPolicies")

### terminationPolicies Type

unknown\[]

### terminationPolicies Constraints

**unique items**: all items in this array must be unique. Duplicates are not allowed.
