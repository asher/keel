# Untitled object in DeliveryConfig Schema

```txt
https://keel-prestaging.us-west-2.spinnaker.mgmt.netflix.net/schema/#/$defs/NotificationConfig
```




| Abstract            | Extensible | Status         | Identifiable | Custom Properties | Additional Properties | Access Restrictions | Defined In                                                    |
| :------------------ | ---------- | -------------- | ------------ | :---------------- | --------------------- | ------------------- | ------------------------------------------------------------- |
| Can be instantiated | No         | Unknown status | No           | Forbidden         | Allowed               | none                | [keel.schema.json\*](keel.schema.json "open original schema") |

## NotificationConfig Type

`object` ([Details](keel-defs-notificationconfig.md))

# undefined Properties

| Property                | Type          | Required | Nullable       | Defined by                                                                                                                                                                                        |
| :---------------------- | ------------- | -------- | -------------- | :------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------ |
| [type](#type)           | Not specified | Required | cannot be null | [DeliveryConfig](keel-defs-notificationconfig-properties-type.md "https&#x3A;//keel-prestaging.us-west-2.spinnaker.mgmt.netflix.net/schema/#/$defs/NotificationConfig/properties/type")           |
| [address](#address)     | `string`      | Required | cannot be null | [DeliveryConfig](keel-defs-notificationconfig-properties-address.md "https&#x3A;//keel-prestaging.us-west-2.spinnaker.mgmt.netflix.net/schema/#/$defs/NotificationConfig/properties/address")     |
| [frequency](#frequency) | Not specified | Required | cannot be null | [DeliveryConfig](keel-defs-notificationconfig-properties-frequency.md "https&#x3A;//keel-prestaging.us-west-2.spinnaker.mgmt.netflix.net/schema/#/$defs/NotificationConfig/properties/frequency") |

## type




`type`

-   is required
-   Type: unknown
-   cannot be null
-   defined in: [DeliveryConfig](keel-defs-notificationconfig-properties-type.md "https&#x3A;//keel-prestaging.us-west-2.spinnaker.mgmt.netflix.net/schema/#/$defs/NotificationConfig/properties/type")

### type Type

unknown

### type Constraints

**enum**: the value of this property must be equal to one of the following values:

| Value     | Explanation |
| :-------- | ----------- |
| `"slack"` |             |
| `"email"` |             |

## address




`address`

-   is required
-   Type: `string`
-   cannot be null
-   defined in: [DeliveryConfig](keel-defs-notificationconfig-properties-address.md "https&#x3A;//keel-prestaging.us-west-2.spinnaker.mgmt.netflix.net/schema/#/$defs/NotificationConfig/properties/address")

### address Type

`string`

## frequency




`frequency`

-   is required
-   Type: unknown
-   cannot be null
-   defined in: [DeliveryConfig](keel-defs-notificationconfig-properties-frequency.md "https&#x3A;//keel-prestaging.us-west-2.spinnaker.mgmt.netflix.net/schema/#/$defs/NotificationConfig/properties/frequency")

### frequency Type

unknown

### frequency Constraints

**enum**: the value of this property must be equal to one of the following values:

| Value       | Explanation |
| :---------- | ----------- |
| `"verbose"` |             |
| `"normal"`  |             |
| `"quiet"`   |             |
