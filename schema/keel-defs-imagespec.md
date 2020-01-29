# Untitled object in DeliveryConfig Schema

```txt
https://keel-prestaging.us-west-2.spinnaker.mgmt.netflix.net/schema/#/$defs/ResourceSpec/oneOf/0
```




| Abstract            | Extensible | Status         | Identifiable | Custom Properties | Additional Properties | Access Restrictions | Defined In                                                    |
| :------------------ | ---------- | -------------- | ------------ | :---------------- | --------------------- | ------------------- | ------------------------------------------------------------- |
| Can be instantiated | No         | Unknown status | No           | Forbidden         | Allowed               | none                | [keel.schema.json\*](keel.schema.json "open original schema") |

## 0 Type

`object` ([Details](keel-defs-imagespec.md))

# undefined Properties

| Property                              | Type          | Required | Nullable       | Defined by                                                                                                                                                                                    |
| :------------------------------------ | ------------- | -------- | -------------- | :-------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------- |
| [artifactName](#artifactName)         | `string`      | Required | cannot be null | [DeliveryConfig](keel-defs-imagespec-properties-artifactname.md "https&#x3A;//keel-prestaging.us-west-2.spinnaker.mgmt.netflix.net/schema/#/$defs/ImageSpec/properties/artifactName")         |
| [baseLabel](#baseLabel)               | Not specified | Required | cannot be null | [DeliveryConfig](keel-defs-imagespec-properties-baselabel.md "https&#x3A;//keel-prestaging.us-west-2.spinnaker.mgmt.netflix.net/schema/#/$defs/ImageSpec/properties/baseLabel")               |
| [baseOs](#baseOs)                     | `string`      | Required | cannot be null | [DeliveryConfig](keel-defs-imagespec-properties-baseos.md "https&#x3A;//keel-prestaging.us-west-2.spinnaker.mgmt.netflix.net/schema/#/$defs/ImageSpec/properties/baseOs")                     |
| [regions](#regions)                   | `array`       | Required | cannot be null | [DeliveryConfig](keel-defs-imagespec-properties-regions.md "https&#x3A;//keel-prestaging.us-west-2.spinnaker.mgmt.netflix.net/schema/#/$defs/ImageSpec/properties/regions")                   |
| [storeType](#storeType)               | Not specified | Required | cannot be null | [DeliveryConfig](keel-defs-imagespec-properties-storetype.md "https&#x3A;//keel-prestaging.us-west-2.spinnaker.mgmt.netflix.net/schema/#/$defs/ImageSpec/properties/storeType")               |
| [artifactStatuses](#artifactStatuses) | `array`       | Optional | cannot be null | [DeliveryConfig](keel-defs-imagespec-properties-artifactstatuses.md "https&#x3A;//keel-prestaging.us-west-2.spinnaker.mgmt.netflix.net/schema/#/$defs/ImageSpec/properties/artifactStatuses") |
| [application](#application)           | `string`      | Required | cannot be null | [DeliveryConfig](keel-defs-imagespec-properties-application.md "https&#x3A;//keel-prestaging.us-west-2.spinnaker.mgmt.netflix.net/schema/#/$defs/ImageSpec/properties/application")           |

## artifactName




`artifactName`

-   is required
-   Type: `string`
-   cannot be null
-   defined in: [DeliveryConfig](keel-defs-imagespec-properties-artifactname.md "https&#x3A;//keel-prestaging.us-west-2.spinnaker.mgmt.netflix.net/schema/#/$defs/ImageSpec/properties/artifactName")

### artifactName Type

`string`

## baseLabel




`baseLabel`

-   is required
-   Type: unknown
-   cannot be null
-   defined in: [DeliveryConfig](keel-defs-imagespec-properties-baselabel.md "https&#x3A;//keel-prestaging.us-west-2.spinnaker.mgmt.netflix.net/schema/#/$defs/ImageSpec/properties/baseLabel")

### baseLabel Type

unknown

### baseLabel Constraints

**enum**: the value of this property must be equal to one of the following values:

| Value         | Explanation |
| :------------ | ----------- |
| `"RELEASE"`   |             |
| `"CANDIDATE"` |             |
| `"PREVIOUS"`  |             |
| `"UNSTABLE"`  |             |

## baseOs




`baseOs`

-   is required
-   Type: `string`
-   cannot be null
-   defined in: [DeliveryConfig](keel-defs-imagespec-properties-baseos.md "https&#x3A;//keel-prestaging.us-west-2.spinnaker.mgmt.netflix.net/schema/#/$defs/ImageSpec/properties/baseOs")

### baseOs Type

`string`

## regions




`regions`

-   is required
-   Type: `string[]`
-   cannot be null
-   defined in: [DeliveryConfig](keel-defs-imagespec-properties-regions.md "https&#x3A;//keel-prestaging.us-west-2.spinnaker.mgmt.netflix.net/schema/#/$defs/ImageSpec/properties/regions")

### regions Type

`string[]`

### regions Constraints

**unique items**: all items in this array must be unique. Duplicates are not allowed.

## storeType




`storeType`

-   is required
-   Type: unknown
-   cannot be null
-   defined in: [DeliveryConfig](keel-defs-imagespec-properties-storetype.md "https&#x3A;//keel-prestaging.us-west-2.spinnaker.mgmt.netflix.net/schema/#/$defs/ImageSpec/properties/storeType")

### storeType Type

unknown

### storeType Constraints

**enum**: the value of this property must be equal to one of the following values:

| Value      | Explanation |
| :--------- | ----------- |
| `"EBS"`    |             |
| `"S3"`     |             |
| `"DOCKER"` |             |

## artifactStatuses




`artifactStatuses`

-   is optional
-   Type: unknown\[]
-   cannot be null
-   defined in: [DeliveryConfig](keel-defs-imagespec-properties-artifactstatuses.md "https&#x3A;//keel-prestaging.us-west-2.spinnaker.mgmt.netflix.net/schema/#/$defs/ImageSpec/properties/artifactStatuses")

### artifactStatuses Type

unknown\[]

## application




`application`

-   is required
-   Type: `string`
-   cannot be null
-   defined in: [DeliveryConfig](keel-defs-imagespec-properties-application.md "https&#x3A;//keel-prestaging.us-west-2.spinnaker.mgmt.netflix.net/schema/#/$defs/ImageSpec/properties/application")

### application Type

`string`
