# Untitled object in DeliveryConfig Schema

```txt
https://keel-prestaging.us-west-2.spinnaker.mgmt.netflix.net/schema/#/$defs/TitusClusterSpec
```




| Abstract            | Extensible | Status         | Identifiable | Custom Properties | Additional Properties | Access Restrictions | Defined In                                                    |
| :------------------ | ---------- | -------------- | ------------ | :---------------- | --------------------- | ------------------- | ------------------------------------------------------------- |
| Can be instantiated | No         | Unknown status | No           | Forbidden         | Allowed               | none                | [keel.schema.json\*](keel.schema.json "open original schema") |

## TitusClusterSpec Type

`object` ([Details](keel-defs-titusclusterspec.md))

# undefined Properties

| Property                                    | Type     | Required | Nullable       | Defined by                                                                                                                                                                                                        |
| :------------------------------------------ | -------- | -------- | -------------- | :---------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------- |
| [moniker](#moniker)                         | `object` | Required | cannot be null | [DeliveryConfig](keel-defs-moniker.md "https&#x3A;//keel-prestaging.us-west-2.spinnaker.mgmt.netflix.net/schema/#/$defs/TitusClusterSpec/properties/moniker")                                                     |
| [deployWith](#deployWith)                   | Merged   | Optional | cannot be null | [DeliveryConfig](keel-defs-clusterdeploystrategy.md "https&#x3A;//keel-prestaging.us-west-2.spinnaker.mgmt.netflix.net/schema/#/$defs/TitusClusterSpec/properties/deployWith")                                    |
| [locations](#locations)                     | `object` | Required | cannot be null | [DeliveryConfig](keel-defs-simplelocations.md "https&#x3A;//keel-prestaging.us-west-2.spinnaker.mgmt.netflix.net/schema/#/$defs/TitusClusterSpec/properties/locations")                                           |
| [container](#container)                     | Merged   | Required | cannot be null | [DeliveryConfig](keel-defs-containerprovider.md "https&#x3A;//keel-prestaging.us-west-2.spinnaker.mgmt.netflix.net/schema/#/$defs/TitusClusterSpec/properties/container")                                         |
| [capacity](#capacity)                       | `object` | Optional | cannot be null | [DeliveryConfig](keel-defs-capacity.md "https&#x3A;//keel-prestaging.us-west-2.spinnaker.mgmt.netflix.net/schema/#/$defs/TitusClusterSpec/properties/capacity")                                                   |
| [constraints](#constraints)                 | `object` | Optional | cannot be null | [DeliveryConfig](keel-defs-constraints.md "https&#x3A;//keel-prestaging.us-west-2.spinnaker.mgmt.netflix.net/schema/#/$defs/TitusClusterSpec/properties/constraints")                                             |
| [env](#env)                                 | `object` | Optional | cannot be null | [DeliveryConfig](keel-defs-titusclusterspec-properties-env.md "https&#x3A;//keel-prestaging.us-west-2.spinnaker.mgmt.netflix.net/schema/#/$defs/TitusClusterSpec/properties/env")                                 |
| [containerAttributes](#containerAttributes) | `object` | Optional | cannot be null | [DeliveryConfig](keel-defs-titusclusterspec-properties-containerattributes.md "https&#x3A;//keel-prestaging.us-west-2.spinnaker.mgmt.netflix.net/schema/#/$defs/TitusClusterSpec/properties/containerAttributes") |
| [resources](#resources)                     | `object` | Optional | cannot be null | [DeliveryConfig](keel-defs-resourcesspec.md "https&#x3A;//keel-prestaging.us-west-2.spinnaker.mgmt.netflix.net/schema/#/$defs/TitusClusterSpec/properties/resources")                                             |
| [iamProfile](#iamProfile)                   | `string` | Optional | cannot be null | [DeliveryConfig](keel-defs-titusclusterspec-properties-iamprofile.md "https&#x3A;//keel-prestaging.us-west-2.spinnaker.mgmt.netflix.net/schema/#/$defs/TitusClusterSpec/properties/iamProfile")                   |
| [entryPoint](#entryPoint)                   | `string` | Optional | cannot be null | [DeliveryConfig](keel-defs-titusclusterspec-properties-entrypoint.md "https&#x3A;//keel-prestaging.us-west-2.spinnaker.mgmt.netflix.net/schema/#/$defs/TitusClusterSpec/properties/entryPoint")                   |
| [capacityGroup](#capacityGroup)             | `string` | Optional | cannot be null | [DeliveryConfig](keel-defs-titusclusterspec-properties-capacitygroup.md "https&#x3A;//keel-prestaging.us-west-2.spinnaker.mgmt.netflix.net/schema/#/$defs/TitusClusterSpec/properties/capacityGroup")             |
| [migrationPolicy](#migrationPolicy)         | `object` | Optional | cannot be null | [DeliveryConfig](keel-defs-migrationpolicy.md "https&#x3A;//keel-prestaging.us-west-2.spinnaker.mgmt.netflix.net/schema/#/$defs/TitusClusterSpec/properties/migrationPolicy")                                     |
| [dependencies](#dependencies)               | `object` | Optional | cannot be null | [DeliveryConfig](keel-defs-clusterdependencies.md "https&#x3A;//keel-prestaging.us-west-2.spinnaker.mgmt.netflix.net/schema/#/$defs/TitusClusterSpec/properties/dependencies")                                    |
| [tags](#tags)                               | `object` | Optional | cannot be null | [DeliveryConfig](keel-defs-titusclusterspec-properties-tags.md "https&#x3A;//keel-prestaging.us-west-2.spinnaker.mgmt.netflix.net/schema/#/$defs/TitusClusterSpec/properties/tags")                               |
| [overrides](#overrides)                     | `object` | Optional | cannot be null | [DeliveryConfig](keel-defs-titusclusterspec-properties-overrides.md "https&#x3A;//keel-prestaging.us-west-2.spinnaker.mgmt.netflix.net/schema/#/$defs/TitusClusterSpec/properties/overrides")                     |

## moniker




`moniker`

-   is required
-   Type: `object` ([Details](keel-defs-moniker.md))
-   cannot be null
-   defined in: [DeliveryConfig](keel-defs-moniker.md "https&#x3A;//keel-prestaging.us-west-2.spinnaker.mgmt.netflix.net/schema/#/$defs/TitusClusterSpec/properties/moniker")

### moniker Type

`object` ([Details](keel-defs-moniker.md))

## deployWith




`deployWith`

-   is optional
-   Type: merged type ([Details](keel-defs-clusterdeploystrategy.md))
-   cannot be null
-   defined in: [DeliveryConfig](keel-defs-clusterdeploystrategy.md "https&#x3A;//keel-prestaging.us-west-2.spinnaker.mgmt.netflix.net/schema/#/$defs/TitusClusterSpec/properties/deployWith")

### deployWith Type

merged type ([Details](keel-defs-clusterdeploystrategy.md))

one (and only one) of

-   [Untitled object in DeliveryConfig](keel-defs-redblack.md "check type definition")
-   [Untitled object in DeliveryConfig](keel-defs-highlander.md "check type definition")

## locations




`locations`

-   is required
-   Type: `object` ([Details](keel-defs-simplelocations.md))
-   cannot be null
-   defined in: [DeliveryConfig](keel-defs-simplelocations.md "https&#x3A;//keel-prestaging.us-west-2.spinnaker.mgmt.netflix.net/schema/#/$defs/TitusClusterSpec/properties/locations")

### locations Type

`object` ([Details](keel-defs-simplelocations.md))

## container




`container`

-   is required
-   Type: merged type ([Details](keel-defs-containerprovider.md))
-   cannot be null
-   defined in: [DeliveryConfig](keel-defs-containerprovider.md "https&#x3A;//keel-prestaging.us-west-2.spinnaker.mgmt.netflix.net/schema/#/$defs/TitusClusterSpec/properties/container")

### container Type

merged type ([Details](keel-defs-containerprovider.md))

one (and only one) of

-   [Untitled object in DeliveryConfig](keel-defs-referenceprovider.md "check type definition")
-   [Untitled object in DeliveryConfig](keel-defs-digestprovider.md "check type definition")
-   [Untitled object in DeliveryConfig](keel-defs-versionedtagprovider.md "check type definition")

## capacity




`capacity`

-   is optional
-   Type: `object` ([Details](keel-defs-capacity.md))
-   cannot be null
-   defined in: [DeliveryConfig](keel-defs-capacity.md "https&#x3A;//keel-prestaging.us-west-2.spinnaker.mgmt.netflix.net/schema/#/$defs/TitusClusterSpec/properties/capacity")

### capacity Type

`object` ([Details](keel-defs-capacity.md))

## constraints




`constraints`

-   is optional
-   Type: `object` ([Details](keel-defs-constraints.md))
-   cannot be null
-   defined in: [DeliveryConfig](keel-defs-constraints.md "https&#x3A;//keel-prestaging.us-west-2.spinnaker.mgmt.netflix.net/schema/#/$defs/TitusClusterSpec/properties/constraints")

### constraints Type

`object` ([Details](keel-defs-constraints.md))

## env




`env`

-   is optional
-   Type: `object` ([Details](keel-defs-titusclusterspec-properties-env.md))
-   cannot be null
-   defined in: [DeliveryConfig](keel-defs-titusclusterspec-properties-env.md "https&#x3A;//keel-prestaging.us-west-2.spinnaker.mgmt.netflix.net/schema/#/$defs/TitusClusterSpec/properties/env")

### env Type

`object` ([Details](keel-defs-titusclusterspec-properties-env.md))

## containerAttributes




`containerAttributes`

-   is optional
-   Type: `object` ([Details](keel-defs-titusclusterspec-properties-containerattributes.md))
-   cannot be null
-   defined in: [DeliveryConfig](keel-defs-titusclusterspec-properties-containerattributes.md "https&#x3A;//keel-prestaging.us-west-2.spinnaker.mgmt.netflix.net/schema/#/$defs/TitusClusterSpec/properties/containerAttributes")

### containerAttributes Type

`object` ([Details](keel-defs-titusclusterspec-properties-containerattributes.md))

## resources




`resources`

-   is optional
-   Type: `object` ([Details](keel-defs-resourcesspec.md))
-   cannot be null
-   defined in: [DeliveryConfig](keel-defs-resourcesspec.md "https&#x3A;//keel-prestaging.us-west-2.spinnaker.mgmt.netflix.net/schema/#/$defs/TitusClusterSpec/properties/resources")

### resources Type

`object` ([Details](keel-defs-resourcesspec.md))

## iamProfile




`iamProfile`

-   is optional
-   Type: `string`
-   cannot be null
-   defined in: [DeliveryConfig](keel-defs-titusclusterspec-properties-iamprofile.md "https&#x3A;//keel-prestaging.us-west-2.spinnaker.mgmt.netflix.net/schema/#/$defs/TitusClusterSpec/properties/iamProfile")

### iamProfile Type

`string`

## entryPoint




`entryPoint`

-   is optional
-   Type: `string`
-   cannot be null
-   defined in: [DeliveryConfig](keel-defs-titusclusterspec-properties-entrypoint.md "https&#x3A;//keel-prestaging.us-west-2.spinnaker.mgmt.netflix.net/schema/#/$defs/TitusClusterSpec/properties/entryPoint")

### entryPoint Type

`string`

## capacityGroup




`capacityGroup`

-   is optional
-   Type: `string`
-   cannot be null
-   defined in: [DeliveryConfig](keel-defs-titusclusterspec-properties-capacitygroup.md "https&#x3A;//keel-prestaging.us-west-2.spinnaker.mgmt.netflix.net/schema/#/$defs/TitusClusterSpec/properties/capacityGroup")

### capacityGroup Type

`string`

## migrationPolicy




`migrationPolicy`

-   is optional
-   Type: `object` ([Details](keel-defs-migrationpolicy.md))
-   cannot be null
-   defined in: [DeliveryConfig](keel-defs-migrationpolicy.md "https&#x3A;//keel-prestaging.us-west-2.spinnaker.mgmt.netflix.net/schema/#/$defs/TitusClusterSpec/properties/migrationPolicy")

### migrationPolicy Type

`object` ([Details](keel-defs-migrationpolicy.md))

## dependencies




`dependencies`

-   is optional
-   Type: `object` ([Details](keel-defs-clusterdependencies.md))
-   cannot be null
-   defined in: [DeliveryConfig](keel-defs-clusterdependencies.md "https&#x3A;//keel-prestaging.us-west-2.spinnaker.mgmt.netflix.net/schema/#/$defs/TitusClusterSpec/properties/dependencies")

### dependencies Type

`object` ([Details](keel-defs-clusterdependencies.md))

## tags




`tags`

-   is optional
-   Type: `object` ([Details](keel-defs-titusclusterspec-properties-tags.md))
-   cannot be null
-   defined in: [DeliveryConfig](keel-defs-titusclusterspec-properties-tags.md "https&#x3A;//keel-prestaging.us-west-2.spinnaker.mgmt.netflix.net/schema/#/$defs/TitusClusterSpec/properties/tags")

### tags Type

`object` ([Details](keel-defs-titusclusterspec-properties-tags.md))

## overrides




`overrides`

-   is optional
-   Type: `object` ([Details](keel-defs-titusclusterspec-properties-overrides.md))
-   cannot be null
-   defined in: [DeliveryConfig](keel-defs-titusclusterspec-properties-overrides.md "https&#x3A;//keel-prestaging.us-west-2.spinnaker.mgmt.netflix.net/schema/#/$defs/TitusClusterSpec/properties/overrides")

### overrides Type

`object` ([Details](keel-defs-titusclusterspec-properties-overrides.md))
