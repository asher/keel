# Untitled object in DeliveryConfig Schema

```txt
https://keel-prestaging.us-west-2.spinnaker.mgmt.netflix.net/schema/#/$defs/SecurityGroupSpec
```




| Abstract            | Extensible | Status         | Identifiable | Custom Properties | Additional Properties | Access Restrictions | Defined In                                                    |
| :------------------ | ---------- | -------------- | ------------ | :---------------- | --------------------- | ------------------- | ------------------------------------------------------------- |
| Can be instantiated | No         | Unknown status | No           | Forbidden         | Allowed               | none                | [keel.schema.json\*](keel.schema.json "open original schema") |

## SecurityGroupSpec Type

`object` ([Details](keel-defs-securitygroupspec.md))

# undefined Properties

| Property                      | Type     | Required | Nullable       | Defined by                                                                                                                                                                                            |
| :---------------------------- | -------- | -------- | -------------- | :---------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------- |
| [moniker](#moniker)           | `object` | Required | cannot be null | [DeliveryConfig](keel-defs-moniker.md "https&#x3A;//keel-prestaging.us-west-2.spinnaker.mgmt.netflix.net/schema/#/$defs/SecurityGroupSpec/properties/moniker")                                        |
| [locations](#locations)       | `object` | Required | cannot be null | [DeliveryConfig](keel-defs-simplelocations.md "https&#x3A;//keel-prestaging.us-west-2.spinnaker.mgmt.netflix.net/schema/#/$defs/SecurityGroupSpec/properties/locations")                              |
| [description](#description)   | `string` | Optional | cannot be null | [DeliveryConfig](keel-defs-securitygroupspec-properties-description.md "https&#x3A;//keel-prestaging.us-west-2.spinnaker.mgmt.netflix.net/schema/#/$defs/SecurityGroupSpec/properties/description")   |
| [inboundRules](#inboundRules) | `array`  | Optional | cannot be null | [DeliveryConfig](keel-defs-securitygroupspec-properties-inboundrules.md "https&#x3A;//keel-prestaging.us-west-2.spinnaker.mgmt.netflix.net/schema/#/$defs/SecurityGroupSpec/properties/inboundRules") |
| [overrides](#overrides)       | `object` | Optional | cannot be null | [DeliveryConfig](keel-defs-securitygroupspec-properties-overrides.md "https&#x3A;//keel-prestaging.us-west-2.spinnaker.mgmt.netflix.net/schema/#/$defs/SecurityGroupSpec/properties/overrides")       |

## moniker




`moniker`

-   is required
-   Type: `object` ([Details](keel-defs-moniker.md))
-   cannot be null
-   defined in: [DeliveryConfig](keel-defs-moniker.md "https&#x3A;//keel-prestaging.us-west-2.spinnaker.mgmt.netflix.net/schema/#/$defs/SecurityGroupSpec/properties/moniker")

### moniker Type

`object` ([Details](keel-defs-moniker.md))

## locations




`locations`

-   is required
-   Type: `object` ([Details](keel-defs-simplelocations.md))
-   cannot be null
-   defined in: [DeliveryConfig](keel-defs-simplelocations.md "https&#x3A;//keel-prestaging.us-west-2.spinnaker.mgmt.netflix.net/schema/#/$defs/SecurityGroupSpec/properties/locations")

### locations Type

`object` ([Details](keel-defs-simplelocations.md))

## description




`description`

-   is optional
-   Type: `string`
-   cannot be null
-   defined in: [DeliveryConfig](keel-defs-securitygroupspec-properties-description.md "https&#x3A;//keel-prestaging.us-west-2.spinnaker.mgmt.netflix.net/schema/#/$defs/SecurityGroupSpec/properties/description")

### description Type

`string`

## inboundRules




`inboundRules`

-   is optional
-   Type: an array of merged types ([Details](keel-defs-securitygrouprule.md))
-   cannot be null
-   defined in: [DeliveryConfig](keel-defs-securitygroupspec-properties-inboundrules.md "https&#x3A;//keel-prestaging.us-west-2.spinnaker.mgmt.netflix.net/schema/#/$defs/SecurityGroupSpec/properties/inboundRules")

### inboundRules Type

an array of merged types ([Details](keel-defs-securitygrouprule.md))

### inboundRules Constraints

**unique items**: all items in this array must be unique. Duplicates are not allowed.

## overrides




`overrides`

-   is optional
-   Type: `object` ([Details](keel-defs-securitygroupspec-properties-overrides.md))
-   cannot be null
-   defined in: [DeliveryConfig](keel-defs-securitygroupspec-properties-overrides.md "https&#x3A;//keel-prestaging.us-west-2.spinnaker.mgmt.netflix.net/schema/#/$defs/SecurityGroupSpec/properties/overrides")

### overrides Type

`object` ([Details](keel-defs-securitygroupspec-properties-overrides.md))
