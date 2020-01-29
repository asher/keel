# Untitled object in DeliveryConfig Schema

```txt
https://keel-prestaging.us-west-2.spinnaker.mgmt.netflix.net/schema/#/$defs/RedBlack/properties/stagger/items
```




| Abstract            | Extensible | Status         | Identifiable | Custom Properties | Additional Properties | Access Restrictions | Defined In                                                    |
| :------------------ | ---------- | -------------- | ------------ | :---------------- | --------------------- | ------------------- | ------------------------------------------------------------- |
| Can be instantiated | No         | Unknown status | No           | Forbidden         | Allowed               | none                | [keel.schema.json\*](keel.schema.json "open original schema") |

## items Type

`object` ([Details](keel-defs-staggeredregion.md))

# undefined Properties

| Property                | Type     | Required | Nullable       | Defined by                                                                                                                                                                                  |
| :---------------------- | -------- | -------- | -------------- | :------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------ |
| [region](#region)       | `string` | Required | cannot be null | [DeliveryConfig](keel-defs-staggeredregion-properties-region.md "https&#x3A;//keel-prestaging.us-west-2.spinnaker.mgmt.netflix.net/schema/#/$defs/StaggeredRegion/properties/region")       |
| [hours](#hours)         | `string` | Optional | cannot be null | [DeliveryConfig](keel-defs-staggeredregion-properties-hours.md "https&#x3A;//keel-prestaging.us-west-2.spinnaker.mgmt.netflix.net/schema/#/$defs/StaggeredRegion/properties/hours")         |
| [pauseTime](#pauseTime) | `string` | Optional | cannot be null | [DeliveryConfig](keel-defs-staggeredregion-properties-pausetime.md "https&#x3A;//keel-prestaging.us-west-2.spinnaker.mgmt.netflix.net/schema/#/$defs/StaggeredRegion/properties/pauseTime") |

## region




`region`

-   is required
-   Type: `string`
-   cannot be null
-   defined in: [DeliveryConfig](keel-defs-staggeredregion-properties-region.md "https&#x3A;//keel-prestaging.us-west-2.spinnaker.mgmt.netflix.net/schema/#/$defs/StaggeredRegion/properties/region")

### region Type

`string`

## hours




`hours`

-   is optional
-   Type: `string`
-   cannot be null
-   defined in: [DeliveryConfig](keel-defs-staggeredregion-properties-hours.md "https&#x3A;//keel-prestaging.us-west-2.spinnaker.mgmt.netflix.net/schema/#/$defs/StaggeredRegion/properties/hours")

### hours Type

`string`

## pauseTime




`pauseTime`

-   is optional
-   Type: `string`
-   cannot be null
-   defined in: [DeliveryConfig](keel-defs-staggeredregion-properties-pausetime.md "https&#x3A;//keel-prestaging.us-west-2.spinnaker.mgmt.netflix.net/schema/#/$defs/StaggeredRegion/properties/pauseTime")

### pauseTime Type

`string`

### pauseTime Constraints

**duration**: the string must be a duration string, according to [RFC 3339, section 5.6](https://tools.ietf.org/html/rfc3339 "check the specification")
