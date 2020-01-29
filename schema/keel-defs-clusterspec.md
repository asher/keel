# Untitled object in DeliveryConfig Schema

```txt
https://keel-prestaging.us-west-2.spinnaker.mgmt.netflix.net/schema/#/$defs/ResourceSpec/oneOf/1
```




| Abstract            | Extensible | Status         | Identifiable | Custom Properties | Additional Properties | Access Restrictions | Defined In                                                    |
| :------------------ | ---------- | -------------- | ------------ | :---------------- | --------------------- | ------------------- | ------------------------------------------------------------- |
| Can be instantiated | No         | Unknown status | No           | Forbidden         | Allowed               | none                | [keel.schema.json\*](keel.schema.json "open original schema") |

## 1 Type

`object` ([Details](keel-defs-clusterspec.md))

# undefined Properties

| Property                                    | Type     | Required | Nullable       | Defined by                                                                                                                                                                           |
| :------------------------------------------ | -------- | -------- | -------------- | :----------------------------------------------------------------------------------------------------------------------------------------------------------------------------------- |
| [moniker](#moniker)                         | `object` | Required | cannot be null | [DeliveryConfig](keel-defs-moniker.md "https&#x3A;//keel-prestaging.us-west-2.spinnaker.mgmt.netflix.net/schema/#/$defs/ClusterSpec/properties/moniker")                             |
| [imageProvider](#imageProvider)             | Merged   | Required | cannot be null | [DeliveryConfig](keel-defs-imageprovider.md "https&#x3A;//keel-prestaging.us-west-2.spinnaker.mgmt.netflix.net/schema/#/$defs/ClusterSpec/properties/imageProvider")                 |
| [deployWith](#deployWith)                   | Merged   | Optional | cannot be null | [DeliveryConfig](keel-defs-clusterdeploystrategy.md "https&#x3A;//keel-prestaging.us-west-2.spinnaker.mgmt.netflix.net/schema/#/$defs/ClusterSpec/properties/deployWith")            |
| [locations](#locations)                     | `object` | Required | cannot be null | [DeliveryConfig](keel-defs-subnetawarelocations.md "https&#x3A;//keel-prestaging.us-west-2.spinnaker.mgmt.netflix.net/schema/#/$defs/ClusterSpec/properties/locations")              |
| [launchConfiguration](#launchConfiguration) | `object` | Optional | cannot be null | [DeliveryConfig](keel-defs-launchconfigurationspec.md "https&#x3A;//keel-prestaging.us-west-2.spinnaker.mgmt.netflix.net/schema/#/$defs/ClusterSpec/properties/launchConfiguration") |
| [capacity](#capacity)                       | `object` | Optional | cannot be null | [DeliveryConfig](keel-defs-capacity.md "https&#x3A;//keel-prestaging.us-west-2.spinnaker.mgmt.netflix.net/schema/#/$defs/ClusterSpec/properties/capacity")                           |
| [dependencies](#dependencies)               | `object` | Optional | cannot be null | [DeliveryConfig](keel-defs-clusterdependencies.md "https&#x3A;//keel-prestaging.us-west-2.spinnaker.mgmt.netflix.net/schema/#/$defs/ClusterSpec/properties/dependencies")            |
| [health](#health)                           | `object` | Optional | cannot be null | [DeliveryConfig](keel-defs-healthspec.md "https&#x3A;//keel-prestaging.us-west-2.spinnaker.mgmt.netflix.net/schema/#/$defs/ClusterSpec/properties/health")                           |
| [scaling](#scaling)                         | `object` | Optional | cannot be null | [DeliveryConfig](keel-defs-scaling.md "https&#x3A;//keel-prestaging.us-west-2.spinnaker.mgmt.netflix.net/schema/#/$defs/ClusterSpec/properties/scaling")                             |
| [tags](#tags)                               | `object` | Optional | cannot be null | [DeliveryConfig](keel-defs-clusterspec-properties-tags.md "https&#x3A;//keel-prestaging.us-west-2.spinnaker.mgmt.netflix.net/schema/#/$defs/ClusterSpec/properties/tags")            |
| [overrides](#overrides)                     | `object` | Optional | cannot be null | [DeliveryConfig](keel-defs-clusterspec-properties-overrides.md "https&#x3A;//keel-prestaging.us-west-2.spinnaker.mgmt.netflix.net/schema/#/$defs/ClusterSpec/properties/overrides")  |

## moniker




`moniker`

-   is required
-   Type: `object` ([Details](keel-defs-moniker.md))
-   cannot be null
-   defined in: [DeliveryConfig](keel-defs-moniker.md "https&#x3A;//keel-prestaging.us-west-2.spinnaker.mgmt.netflix.net/schema/#/$defs/ClusterSpec/properties/moniker")

### moniker Type

`object` ([Details](keel-defs-moniker.md))

## imageProvider




`imageProvider`

-   is required
-   Type: merged type ([Details](keel-defs-imageprovider.md))
-   cannot be null
-   defined in: [DeliveryConfig](keel-defs-imageprovider.md "https&#x3A;//keel-prestaging.us-west-2.spinnaker.mgmt.netflix.net/schema/#/$defs/ClusterSpec/properties/imageProvider")

### imageProvider Type

merged type ([Details](keel-defs-imageprovider.md))

one (and only one) of

-   [Untitled object in DeliveryConfig](keel-defs-artifactimageprovider.md "check type definition")
-   [Untitled object in DeliveryConfig](keel-defs-referenceartifactimageprovider.md "check type definition")
-   [Untitled object in DeliveryConfig](keel-defs-jenkinsimageprovider.md "check type definition")

## deployWith




`deployWith`

-   is optional
-   Type: merged type ([Details](keel-defs-clusterdeploystrategy.md))
-   cannot be null
-   defined in: [DeliveryConfig](keel-defs-clusterdeploystrategy.md "https&#x3A;//keel-prestaging.us-west-2.spinnaker.mgmt.netflix.net/schema/#/$defs/ClusterSpec/properties/deployWith")

### deployWith Type

merged type ([Details](keel-defs-clusterdeploystrategy.md))

one (and only one) of

-   [Untitled object in DeliveryConfig](keel-defs-redblack.md "check type definition")
-   [Untitled object in DeliveryConfig](keel-defs-highlander.md "check type definition")

## locations




`locations`

-   is required
-   Type: `object` ([Details](keel-defs-subnetawarelocations.md))
-   cannot be null
-   defined in: [DeliveryConfig](keel-defs-subnetawarelocations.md "https&#x3A;//keel-prestaging.us-west-2.spinnaker.mgmt.netflix.net/schema/#/$defs/ClusterSpec/properties/locations")

### locations Type

`object` ([Details](keel-defs-subnetawarelocations.md))

## launchConfiguration




`launchConfiguration`

-   is optional
-   Type: `object` ([Details](keel-defs-launchconfigurationspec.md))
-   cannot be null
-   defined in: [DeliveryConfig](keel-defs-launchconfigurationspec.md "https&#x3A;//keel-prestaging.us-west-2.spinnaker.mgmt.netflix.net/schema/#/$defs/ClusterSpec/properties/launchConfiguration")

### launchConfiguration Type

`object` ([Details](keel-defs-launchconfigurationspec.md))

## capacity




`capacity`

-   is optional
-   Type: `object` ([Details](keel-defs-capacity.md))
-   cannot be null
-   defined in: [DeliveryConfig](keel-defs-capacity.md "https&#x3A;//keel-prestaging.us-west-2.spinnaker.mgmt.netflix.net/schema/#/$defs/ClusterSpec/properties/capacity")

### capacity Type

`object` ([Details](keel-defs-capacity.md))

## dependencies




`dependencies`

-   is optional
-   Type: `object` ([Details](keel-defs-clusterdependencies.md))
-   cannot be null
-   defined in: [DeliveryConfig](keel-defs-clusterdependencies.md "https&#x3A;//keel-prestaging.us-west-2.spinnaker.mgmt.netflix.net/schema/#/$defs/ClusterSpec/properties/dependencies")

### dependencies Type

`object` ([Details](keel-defs-clusterdependencies.md))

## health




`health`

-   is optional
-   Type: `object` ([Details](keel-defs-healthspec.md))
-   cannot be null
-   defined in: [DeliveryConfig](keel-defs-healthspec.md "https&#x3A;//keel-prestaging.us-west-2.spinnaker.mgmt.netflix.net/schema/#/$defs/ClusterSpec/properties/health")

### health Type

`object` ([Details](keel-defs-healthspec.md))

## scaling




`scaling`

-   is optional
-   Type: `object` ([Details](keel-defs-scaling.md))
-   cannot be null
-   defined in: [DeliveryConfig](keel-defs-scaling.md "https&#x3A;//keel-prestaging.us-west-2.spinnaker.mgmt.netflix.net/schema/#/$defs/ClusterSpec/properties/scaling")

### scaling Type

`object` ([Details](keel-defs-scaling.md))

## tags




`tags`

-   is optional
-   Type: `object` ([Details](keel-defs-clusterspec-properties-tags.md))
-   cannot be null
-   defined in: [DeliveryConfig](keel-defs-clusterspec-properties-tags.md "https&#x3A;//keel-prestaging.us-west-2.spinnaker.mgmt.netflix.net/schema/#/$defs/ClusterSpec/properties/tags")

### tags Type

`object` ([Details](keel-defs-clusterspec-properties-tags.md))

## overrides




`overrides`

-   is optional
-   Type: `object` ([Details](keel-defs-clusterspec-properties-overrides.md))
-   cannot be null
-   defined in: [DeliveryConfig](keel-defs-clusterspec-properties-overrides.md "https&#x3A;//keel-prestaging.us-west-2.spinnaker.mgmt.netflix.net/schema/#/$defs/ClusterSpec/properties/overrides")

### overrides Type

`object` ([Details](keel-defs-clusterspec-properties-overrides.md))
