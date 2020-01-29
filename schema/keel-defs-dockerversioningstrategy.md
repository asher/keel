# Untitled object in DeliveryConfig Schema

```txt
https://keel-prestaging.us-west-2.spinnaker.mgmt.netflix.net/schema/#/$defs/VersioningStrategy/oneOf/1
```




| Abstract            | Extensible | Status         | Identifiable | Custom Properties | Additional Properties | Access Restrictions | Defined In                                                    |
| :------------------ | ---------- | -------------- | ------------ | :---------------- | --------------------- | ------------------- | ------------------------------------------------------------- |
| Can be instantiated | No         | Unknown status | No           | Forbidden         | Allowed               | none                | [keel.schema.json\*](keel.schema.json "open original schema") |

## 1 Type

`object` ([Details](keel-defs-dockerversioningstrategy.md))

# undefined Properties

| Property                                | Type          | Required | Nullable       | Defined by                                                                                                                                                                                                                    |
| :-------------------------------------- | ------------- | -------- | -------------- | :---------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------- |
| [strategy](#strategy)                   | Not specified | Required | cannot be null | [DeliveryConfig](keel-defs-dockerversioningstrategy-properties-strategy.md "https&#x3A;//keel-prestaging.us-west-2.spinnaker.mgmt.netflix.net/schema/#/$defs/DockerVersioningStrategy/properties/strategy")                   |
| [captureGroupRegex](#captureGroupRegex) | `string`      | Optional | cannot be null | [DeliveryConfig](keel-defs-dockerversioningstrategy-properties-capturegroupregex.md "https&#x3A;//keel-prestaging.us-west-2.spinnaker.mgmt.netflix.net/schema/#/$defs/DockerVersioningStrategy/properties/captureGroupRegex") |

## strategy




`strategy`

-   is required
-   Type: unknown
-   cannot be null
-   defined in: [DeliveryConfig](keel-defs-dockerversioningstrategy-properties-strategy.md "https&#x3A;//keel-prestaging.us-west-2.spinnaker.mgmt.netflix.net/schema/#/$defs/DockerVersioningStrategy/properties/strategy")

### strategy Type

unknown

### strategy Constraints

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
-   defined in: [DeliveryConfig](keel-defs-dockerversioningstrategy-properties-capturegroupregex.md "https&#x3A;//keel-prestaging.us-west-2.spinnaker.mgmt.netflix.net/schema/#/$defs/DockerVersioningStrategy/properties/captureGroupRegex")

### captureGroupRegex Type

`string`
