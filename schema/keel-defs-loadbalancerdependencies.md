# Untitled object in DeliveryConfig Schema

```txt
https://keel-prestaging.us-west-2.spinnaker.mgmt.netflix.net/schema/#/$defs/ApplicationLoadBalancerSpec/properties/dependencies
```




| Abstract            | Extensible | Status         | Identifiable | Custom Properties | Additional Properties | Access Restrictions | Defined In                                                    |
| :------------------ | ---------- | -------------- | ------------ | :---------------- | --------------------- | ------------------- | ------------------------------------------------------------- |
| Can be instantiated | No         | Unknown status | No           | Forbidden         | Allowed               | none                | [keel.schema.json\*](keel.schema.json "open original schema") |

## dependencies Type

`object` ([Details](keel-defs-loadbalancerdependencies.md))

# undefined Properties

| Property                                  | Type    | Required | Nullable       | Defined by                                                                                                                                                                                                                      |
| :---------------------------------------- | ------- | -------- | -------------- | :------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------ |
| [securityGroupNames](#securityGroupNames) | `array` | Optional | cannot be null | [DeliveryConfig](keel-defs-loadbalancerdependencies-properties-securitygroupnames.md "https&#x3A;//keel-prestaging.us-west-2.spinnaker.mgmt.netflix.net/schema/#/$defs/LoadBalancerDependencies/properties/securityGroupNames") |

## securityGroupNames




`securityGroupNames`

-   is optional
-   Type: `string[]`
-   cannot be null
-   defined in: [DeliveryConfig](keel-defs-loadbalancerdependencies-properties-securitygroupnames.md "https&#x3A;//keel-prestaging.us-west-2.spinnaker.mgmt.netflix.net/schema/#/$defs/LoadBalancerDependencies/properties/securityGroupNames")

### securityGroupNames Type

`string[]`

### securityGroupNames Constraints

**unique items**: all items in this array must be unique. Duplicates are not allowed.
