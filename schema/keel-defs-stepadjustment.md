# Untitled object in DeliveryConfig Schema

```txt
https://keel-prestaging.us-west-2.spinnaker.mgmt.netflix.net/schema/#/$defs/StepScalingPolicy/properties/stepAdjustments/items
```




| Abstract            | Extensible | Status         | Identifiable | Custom Properties | Additional Properties | Access Restrictions | Defined In                                                    |
| :------------------ | ---------- | -------------- | ------------ | :---------------- | --------------------- | ------------------- | ------------------------------------------------------------- |
| Can be instantiated | No         | Unknown status | No           | Forbidden         | Allowed               | none                | [keel.schema.json\*](keel.schema.json "open original schema") |

## items Type

`object` ([Details](keel-defs-stepadjustment.md))

# undefined Properties

| Property                                | Type     | Required | Nullable       | Defined by                                                                                                                                                                                                |
| :-------------------------------------- | -------- | -------- | -------------- | :-------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------- |
| [lowerBound](#lowerBound)               | `number` | Optional | cannot be null | [DeliveryConfig](keel-defs-stepadjustment-properties-lowerbound.md "https&#x3A;//keel-prestaging.us-west-2.spinnaker.mgmt.netflix.net/schema/#/$defs/StepAdjustment/properties/lowerBound")               |
| [upperBound](#upperBound)               | `number` | Optional | cannot be null | [DeliveryConfig](keel-defs-stepadjustment-properties-upperbound.md "https&#x3A;//keel-prestaging.us-west-2.spinnaker.mgmt.netflix.net/schema/#/$defs/StepAdjustment/properties/upperBound")               |
| [scalingAdjustment](#scalingAdjustment) | `number` | Required | cannot be null | [DeliveryConfig](keel-defs-stepadjustment-properties-scalingadjustment.md "https&#x3A;//keel-prestaging.us-west-2.spinnaker.mgmt.netflix.net/schema/#/$defs/StepAdjustment/properties/scalingAdjustment") |

## lowerBound




`lowerBound`

-   is optional
-   Type: `number`
-   cannot be null
-   defined in: [DeliveryConfig](keel-defs-stepadjustment-properties-lowerbound.md "https&#x3A;//keel-prestaging.us-west-2.spinnaker.mgmt.netflix.net/schema/#/$defs/StepAdjustment/properties/lowerBound")

### lowerBound Type

`number`

## upperBound




`upperBound`

-   is optional
-   Type: `number`
-   cannot be null
-   defined in: [DeliveryConfig](keel-defs-stepadjustment-properties-upperbound.md "https&#x3A;//keel-prestaging.us-west-2.spinnaker.mgmt.netflix.net/schema/#/$defs/StepAdjustment/properties/upperBound")

### upperBound Type

`number`

## scalingAdjustment




`scalingAdjustment`

-   is required
-   Type: `number`
-   cannot be null
-   defined in: [DeliveryConfig](keel-defs-stepadjustment-properties-scalingadjustment.md "https&#x3A;//keel-prestaging.us-west-2.spinnaker.mgmt.netflix.net/schema/#/$defs/StepAdjustment/properties/scalingAdjustment")

### scalingAdjustment Type

`number`
