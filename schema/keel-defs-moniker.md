# Untitled object in DeliveryConfig Schema

```txt
https://keel-prestaging.us-west-2.spinnaker.mgmt.netflix.net/schema/#/$defs/TitusClusterSpec/properties/moniker
```




| Abstract            | Extensible | Status         | Identifiable | Custom Properties | Additional Properties | Access Restrictions | Defined In                                                    |
| :------------------ | ---------- | -------------- | ------------ | :---------------- | --------------------- | ------------------- | ------------------------------------------------------------- |
| Can be instantiated | No         | Unknown status | No           | Forbidden         | Allowed               | none                | [keel.schema.json\*](keel.schema.json "open original schema") |

## moniker Type

`object` ([Details](keel-defs-moniker.md))

# undefined Properties

| Property              | Type     | Required | Nullable       | Defined by                                                                                                                                                                |
| :-------------------- | -------- | -------- | -------------- | :------------------------------------------------------------------------------------------------------------------------------------------------------------------------ |
| [app](#app)           | `string` | Required | cannot be null | [DeliveryConfig](keel-defs-moniker-properties-app.md "https&#x3A;//keel-prestaging.us-west-2.spinnaker.mgmt.netflix.net/schema/#/$defs/Moniker/properties/app")           |
| [stack](#stack)       | `string` | Optional | cannot be null | [DeliveryConfig](keel-defs-moniker-properties-stack.md "https&#x3A;//keel-prestaging.us-west-2.spinnaker.mgmt.netflix.net/schema/#/$defs/Moniker/properties/stack")       |
| [detail](#detail)     | `string` | Optional | cannot be null | [DeliveryConfig](keel-defs-moniker-properties-detail.md "https&#x3A;//keel-prestaging.us-west-2.spinnaker.mgmt.netflix.net/schema/#/$defs/Moniker/properties/detail")     |
| [sequence](#sequence) | `number` | Optional | cannot be null | [DeliveryConfig](keel-defs-moniker-properties-sequence.md "https&#x3A;//keel-prestaging.us-west-2.spinnaker.mgmt.netflix.net/schema/#/$defs/Moniker/properties/sequence") |

## app




`app`

-   is required
-   Type: `string`
-   cannot be null
-   defined in: [DeliveryConfig](keel-defs-moniker-properties-app.md "https&#x3A;//keel-prestaging.us-west-2.spinnaker.mgmt.netflix.net/schema/#/$defs/Moniker/properties/app")

### app Type

`string`

## stack




`stack`

-   is optional
-   Type: `string`
-   cannot be null
-   defined in: [DeliveryConfig](keel-defs-moniker-properties-stack.md "https&#x3A;//keel-prestaging.us-west-2.spinnaker.mgmt.netflix.net/schema/#/$defs/Moniker/properties/stack")

### stack Type

`string`

## detail




`detail`

-   is optional
-   Type: `string`
-   cannot be null
-   defined in: [DeliveryConfig](keel-defs-moniker-properties-detail.md "https&#x3A;//keel-prestaging.us-west-2.spinnaker.mgmt.netflix.net/schema/#/$defs/Moniker/properties/detail")

### detail Type

`string`

## sequence




`sequence`

-   is optional
-   Type: `number`
-   cannot be null
-   defined in: [DeliveryConfig](keel-defs-moniker-properties-sequence.md "https&#x3A;//keel-prestaging.us-west-2.spinnaker.mgmt.netflix.net/schema/#/$defs/Moniker/properties/sequence")

### sequence Type

`number`
