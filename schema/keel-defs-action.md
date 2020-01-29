# Untitled object in DeliveryConfig Schema

```txt
https://keel-prestaging.us-west-2.spinnaker.mgmt.netflix.net/schema/#/$defs/Rule/properties/actions/items
```




| Abstract            | Extensible | Status         | Identifiable | Custom Properties | Additional Properties | Access Restrictions | Defined In                                                    |
| :------------------ | ---------- | -------------- | ------------ | :---------------- | --------------------- | ------------------- | ------------------------------------------------------------- |
| Can be instantiated | No         | Unknown status | No           | Forbidden         | Allowed               | none                | [keel.schema.json\*](keel.schema.json "open original schema") |

## items Type

`object` ([Details](keel-defs-action.md))

# undefined Properties

| Property                            | Type     | Required | Nullable       | Defined by                                                                                                                                                                            |
| :---------------------------------- | -------- | -------- | -------------- | :------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------ |
| [type](#type)                       | `string` | Required | cannot be null | [DeliveryConfig](keel-defs-action-properties-type.md "https&#x3A;//keel-prestaging.us-west-2.spinnaker.mgmt.netflix.net/schema/#/$defs/Action/properties/type")                       |
| [order](#order)                     | `number` | Required | cannot be null | [DeliveryConfig](keel-defs-action-properties-order.md "https&#x3A;//keel-prestaging.us-west-2.spinnaker.mgmt.netflix.net/schema/#/$defs/Action/properties/order")                     |
| [targetGroupName](#targetGroupName) | `string` | Required | cannot be null | [DeliveryConfig](keel-defs-action-properties-targetgroupname.md "https&#x3A;//keel-prestaging.us-west-2.spinnaker.mgmt.netflix.net/schema/#/$defs/Action/properties/targetGroupName") |
| [redirectConfig](#redirectConfig)   | `object` | Optional | cannot be null | [DeliveryConfig](keel-defs-redirectconfig.md "https&#x3A;//keel-prestaging.us-west-2.spinnaker.mgmt.netflix.net/schema/#/$defs/Action/properties/redirectConfig")                     |

## type




`type`

-   is required
-   Type: `string`
-   cannot be null
-   defined in: [DeliveryConfig](keel-defs-action-properties-type.md "https&#x3A;//keel-prestaging.us-west-2.spinnaker.mgmt.netflix.net/schema/#/$defs/Action/properties/type")

### type Type

`string`

## order




`order`

-   is required
-   Type: `number`
-   cannot be null
-   defined in: [DeliveryConfig](keel-defs-action-properties-order.md "https&#x3A;//keel-prestaging.us-west-2.spinnaker.mgmt.netflix.net/schema/#/$defs/Action/properties/order")

### order Type

`number`

## targetGroupName




`targetGroupName`

-   is required
-   Type: `string`
-   cannot be null
-   defined in: [DeliveryConfig](keel-defs-action-properties-targetgroupname.md "https&#x3A;//keel-prestaging.us-west-2.spinnaker.mgmt.netflix.net/schema/#/$defs/Action/properties/targetGroupName")

### targetGroupName Type

`string`

## redirectConfig




`redirectConfig`

-   is optional
-   Type: `object` ([Details](keel-defs-redirectconfig.md))
-   cannot be null
-   defined in: [DeliveryConfig](keel-defs-redirectconfig.md "https&#x3A;//keel-prestaging.us-west-2.spinnaker.mgmt.netflix.net/schema/#/$defs/Action/properties/redirectConfig")

### redirectConfig Type

`object` ([Details](keel-defs-redirectconfig.md))
