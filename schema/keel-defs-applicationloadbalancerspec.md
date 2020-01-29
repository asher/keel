# Untitled object in DeliveryConfig Schema

```txt
https://keel-prestaging.us-west-2.spinnaker.mgmt.netflix.net/schema/#/$defs/ResourceSpec/oneOf/4
```




| Abstract            | Extensible | Status         | Identifiable | Custom Properties | Additional Properties | Access Restrictions | Defined In                                                    |
| :------------------ | ---------- | -------------- | ------------ | :---------------- | --------------------- | ------------------- | ------------------------------------------------------------- |
| Can be instantiated | No         | Unknown status | No           | Forbidden         | Allowed               | none                | [keel.schema.json\*](keel.schema.json "open original schema") |

## 4 Type

`object` ([Details](keel-defs-applicationloadbalancerspec.md))

# undefined Properties

| Property                      | Type      | Required | Nullable       | Defined by                                                                                                                                                                                                                |
| :---------------------------- | --------- | -------- | -------------- | :------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------ |
| [moniker](#moniker)           | `object`  | Required | cannot be null | [DeliveryConfig](keel-defs-moniker.md "https&#x3A;//keel-prestaging.us-west-2.spinnaker.mgmt.netflix.net/schema/#/$defs/ApplicationLoadBalancerSpec/properties/moniker")                                                  |
| [locations](#locations)       | `object`  | Required | cannot be null | [DeliveryConfig](keel-defs-subnetawarelocations.md "https&#x3A;//keel-prestaging.us-west-2.spinnaker.mgmt.netflix.net/schema/#/$defs/ApplicationLoadBalancerSpec/properties/locations")                                   |
| [internal](#internal)         | `boolean` | Optional | cannot be null | [DeliveryConfig](keel-defs-applicationloadbalancerspec-properties-internal.md "https&#x3A;//keel-prestaging.us-west-2.spinnaker.mgmt.netflix.net/schema/#/$defs/ApplicationLoadBalancerSpec/properties/internal")         |
| [dependencies](#dependencies) | `object`  | Optional | cannot be null | [DeliveryConfig](keel-defs-loadbalancerdependencies.md "https&#x3A;//keel-prestaging.us-west-2.spinnaker.mgmt.netflix.net/schema/#/$defs/ApplicationLoadBalancerSpec/properties/dependencies")                            |
| [idleTimeout](#idleTimeout)   | `string`  | Optional | cannot be null | [DeliveryConfig](keel-defs-applicationloadbalancerspec-properties-idletimeout.md "https&#x3A;//keel-prestaging.us-west-2.spinnaker.mgmt.netflix.net/schema/#/$defs/ApplicationLoadBalancerSpec/properties/idleTimeout")   |
| [listeners](#listeners)       | `array`   | Required | cannot be null | [DeliveryConfig](keel-defs-applicationloadbalancerspec-properties-listeners.md "https&#x3A;//keel-prestaging.us-west-2.spinnaker.mgmt.netflix.net/schema/#/$defs/ApplicationLoadBalancerSpec/properties/listeners")       |
| [targetGroups](#targetGroups) | `array`   | Required | cannot be null | [DeliveryConfig](keel-defs-applicationloadbalancerspec-properties-targetgroups.md "https&#x3A;//keel-prestaging.us-west-2.spinnaker.mgmt.netflix.net/schema/#/$defs/ApplicationLoadBalancerSpec/properties/targetGroups") |
| [overrides](#overrides)       | `object`  | Optional | cannot be null | [DeliveryConfig](keel-defs-applicationloadbalancerspec-properties-overrides.md "https&#x3A;//keel-prestaging.us-west-2.spinnaker.mgmt.netflix.net/schema/#/$defs/ApplicationLoadBalancerSpec/properties/overrides")       |

## moniker




`moniker`

-   is required
-   Type: `object` ([Details](keel-defs-moniker.md))
-   cannot be null
-   defined in: [DeliveryConfig](keel-defs-moniker.md "https&#x3A;//keel-prestaging.us-west-2.spinnaker.mgmt.netflix.net/schema/#/$defs/ApplicationLoadBalancerSpec/properties/moniker")

### moniker Type

`object` ([Details](keel-defs-moniker.md))

## locations




`locations`

-   is required
-   Type: `object` ([Details](keel-defs-subnetawarelocations.md))
-   cannot be null
-   defined in: [DeliveryConfig](keel-defs-subnetawarelocations.md "https&#x3A;//keel-prestaging.us-west-2.spinnaker.mgmt.netflix.net/schema/#/$defs/ApplicationLoadBalancerSpec/properties/locations")

### locations Type

`object` ([Details](keel-defs-subnetawarelocations.md))

## internal




`internal`

-   is optional
-   Type: `boolean`
-   cannot be null
-   defined in: [DeliveryConfig](keel-defs-applicationloadbalancerspec-properties-internal.md "https&#x3A;//keel-prestaging.us-west-2.spinnaker.mgmt.netflix.net/schema/#/$defs/ApplicationLoadBalancerSpec/properties/internal")

### internal Type

`boolean`

## dependencies




`dependencies`

-   is optional
-   Type: `object` ([Details](keel-defs-loadbalancerdependencies.md))
-   cannot be null
-   defined in: [DeliveryConfig](keel-defs-loadbalancerdependencies.md "https&#x3A;//keel-prestaging.us-west-2.spinnaker.mgmt.netflix.net/schema/#/$defs/ApplicationLoadBalancerSpec/properties/dependencies")

### dependencies Type

`object` ([Details](keel-defs-loadbalancerdependencies.md))

## idleTimeout




`idleTimeout`

-   is optional
-   Type: `string`
-   cannot be null
-   defined in: [DeliveryConfig](keel-defs-applicationloadbalancerspec-properties-idletimeout.md "https&#x3A;//keel-prestaging.us-west-2.spinnaker.mgmt.netflix.net/schema/#/$defs/ApplicationLoadBalancerSpec/properties/idleTimeout")

### idleTimeout Type

`string`

### idleTimeout Constraints

**duration**: the string must be a duration string, according to [RFC 3339, section 5.6](https://tools.ietf.org/html/rfc3339 "check the specification")

## listeners




`listeners`

-   is required
-   Type: `object[]` ([Details](keel-defs-listener.md))
-   cannot be null
-   defined in: [DeliveryConfig](keel-defs-applicationloadbalancerspec-properties-listeners.md "https&#x3A;//keel-prestaging.us-west-2.spinnaker.mgmt.netflix.net/schema/#/$defs/ApplicationLoadBalancerSpec/properties/listeners")

### listeners Type

`object[]` ([Details](keel-defs-listener.md))

### listeners Constraints

**unique items**: all items in this array must be unique. Duplicates are not allowed.

## targetGroups




`targetGroups`

-   is required
-   Type: `object[]` ([Details](keel-defs-targetgroup.md))
-   cannot be null
-   defined in: [DeliveryConfig](keel-defs-applicationloadbalancerspec-properties-targetgroups.md "https&#x3A;//keel-prestaging.us-west-2.spinnaker.mgmt.netflix.net/schema/#/$defs/ApplicationLoadBalancerSpec/properties/targetGroups")

### targetGroups Type

`object[]` ([Details](keel-defs-targetgroup.md))

### targetGroups Constraints

**unique items**: all items in this array must be unique. Duplicates are not allowed.

## overrides




`overrides`

-   is optional
-   Type: `object` ([Details](keel-defs-applicationloadbalancerspec-properties-overrides.md))
-   cannot be null
-   defined in: [DeliveryConfig](keel-defs-applicationloadbalancerspec-properties-overrides.md "https&#x3A;//keel-prestaging.us-west-2.spinnaker.mgmt.netflix.net/schema/#/$defs/ApplicationLoadBalancerSpec/properties/overrides")

### overrides Type

`object` ([Details](keel-defs-applicationloadbalancerspec-properties-overrides.md))
