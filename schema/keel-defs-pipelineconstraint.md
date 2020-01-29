# Untitled object in DeliveryConfig Schema

```txt
https://keel-prestaging.us-west-2.spinnaker.mgmt.netflix.net/schema/#/$defs/PipelineConstraint
```




| Abstract            | Extensible | Status         | Identifiable | Custom Properties | Additional Properties | Access Restrictions | Defined In                                                    |
| :------------------ | ---------- | -------------- | ------------ | :---------------- | --------------------- | ------------------- | ------------------------------------------------------------- |
| Can be instantiated | No         | Unknown status | No           | Forbidden         | Allowed               | none                | [keel.schema.json\*](keel.schema.json "open original schema") |

## PipelineConstraint Type

`object` ([Details](keel-defs-pipelineconstraint.md))

# undefined Properties

| Property                  | Type     | Required | Nullable       | Defined by                                                                                                                                                                                          |
| :------------------------ | -------- | -------- | -------------- | :-------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------- |
| [timeout](#timeout)       | `string` | Optional | cannot be null | [DeliveryConfig](keel-defs-pipelineconstraint-properties-timeout.md "https&#x3A;//keel-prestaging.us-west-2.spinnaker.mgmt.netflix.net/schema/#/$defs/PipelineConstraint/properties/timeout")       |
| [pipelineId](#pipelineId) | `string` | Required | cannot be null | [DeliveryConfig](keel-defs-pipelineconstraint-properties-pipelineid.md "https&#x3A;//keel-prestaging.us-west-2.spinnaker.mgmt.netflix.net/schema/#/$defs/PipelineConstraint/properties/pipelineId") |
| [retries](#retries)       | `number` | Optional | cannot be null | [DeliveryConfig](keel-defs-pipelineconstraint-properties-retries.md "https&#x3A;//keel-prestaging.us-west-2.spinnaker.mgmt.netflix.net/schema/#/$defs/PipelineConstraint/properties/retries")       |
| [parameters](#parameters) | `object` | Optional | cannot be null | [DeliveryConfig](keel-defs-pipelineconstraint-properties-parameters.md "https&#x3A;//keel-prestaging.us-west-2.spinnaker.mgmt.netflix.net/schema/#/$defs/PipelineConstraint/properties/parameters") |

## timeout




`timeout`

-   is optional
-   Type: `string`
-   cannot be null
-   defined in: [DeliveryConfig](keel-defs-pipelineconstraint-properties-timeout.md "https&#x3A;//keel-prestaging.us-west-2.spinnaker.mgmt.netflix.net/schema/#/$defs/PipelineConstraint/properties/timeout")

### timeout Type

`string`

### timeout Constraints

**duration**: the string must be a duration string, according to [RFC 3339, section 5.6](https://tools.ietf.org/html/rfc3339 "check the specification")

## pipelineId




`pipelineId`

-   is required
-   Type: `string`
-   cannot be null
-   defined in: [DeliveryConfig](keel-defs-pipelineconstraint-properties-pipelineid.md "https&#x3A;//keel-prestaging.us-west-2.spinnaker.mgmt.netflix.net/schema/#/$defs/PipelineConstraint/properties/pipelineId")

### pipelineId Type

`string`

## retries




`retries`

-   is optional
-   Type: `number`
-   cannot be null
-   defined in: [DeliveryConfig](keel-defs-pipelineconstraint-properties-retries.md "https&#x3A;//keel-prestaging.us-west-2.spinnaker.mgmt.netflix.net/schema/#/$defs/PipelineConstraint/properties/retries")

### retries Type

`number`

## parameters




`parameters`

-   is optional
-   Type: `object` ([Details](keel-defs-pipelineconstraint-properties-parameters.md))
-   cannot be null
-   defined in: [DeliveryConfig](keel-defs-pipelineconstraint-properties-parameters.md "https&#x3A;//keel-prestaging.us-west-2.spinnaker.mgmt.netflix.net/schema/#/$defs/PipelineConstraint/properties/parameters")

### parameters Type

`object` ([Details](keel-defs-pipelineconstraint-properties-parameters.md))
