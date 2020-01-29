# Untitled object in DeliveryConfig Schema

```txt
https://keel-prestaging.us-west-2.spinnaker.mgmt.netflix.net/schema/#/$defs/TargetTrackingPolicy
```




| Abstract            | Extensible | Status         | Identifiable | Custom Properties | Additional Properties | Access Restrictions | Defined In                                                    |
| :------------------ | ---------- | -------------- | ------------ | :---------------- | --------------------- | ------------------- | ------------------------------------------------------------- |
| Can be instantiated | No         | Unknown status | No           | Forbidden         | Allowed               | none                | [keel.schema.json\*](keel.schema.json "open original schema") |

## TargetTrackingPolicy Type

`object` ([Details](keel-defs-targettrackingpolicy.md))

# undefined Properties

| Property                                      | Type      | Required | Nullable       | Defined by                                                                                                                                                                                                      |
| :-------------------------------------------- | --------- | -------- | -------------- | :-------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------- |
| [name](#name)                                 | `string`  | Optional | cannot be null | [DeliveryConfig](keel-defs-targettrackingpolicy-properties-name.md "https&#x3A;//keel-prestaging.us-west-2.spinnaker.mgmt.netflix.net/schema/#/$defs/TargetTrackingPolicy/properties/name")                     |
| [warmup](#warmup)                             | `string`  | Optional | cannot be null | [DeliveryConfig](keel-defs-targettrackingpolicy-properties-warmup.md "https&#x3A;//keel-prestaging.us-west-2.spinnaker.mgmt.netflix.net/schema/#/$defs/TargetTrackingPolicy/properties/warmup")                 |
| [targetValue](#targetValue)                   | `number`  | Required | cannot be null | [DeliveryConfig](keel-defs-targettrackingpolicy-properties-targetvalue.md "https&#x3A;//keel-prestaging.us-west-2.spinnaker.mgmt.netflix.net/schema/#/$defs/TargetTrackingPolicy/properties/targetValue")       |
| [disableScaleIn](#disableScaleIn)             | `boolean` | Optional | cannot be null | [DeliveryConfig](keel-defs-targettrackingpolicy-properties-disablescalein.md "https&#x3A;//keel-prestaging.us-west-2.spinnaker.mgmt.netflix.net/schema/#/$defs/TargetTrackingPolicy/properties/disableScaleIn") |
| [predefinedMetricSpec](#predefinedMetricSpec) | `object`  | Optional | cannot be null | [DeliveryConfig](keel-defs-predefinedmetricspecification.md "https&#x3A;//keel-prestaging.us-west-2.spinnaker.mgmt.netflix.net/schema/#/$defs/TargetTrackingPolicy/properties/predefinedMetricSpec")            |
| [customMetricSpec](#customMetricSpec)         | `object`  | Optional | cannot be null | [DeliveryConfig](keel-defs-customizedmetricspecification.md "https&#x3A;//keel-prestaging.us-west-2.spinnaker.mgmt.netflix.net/schema/#/$defs/TargetTrackingPolicy/properties/customMetricSpec")                |

## name




`name`

-   is optional
-   Type: `string`
-   cannot be null
-   defined in: [DeliveryConfig](keel-defs-targettrackingpolicy-properties-name.md "https&#x3A;//keel-prestaging.us-west-2.spinnaker.mgmt.netflix.net/schema/#/$defs/TargetTrackingPolicy/properties/name")

### name Type

`string`

## warmup




`warmup`

-   is optional
-   Type: `string`
-   cannot be null
-   defined in: [DeliveryConfig](keel-defs-targettrackingpolicy-properties-warmup.md "https&#x3A;//keel-prestaging.us-west-2.spinnaker.mgmt.netflix.net/schema/#/$defs/TargetTrackingPolicy/properties/warmup")

### warmup Type

`string`

### warmup Constraints

**duration**: the string must be a duration string, according to [RFC 3339, section 5.6](https://tools.ietf.org/html/rfc3339 "check the specification")

## targetValue




`targetValue`

-   is required
-   Type: `number`
-   cannot be null
-   defined in: [DeliveryConfig](keel-defs-targettrackingpolicy-properties-targetvalue.md "https&#x3A;//keel-prestaging.us-west-2.spinnaker.mgmt.netflix.net/schema/#/$defs/TargetTrackingPolicy/properties/targetValue")

### targetValue Type

`number`

## disableScaleIn




`disableScaleIn`

-   is optional
-   Type: `boolean`
-   cannot be null
-   defined in: [DeliveryConfig](keel-defs-targettrackingpolicy-properties-disablescalein.md "https&#x3A;//keel-prestaging.us-west-2.spinnaker.mgmt.netflix.net/schema/#/$defs/TargetTrackingPolicy/properties/disableScaleIn")

### disableScaleIn Type

`boolean`

## predefinedMetricSpec




`predefinedMetricSpec`

-   is optional
-   Type: `object` ([Details](keel-defs-predefinedmetricspecification.md))
-   cannot be null
-   defined in: [DeliveryConfig](keel-defs-predefinedmetricspecification.md "https&#x3A;//keel-prestaging.us-west-2.spinnaker.mgmt.netflix.net/schema/#/$defs/TargetTrackingPolicy/properties/predefinedMetricSpec")

### predefinedMetricSpec Type

`object` ([Details](keel-defs-predefinedmetricspecification.md))

## customMetricSpec




`customMetricSpec`

-   is optional
-   Type: `object` ([Details](keel-defs-customizedmetricspecification.md))
-   cannot be null
-   defined in: [DeliveryConfig](keel-defs-customizedmetricspecification.md "https&#x3A;//keel-prestaging.us-west-2.spinnaker.mgmt.netflix.net/schema/#/$defs/TargetTrackingPolicy/properties/customMetricSpec")

### customMetricSpec Type

`object` ([Details](keel-defs-customizedmetricspecification.md))
