# Untitled object in DeliveryConfig Schema

```txt
https://keel-prestaging.us-west-2.spinnaker.mgmt.netflix.net/schema/#/$defs/DeliveryArtifact/oneOf/0
```




| Abstract            | Extensible | Status         | Identifiable | Custom Properties | Additional Properties | Access Restrictions | Defined In                                                    |
| :------------------ | ---------- | -------------- | ------------ | :---------------- | --------------------- | ------------------- | ------------------------------------------------------------- |
| Can be instantiated | No         | Unknown status | No           | Forbidden         | Allowed               | none                | [keel.schema.json\*](keel.schema.json "open original schema") |

## 0 Type

`object` ([Details](keel-defs-debianartifact.md))

# undefined Properties

| Property                                  | Type     | Required | Nullable       | Defined by                                                                                                                                                                                                  |
| :---------------------------------------- | -------- | -------- | -------------- | :---------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------- |
| [name](#name)                             | `string` | Required | cannot be null | [DeliveryConfig](keel-defs-debianartifact-properties-name.md "https&#x3A;//keel-prestaging.us-west-2.spinnaker.mgmt.netflix.net/schema/#/$defs/DebianArtifact/properties/name")                             |
| [deliveryConfigName](#deliveryConfigName) | `string` | Optional | cannot be null | [DeliveryConfig](keel-defs-debianartifact-properties-deliveryconfigname.md "https&#x3A;//keel-prestaging.us-west-2.spinnaker.mgmt.netflix.net/schema/#/$defs/DebianArtifact/properties/deliveryConfigName") |
| [reference](#reference)                   | `string` | Optional | cannot be null | [DeliveryConfig](keel-defs-debianartifact-properties-reference.md "https&#x3A;//keel-prestaging.us-west-2.spinnaker.mgmt.netflix.net/schema/#/$defs/DebianArtifact/properties/reference")                   |
| [statuses](#statuses)                     | `array`  | Optional | cannot be null | [DeliveryConfig](keel-defs-debianartifact-properties-statuses.md "https&#x3A;//keel-prestaging.us-west-2.spinnaker.mgmt.netflix.net/schema/#/$defs/DebianArtifact/properties/statuses")                     |
| [versioningStrategy](#versioningStrategy) | Merged   | Optional | cannot be null | [DeliveryConfig](keel-defs-versioningstrategy.md "https&#x3A;//keel-prestaging.us-west-2.spinnaker.mgmt.netflix.net/schema/#/$defs/DebianArtifact/properties/versioningStrategy")                           |

## name




`name`

-   is required
-   Type: `string`
-   cannot be null
-   defined in: [DeliveryConfig](keel-defs-debianartifact-properties-name.md "https&#x3A;//keel-prestaging.us-west-2.spinnaker.mgmt.netflix.net/schema/#/$defs/DebianArtifact/properties/name")

### name Type

`string`

## deliveryConfigName




`deliveryConfigName`

-   is optional
-   Type: `string`
-   cannot be null
-   defined in: [DeliveryConfig](keel-defs-debianartifact-properties-deliveryconfigname.md "https&#x3A;//keel-prestaging.us-west-2.spinnaker.mgmt.netflix.net/schema/#/$defs/DebianArtifact/properties/deliveryConfigName")

### deliveryConfigName Type

`string`

## reference




`reference`

-   is optional
-   Type: `string`
-   cannot be null
-   defined in: [DeliveryConfig](keel-defs-debianartifact-properties-reference.md "https&#x3A;//keel-prestaging.us-west-2.spinnaker.mgmt.netflix.net/schema/#/$defs/DebianArtifact/properties/reference")

### reference Type

`string`

## statuses




`statuses`

-   is optional
-   Type: unknown\[]
-   cannot be null
-   defined in: [DeliveryConfig](keel-defs-debianartifact-properties-statuses.md "https&#x3A;//keel-prestaging.us-west-2.spinnaker.mgmt.netflix.net/schema/#/$defs/DebianArtifact/properties/statuses")

### statuses Type

unknown\[]

## versioningStrategy




`versioningStrategy`

-   is optional
-   Type: merged type ([Details](keel-defs-versioningstrategy.md))
-   cannot be null
-   defined in: [DeliveryConfig](keel-defs-versioningstrategy.md "https&#x3A;//keel-prestaging.us-west-2.spinnaker.mgmt.netflix.net/schema/#/$defs/DebianArtifact/properties/versioningStrategy")

### versioningStrategy Type

merged type ([Details](keel-defs-versioningstrategy.md))

one (and only one) of

-   [Untitled object in DeliveryConfig](keel-defs-debiansemverversioningstrategy.md "check type definition")
-   [Untitled object in DeliveryConfig](keel-defs-dockerversioningstrategy.md "check type definition")
