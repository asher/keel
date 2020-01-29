# Untitled object in DeliveryConfig Schema

```txt
https://keel-prestaging.us-west-2.spinnaker.mgmt.netflix.net/schema/#/$defs/Rule
```




| Abstract            | Extensible | Status         | Identifiable | Custom Properties | Additional Properties | Access Restrictions | Defined In                                                    |
| :------------------ | ---------- | -------------- | ------------ | :---------------- | --------------------- | ------------------- | ------------------------------------------------------------- |
| Can be instantiated | No         | Unknown status | No           | Forbidden         | Allowed               | none                | [keel.schema.json\*](keel.schema.json "open original schema") |

## Rule Type

`object` ([Details](keel-defs-rule.md))

# undefined Properties

| Property                  | Type      | Required | Nullable       | Defined by                                                                                                                                                              |
| :------------------------ | --------- | -------- | -------------- | :---------------------------------------------------------------------------------------------------------------------------------------------------------------------- |
| [priority](#priority)     | `string`  | Required | cannot be null | [DeliveryConfig](keel-defs-rule-properties-priority.md "https&#x3A;//keel-prestaging.us-west-2.spinnaker.mgmt.netflix.net/schema/#/$defs/Rule/properties/priority")     |
| [conditions](#conditions) | `array`   | Optional | cannot be null | [DeliveryConfig](keel-defs-rule-properties-conditions.md "https&#x3A;//keel-prestaging.us-west-2.spinnaker.mgmt.netflix.net/schema/#/$defs/Rule/properties/conditions") |
| [actions](#actions)       | `array`   | Required | cannot be null | [DeliveryConfig](keel-defs-rule-properties-actions.md "https&#x3A;//keel-prestaging.us-west-2.spinnaker.mgmt.netflix.net/schema/#/$defs/Rule/properties/actions")       |
| [default](#default)       | `boolean` | Required | cannot be null | [DeliveryConfig](keel-defs-rule-properties-default.md "https&#x3A;//keel-prestaging.us-west-2.spinnaker.mgmt.netflix.net/schema/#/$defs/Rule/properties/default")       |

## priority




`priority`

-   is required
-   Type: `string`
-   cannot be null
-   defined in: [DeliveryConfig](keel-defs-rule-properties-priority.md "https&#x3A;//keel-prestaging.us-west-2.spinnaker.mgmt.netflix.net/schema/#/$defs/Rule/properties/priority")

### priority Type

`string`

## conditions




`conditions`

-   is optional
-   Type: `object[]` ([Details](keel-defs-condition.md))
-   cannot be null
-   defined in: [DeliveryConfig](keel-defs-rule-properties-conditions.md "https&#x3A;//keel-prestaging.us-west-2.spinnaker.mgmt.netflix.net/schema/#/$defs/Rule/properties/conditions")

### conditions Type

`object[]` ([Details](keel-defs-condition.md))

## actions




`actions`

-   is required
-   Type: `object[]` ([Details](keel-defs-action.md))
-   cannot be null
-   defined in: [DeliveryConfig](keel-defs-rule-properties-actions.md "https&#x3A;//keel-prestaging.us-west-2.spinnaker.mgmt.netflix.net/schema/#/$defs/Rule/properties/actions")

### actions Type

`object[]` ([Details](keel-defs-action.md))

## default




`default`

-   is required
-   Type: `boolean`
-   cannot be null
-   defined in: [DeliveryConfig](keel-defs-rule-properties-default.md "https&#x3A;//keel-prestaging.us-west-2.spinnaker.mgmt.netflix.net/schema/#/$defs/Rule/properties/default")

### default Type

`boolean`
