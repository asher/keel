# Untitled object in DeliveryConfig Schema

```txt
https://keel-prestaging.us-west-2.spinnaker.mgmt.netflix.net/schema/#/$defs/ClusterDeployStrategy/oneOf/0
```




| Abstract            | Extensible | Status         | Identifiable | Custom Properties | Additional Properties | Access Restrictions | Defined In                                                    |
| :------------------ | ---------- | -------------- | ------------ | :---------------- | --------------------- | ------------------- | ------------------------------------------------------------- |
| Can be instantiated | No         | Unknown status | No           | Forbidden         | Allowed               | none                | [keel.schema.json\*](keel.schema.json "open original schema") |

## 0 Type

`object` ([Details](keel-defs-redblack.md))

# undefined Properties

| Property                                      | Type          | Required | Nullable       | Defined by                                                                                                                                                                                          |
| :-------------------------------------------- | ------------- | -------- | -------------- | :-------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------- |
| [strategy](#strategy)                         | Not specified | Required | cannot be null | [DeliveryConfig](keel-defs-redblack-properties-strategy.md "https&#x3A;//keel-prestaging.us-west-2.spinnaker.mgmt.netflix.net/schema/#/$defs/RedBlack/properties/strategy")                         |
| [rollbackOnFailure](#rollbackOnFailure)       | `boolean`     | Optional | cannot be null | [DeliveryConfig](keel-defs-redblack-properties-rollbackonfailure.md "https&#x3A;//keel-prestaging.us-west-2.spinnaker.mgmt.netflix.net/schema/#/$defs/RedBlack/properties/rollbackOnFailure")       |
| [resizePreviousToZero](#resizePreviousToZero) | `boolean`     | Optional | cannot be null | [DeliveryConfig](keel-defs-redblack-properties-resizeprevioustozero.md "https&#x3A;//keel-prestaging.us-west-2.spinnaker.mgmt.netflix.net/schema/#/$defs/RedBlack/properties/resizePreviousToZero") |
| [maxServerGroups](#maxServerGroups)           | `number`      | Optional | cannot be null | [DeliveryConfig](keel-defs-redblack-properties-maxservergroups.md "https&#x3A;//keel-prestaging.us-west-2.spinnaker.mgmt.netflix.net/schema/#/$defs/RedBlack/properties/maxServerGroups")           |
| [delayBeforeDisable](#delayBeforeDisable)     | `string`      | Optional | cannot be null | [DeliveryConfig](keel-defs-redblack-properties-delaybeforedisable.md "https&#x3A;//keel-prestaging.us-west-2.spinnaker.mgmt.netflix.net/schema/#/$defs/RedBlack/properties/delayBeforeDisable")     |
| [delayBeforeScaleDown](#delayBeforeScaleDown) | `string`      | Optional | cannot be null | [DeliveryConfig](keel-defs-redblack-properties-delaybeforescaledown.md "https&#x3A;//keel-prestaging.us-west-2.spinnaker.mgmt.netflix.net/schema/#/$defs/RedBlack/properties/delayBeforeScaleDown") |
| [stagger](#stagger)                           | `array`       | Optional | cannot be null | [DeliveryConfig](keel-defs-redblack-properties-stagger.md "https&#x3A;//keel-prestaging.us-west-2.spinnaker.mgmt.netflix.net/schema/#/$defs/RedBlack/properties/stagger")                           |

## strategy




`strategy`

-   is required
-   Type: unknown
-   cannot be null
-   defined in: [DeliveryConfig](keel-defs-redblack-properties-strategy.md "https&#x3A;//keel-prestaging.us-west-2.spinnaker.mgmt.netflix.net/schema/#/$defs/RedBlack/properties/strategy")

### strategy Type

unknown

### strategy Constraints

**enum**: the value of this property must be equal to one of the following values:

| Value         | Explanation |
| :------------ | ----------- |
| `"red-black"` |             |

## rollbackOnFailure




`rollbackOnFailure`

-   is optional
-   Type: `boolean`
-   cannot be null
-   defined in: [DeliveryConfig](keel-defs-redblack-properties-rollbackonfailure.md "https&#x3A;//keel-prestaging.us-west-2.spinnaker.mgmt.netflix.net/schema/#/$defs/RedBlack/properties/rollbackOnFailure")

### rollbackOnFailure Type

`boolean`

## resizePreviousToZero




`resizePreviousToZero`

-   is optional
-   Type: `boolean`
-   cannot be null
-   defined in: [DeliveryConfig](keel-defs-redblack-properties-resizeprevioustozero.md "https&#x3A;//keel-prestaging.us-west-2.spinnaker.mgmt.netflix.net/schema/#/$defs/RedBlack/properties/resizePreviousToZero")

### resizePreviousToZero Type

`boolean`

## maxServerGroups




`maxServerGroups`

-   is optional
-   Type: `number`
-   cannot be null
-   defined in: [DeliveryConfig](keel-defs-redblack-properties-maxservergroups.md "https&#x3A;//keel-prestaging.us-west-2.spinnaker.mgmt.netflix.net/schema/#/$defs/RedBlack/properties/maxServerGroups")

### maxServerGroups Type

`number`

## delayBeforeDisable




`delayBeforeDisable`

-   is optional
-   Type: `string`
-   cannot be null
-   defined in: [DeliveryConfig](keel-defs-redblack-properties-delaybeforedisable.md "https&#x3A;//keel-prestaging.us-west-2.spinnaker.mgmt.netflix.net/schema/#/$defs/RedBlack/properties/delayBeforeDisable")

### delayBeforeDisable Type

`string`

### delayBeforeDisable Constraints

**duration**: the string must be a duration string, according to [RFC 3339, section 5.6](https://tools.ietf.org/html/rfc3339 "check the specification")

## delayBeforeScaleDown




`delayBeforeScaleDown`

-   is optional
-   Type: `string`
-   cannot be null
-   defined in: [DeliveryConfig](keel-defs-redblack-properties-delaybeforescaledown.md "https&#x3A;//keel-prestaging.us-west-2.spinnaker.mgmt.netflix.net/schema/#/$defs/RedBlack/properties/delayBeforeScaleDown")

### delayBeforeScaleDown Type

`string`

### delayBeforeScaleDown Constraints

**duration**: the string must be a duration string, according to [RFC 3339, section 5.6](https://tools.ietf.org/html/rfc3339 "check the specification")

## stagger




`stagger`

-   is optional
-   Type: `object[]` ([Details](keel-defs-staggeredregion.md))
-   cannot be null
-   defined in: [DeliveryConfig](keel-defs-redblack-properties-stagger.md "https&#x3A;//keel-prestaging.us-west-2.spinnaker.mgmt.netflix.net/schema/#/$defs/RedBlack/properties/stagger")

### stagger Type

`object[]` ([Details](keel-defs-staggeredregion.md))
