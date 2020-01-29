# Untitled object in DeliveryConfig Schema

```txt
https://keel-prestaging.us-west-2.spinnaker.mgmt.netflix.net/schema/#/$defs/TitusClusterSpec/properties/capacity
```




| Abstract            | Extensible | Status         | Identifiable | Custom Properties | Additional Properties | Access Restrictions | Defined In                                                    |
| :------------------ | ---------- | -------------- | ------------ | :---------------- | --------------------- | ------------------- | ------------------------------------------------------------- |
| Can be instantiated | No         | Unknown status | No           | Forbidden         | Allowed               | none                | [keel.schema.json\*](keel.schema.json "open original schema") |

## capacity Type

`object` ([Details](keel-defs-capacity.md))

# undefined Properties

| Property            | Type     | Required | Nullable       | Defined by                                                                                                                                                                |
| :------------------ | -------- | -------- | -------------- | :------------------------------------------------------------------------------------------------------------------------------------------------------------------------ |
| [min](#min)         | `number` | Required | cannot be null | [DeliveryConfig](keel-defs-capacity-properties-min.md "https&#x3A;//keel-prestaging.us-west-2.spinnaker.mgmt.netflix.net/schema/#/$defs/Capacity/properties/min")         |
| [max](#max)         | `number` | Required | cannot be null | [DeliveryConfig](keel-defs-capacity-properties-max.md "https&#x3A;//keel-prestaging.us-west-2.spinnaker.mgmt.netflix.net/schema/#/$defs/Capacity/properties/max")         |
| [desired](#desired) | `number` | Optional | cannot be null | [DeliveryConfig](keel-defs-capacity-properties-desired.md "https&#x3A;//keel-prestaging.us-west-2.spinnaker.mgmt.netflix.net/schema/#/$defs/Capacity/properties/desired") |

## min




`min`

-   is required
-   Type: `number`
-   cannot be null
-   defined in: [DeliveryConfig](keel-defs-capacity-properties-min.md "https&#x3A;//keel-prestaging.us-west-2.spinnaker.mgmt.netflix.net/schema/#/$defs/Capacity/properties/min")

### min Type

`number`

## max




`max`

-   is required
-   Type: `number`
-   cannot be null
-   defined in: [DeliveryConfig](keel-defs-capacity-properties-max.md "https&#x3A;//keel-prestaging.us-west-2.spinnaker.mgmt.netflix.net/schema/#/$defs/Capacity/properties/max")

### max Type

`number`

## desired




`desired`

-   is optional
-   Type: `number`
-   cannot be null
-   defined in: [DeliveryConfig](keel-defs-capacity-properties-desired.md "https&#x3A;//keel-prestaging.us-west-2.spinnaker.mgmt.netflix.net/schema/#/$defs/Capacity/properties/desired")

### desired Type

`number`
