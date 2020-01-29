# Untitled object in DeliveryConfig Schema

```txt
https://keel-prestaging.us-west-2.spinnaker.mgmt.netflix.net/schema/#/$defs/SelfReferenceRule
```




| Abstract            | Extensible | Status         | Identifiable | Custom Properties | Additional Properties | Access Restrictions | Defined In                                                    |
| :------------------ | ---------- | -------------- | ------------ | :---------------- | --------------------- | ------------------- | ------------------------------------------------------------- |
| Can be instantiated | No         | Unknown status | No           | Forbidden         | Allowed               | none                | [keel.schema.json\*](keel.schema.json "open original schema") |

## SelfReferenceRule Type

`object` ([Details](keel-defs-selfreferencerule.md))

# undefined Properties

| Property                | Type          | Required | Nullable       | Defined by                                                                                                                                                                                    |
| :---------------------- | ------------- | -------- | -------------- | :-------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------- |
| [protocol](#protocol)   | Not specified | Required | cannot be null | [DeliveryConfig](keel-defs-selfreferencerule-properties-protocol.md "https&#x3A;//keel-prestaging.us-west-2.spinnaker.mgmt.netflix.net/schema/#/$defs/SelfReferenceRule/properties/protocol") |
| [portRange](#portRange) | `object`      | Required | cannot be null | [DeliveryConfig](keel-defs-portrange.md "https&#x3A;//keel-prestaging.us-west-2.spinnaker.mgmt.netflix.net/schema/#/$defs/SelfReferenceRule/properties/portRange")                            |

## protocol




`protocol`

-   is required
-   Type: unknown
-   cannot be null
-   defined in: [DeliveryConfig](keel-defs-selfreferencerule-properties-protocol.md "https&#x3A;//keel-prestaging.us-west-2.spinnaker.mgmt.netflix.net/schema/#/$defs/SelfReferenceRule/properties/protocol")

### protocol Type

unknown

### protocol Constraints

**enum**: the value of this property must be equal to one of the following values:

| Value    | Explanation |
| :------- | ----------- |
| `"TCP"`  |             |
| `"UDP"`  |             |
| `"ICMP"` |             |

## portRange




`portRange`

-   is required
-   Type: `object` ([Details](keel-defs-portrange.md))
-   cannot be null
-   defined in: [DeliveryConfig](keel-defs-portrange.md "https&#x3A;//keel-prestaging.us-west-2.spinnaker.mgmt.netflix.net/schema/#/$defs/SelfReferenceRule/properties/portRange")

### portRange Type

`object` ([Details](keel-defs-portrange.md))
