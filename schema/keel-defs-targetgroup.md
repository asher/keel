# Untitled object in DeliveryConfig Schema

```txt
https://keel-prestaging.us-west-2.spinnaker.mgmt.netflix.net/schema/#/$defs/TargetGroup
```




| Abstract            | Extensible | Status         | Identifiable | Custom Properties | Additional Properties | Access Restrictions | Defined In                                                    |
| :------------------ | ---------- | -------------- | ------------ | :---------------- | --------------------- | ------------------- | ------------------------------------------------------------- |
| Can be instantiated | No         | Unknown status | No           | Forbidden         | Allowed               | none                | [keel.schema.json\*](keel.schema.json "open original schema") |

## TargetGroup Type

`object` ([Details](keel-defs-targetgroup.md))

# undefined Properties

| Property                                                  | Type      | Required | Nullable       | Defined by                                                                                                                                                                                                            |
| :-------------------------------------------------------- | --------- | -------- | -------------- | :-------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------- |
| [name](#name)                                             | `string`  | Required | cannot be null | [DeliveryConfig](keel-defs-targetgroup-properties-name.md "https&#x3A;//keel-prestaging.us-west-2.spinnaker.mgmt.netflix.net/schema/#/$defs/TargetGroup/properties/name")                                             |
| [targetType](#targetType)                                 | `string`  | Optional | cannot be null | [DeliveryConfig](keel-defs-targetgroup-properties-targettype.md "https&#x3A;//keel-prestaging.us-west-2.spinnaker.mgmt.netflix.net/schema/#/$defs/TargetGroup/properties/targetType")                                 |
| [protocol](#protocol)                                     | `string`  | Optional | cannot be null | [DeliveryConfig](keel-defs-targetgroup-properties-protocol.md "https&#x3A;//keel-prestaging.us-west-2.spinnaker.mgmt.netflix.net/schema/#/$defs/TargetGroup/properties/protocol")                                     |
| [port](#port)                                             | `number`  | Required | cannot be null | [DeliveryConfig](keel-defs-targetgroup-properties-port.md "https&#x3A;//keel-prestaging.us-west-2.spinnaker.mgmt.netflix.net/schema/#/$defs/TargetGroup/properties/port")                                             |
| [healthCheckEnabled](#healthCheckEnabled)                 | `boolean` | Optional | cannot be null | [DeliveryConfig](keel-defs-targetgroup-properties-healthcheckenabled.md "https&#x3A;//keel-prestaging.us-west-2.spinnaker.mgmt.netflix.net/schema/#/$defs/TargetGroup/properties/healthCheckEnabled")                 |
| [healthCheckTimeoutSeconds](#healthCheckTimeoutSeconds)   | `string`  | Optional | cannot be null | [DeliveryConfig](keel-defs-targetgroup-properties-healthchecktimeoutseconds.md "https&#x3A;//keel-prestaging.us-west-2.spinnaker.mgmt.netflix.net/schema/#/$defs/TargetGroup/properties/healthCheckTimeoutSeconds")   |
| [healthCheckPort](#healthCheckPort)                       | `number`  | Optional | cannot be null | [DeliveryConfig](keel-defs-targetgroup-properties-healthcheckport.md "https&#x3A;//keel-prestaging.us-west-2.spinnaker.mgmt.netflix.net/schema/#/$defs/TargetGroup/properties/healthCheckPort")                       |
| [healthCheckProtocol](#healthCheckProtocol)               | `string`  | Optional | cannot be null | [DeliveryConfig](keel-defs-targetgroup-properties-healthcheckprotocol.md "https&#x3A;//keel-prestaging.us-west-2.spinnaker.mgmt.netflix.net/schema/#/$defs/TargetGroup/properties/healthCheckProtocol")               |
| [healthCheckHttpCode](#healthCheckHttpCode)               | `string`  | Optional | cannot be null | [DeliveryConfig](keel-defs-targetgroup-properties-healthcheckhttpcode.md "https&#x3A;//keel-prestaging.us-west-2.spinnaker.mgmt.netflix.net/schema/#/$defs/TargetGroup/properties/healthCheckHttpCode")               |
| [healthCheckPath](#healthCheckPath)                       | `string`  | Optional | cannot be null | [DeliveryConfig](keel-defs-targetgroup-properties-healthcheckpath.md "https&#x3A;//keel-prestaging.us-west-2.spinnaker.mgmt.netflix.net/schema/#/$defs/TargetGroup/properties/healthCheckPath")                       |
| [healthCheckIntervalSeconds](#healthCheckIntervalSeconds) | `string`  | Optional | cannot be null | [DeliveryConfig](keel-defs-targetgroup-properties-healthcheckintervalseconds.md "https&#x3A;//keel-prestaging.us-west-2.spinnaker.mgmt.netflix.net/schema/#/$defs/TargetGroup/properties/healthCheckIntervalSeconds") |
| [healthyThresholdCount](#healthyThresholdCount)           | `number`  | Optional | cannot be null | [DeliveryConfig](keel-defs-targetgroup-properties-healthythresholdcount.md "https&#x3A;//keel-prestaging.us-west-2.spinnaker.mgmt.netflix.net/schema/#/$defs/TargetGroup/properties/healthyThresholdCount")           |
| [unhealthyThresholdCount](#unhealthyThresholdCount)       | `number`  | Optional | cannot be null | [DeliveryConfig](keel-defs-targetgroup-properties-unhealthythresholdcount.md "https&#x3A;//keel-prestaging.us-west-2.spinnaker.mgmt.netflix.net/schema/#/$defs/TargetGroup/properties/unhealthyThresholdCount")       |
| [attributes](#attributes)                                 | `object`  | Optional | cannot be null | [DeliveryConfig](keel-defs-targetgroupattributes.md "https&#x3A;//keel-prestaging.us-west-2.spinnaker.mgmt.netflix.net/schema/#/$defs/TargetGroup/properties/attributes")                                             |

## name




`name`

-   is required
-   Type: `string`
-   cannot be null
-   defined in: [DeliveryConfig](keel-defs-targetgroup-properties-name.md "https&#x3A;//keel-prestaging.us-west-2.spinnaker.mgmt.netflix.net/schema/#/$defs/TargetGroup/properties/name")

### name Type

`string`

## targetType




`targetType`

-   is optional
-   Type: `string`
-   cannot be null
-   defined in: [DeliveryConfig](keel-defs-targetgroup-properties-targettype.md "https&#x3A;//keel-prestaging.us-west-2.spinnaker.mgmt.netflix.net/schema/#/$defs/TargetGroup/properties/targetType")

### targetType Type

`string`

## protocol




`protocol`

-   is optional
-   Type: `string`
-   cannot be null
-   defined in: [DeliveryConfig](keel-defs-targetgroup-properties-protocol.md "https&#x3A;//keel-prestaging.us-west-2.spinnaker.mgmt.netflix.net/schema/#/$defs/TargetGroup/properties/protocol")

### protocol Type

`string`

## port




`port`

-   is required
-   Type: `number`
-   cannot be null
-   defined in: [DeliveryConfig](keel-defs-targetgroup-properties-port.md "https&#x3A;//keel-prestaging.us-west-2.spinnaker.mgmt.netflix.net/schema/#/$defs/TargetGroup/properties/port")

### port Type

`number`

## healthCheckEnabled




`healthCheckEnabled`

-   is optional
-   Type: `boolean`
-   cannot be null
-   defined in: [DeliveryConfig](keel-defs-targetgroup-properties-healthcheckenabled.md "https&#x3A;//keel-prestaging.us-west-2.spinnaker.mgmt.netflix.net/schema/#/$defs/TargetGroup/properties/healthCheckEnabled")

### healthCheckEnabled Type

`boolean`

## healthCheckTimeoutSeconds




`healthCheckTimeoutSeconds`

-   is optional
-   Type: `string`
-   cannot be null
-   defined in: [DeliveryConfig](keel-defs-targetgroup-properties-healthchecktimeoutseconds.md "https&#x3A;//keel-prestaging.us-west-2.spinnaker.mgmt.netflix.net/schema/#/$defs/TargetGroup/properties/healthCheckTimeoutSeconds")

### healthCheckTimeoutSeconds Type

`string`

### healthCheckTimeoutSeconds Constraints

**duration**: the string must be a duration string, according to [RFC 3339, section 5.6](https://tools.ietf.org/html/rfc3339 "check the specification")

## healthCheckPort




`healthCheckPort`

-   is optional
-   Type: `number`
-   cannot be null
-   defined in: [DeliveryConfig](keel-defs-targetgroup-properties-healthcheckport.md "https&#x3A;//keel-prestaging.us-west-2.spinnaker.mgmt.netflix.net/schema/#/$defs/TargetGroup/properties/healthCheckPort")

### healthCheckPort Type

`number`

## healthCheckProtocol




`healthCheckProtocol`

-   is optional
-   Type: `string`
-   cannot be null
-   defined in: [DeliveryConfig](keel-defs-targetgroup-properties-healthcheckprotocol.md "https&#x3A;//keel-prestaging.us-west-2.spinnaker.mgmt.netflix.net/schema/#/$defs/TargetGroup/properties/healthCheckProtocol")

### healthCheckProtocol Type

`string`

## healthCheckHttpCode




`healthCheckHttpCode`

-   is optional
-   Type: `string`
-   cannot be null
-   defined in: [DeliveryConfig](keel-defs-targetgroup-properties-healthcheckhttpcode.md "https&#x3A;//keel-prestaging.us-west-2.spinnaker.mgmt.netflix.net/schema/#/$defs/TargetGroup/properties/healthCheckHttpCode")

### healthCheckHttpCode Type

`string`

## healthCheckPath




`healthCheckPath`

-   is optional
-   Type: `string`
-   cannot be null
-   defined in: [DeliveryConfig](keel-defs-targetgroup-properties-healthcheckpath.md "https&#x3A;//keel-prestaging.us-west-2.spinnaker.mgmt.netflix.net/schema/#/$defs/TargetGroup/properties/healthCheckPath")

### healthCheckPath Type

`string`

## healthCheckIntervalSeconds




`healthCheckIntervalSeconds`

-   is optional
-   Type: `string`
-   cannot be null
-   defined in: [DeliveryConfig](keel-defs-targetgroup-properties-healthcheckintervalseconds.md "https&#x3A;//keel-prestaging.us-west-2.spinnaker.mgmt.netflix.net/schema/#/$defs/TargetGroup/properties/healthCheckIntervalSeconds")

### healthCheckIntervalSeconds Type

`string`

### healthCheckIntervalSeconds Constraints

**duration**: the string must be a duration string, according to [RFC 3339, section 5.6](https://tools.ietf.org/html/rfc3339 "check the specification")

## healthyThresholdCount




`healthyThresholdCount`

-   is optional
-   Type: `number`
-   cannot be null
-   defined in: [DeliveryConfig](keel-defs-targetgroup-properties-healthythresholdcount.md "https&#x3A;//keel-prestaging.us-west-2.spinnaker.mgmt.netflix.net/schema/#/$defs/TargetGroup/properties/healthyThresholdCount")

### healthyThresholdCount Type

`number`

## unhealthyThresholdCount




`unhealthyThresholdCount`

-   is optional
-   Type: `number`
-   cannot be null
-   defined in: [DeliveryConfig](keel-defs-targetgroup-properties-unhealthythresholdcount.md "https&#x3A;//keel-prestaging.us-west-2.spinnaker.mgmt.netflix.net/schema/#/$defs/TargetGroup/properties/unhealthyThresholdCount")

### unhealthyThresholdCount Type

`number`

## attributes




`attributes`

-   is optional
-   Type: `object` ([Details](keel-defs-targetgroupattributes.md))
-   cannot be null
-   defined in: [DeliveryConfig](keel-defs-targetgroupattributes.md "https&#x3A;//keel-prestaging.us-west-2.spinnaker.mgmt.netflix.net/schema/#/$defs/TargetGroup/properties/attributes")

### attributes Type

`object` ([Details](keel-defs-targetgroupattributes.md))
