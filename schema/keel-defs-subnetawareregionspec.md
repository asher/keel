# Untitled object in DeliveryConfig Schema

```txt
https://keel-prestaging.us-west-2.spinnaker.mgmt.netflix.net/schema/#/$defs/SubnetAwareRegionSpec
```




| Abstract            | Extensible | Status         | Identifiable | Custom Properties | Additional Properties | Access Restrictions | Defined In                                                    |
| :------------------ | ---------- | -------------- | ------------ | :---------------- | --------------------- | ------------------- | ------------------------------------------------------------- |
| Can be instantiated | No         | Unknown status | No           | Forbidden         | Allowed               | none                | [keel.schema.json\*](keel.schema.json "open original schema") |

## SubnetAwareRegionSpec Type

`object` ([Details](keel-defs-subnetawareregionspec.md))

# undefined Properties

| Property                                | Type     | Required | Nullable       | Defined by                                                                                                                                                                                                              |
| :-------------------------------------- | -------- | -------- | -------------- | :---------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------- |
| [name](#name)                           | `string` | Required | cannot be null | [DeliveryConfig](keel-defs-subnetawareregionspec-properties-name.md "https&#x3A;//keel-prestaging.us-west-2.spinnaker.mgmt.netflix.net/schema/#/$defs/SubnetAwareRegionSpec/properties/name")                           |
| [availabilityZones](#availabilityZones) | `array`  | Optional | cannot be null | [DeliveryConfig](keel-defs-subnetawareregionspec-properties-availabilityzones.md "https&#x3A;//keel-prestaging.us-west-2.spinnaker.mgmt.netflix.net/schema/#/$defs/SubnetAwareRegionSpec/properties/availabilityZones") |

## name




`name`

-   is required
-   Type: `string`
-   cannot be null
-   defined in: [DeliveryConfig](keel-defs-subnetawareregionspec-properties-name.md "https&#x3A;//keel-prestaging.us-west-2.spinnaker.mgmt.netflix.net/schema/#/$defs/SubnetAwareRegionSpec/properties/name")

### name Type

`string`

## availabilityZones




`availabilityZones`

-   is optional
-   Type: `string[]`
-   cannot be null
-   defined in: [DeliveryConfig](keel-defs-subnetawareregionspec-properties-availabilityzones.md "https&#x3A;//keel-prestaging.us-west-2.spinnaker.mgmt.netflix.net/schema/#/$defs/SubnetAwareRegionSpec/properties/availabilityZones")

### availabilityZones Type

`string[]`

### availabilityZones Constraints

**unique items**: all items in this array must be unique. Duplicates are not allowed.
