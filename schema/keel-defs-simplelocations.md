# Untitled object in DeliveryConfig Schema

```txt
https://keel-prestaging.us-west-2.spinnaker.mgmt.netflix.net/schema/#/$defs/TitusClusterSpec/properties/locations
```




| Abstract            | Extensible | Status         | Identifiable | Custom Properties | Additional Properties | Access Restrictions | Defined In                                                    |
| :------------------ | ---------- | -------------- | ------------ | :---------------- | --------------------- | ------------------- | ------------------------------------------------------------- |
| Can be instantiated | No         | Unknown status | No           | Forbidden         | Allowed               | none                | [keel.schema.json\*](keel.schema.json "open original schema") |

## locations Type

`object` ([Details](keel-defs-simplelocations.md))

# undefined Properties

| Property            | Type     | Required | Nullable       | Defined by                                                                                                                                                                              |
| :------------------ | -------- | -------- | -------------- | :-------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------- |
| [account](#account) | `string` | Required | cannot be null | [DeliveryConfig](keel-defs-simplelocations-properties-account.md "https&#x3A;//keel-prestaging.us-west-2.spinnaker.mgmt.netflix.net/schema/#/$defs/SimpleLocations/properties/account") |
| [vpc](#vpc)         | `string` | Optional | cannot be null | [DeliveryConfig](keel-defs-simplelocations-properties-vpc.md "https&#x3A;//keel-prestaging.us-west-2.spinnaker.mgmt.netflix.net/schema/#/$defs/SimpleLocations/properties/vpc")         |
| [regions](#regions) | `array`  | Required | cannot be null | [DeliveryConfig](keel-defs-simplelocations-properties-regions.md "https&#x3A;//keel-prestaging.us-west-2.spinnaker.mgmt.netflix.net/schema/#/$defs/SimpleLocations/properties/regions") |

## account




`account`

-   is required
-   Type: `string`
-   cannot be null
-   defined in: [DeliveryConfig](keel-defs-simplelocations-properties-account.md "https&#x3A;//keel-prestaging.us-west-2.spinnaker.mgmt.netflix.net/schema/#/$defs/SimpleLocations/properties/account")

### account Type

`string`

## vpc




`vpc`

-   is optional
-   Type: `string`
-   cannot be null
-   defined in: [DeliveryConfig](keel-defs-simplelocations-properties-vpc.md "https&#x3A;//keel-prestaging.us-west-2.spinnaker.mgmt.netflix.net/schema/#/$defs/SimpleLocations/properties/vpc")

### vpc Type

`string`

## regions




`regions`

-   is required
-   Type: `object[]` ([Details](keel-defs-simpleregionspec.md))
-   cannot be null
-   defined in: [DeliveryConfig](keel-defs-simplelocations-properties-regions.md "https&#x3A;//keel-prestaging.us-west-2.spinnaker.mgmt.netflix.net/schema/#/$defs/SimpleLocations/properties/regions")

### regions Type

`object[]` ([Details](keel-defs-simpleregionspec.md))

### regions Constraints

**unique items**: all items in this array must be unique. Duplicates are not allowed.
