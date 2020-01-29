# Untitled object in DeliveryConfig Schema

```txt
https://keel-prestaging.us-west-2.spinnaker.mgmt.netflix.net/schema/#/$defs/TimeWindowConstraint
```




| Abstract            | Extensible | Status         | Identifiable | Custom Properties | Additional Properties | Access Restrictions | Defined In                                                    |
| :------------------ | ---------- | -------------- | ------------ | :---------------- | --------------------- | ------------------- | ------------------------------------------------------------- |
| Can be instantiated | No         | Unknown status | No           | Forbidden         | Allowed               | none                | [keel.schema.json\*](keel.schema.json "open original schema") |

## TimeWindowConstraint Type

`object` ([Details](keel-defs-timewindowconstraint.md))

# undefined Properties

| Property            | Type     | Required | Nullable       | Defined by                                                                                                                                                                                        |
| :------------------ | -------- | -------- | -------------- | :------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------ |
| [windows](#windows) | `array`  | Required | cannot be null | [DeliveryConfig](keel-defs-timewindowconstraint-properties-windows.md "https&#x3A;//keel-prestaging.us-west-2.spinnaker.mgmt.netflix.net/schema/#/$defs/TimeWindowConstraint/properties/windows") |
| [tz](#tz)           | `string` | Optional | cannot be null | [DeliveryConfig](keel-defs-timewindowconstraint-properties-tz.md "https&#x3A;//keel-prestaging.us-west-2.spinnaker.mgmt.netflix.net/schema/#/$defs/TimeWindowConstraint/properties/tz")           |

## windows




`windows`

-   is required
-   Type: `object[]` ([Details](keel-defs-timewindow.md))
-   cannot be null
-   defined in: [DeliveryConfig](keel-defs-timewindowconstraint-properties-windows.md "https&#x3A;//keel-prestaging.us-west-2.spinnaker.mgmt.netflix.net/schema/#/$defs/TimeWindowConstraint/properties/windows")

### windows Type

`object[]` ([Details](keel-defs-timewindow.md))

## tz




`tz`

-   is optional
-   Type: `string`
-   cannot be null
-   defined in: [DeliveryConfig](keel-defs-timewindowconstraint-properties-tz.md "https&#x3A;//keel-prestaging.us-west-2.spinnaker.mgmt.netflix.net/schema/#/$defs/TimeWindowConstraint/properties/tz")

### tz Type

`string`
