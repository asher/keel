# Untitled object in DeliveryConfig Schema

```txt
https://keel-prestaging.us-west-2.spinnaker.mgmt.netflix.net/schema/#/$defs/ApplicationLoadBalancerSpec/properties/listeners/items
```




| Abstract            | Extensible | Status         | Identifiable | Custom Properties | Additional Properties | Access Restrictions | Defined In                                                    |
| :------------------ | ---------- | -------------- | ------------ | :---------------- | --------------------- | ------------------- | ------------------------------------------------------------- |
| Can be instantiated | No         | Unknown status | No           | Forbidden         | Allowed               | none                | [keel.schema.json\*](keel.schema.json "open original schema") |

## items Type

`object` ([Details](keel-defs-listener.md))

# undefined Properties

| Property                          | Type     | Required | Nullable       | Defined by                                                                                                                                                                              |
| :-------------------------------- | -------- | -------- | -------------- | :-------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------- |
| [port](#port)                     | `number` | Required | cannot be null | [DeliveryConfig](keel-defs-listener-properties-port.md "https&#x3A;//keel-prestaging.us-west-2.spinnaker.mgmt.netflix.net/schema/#/$defs/Listener/properties/port")                     |
| [protocol](#protocol)             | `string` | Required | cannot be null | [DeliveryConfig](keel-defs-listener-properties-protocol.md "https&#x3A;//keel-prestaging.us-west-2.spinnaker.mgmt.netflix.net/schema/#/$defs/Listener/properties/protocol")             |
| [certificateArn](#certificateArn) | `string` | Optional | cannot be null | [DeliveryConfig](keel-defs-listener-properties-certificatearn.md "https&#x3A;//keel-prestaging.us-west-2.spinnaker.mgmt.netflix.net/schema/#/$defs/Listener/properties/certificateArn") |
| [rules](#rules)                   | `array`  | Optional | cannot be null | [DeliveryConfig](keel-defs-listener-properties-rules.md "https&#x3A;//keel-prestaging.us-west-2.spinnaker.mgmt.netflix.net/schema/#/$defs/Listener/properties/rules")                   |
| [defaultActions](#defaultActions) | `array`  | Optional | cannot be null | [DeliveryConfig](keel-defs-listener-properties-defaultactions.md "https&#x3A;//keel-prestaging.us-west-2.spinnaker.mgmt.netflix.net/schema/#/$defs/Listener/properties/defaultActions") |

## port




`port`

-   is required
-   Type: `number`
-   cannot be null
-   defined in: [DeliveryConfig](keel-defs-listener-properties-port.md "https&#x3A;//keel-prestaging.us-west-2.spinnaker.mgmt.netflix.net/schema/#/$defs/Listener/properties/port")

### port Type

`number`

## protocol




`protocol`

-   is required
-   Type: `string`
-   cannot be null
-   defined in: [DeliveryConfig](keel-defs-listener-properties-protocol.md "https&#x3A;//keel-prestaging.us-west-2.spinnaker.mgmt.netflix.net/schema/#/$defs/Listener/properties/protocol")

### protocol Type

`string`

## certificateArn




`certificateArn`

-   is optional
-   Type: `string`
-   cannot be null
-   defined in: [DeliveryConfig](keel-defs-listener-properties-certificatearn.md "https&#x3A;//keel-prestaging.us-west-2.spinnaker.mgmt.netflix.net/schema/#/$defs/Listener/properties/certificateArn")

### certificateArn Type

`string`

## rules




`rules`

-   is optional
-   Type: `object[]` ([Details](keel-defs-rule.md))
-   cannot be null
-   defined in: [DeliveryConfig](keel-defs-listener-properties-rules.md "https&#x3A;//keel-prestaging.us-west-2.spinnaker.mgmt.netflix.net/schema/#/$defs/Listener/properties/rules")

### rules Type

`object[]` ([Details](keel-defs-rule.md))

### rules Constraints

**unique items**: all items in this array must be unique. Duplicates are not allowed.

## defaultActions




`defaultActions`

-   is optional
-   Type: `object[]` ([Details](keel-defs-action.md))
-   cannot be null
-   defined in: [DeliveryConfig](keel-defs-listener-properties-defaultactions.md "https&#x3A;//keel-prestaging.us-west-2.spinnaker.mgmt.netflix.net/schema/#/$defs/Listener/properties/defaultActions")

### defaultActions Type

`object[]` ([Details](keel-defs-action.md))

### defaultActions Constraints

**unique items**: all items in this array must be unique. Duplicates are not allowed.
