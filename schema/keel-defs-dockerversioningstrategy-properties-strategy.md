# Untitled undefined type in DeliveryConfig Schema

```txt
https://keel-prestaging.us-west-2.spinnaker.mgmt.netflix.net/schema/#/$defs/DockerVersioningStrategy/properties/strategy
```




| Abstract            | Extensible | Status         | Identifiable            | Custom Properties | Additional Properties | Access Restrictions | Defined In                                                    |
| :------------------ | ---------- | -------------- | ----------------------- | :---------------- | --------------------- | ------------------- | ------------------------------------------------------------- |
| Can be instantiated | No         | Unknown status | Unknown identifiability | Forbidden         | Allowed               | none                | [keel.schema.json\*](keel.schema.json "open original schema") |

## strategy Type

unknown

## strategy Constraints

**enum**: the value of this property must be equal to one of the following values:

| Value                           | Explanation |
| :------------------------------ | ----------- |
| `"increasing-tag"`              |             |
| `"semver-tag"`                  |             |
| `"branch-job-commit-by-job"`    |             |
| `"semver-job-commit-by-job"`    |             |
| `"semver-job-commit-by-semver"` |             |
