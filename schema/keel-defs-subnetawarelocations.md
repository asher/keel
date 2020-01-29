# Untitled object in DeliveryConfig Schema

```txt
https://keel-prestaging.us-west-2.spinnaker.mgmt.netflix.net/schema/#/$defs/SubnetAwareLocations
```




| Abstract            | Extensible | Status         | Identifiable | Custom Properties | Additional Properties | Access Restrictions | Defined In                                                    |
| :------------------ | ---------- | -------------- | ------------ | :---------------- | --------------------- | ------------------- | ------------------------------------------------------------- |
| Can be instantiated | No         | Unknown status | No           | Forbidden         | Allowed               | none                | [keel.schema.json\*](keel.schema.json "open original schema") |

## SubnetAwareLocations Type

`object` ([Details](keel-defs-subnetawarelocations.md))

# undefined Properties

| Property            | Type     | Required | Nullable       | Defined by                                                                                                                                                                                        |
| :------------------ | -------- | -------- | -------------- | :------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------ |
| [account](#account) | `string` | Required | cannot be null | [DeliveryConfig](keel-defs-subnetawarelocations-properties-account.md "https&#x3A;//keel-prestaging.us-west-2.spinnaker.mgmt.netflix.net/schema/#/$defs/SubnetAwareLocations/properties/account") |
| [subnet](#subnet)   | `string` | Optional | cannot be null | [DeliveryConfig](keel-defs-subnetawarelocations-properties-subnet.md "https&#x3A;//keel-prestaging.us-west-2.spinnaker.mgmt.netflix.net/schema/#/$defs/SubnetAwareLocations/properties/subnet")   |
| [vpc](#vpc)         | `string` | Optional | cannot be null | [DeliveryConfig](keel-defs-subnetawarelocations-properties-vpc.md "https&#x3A;//keel-prestaging.us-west-2.spinnaker.mgmt.netflix.net/schema/#/$defs/SubnetAwareLocations/properties/vpc")         |
| [regions](#regions) | `array`  | Required | cannot be null | [DeliveryConfig](keel-defs-subnetawarelocations-properties-regions.md "https&#x3A;//keel-prestaging.us-west-2.spinnaker.mgmt.netflix.net/schema/#/$defs/SubnetAwareLocations/properties/regions") |

## account




`account`

-   is required
-   Type: `string`
-   cannot be null
-   defined in: [DeliveryConfig](keel-defs-subnetawarelocations-properties-account.md "https&#x3A;//keel-prestaging.us-west-2.spinnaker.mgmt.netflix.net/schema/#/$defs/SubnetAwareLocations/properties/account")

### account Type

`string`

## subnet




`subnet`

-   is optional
-   Type: `string`
-   cannot be null
-   defined in: [DeliveryConfig](keel-defs-subnetawarelocations-properties-subnet.md "https&#x3A;//keel-prestaging.us-west-2.spinnaker.mgmt.netflix.net/schema/#/$defs/SubnetAwareLocations/properties/subnet")

### subnet Type

`string`

## vpc




`vpc`

-   is optional
-   Type: `string`
-   cannot be null
-   defined in: [DeliveryConfig](keel-defs-subnetawarelocations-properties-vpc.md "https&#x3A;//keel-prestaging.us-west-2.spinnaker.mgmt.netflix.net/schema/#/$defs/SubnetAwareLocations/properties/vpc")

### vpc Type

`string`

## regions




`regions`

-   is required
-   Type: `object[]` ([Details](keel-defs-subnetawareregionspec.md))
-   cannot be null
-   defined in: [DeliveryConfig](keel-defs-subnetawarelocations-properties-regions.md "https&#x3A;//keel-prestaging.us-west-2.spinnaker.mgmt.netflix.net/schema/#/$defs/SubnetAwareLocations/properties/regions")

### regions Type

`object[]` ([Details](keel-defs-subnetawareregionspec.md))

### regions Constraints

**unique items**: all items in this array must be unique. Duplicates are not allowed.
