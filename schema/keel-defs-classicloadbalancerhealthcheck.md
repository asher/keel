# Untitled object in DeliveryConfig Schema

```txt
https://keel-prestaging.us-west-2.spinnaker.mgmt.netflix.net/schema/#/$defs/ClassicLoadBalancerSpec/properties/healthCheck
```




| Abstract            | Extensible | Status         | Identifiable | Custom Properties | Additional Properties | Access Restrictions | Defined In                                                    |
| :------------------ | ---------- | -------------- | ------------ | :---------------- | --------------------- | ------------------- | ------------------------------------------------------------- |
| Can be instantiated | No         | Unknown status | No           | Forbidden         | Allowed               | none                | [keel.schema.json\*](keel.schema.json "open original schema") |

## healthCheck Type

`object` ([Details](keel-defs-classicloadbalancerhealthcheck.md))

# undefined Properties

| Property                                  | Type     | Required | Nullable       | Defined by                                                                                                                                                                                                                                  |
| :---------------------------------------- | -------- | -------- | -------------- | :------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------ |
| [target](#target)                         | `string` | Required | cannot be null | [DeliveryConfig](keel-defs-classicloadbalancerhealthcheck-properties-target.md "https&#x3A;//keel-prestaging.us-west-2.spinnaker.mgmt.netflix.net/schema/#/$defs/ClassicLoadBalancerHealthCheck/properties/target")                         |
| [interval](#interval)                     | `string` | Optional | cannot be null | [DeliveryConfig](keel-defs-classicloadbalancerhealthcheck-properties-interval.md "https&#x3A;//keel-prestaging.us-west-2.spinnaker.mgmt.netflix.net/schema/#/$defs/ClassicLoadBalancerHealthCheck/properties/interval")                     |
| [healthyThreshold](#healthyThreshold)     | `number` | Optional | cannot be null | [DeliveryConfig](keel-defs-classicloadbalancerhealthcheck-properties-healthythreshold.md "https&#x3A;//keel-prestaging.us-west-2.spinnaker.mgmt.netflix.net/schema/#/$defs/ClassicLoadBalancerHealthCheck/properties/healthyThreshold")     |
| [unhealthyThreshold](#unhealthyThreshold) | `number` | Optional | cannot be null | [DeliveryConfig](keel-defs-classicloadbalancerhealthcheck-properties-unhealthythreshold.md "https&#x3A;//keel-prestaging.us-west-2.spinnaker.mgmt.netflix.net/schema/#/$defs/ClassicLoadBalancerHealthCheck/properties/unhealthyThreshold") |
| [timeout](#timeout)                       | `string` | Optional | cannot be null | [DeliveryConfig](keel-defs-classicloadbalancerhealthcheck-properties-timeout.md "https&#x3A;//keel-prestaging.us-west-2.spinnaker.mgmt.netflix.net/schema/#/$defs/ClassicLoadBalancerHealthCheck/properties/timeout")                       |

## target




`target`

-   is required
-   Type: `string`
-   cannot be null
-   defined in: [DeliveryConfig](keel-defs-classicloadbalancerhealthcheck-properties-target.md "https&#x3A;//keel-prestaging.us-west-2.spinnaker.mgmt.netflix.net/schema/#/$defs/ClassicLoadBalancerHealthCheck/properties/target")

### target Type

`string`

## interval




`interval`

-   is optional
-   Type: `string`
-   cannot be null
-   defined in: [DeliveryConfig](keel-defs-classicloadbalancerhealthcheck-properties-interval.md "https&#x3A;//keel-prestaging.us-west-2.spinnaker.mgmt.netflix.net/schema/#/$defs/ClassicLoadBalancerHealthCheck/properties/interval")

### interval Type

`string`

### interval Constraints

**duration**: the string must be a duration string, according to [RFC 3339, section 5.6](https://tools.ietf.org/html/rfc3339 "check the specification")

## healthyThreshold




`healthyThreshold`

-   is optional
-   Type: `number`
-   cannot be null
-   defined in: [DeliveryConfig](keel-defs-classicloadbalancerhealthcheck-properties-healthythreshold.md "https&#x3A;//keel-prestaging.us-west-2.spinnaker.mgmt.netflix.net/schema/#/$defs/ClassicLoadBalancerHealthCheck/properties/healthyThreshold")

### healthyThreshold Type

`number`

## unhealthyThreshold




`unhealthyThreshold`

-   is optional
-   Type: `number`
-   cannot be null
-   defined in: [DeliveryConfig](keel-defs-classicloadbalancerhealthcheck-properties-unhealthythreshold.md "https&#x3A;//keel-prestaging.us-west-2.spinnaker.mgmt.netflix.net/schema/#/$defs/ClassicLoadBalancerHealthCheck/properties/unhealthyThreshold")

### unhealthyThreshold Type

`number`

## timeout




`timeout`

-   is optional
-   Type: `string`
-   cannot be null
-   defined in: [DeliveryConfig](keel-defs-classicloadbalancerhealthcheck-properties-timeout.md "https&#x3A;//keel-prestaging.us-west-2.spinnaker.mgmt.netflix.net/schema/#/$defs/ClassicLoadBalancerHealthCheck/properties/timeout")

### timeout Type

`string`

### timeout Constraints

**duration**: the string must be a duration string, according to [RFC 3339, section 5.6](https://tools.ietf.org/html/rfc3339 "check the specification")
