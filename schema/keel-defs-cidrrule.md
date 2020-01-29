# Untitled object in DeliveryConfig Schema

```txt
https://keel-prestaging.us-west-2.spinnaker.mgmt.netflix.net/schema/#/$defs/SecurityGroupRule/oneOf/3
```




| Abstract            | Extensible | Status         | Identifiable | Custom Properties | Additional Properties | Access Restrictions | Defined In                                                    |
| :------------------ | ---------- | -------------- | ------------ | :---------------- | --------------------- | ------------------- | ------------------------------------------------------------- |
| Can be instantiated | No         | Unknown status | No           | Forbidden         | Allowed               | none                | [keel.schema.json\*](keel.schema.json "open original schema") |

## 3 Type

`object` ([Details](keel-defs-cidrrule.md))

# undefined Properties

| Property                  | Type          | Required | Nullable       | Defined by                                                                                                                                                                      |
| :------------------------ | ------------- | -------- | -------------- | :------------------------------------------------------------------------------------------------------------------------------------------------------------------------------ |
| [protocol](#protocol)     | Not specified | Required | cannot be null | [DeliveryConfig](keel-defs-cidrrule-properties-protocol.md "https&#x3A;//keel-prestaging.us-west-2.spinnaker.mgmt.netflix.net/schema/#/$defs/CidrRule/properties/protocol")     |
| [portRange](#portRange)   | `object`      | Required | cannot be null | [DeliveryConfig](keel-defs-portrange.md "https&#x3A;//keel-prestaging.us-west-2.spinnaker.mgmt.netflix.net/schema/#/$defs/CidrRule/properties/portRange")                       |
| [blockRange](#blockRange) | `string`      | Required | cannot be null | [DeliveryConfig](keel-defs-cidrrule-properties-blockrange.md "https&#x3A;//keel-prestaging.us-west-2.spinnaker.mgmt.netflix.net/schema/#/$defs/CidrRule/properties/blockRange") |

## protocol




`protocol`

-   is required
-   Type: unknown
-   cannot be null
-   defined in: [DeliveryConfig](keel-defs-cidrrule-properties-protocol.md "https&#x3A;//keel-prestaging.us-west-2.spinnaker.mgmt.netflix.net/schema/#/$defs/CidrRule/properties/protocol")

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
-   defined in: [DeliveryConfig](keel-defs-portrange.md "https&#x3A;//keel-prestaging.us-west-2.spinnaker.mgmt.netflix.net/schema/#/$defs/CidrRule/properties/portRange")

### portRange Type

`object` ([Details](keel-defs-portrange.md))

## blockRange




`blockRange`

-   is required
-   Type: `string`
-   cannot be null
-   defined in: [DeliveryConfig](keel-defs-cidrrule-properties-blockrange.md "https&#x3A;//keel-prestaging.us-west-2.spinnaker.mgmt.netflix.net/schema/#/$defs/CidrRule/properties/blockRange")

### blockRange Type

`string`
