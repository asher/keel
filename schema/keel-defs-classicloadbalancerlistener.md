# Untitled object in DeliveryConfig Schema

```txt
https://keel-prestaging.us-west-2.spinnaker.mgmt.netflix.net/schema/#/$defs/ClassicLoadBalancerSpec/properties/listeners/items
```




| Abstract            | Extensible | Status         | Identifiable | Custom Properties | Additional Properties | Access Restrictions | Defined In                                                    |
| :------------------ | ---------- | -------------- | ------------ | :---------------- | --------------------- | ------------------- | ------------------------------------------------------------- |
| Can be instantiated | No         | Unknown status | No           | Forbidden         | Allowed               | none                | [keel.schema.json\*](keel.schema.json "open original schema") |

## items Type

`object` ([Details](keel-defs-classicloadbalancerlistener.md))

# undefined Properties

| Property                              | Type     | Required | Nullable       | Defined by                                                                                                                                                                                                                        |
| :------------------------------------ | -------- | -------- | -------------- | :-------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------- |
| [internalProtocol](#internalProtocol) | `string` | Required | cannot be null | [DeliveryConfig](keel-defs-classicloadbalancerlistener-properties-internalprotocol.md "https&#x3A;//keel-prestaging.us-west-2.spinnaker.mgmt.netflix.net/schema/#/$defs/ClassicLoadBalancerListener/properties/internalProtocol") |
| [internalPort](#internalPort)         | `number` | Required | cannot be null | [DeliveryConfig](keel-defs-classicloadbalancerlistener-properties-internalport.md "https&#x3A;//keel-prestaging.us-west-2.spinnaker.mgmt.netflix.net/schema/#/$defs/ClassicLoadBalancerListener/properties/internalPort")         |
| [externalProtocol](#externalProtocol) | `string` | Required | cannot be null | [DeliveryConfig](keel-defs-classicloadbalancerlistener-properties-externalprotocol.md "https&#x3A;//keel-prestaging.us-west-2.spinnaker.mgmt.netflix.net/schema/#/$defs/ClassicLoadBalancerListener/properties/externalProtocol") |
| [externalPort](#externalPort)         | `number` | Required | cannot be null | [DeliveryConfig](keel-defs-classicloadbalancerlistener-properties-externalport.md "https&#x3A;//keel-prestaging.us-west-2.spinnaker.mgmt.netflix.net/schema/#/$defs/ClassicLoadBalancerListener/properties/externalPort")         |
| [sslCertificateId](#sslCertificateId) | `string` | Optional | cannot be null | [DeliveryConfig](keel-defs-classicloadbalancerlistener-properties-sslcertificateid.md "https&#x3A;//keel-prestaging.us-west-2.spinnaker.mgmt.netflix.net/schema/#/$defs/ClassicLoadBalancerListener/properties/sslCertificateId") |

## internalProtocol




`internalProtocol`

-   is required
-   Type: `string`
-   cannot be null
-   defined in: [DeliveryConfig](keel-defs-classicloadbalancerlistener-properties-internalprotocol.md "https&#x3A;//keel-prestaging.us-west-2.spinnaker.mgmt.netflix.net/schema/#/$defs/ClassicLoadBalancerListener/properties/internalProtocol")

### internalProtocol Type

`string`

## internalPort




`internalPort`

-   is required
-   Type: `number`
-   cannot be null
-   defined in: [DeliveryConfig](keel-defs-classicloadbalancerlistener-properties-internalport.md "https&#x3A;//keel-prestaging.us-west-2.spinnaker.mgmt.netflix.net/schema/#/$defs/ClassicLoadBalancerListener/properties/internalPort")

### internalPort Type

`number`

## externalProtocol




`externalProtocol`

-   is required
-   Type: `string`
-   cannot be null
-   defined in: [DeliveryConfig](keel-defs-classicloadbalancerlistener-properties-externalprotocol.md "https&#x3A;//keel-prestaging.us-west-2.spinnaker.mgmt.netflix.net/schema/#/$defs/ClassicLoadBalancerListener/properties/externalProtocol")

### externalProtocol Type

`string`

## externalPort




`externalPort`

-   is required
-   Type: `number`
-   cannot be null
-   defined in: [DeliveryConfig](keel-defs-classicloadbalancerlistener-properties-externalport.md "https&#x3A;//keel-prestaging.us-west-2.spinnaker.mgmt.netflix.net/schema/#/$defs/ClassicLoadBalancerListener/properties/externalPort")

### externalPort Type

`number`

## sslCertificateId




`sslCertificateId`

-   is optional
-   Type: `string`
-   cannot be null
-   defined in: [DeliveryConfig](keel-defs-classicloadbalancerlistener-properties-sslcertificateid.md "https&#x3A;//keel-prestaging.us-west-2.spinnaker.mgmt.netflix.net/schema/#/$defs/ClassicLoadBalancerListener/properties/sslCertificateId")

### sslCertificateId Type

`string`
