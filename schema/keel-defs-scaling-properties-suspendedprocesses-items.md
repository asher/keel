# Untitled undefined type in DeliveryConfig Schema

```txt
https://keel-prestaging.us-west-2.spinnaker.mgmt.netflix.net/schema/#/$defs/Scaling/properties/suspendedProcesses/items
```




| Abstract            | Extensible | Status         | Identifiable            | Custom Properties | Additional Properties | Access Restrictions | Defined In                                                    |
| :------------------ | ---------- | -------------- | ----------------------- | :---------------- | --------------------- | ------------------- | ------------------------------------------------------------- |
| Can be instantiated | No         | Unknown status | Unknown identifiability | Forbidden         | Allowed               | none                | [keel.schema.json\*](keel.schema.json "open original schema") |

## items Type

unknown

## items Constraints

**enum**: the value of this property must be equal to one of the following values:

| Value                 | Explanation |
| :-------------------- | ----------- |
| `"Launch"`            |             |
| `"Terminate"`         |             |
| `"AddToLoadBalancer"` |             |
| `"AlarmNotification"` |             |
| `"AZRebalance"`       |             |
| `"HealthCheck"`       |             |
| `"ReplaceUnhealthy"`  |             |
| `"ScheduledActions"`  |             |
