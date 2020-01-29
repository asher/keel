# Untitled object in DeliveryConfig Schema

```txt
https://keel-prestaging.us-west-2.spinnaker.mgmt.netflix.net/schema/#/$defs/Environment
```




| Abstract            | Extensible | Status         | Identifiable | Custom Properties | Additional Properties | Access Restrictions | Defined In                                                    |
| :------------------ | ---------- | -------------- | ------------ | :---------------- | --------------------- | ------------------- | ------------------------------------------------------------- |
| Can be instantiated | No         | Unknown status | No           | Forbidden         | Allowed               | none                | [keel.schema.json\*](keel.schema.json "open original schema") |

## Environment Type

`object` ([Details](keel-defs-environment.md))

# undefined Properties

| Property                        | Type     | Required | Nullable       | Defined by                                                                                                                                                                                  |
| :------------------------------ | -------- | -------- | -------------- | :------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------ |
| [name](#name)                   | `string` | Required | cannot be null | [DeliveryConfig](keel-defs-environment-properties-name.md "https&#x3A;//keel-prestaging.us-west-2.spinnaker.mgmt.netflix.net/schema/#/$defs/Environment/properties/name")                   |
| [resources](#resources)         | `array`  | Optional | cannot be null | [DeliveryConfig](keel-defs-environment-properties-resources.md "https&#x3A;//keel-prestaging.us-west-2.spinnaker.mgmt.netflix.net/schema/#/$defs/Environment/properties/resources")         |
| [constraints](#constraints)     | `array`  | Optional | cannot be null | [DeliveryConfig](keel-defs-environment-properties-constraints.md "https&#x3A;//keel-prestaging.us-west-2.spinnaker.mgmt.netflix.net/schema/#/$defs/Environment/properties/constraints")     |
| [notifications](#notifications) | `array`  | Optional | cannot be null | [DeliveryConfig](keel-defs-environment-properties-notifications.md "https&#x3A;//keel-prestaging.us-west-2.spinnaker.mgmt.netflix.net/schema/#/$defs/Environment/properties/notifications") |

## name




`name`

-   is required
-   Type: `string`
-   cannot be null
-   defined in: [DeliveryConfig](keel-defs-environment-properties-name.md "https&#x3A;//keel-prestaging.us-west-2.spinnaker.mgmt.netflix.net/schema/#/$defs/Environment/properties/name")

### name Type

`string`

## resources




`resources`

-   is optional
-   Type: `object[]` ([Details](keel-defs-resource.md))
-   cannot be null
-   defined in: [DeliveryConfig](keel-defs-environment-properties-resources.md "https&#x3A;//keel-prestaging.us-west-2.spinnaker.mgmt.netflix.net/schema/#/$defs/Environment/properties/resources")

### resources Type

`object[]` ([Details](keel-defs-resource.md))

### resources Constraints

**unique items**: all items in this array must be unique. Duplicates are not allowed.

## constraints




`constraints`

-   is optional
-   Type: an array of merged types ([Details](keel-defs-constraint.md))
-   cannot be null
-   defined in: [DeliveryConfig](keel-defs-environment-properties-constraints.md "https&#x3A;//keel-prestaging.us-west-2.spinnaker.mgmt.netflix.net/schema/#/$defs/Environment/properties/constraints")

### constraints Type

an array of merged types ([Details](keel-defs-constraint.md))

### constraints Constraints

**unique items**: all items in this array must be unique. Duplicates are not allowed.

## notifications




`notifications`

-   is optional
-   Type: `object[]` ([Details](keel-defs-notificationconfig.md))
-   cannot be null
-   defined in: [DeliveryConfig](keel-defs-environment-properties-notifications.md "https&#x3A;//keel-prestaging.us-west-2.spinnaker.mgmt.netflix.net/schema/#/$defs/Environment/properties/notifications")

### notifications Type

`object[]` ([Details](keel-defs-notificationconfig.md))

### notifications Constraints

**unique items**: all items in this array must be unique. Duplicates are not allowed.
