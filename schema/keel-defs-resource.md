# Untitled object in DeliveryConfig Schema

```txt
https://keel-prestaging.us-west-2.spinnaker.mgmt.netflix.net/schema/#/$defs/Resource
```




| Abstract            | Extensible | Status         | Identifiable | Custom Properties | Additional Properties | Access Restrictions | Defined In                                                    |
| :------------------ | ---------- | -------------- | ------------ | :---------------- | --------------------- | ------------------- | ------------------------------------------------------------- |
| Can be instantiated | No         | Unknown status | No           | Forbidden         | Allowed               | none                | [keel.schema.json\*](keel.schema.json "open original schema") |

## Resource Type

`object` ([Details](keel-defs-resource.md))

# undefined Properties

| Property                  | Type     | Required | Nullable       | Defined by                                                                                                                                                                      |
| :------------------------ | -------- | -------- | -------------- | :------------------------------------------------------------------------------------------------------------------------------------------------------------------------------ |
| [apiVersion](#apiVersion) | `string` | Required | cannot be null | [DeliveryConfig](keel-defs-resource-properties-apiversion.md "https&#x3A;//keel-prestaging.us-west-2.spinnaker.mgmt.netflix.net/schema/#/$defs/Resource/properties/apiVersion") |
| [kind](#kind)             | `string` | Required | cannot be null | [DeliveryConfig](keel-defs-resource-properties-kind.md "https&#x3A;//keel-prestaging.us-west-2.spinnaker.mgmt.netflix.net/schema/#/$defs/Resource/properties/kind")             |
| [metadata](#metadata)     | `object` | Required | cannot be null | [DeliveryConfig](keel-defs-resource-properties-metadata.md "https&#x3A;//keel-prestaging.us-west-2.spinnaker.mgmt.netflix.net/schema/#/$defs/Resource/properties/metadata")     |
| [spec](#spec)             | Merged   | Required | cannot be null | [DeliveryConfig](keel-defs-resourcespec.md "https&#x3A;//keel-prestaging.us-west-2.spinnaker.mgmt.netflix.net/schema/#/$defs/Resource/properties/spec")                         |

## apiVersion




`apiVersion`

-   is required
-   Type: `string`
-   cannot be null
-   defined in: [DeliveryConfig](keel-defs-resource-properties-apiversion.md "https&#x3A;//keel-prestaging.us-west-2.spinnaker.mgmt.netflix.net/schema/#/$defs/Resource/properties/apiVersion")

### apiVersion Type

`string`

## kind




`kind`

-   is required
-   Type: `string`
-   cannot be null
-   defined in: [DeliveryConfig](keel-defs-resource-properties-kind.md "https&#x3A;//keel-prestaging.us-west-2.spinnaker.mgmt.netflix.net/schema/#/$defs/Resource/properties/kind")

### kind Type

`string`

## metadata




`metadata`

-   is required
-   Type: `object` ([Details](keel-defs-resource-properties-metadata.md))
-   cannot be null
-   defined in: [DeliveryConfig](keel-defs-resource-properties-metadata.md "https&#x3A;//keel-prestaging.us-west-2.spinnaker.mgmt.netflix.net/schema/#/$defs/Resource/properties/metadata")

### metadata Type

`object` ([Details](keel-defs-resource-properties-metadata.md))

## spec




`spec`

-   is required
-   Type: merged type ([Details](keel-defs-resourcespec.md))
-   cannot be null
-   defined in: [DeliveryConfig](keel-defs-resourcespec.md "https&#x3A;//keel-prestaging.us-west-2.spinnaker.mgmt.netflix.net/schema/#/$defs/Resource/properties/spec")

### spec Type

merged type ([Details](keel-defs-resourcespec.md))

one (and only one) of

-   [Untitled object in DeliveryConfig](keel-defs-imagespec.md "check type definition")
-   [Untitled object in DeliveryConfig](keel-defs-clusterspec.md "check type definition")
-   [Untitled object in DeliveryConfig](keel-defs-securitygroupspec.md "check type definition")
-   [Untitled object in DeliveryConfig](keel-defs-classicloadbalancerspec.md "check type definition")
-   [Untitled object in DeliveryConfig](keel-defs-applicationloadbalancerspec.md "check type definition")
-   [Untitled object in DeliveryConfig](keel-defs-titusclusterspec.md "check type definition")
