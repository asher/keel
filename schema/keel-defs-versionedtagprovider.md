# Untitled object in DeliveryConfig Schema

```txt
https://keel-prestaging.us-west-2.spinnaker.mgmt.netflix.net/schema/#/$defs/VersionedTagProvider
```




| Abstract            | Extensible | Status         | Identifiable | Custom Properties | Additional Properties | Access Restrictions | Defined In                                                    |
| :------------------ | ---------- | -------------- | ------------ | :---------------- | --------------------- | ------------------- | ------------------------------------------------------------- |
| Can be instantiated | No         | Unknown status | No           | Forbidden         | Allowed               | none                | [keel.schema.json\*](keel.schema.json "open original schema") |

## VersionedTagProvider Type

`object` ([Details](keel-defs-versionedtagprovider.md))

# undefined Properties

| Property                                  | Type          | Required | Nullable       | Defined by                                                                                                                                                                                                              |
| :---------------------------------------- | ------------- | -------- | -------------- | :---------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------- |
| [organization](#organization)             | `string`      | Required | cannot be null | [DeliveryConfig](keel-defs-versionedtagprovider-properties-organization.md "https&#x3A;//keel-prestaging.us-west-2.spinnaker.mgmt.netflix.net/schema/#/$defs/VersionedTagProvider/properties/organization")             |
| [image](#image)                           | `string`      | Required | cannot be null | [DeliveryConfig](keel-defs-versionedtagprovider-properties-image.md "https&#x3A;//keel-prestaging.us-west-2.spinnaker.mgmt.netflix.net/schema/#/$defs/VersionedTagProvider/properties/image")                           |
| [tagVersionStrategy](#tagVersionStrategy) | Not specified | Required | cannot be null | [DeliveryConfig](keel-defs-versionedtagprovider-properties-tagversionstrategy.md "https&#x3A;//keel-prestaging.us-west-2.spinnaker.mgmt.netflix.net/schema/#/$defs/VersionedTagProvider/properties/tagVersionStrategy") |
| [captureGroupRegex](#captureGroupRegex)   | `string`      | Optional | cannot be null | [DeliveryConfig](keel-defs-versionedtagprovider-properties-capturegroupregex.md "https&#x3A;//keel-prestaging.us-west-2.spinnaker.mgmt.netflix.net/schema/#/$defs/VersionedTagProvider/properties/captureGroupRegex")   |

## organization




`organization`

-   is required
-   Type: `string`
-   cannot be null
-   defined in: [DeliveryConfig](keel-defs-versionedtagprovider-properties-organization.md "https&#x3A;//keel-prestaging.us-west-2.spinnaker.mgmt.netflix.net/schema/#/$defs/VersionedTagProvider/properties/organization")

### organization Type

`string`

## image




`image`

-   is required
-   Type: `string`
-   cannot be null
-   defined in: [DeliveryConfig](keel-defs-versionedtagprovider-properties-image.md "https&#x3A;//keel-prestaging.us-west-2.spinnaker.mgmt.netflix.net/schema/#/$defs/VersionedTagProvider/properties/image")

### image Type

`string`

## tagVersionStrategy




`tagVersionStrategy`

-   is required
-   Type: unknown
-   cannot be null
-   defined in: [DeliveryConfig](keel-defs-versionedtagprovider-properties-tagversionstrategy.md "https&#x3A;//keel-prestaging.us-west-2.spinnaker.mgmt.netflix.net/schema/#/$defs/VersionedTagProvider/properties/tagVersionStrategy")

### tagVersionStrategy Type

unknown

### tagVersionStrategy Constraints

**enum**: the value of this property must be equal to one of the following values:

| Value                           | Explanation |
| :------------------------------ | ----------- |
| `"increasing-tag"`              |             |
| `"semver-tag"`                  |             |
| `"branch-job-commit-by-job"`    |             |
| `"semver-job-commit-by-job"`    |             |
| `"semver-job-commit-by-semver"` |             |

## captureGroupRegex




`captureGroupRegex`

-   is optional
-   Type: `string`
-   cannot be null
-   defined in: [DeliveryConfig](keel-defs-versionedtagprovider-properties-capturegroupregex.md "https&#x3A;//keel-prestaging.us-west-2.spinnaker.mgmt.netflix.net/schema/#/$defs/VersionedTagProvider/properties/captureGroupRegex")

### captureGroupRegex Type

`string`
