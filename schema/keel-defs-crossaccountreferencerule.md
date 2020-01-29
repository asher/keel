# Untitled object in DeliveryConfig Schema

```txt
https://keel-prestaging.us-west-2.spinnaker.mgmt.netflix.net/schema/#/$defs/SecurityGroupRule/oneOf/2
```




| Abstract            | Extensible | Status         | Identifiable | Custom Properties | Additional Properties | Access Restrictions | Defined In                                                    |
| :------------------ | ---------- | -------------- | ------------ | :---------------- | --------------------- | ------------------- | ------------------------------------------------------------- |
| Can be instantiated | No         | Unknown status | No           | Forbidden         | Allowed               | none                | [keel.schema.json\*](keel.schema.json "open original schema") |

## 2 Type

`object` ([Details](keel-defs-crossaccountreferencerule.md))

# undefined Properties

| Property                | Type          | Required | Nullable       | Defined by                                                                                                                                                                                                    |
| :---------------------- | ------------- | -------- | -------------- | :------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------ |
| [protocol](#protocol)   | Not specified | Required | cannot be null | [DeliveryConfig](keel-defs-crossaccountreferencerule-properties-protocol.md "https&#x3A;//keel-prestaging.us-west-2.spinnaker.mgmt.netflix.net/schema/#/$defs/CrossAccountReferenceRule/properties/protocol") |
| [name](#name)           | `string`      | Required | cannot be null | [DeliveryConfig](keel-defs-crossaccountreferencerule-properties-name.md "https&#x3A;//keel-prestaging.us-west-2.spinnaker.mgmt.netflix.net/schema/#/$defs/CrossAccountReferenceRule/properties/name")         |
| [account](#account)     | `string`      | Required | cannot be null | [DeliveryConfig](keel-defs-crossaccountreferencerule-properties-account.md "https&#x3A;//keel-prestaging.us-west-2.spinnaker.mgmt.netflix.net/schema/#/$defs/CrossAccountReferenceRule/properties/account")   |
| [vpc](#vpc)             | `string`      | Required | cannot be null | [DeliveryConfig](keel-defs-crossaccountreferencerule-properties-vpc.md "https&#x3A;//keel-prestaging.us-west-2.spinnaker.mgmt.netflix.net/schema/#/$defs/CrossAccountReferenceRule/properties/vpc")           |
| [portRange](#portRange) | `object`      | Required | cannot be null | [DeliveryConfig](keel-defs-portrange.md "https&#x3A;//keel-prestaging.us-west-2.spinnaker.mgmt.netflix.net/schema/#/$defs/CrossAccountReferenceRule/properties/portRange")                                    |

## protocol




`protocol`

-   is required
-   Type: unknown
-   cannot be null
-   defined in: [DeliveryConfig](keel-defs-crossaccountreferencerule-properties-protocol.md "https&#x3A;//keel-prestaging.us-west-2.spinnaker.mgmt.netflix.net/schema/#/$defs/CrossAccountReferenceRule/properties/protocol")

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
-   defined in: [DeliveryConfig](keel-defs-crossaccountreferencerule-properties-name.md "https&#x3A;//keel-prestaging.us-west-2.spinnaker.mgmt.netflix.net/schema/#/$defs/CrossAccountReferenceRule/properties/name")

### name Type

`string`

## account




`account`

-   is required
-   Type: `string`
-   cannot be null
-   defined in: [DeliveryConfig](keel-defs-crossaccountreferencerule-properties-account.md "https&#x3A;//keel-prestaging.us-west-2.spinnaker.mgmt.netflix.net/schema/#/$defs/CrossAccountReferenceRule/properties/account")

### account Type

`string`

## vpc




`vpc`

-   is required
-   Type: `string`
-   cannot be null
-   defined in: [DeliveryConfig](keel-defs-crossaccountreferencerule-properties-vpc.md "https&#x3A;//keel-prestaging.us-west-2.spinnaker.mgmt.netflix.net/schema/#/$defs/CrossAccountReferenceRule/properties/vpc")

### vpc Type

`string`

## portRange




`portRange`

-   is required
-   Type: `object` ([Details](keel-defs-portrange.md))
-   cannot be null
-   defined in: [DeliveryConfig](keel-defs-portrange.md "https&#x3A;//keel-prestaging.us-west-2.spinnaker.mgmt.netflix.net/schema/#/$defs/CrossAccountReferenceRule/properties/portRange")

### portRange Type

`object` ([Details](keel-defs-portrange.md))
