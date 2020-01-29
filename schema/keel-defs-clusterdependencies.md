# Untitled object in DeliveryConfig Schema

```txt
https://keel-prestaging.us-west-2.spinnaker.mgmt.netflix.net/schema/#/$defs/TitusClusterSpec/properties/dependencies
```




| Abstract            | Extensible | Status         | Identifiable | Custom Properties | Additional Properties | Access Restrictions | Defined In                                                    |
| :------------------ | ---------- | -------------- | ------------ | :---------------- | --------------------- | ------------------- | ------------------------------------------------------------- |
| Can be instantiated | No         | Unknown status | No           | Forbidden         | Allowed               | none                | [keel.schema.json\*](keel.schema.json "open original schema") |

## dependencies Type

`object` ([Details](keel-defs-clusterdependencies.md))

# undefined Properties

| Property                                  | Type    | Required | Nullable       | Defined by                                                                                                                                                                                                            |
| :---------------------------------------- | ------- | -------- | -------------- | :-------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------- |
| [loadBalancerNames](#loadBalancerNames)   | `array` | Optional | cannot be null | [DeliveryConfig](keel-defs-clusterdependencies-properties-loadbalancernames.md "https&#x3A;//keel-prestaging.us-west-2.spinnaker.mgmt.netflix.net/schema/#/$defs/ClusterDependencies/properties/loadBalancerNames")   |
| [securityGroupNames](#securityGroupNames) | `array` | Optional | cannot be null | [DeliveryConfig](keel-defs-clusterdependencies-properties-securitygroupnames.md "https&#x3A;//keel-prestaging.us-west-2.spinnaker.mgmt.netflix.net/schema/#/$defs/ClusterDependencies/properties/securityGroupNames") |
| [targetGroups](#targetGroups)             | `array` | Optional | cannot be null | [DeliveryConfig](keel-defs-clusterdependencies-properties-targetgroups.md "https&#x3A;//keel-prestaging.us-west-2.spinnaker.mgmt.netflix.net/schema/#/$defs/ClusterDependencies/properties/targetGroups")             |

## loadBalancerNames




`loadBalancerNames`

-   is optional
-   Type: `string[]`
-   cannot be null
-   defined in: [DeliveryConfig](keel-defs-clusterdependencies-properties-loadbalancernames.md "https&#x3A;//keel-prestaging.us-west-2.spinnaker.mgmt.netflix.net/schema/#/$defs/ClusterDependencies/properties/loadBalancerNames")

### loadBalancerNames Type

`string[]`

### loadBalancerNames Constraints

**unique items**: all items in this array must be unique. Duplicates are not allowed.

## securityGroupNames




`securityGroupNames`

-   is optional
-   Type: `string[]`
-   cannot be null
-   defined in: [DeliveryConfig](keel-defs-clusterdependencies-properties-securitygroupnames.md "https&#x3A;//keel-prestaging.us-west-2.spinnaker.mgmt.netflix.net/schema/#/$defs/ClusterDependencies/properties/securityGroupNames")

### securityGroupNames Type

`string[]`

### securityGroupNames Constraints

**unique items**: all items in this array must be unique. Duplicates are not allowed.

## targetGroups




`targetGroups`

-   is optional
-   Type: `string[]`
-   cannot be null
-   defined in: [DeliveryConfig](keel-defs-clusterdependencies-properties-targetgroups.md "https&#x3A;//keel-prestaging.us-west-2.spinnaker.mgmt.netflix.net/schema/#/$defs/ClusterDependencies/properties/targetGroups")

### targetGroups Type

`string[]`

### targetGroups Constraints

**unique items**: all items in this array must be unique. Duplicates are not allowed.
