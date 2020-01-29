# Untitled object in DeliveryConfig Schema

```txt
https://keel-prestaging.us-west-2.spinnaker.mgmt.netflix.net/schema/#/$defs/TargetTrackingPolicy/properties/customMetricSpec
```




| Abstract            | Extensible | Status         | Identifiable | Custom Properties | Additional Properties | Access Restrictions | Defined In                                                    |
| :------------------ | ---------- | -------------- | ------------ | :---------------- | --------------------- | ------------------- | ------------------------------------------------------------- |
| Can be instantiated | No         | Unknown status | No           | Forbidden         | Allowed               | none                | [keel.schema.json\*](keel.schema.json "open original schema") |

## customMetricSpec Type

`object` ([Details](keel-defs-customizedmetricspecification.md))

# undefined Properties

| Property                  | Type     | Required | Nullable       | Defined by                                                                                                                                                                                                                |
| :------------------------ | -------- | -------- | -------------- | :------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------ |
| [name](#name)             | `string` | Required | cannot be null | [DeliveryConfig](keel-defs-customizedmetricspecification-properties-name.md "https&#x3A;//keel-prestaging.us-west-2.spinnaker.mgmt.netflix.net/schema/#/$defs/CustomizedMetricSpecification/properties/name")             |
| [namespace](#namespace)   | `string` | Required | cannot be null | [DeliveryConfig](keel-defs-customizedmetricspecification-properties-namespace.md "https&#x3A;//keel-prestaging.us-west-2.spinnaker.mgmt.netflix.net/schema/#/$defs/CustomizedMetricSpecification/properties/namespace")   |
| [statistic](#statistic)   | `string` | Required | cannot be null | [DeliveryConfig](keel-defs-customizedmetricspecification-properties-statistic.md "https&#x3A;//keel-prestaging.us-west-2.spinnaker.mgmt.netflix.net/schema/#/$defs/CustomizedMetricSpecification/properties/statistic")   |
| [unit](#unit)             | `string` | Optional | cannot be null | [DeliveryConfig](keel-defs-customizedmetricspecification-properties-unit.md "https&#x3A;//keel-prestaging.us-west-2.spinnaker.mgmt.netflix.net/schema/#/$defs/CustomizedMetricSpecification/properties/unit")             |
| [dimensions](#dimensions) | `array`  | Optional | cannot be null | [DeliveryConfig](keel-defs-customizedmetricspecification-properties-dimensions.md "https&#x3A;//keel-prestaging.us-west-2.spinnaker.mgmt.netflix.net/schema/#/$defs/CustomizedMetricSpecification/properties/dimensions") |

## name




`name`

-   is required
-   Type: `string`
-   cannot be null
-   defined in: [DeliveryConfig](keel-defs-customizedmetricspecification-properties-name.md "https&#x3A;//keel-prestaging.us-west-2.spinnaker.mgmt.netflix.net/schema/#/$defs/CustomizedMetricSpecification/properties/name")

### name Type

`string`

## namespace




`namespace`

-   is required
-   Type: `string`
-   cannot be null
-   defined in: [DeliveryConfig](keel-defs-customizedmetricspecification-properties-namespace.md "https&#x3A;//keel-prestaging.us-west-2.spinnaker.mgmt.netflix.net/schema/#/$defs/CustomizedMetricSpecification/properties/namespace")

### namespace Type

`string`

## statistic




`statistic`

-   is required
-   Type: `string`
-   cannot be null
-   defined in: [DeliveryConfig](keel-defs-customizedmetricspecification-properties-statistic.md "https&#x3A;//keel-prestaging.us-west-2.spinnaker.mgmt.netflix.net/schema/#/$defs/CustomizedMetricSpecification/properties/statistic")

### statistic Type

`string`

## unit




`unit`

-   is optional
-   Type: `string`
-   cannot be null
-   defined in: [DeliveryConfig](keel-defs-customizedmetricspecification-properties-unit.md "https&#x3A;//keel-prestaging.us-west-2.spinnaker.mgmt.netflix.net/schema/#/$defs/CustomizedMetricSpecification/properties/unit")

### unit Type

`string`

## dimensions




`dimensions`

-   is optional
-   Type: `object[]` ([Details](keel-defs-metricdimension.md))
-   cannot be null
-   defined in: [DeliveryConfig](keel-defs-customizedmetricspecification-properties-dimensions.md "https&#x3A;//keel-prestaging.us-west-2.spinnaker.mgmt.netflix.net/schema/#/$defs/CustomizedMetricSpecification/properties/dimensions")

### dimensions Type

`object[]` ([Details](keel-defs-metricdimension.md))

### dimensions Constraints

**unique items**: all items in this array must be unique. Duplicates are not allowed.
