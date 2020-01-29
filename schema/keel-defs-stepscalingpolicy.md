# Untitled object in DeliveryConfig Schema

```txt
https://keel-prestaging.us-west-2.spinnaker.mgmt.netflix.net/schema/#/$defs/StepScalingPolicy
```




| Abstract            | Extensible | Status         | Identifiable | Custom Properties | Additional Properties | Access Restrictions | Defined In                                                    |
| :------------------ | ---------- | -------------- | ------------ | :---------------- | --------------------- | ------------------- | ------------------------------------------------------------- |
| Can be instantiated | No         | Unknown status | No           | Forbidden         | Allowed               | none                | [keel.schema.json\*](keel.schema.json "open original schema") |

## StepScalingPolicy Type

`object` ([Details](keel-defs-stepscalingpolicy.md))

# undefined Properties

| Property                                        | Type      | Required | Nullable       | Defined by                                                                                                                                                                                                              |
| :---------------------------------------------- | --------- | -------- | -------------- | :---------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------- |
| [name](#name)                                   | `string`  | Optional | cannot be null | [DeliveryConfig](keel-defs-stepscalingpolicy-properties-name.md "https&#x3A;//keel-prestaging.us-west-2.spinnaker.mgmt.netflix.net/schema/#/$defs/StepScalingPolicy/properties/name")                                   |
| [adjustmentType](#adjustmentType)               | `string`  | Required | cannot be null | [DeliveryConfig](keel-defs-stepscalingpolicy-properties-adjustmenttype.md "https&#x3A;//keel-prestaging.us-west-2.spinnaker.mgmt.netflix.net/schema/#/$defs/StepScalingPolicy/properties/adjustmentType")               |
| [actionsEnabled](#actionsEnabled)               | `boolean` | Required | cannot be null | [DeliveryConfig](keel-defs-stepscalingpolicy-properties-actionsenabled.md "https&#x3A;//keel-prestaging.us-west-2.spinnaker.mgmt.netflix.net/schema/#/$defs/StepScalingPolicy/properties/actionsEnabled")               |
| [comparisonOperator](#comparisonOperator)       | `string`  | Required | cannot be null | [DeliveryConfig](keel-defs-stepscalingpolicy-properties-comparisonoperator.md "https&#x3A;//keel-prestaging.us-west-2.spinnaker.mgmt.netflix.net/schema/#/$defs/StepScalingPolicy/properties/comparisonOperator")       |
| [dimensions](#dimensions)                       | `array`   | Optional | cannot be null | [DeliveryConfig](keel-defs-stepscalingpolicy-properties-dimensions.md "https&#x3A;//keel-prestaging.us-west-2.spinnaker.mgmt.netflix.net/schema/#/$defs/StepScalingPolicy/properties/dimensions")                       |
| [evaluationPeriods](#evaluationPeriods)         | `number`  | Required | cannot be null | [DeliveryConfig](keel-defs-stepscalingpolicy-properties-evaluationperiods.md "https&#x3A;//keel-prestaging.us-west-2.spinnaker.mgmt.netflix.net/schema/#/$defs/StepScalingPolicy/properties/evaluationPeriods")         |
| [period](#period)                               | `string`  | Required | cannot be null | [DeliveryConfig](keel-defs-stepscalingpolicy-properties-period.md "https&#x3A;//keel-prestaging.us-west-2.spinnaker.mgmt.netflix.net/schema/#/$defs/StepScalingPolicy/properties/period")                               |
| [threshold](#threshold)                         | `number`  | Required | cannot be null | [DeliveryConfig](keel-defs-stepscalingpolicy-properties-threshold.md "https&#x3A;//keel-prestaging.us-west-2.spinnaker.mgmt.netflix.net/schema/#/$defs/StepScalingPolicy/properties/threshold")                         |
| [metricName](#metricName)                       | `string`  | Required | cannot be null | [DeliveryConfig](keel-defs-stepscalingpolicy-properties-metricname.md "https&#x3A;//keel-prestaging.us-west-2.spinnaker.mgmt.netflix.net/schema/#/$defs/StepScalingPolicy/properties/metricName")                       |
| [namespace](#namespace)                         | `string`  | Required | cannot be null | [DeliveryConfig](keel-defs-stepscalingpolicy-properties-namespace.md "https&#x3A;//keel-prestaging.us-west-2.spinnaker.mgmt.netflix.net/schema/#/$defs/StepScalingPolicy/properties/namespace")                         |
| [statistic](#statistic)                         | `string`  | Required | cannot be null | [DeliveryConfig](keel-defs-stepscalingpolicy-properties-statistic.md "https&#x3A;//keel-prestaging.us-west-2.spinnaker.mgmt.netflix.net/schema/#/$defs/StepScalingPolicy/properties/statistic")                         |
| [warmup](#warmup)                               | `string`  | Optional | cannot be null | [DeliveryConfig](keel-defs-stepscalingpolicy-properties-warmup.md "https&#x3A;//keel-prestaging.us-west-2.spinnaker.mgmt.netflix.net/schema/#/$defs/StepScalingPolicy/properties/warmup")                               |
| [metricAggregationType](#metricAggregationType) | `string`  | Optional | cannot be null | [DeliveryConfig](keel-defs-stepscalingpolicy-properties-metricaggregationtype.md "https&#x3A;//keel-prestaging.us-west-2.spinnaker.mgmt.netflix.net/schema/#/$defs/StepScalingPolicy/properties/metricAggregationType") |
| [stepAdjustments](#stepAdjustments)             | `array`   | Required | cannot be null | [DeliveryConfig](keel-defs-stepscalingpolicy-properties-stepadjustments.md "https&#x3A;//keel-prestaging.us-west-2.spinnaker.mgmt.netflix.net/schema/#/$defs/StepScalingPolicy/properties/stepAdjustments")             |

## name




`name`

-   is optional
-   Type: `string`
-   cannot be null
-   defined in: [DeliveryConfig](keel-defs-stepscalingpolicy-properties-name.md "https&#x3A;//keel-prestaging.us-west-2.spinnaker.mgmt.netflix.net/schema/#/$defs/StepScalingPolicy/properties/name")

### name Type

`string`

## adjustmentType




`adjustmentType`

-   is required
-   Type: `string`
-   cannot be null
-   defined in: [DeliveryConfig](keel-defs-stepscalingpolicy-properties-adjustmenttype.md "https&#x3A;//keel-prestaging.us-west-2.spinnaker.mgmt.netflix.net/schema/#/$defs/StepScalingPolicy/properties/adjustmentType")

### adjustmentType Type

`string`

## actionsEnabled




`actionsEnabled`

-   is required
-   Type: `boolean`
-   cannot be null
-   defined in: [DeliveryConfig](keel-defs-stepscalingpolicy-properties-actionsenabled.md "https&#x3A;//keel-prestaging.us-west-2.spinnaker.mgmt.netflix.net/schema/#/$defs/StepScalingPolicy/properties/actionsEnabled")

### actionsEnabled Type

`boolean`

## comparisonOperator




`comparisonOperator`

-   is required
-   Type: `string`
-   cannot be null
-   defined in: [DeliveryConfig](keel-defs-stepscalingpolicy-properties-comparisonoperator.md "https&#x3A;//keel-prestaging.us-west-2.spinnaker.mgmt.netflix.net/schema/#/$defs/StepScalingPolicy/properties/comparisonOperator")

### comparisonOperator Type

`string`

## dimensions




`dimensions`

-   is optional
-   Type: `object[]` ([Details](keel-defs-metricdimension.md))
-   cannot be null
-   defined in: [DeliveryConfig](keel-defs-stepscalingpolicy-properties-dimensions.md "https&#x3A;//keel-prestaging.us-west-2.spinnaker.mgmt.netflix.net/schema/#/$defs/StepScalingPolicy/properties/dimensions")

### dimensions Type

`object[]` ([Details](keel-defs-metricdimension.md))

### dimensions Constraints

**unique items**: all items in this array must be unique. Duplicates are not allowed.

## evaluationPeriods




`evaluationPeriods`

-   is required
-   Type: `number`
-   cannot be null
-   defined in: [DeliveryConfig](keel-defs-stepscalingpolicy-properties-evaluationperiods.md "https&#x3A;//keel-prestaging.us-west-2.spinnaker.mgmt.netflix.net/schema/#/$defs/StepScalingPolicy/properties/evaluationPeriods")

### evaluationPeriods Type

`number`

## period




`period`

-   is required
-   Type: `string`
-   cannot be null
-   defined in: [DeliveryConfig](keel-defs-stepscalingpolicy-properties-period.md "https&#x3A;//keel-prestaging.us-west-2.spinnaker.mgmt.netflix.net/schema/#/$defs/StepScalingPolicy/properties/period")

### period Type

`string`

### period Constraints

**duration**: the string must be a duration string, according to [RFC 3339, section 5.6](https://tools.ietf.org/html/rfc3339 "check the specification")

## threshold




`threshold`

-   is required
-   Type: `number`
-   cannot be null
-   defined in: [DeliveryConfig](keel-defs-stepscalingpolicy-properties-threshold.md "https&#x3A;//keel-prestaging.us-west-2.spinnaker.mgmt.netflix.net/schema/#/$defs/StepScalingPolicy/properties/threshold")

### threshold Type

`number`

## metricName




`metricName`

-   is required
-   Type: `string`
-   cannot be null
-   defined in: [DeliveryConfig](keel-defs-stepscalingpolicy-properties-metricname.md "https&#x3A;//keel-prestaging.us-west-2.spinnaker.mgmt.netflix.net/schema/#/$defs/StepScalingPolicy/properties/metricName")

### metricName Type

`string`

## namespace




`namespace`

-   is required
-   Type: `string`
-   cannot be null
-   defined in: [DeliveryConfig](keel-defs-stepscalingpolicy-properties-namespace.md "https&#x3A;//keel-prestaging.us-west-2.spinnaker.mgmt.netflix.net/schema/#/$defs/StepScalingPolicy/properties/namespace")

### namespace Type

`string`

## statistic




`statistic`

-   is required
-   Type: `string`
-   cannot be null
-   defined in: [DeliveryConfig](keel-defs-stepscalingpolicy-properties-statistic.md "https&#x3A;//keel-prestaging.us-west-2.spinnaker.mgmt.netflix.net/schema/#/$defs/StepScalingPolicy/properties/statistic")

### statistic Type

`string`

## warmup




`warmup`

-   is optional
-   Type: `string`
-   cannot be null
-   defined in: [DeliveryConfig](keel-defs-stepscalingpolicy-properties-warmup.md "https&#x3A;//keel-prestaging.us-west-2.spinnaker.mgmt.netflix.net/schema/#/$defs/StepScalingPolicy/properties/warmup")

### warmup Type

`string`

### warmup Constraints

**duration**: the string must be a duration string, according to [RFC 3339, section 5.6](https://tools.ietf.org/html/rfc3339 "check the specification")

## metricAggregationType




`metricAggregationType`

-   is optional
-   Type: `string`
-   cannot be null
-   defined in: [DeliveryConfig](keel-defs-stepscalingpolicy-properties-metricaggregationtype.md "https&#x3A;//keel-prestaging.us-west-2.spinnaker.mgmt.netflix.net/schema/#/$defs/StepScalingPolicy/properties/metricAggregationType")

### metricAggregationType Type

`string`

## stepAdjustments




`stepAdjustments`

-   is required
-   Type: `object[]` ([Details](keel-defs-stepadjustment.md))
-   cannot be null
-   defined in: [DeliveryConfig](keel-defs-stepscalingpolicy-properties-stepadjustments.md "https&#x3A;//keel-prestaging.us-west-2.spinnaker.mgmt.netflix.net/schema/#/$defs/StepScalingPolicy/properties/stepAdjustments")

### stepAdjustments Type

`object[]` ([Details](keel-defs-stepadjustment.md))

### stepAdjustments Constraints

**unique items**: all items in this array must be unique. Duplicates are not allowed.
