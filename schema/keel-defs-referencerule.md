# Untitled object in DeliveryConfig Schema

```txt
https://keel-prestaging.us-west-2.spinnaker.mgmt.netflix.net/schema/#/$defs/SecurityGroupRule/oneOf/1
```




| Abstract            | Extensible | Status         | Identifiable | Custom Properties | Additional Properties | Access Restrictions | Defined In                                                    |
| :------------------ | ---------- | -------------- | ------------ | :---------------- | --------------------- | ------------------- | ------------------------------------------------------------- |
| Can be instantiated | No         | Unknown status | No           | Forbidden         | Allowed               | none                | [keel.schema.json\*](keel.schema.json "open original schema") |

## 1 Type

`object` ([Details](keel-defs-referencerule.md))

# undefined Properties

| Property                | Type          | Required | Nullable       | Defined by                                                                                                                                                                            |
| :---------------------- | ------------- | -------- | -------------- | :------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------ |
| [protocol](#protocol)   | Not specified | Required | cannot be null | [DeliveryConfig](keel-defs-referencerule-properties-protocol.md "https&#x3A;//keel-prestaging.us-west-2.spinnaker.mgmt.netflix.net/schema/#/$defs/ReferenceRule/properties/protocol") |
| [name](#name)           | `string`      | Required | cannot be null | [DeliveryConfig](keel-defs-referencerule-properties-name.md "https&#x3A;//keel-prestaging.us-west-2.spinnaker.mgmt.netflix.net/schema/#/$defs/ReferenceRule/properties/name")         |
| [portRange](#portRange) | `object`      | Required | cannot be null | [DeliveryConfig](keel-defs-portrange.md "https&#x3A;//keel-prestaging.us-west-2.spinnaker.mgmt.netflix.net/schema/#/$defs/ReferenceRule/properties/portRange")                        |

## protocol




`protocol`

-   is required
-   Type: unknown
-   cannot be null
-   defined in: [DeliveryConfig](keel-defs-referencerule-properties-protocol.md "https&#x3A;//keel-prestaging.us-west-2.spinnaker.mgmt.netflix.net/schema/#/$defs/ReferenceRule/properties/protocol")

### protocol Type

unknown

### protocol Constraints

**enum**: the value of this property must be equal to one of the following values:

| Value    | Explanation |
| :------- | ----------- |
| `"TCP"`  |             |
| `"UDP"`  |             |
| `"ICMP"` |             |

## name




`name`

-   is required
-   Type: `string`
-   cannot be null
-   defined in: [DeliveryConfig](keel-defs-referencerule-properties-name.md "https&#x3A;//keel-prestaging.us-west-2.spinnaker.mgmt.netflix.net/schema/#/$defs/ReferenceRule/properties/name")

### name Type

`string`

## portRange




`portRange`

-   is required
-   Type: `object` ([Details](keel-defs-portrange.md))
-   cannot be null
-   defined in: [DeliveryConfig](keel-defs-portrange.md "https&#x3A;//keel-prestaging.us-west-2.spinnaker.mgmt.netflix.net/schema/#/$defs/ReferenceRule/properties/portRange")

### portRange Type

`object` ([Details](keel-defs-portrange.md))
