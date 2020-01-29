# Untitled object in DeliveryConfig Schema

```txt
https://keel-prestaging.us-west-2.spinnaker.mgmt.netflix.net/schema/#/$defs/DeliveryArtifact/oneOf/1
```




| Abstract            | Extensible | Status         | Identifiable | Custom Properties | Additional Properties | Access Restrictions | Defined In                                                    |
| :------------------ | ---------- | -------------- | ------------ | :---------------- | --------------------- | ------------------- | ------------------------------------------------------------- |
| Can be instantiated | No         | Unknown status | No           | Forbidden         | Allowed               | none                | [keel.schema.json\*](keel.schema.json "open original schema") |

## 1 Type

`object` ([Details](keel-defs-dockerartifact.md))

# undefined Properties

| Property                                  | Type          | Required | Nullable       | Defined by                                                                                                                                                                                                  |
| :---------------------------------------- | ------------- | -------- | -------------- | :---------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------- |
| [name](#name)                             | `string`      | Required | cannot be null | [DeliveryConfig](keel-defs-dockerartifact-properties-name.md "https&#x3A;//keel-prestaging.us-west-2.spinnaker.mgmt.netflix.net/schema/#/$defs/DockerArtifact/properties/name")                             |
| [deliveryConfigName](#deliveryConfigName) | `string`      | Optional | cannot be null | [DeliveryConfig](keel-defs-dockerartifact-properties-deliveryconfigname.md "https&#x3A;//keel-prestaging.us-west-2.spinnaker.mgmt.netflix.net/schema/#/$defs/DockerArtifact/properties/deliveryConfigName") |
| [reference](#reference)                   | `string`      | Optional | cannot be null | [DeliveryConfig](keel-defs-dockerartifact-properties-reference.md "https&#x3A;//keel-prestaging.us-west-2.spinnaker.mgmt.netflix.net/schema/#/$defs/DockerArtifact/properties/reference")                   |
| [tagVersionStrategy](#tagVersionStrategy) | Not specified | Optional | cannot be null | [DeliveryConfig](keel-defs-dockerartifact-properties-tagversionstrategy.md "https&#x3A;//keel-prestaging.us-west-2.spinnaker.mgmt.netflix.net/schema/#/$defs/DockerArtifact/properties/tagVersionStrategy") |
| [captureGroupRegex](#captureGroupRegex)   | `string`      | Optional | cannot be null | [DeliveryConfig](keel-defs-dockerartifact-properties-capturegroupregex.md "https&#x3A;//keel-prestaging.us-west-2.spinnaker.mgmt.netflix.net/schema/#/$defs/DockerArtifact/properties/captureGroupRegex")   |
| [versioningStrategy](#versioningStrategy) | Merged        | Optional | cannot be null | [DeliveryConfig](keel-defs-versioningstrategy.md "https&#x3A;//keel-prestaging.us-west-2.spinnaker.mgmt.netflix.net/schema/#/$defs/DockerArtifact/properties/versioningStrategy")                           |

## name




`name`

-   is required
-   Type: `string`
-   cannot be null
-   defined in: [DeliveryConfig](keel-defs-dockerartifact-properties-name.md "https&#x3A;//keel-prestaging.us-west-2.spinnaker.mgmt.netflix.net/schema/#/$defs/DockerArtifact/properties/name")

### name Type

`string`

## deliveryConfigName




`deliveryConfigName`

-   is optional
-   Type: `string`
-   cannot be null
-   defined in: [DeliveryConfig](keel-defs-dockerartifact-properties-deliveryconfigname.md "https&#x3A;//keel-prestaging.us-west-2.spinnaker.mgmt.netflix.net/schema/#/$defs/DockerArtifact/properties/deliveryConfigName")

### deliveryConfigName Type

`string`

## reference




`reference`

-   is optional
-   Type: `string`
-   cannot be null
-   defined in: [DeliveryConfig](keel-defs-dockerartifact-properties-reference.md "https&#x3A;//keel-prestaging.us-west-2.spinnaker.mgmt.netflix.net/schema/#/$defs/DockerArtifact/properties/reference")

### reference Type

`string`

## tagVersionStrategy




`tagVersionStrategy`

-   is optional
-   Type: unknown
-   cannot be null
-   defined in: [DeliveryConfig](keel-defs-dockerartifact-properties-tagversionstrategy.md "https&#x3A;//keel-prestaging.us-west-2.spinnaker.mgmt.netflix.net/schema/#/$defs/DockerArtifact/properties/tagVersionStrategy")

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
-   defined in: [DeliveryConfig](keel-defs-dockerartifact-properties-capturegroupregex.md "https&#x3A;//keel-prestaging.us-west-2.spinnaker.mgmt.netflix.net/schema/#/$defs/DockerArtifact/properties/captureGroupRegex")

### captureGroupRegex Type

`string`

## versioningStrategy




`versioningStrategy`

-   is optional
-   Type: merged type ([Details](keel-defs-versioningstrategy.md))
-   cannot be null
-   defined in: [DeliveryConfig](keel-defs-versioningstrategy.md "https&#x3A;//keel-prestaging.us-west-2.spinnaker.mgmt.netflix.net/schema/#/$defs/DockerArtifact/properties/versioningStrategy")

### versioningStrategy Type

merged type ([Details](keel-defs-versioningstrategy.md))

one (and only one) of

-   [Untitled object in DeliveryConfig](keel-defs-debiansemverversioningstrategy.md "check type definition")
-   [Untitled object in DeliveryConfig](keel-defs-dockerversioningstrategy.md "check type definition")
