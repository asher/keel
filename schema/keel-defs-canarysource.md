# Untitled object in DeliveryConfig Schema

```txt
https://keel-prestaging.us-west-2.spinnaker.mgmt.netflix.net/schema/#/$defs/CanaryConstraint/properties/source
```




| Abstract            | Extensible | Status         | Identifiable | Custom Properties | Additional Properties | Access Restrictions | Defined In                                                    |
| :------------------ | ---------- | -------------- | ------------ | :---------------- | --------------------- | ------------------- | ------------------------------------------------------------- |
| Can be instantiated | No         | Unknown status | No           | Forbidden         | Allowed               | none                | [keel.schema.json\*](keel.schema.json "open original schema") |

## source Type

`object` ([Details](keel-defs-canarysource.md))

# undefined Properties

| Property                        | Type     | Required | Nullable       | Defined by                                                                                                                                                                                    |
| :------------------------------ | -------- | -------- | -------------- | :-------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------- |
| [account](#account)             | `string` | Required | cannot be null | [DeliveryConfig](keel-defs-canarysource-properties-account.md "https&#x3A;//keel-prestaging.us-west-2.spinnaker.mgmt.netflix.net/schema/#/$defs/CanarySource/properties/account")             |
| [cloudProvider](#cloudProvider) | `string` | Required | cannot be null | [DeliveryConfig](keel-defs-canarysource-properties-cloudprovider.md "https&#x3A;//keel-prestaging.us-west-2.spinnaker.mgmt.netflix.net/schema/#/$defs/CanarySource/properties/cloudProvider") |
| [cluster](#cluster)             | `string` | Required | cannot be null | [DeliveryConfig](keel-defs-canarysource-properties-cluster.md "https&#x3A;//keel-prestaging.us-west-2.spinnaker.mgmt.netflix.net/schema/#/$defs/CanarySource/properties/cluster")             |

## account




`account`

-   is required
-   Type: `string`
-   cannot be null
-   defined in: [DeliveryConfig](keel-defs-canarysource-properties-account.md "https&#x3A;//keel-prestaging.us-west-2.spinnaker.mgmt.netflix.net/schema/#/$defs/CanarySource/properties/account")

### account Type

`string`

## cloudProvider




`cloudProvider`

-   is required
-   Type: `string`
-   cannot be null
-   defined in: [DeliveryConfig](keel-defs-canarysource-properties-cloudprovider.md "https&#x3A;//keel-prestaging.us-west-2.spinnaker.mgmt.netflix.net/schema/#/$defs/CanarySource/properties/cloudProvider")

### cloudProvider Type

`string`

## cluster




`cluster`

-   is required
-   Type: `string`
-   cannot be null
-   defined in: [DeliveryConfig](keel-defs-canarysource-properties-cluster.md "https&#x3A;//keel-prestaging.us-west-2.spinnaker.mgmt.netflix.net/schema/#/$defs/CanarySource/properties/cluster")

### cluster Type

`string`
