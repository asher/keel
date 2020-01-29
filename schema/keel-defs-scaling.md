# Untitled object in DeliveryConfig Schema

```txt
https://keel-prestaging.us-west-2.spinnaker.mgmt.netflix.net/schema/#/$defs/Scaling
```




| Abstract            | Extensible | Status         | Identifiable | Custom Properties | Additional Properties | Access Restrictions | Defined In                                                    |
| :------------------ | ---------- | -------------- | ------------ | :---------------- | --------------------- | ------------------- | ------------------------------------------------------------- |
| Can be instantiated | No         | Unknown status | No           | Forbidden         | Allowed               | none                | [keel.schema.json\*](keel.schema.json "open original schema") |

## Scaling Type

`object` ([Details](keel-defs-scaling.md))

# undefined Properties

| Property                                          | Type    | Required | Nullable       | Defined by                                                                                                                                                                                            |
| :------------------------------------------------ | ------- | -------- | -------------- | :---------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------- |
| [suspendedProcesses](#suspendedProcesses)         | `array` | Optional | cannot be null | [DeliveryConfig](keel-defs-scaling-properties-suspendedprocesses.md "https&#x3A;//keel-prestaging.us-west-2.spinnaker.mgmt.netflix.net/schema/#/$defs/Scaling/properties/suspendedProcesses")         |
| [targetTrackingPolicies](#targetTrackingPolicies) | `array` | Optional | cannot be null | [DeliveryConfig](keel-defs-scaling-properties-targettrackingpolicies.md "https&#x3A;//keel-prestaging.us-west-2.spinnaker.mgmt.netflix.net/schema/#/$defs/Scaling/properties/targetTrackingPolicies") |
| [stepScalingPolicies](#stepScalingPolicies)       | `array` | Optional | cannot be null | [DeliveryConfig](keel-defs-scaling-properties-stepscalingpolicies.md "https&#x3A;//keel-prestaging.us-west-2.spinnaker.mgmt.netflix.net/schema/#/$defs/Scaling/properties/stepScalingPolicies")       |

## suspendedProcesses




`suspendedProcesses`

-   is optional
-   Type: unknown\[]
-   cannot be null
-   defined in: [DeliveryConfig](keel-defs-scaling-properties-suspendedprocesses.md "https&#x3A;//keel-prestaging.us-west-2.spinnaker.mgmt.netflix.net/schema/#/$defs/Scaling/properties/suspendedProcesses")

### suspendedProcesses Type

unknown\[]

### suspendedProcesses Constraints

**unique items**: all items in this array must be unique. Duplicates are not allowed.

## targetTrackingPolicies




`targetTrackingPolicies`

-   is optional
-   Type: `object[]` ([Details](keel-defs-targettrackingpolicy.md))
-   cannot be null
-   defined in: [DeliveryConfig](keel-defs-scaling-properties-targettrackingpolicies.md "https&#x3A;//keel-prestaging.us-west-2.spinnaker.mgmt.netflix.net/schema/#/$defs/Scaling/properties/targetTrackingPolicies")

### targetTrackingPolicies Type

`object[]` ([Details](keel-defs-targettrackingpolicy.md))

### targetTrackingPolicies Constraints

**unique items**: all items in this array must be unique. Duplicates are not allowed.

## stepScalingPolicies




`stepScalingPolicies`

-   is optional
-   Type: `object[]` ([Details](keel-defs-stepscalingpolicy.md))
-   cannot be null
-   defined in: [DeliveryConfig](keel-defs-scaling-properties-stepscalingpolicies.md "https&#x3A;//keel-prestaging.us-west-2.spinnaker.mgmt.netflix.net/schema/#/$defs/Scaling/properties/stepScalingPolicies")

### stepScalingPolicies Type

`object[]` ([Details](keel-defs-stepscalingpolicy.md))

### stepScalingPolicies Constraints

**unique items**: all items in this array must be unique. Duplicates are not allowed.
