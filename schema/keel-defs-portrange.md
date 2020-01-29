# Untitled object in DeliveryConfig Schema

```txt
https://keel-prestaging.us-west-2.spinnaker.mgmt.netflix.net/schema/#/$defs/SelfReferenceRule/properties/portRange
```




| Abstract            | Extensible | Status         | Identifiable | Custom Properties | Additional Properties | Access Restrictions | Defined In                                                    |
| :------------------ | ---------- | -------------- | ------------ | :---------------- | --------------------- | ------------------- | ------------------------------------------------------------- |
| Can be instantiated | No         | Unknown status | No           | Forbidden         | Allowed               | none                | [keel.schema.json\*](keel.schema.json "open original schema") |

## portRange Type

`object` ([Details](keel-defs-portrange.md))

# undefined Properties

| Property                | Type     | Required | Nullable       | Defined by                                                                                                                                                                      |
| :---------------------- | -------- | -------- | -------------- | :------------------------------------------------------------------------------------------------------------------------------------------------------------------------------ |
| [startPort](#startPort) | `number` | Required | cannot be null | [DeliveryConfig](keel-defs-portrange-properties-startport.md "https&#x3A;//keel-prestaging.us-west-2.spinnaker.mgmt.netflix.net/schema/#/$defs/PortRange/properties/startPort") |
| [endPort](#endPort)     | `number` | Required | cannot be null | [DeliveryConfig](keel-defs-portrange-properties-endport.md "https&#x3A;//keel-prestaging.us-west-2.spinnaker.mgmt.netflix.net/schema/#/$defs/PortRange/properties/endPort")     |

## startPort




`startPort`

-   is required
-   Type: `number`
-   cannot be null
-   defined in: [DeliveryConfig](keel-defs-portrange-properties-startport.md "https&#x3A;//keel-prestaging.us-west-2.spinnaker.mgmt.netflix.net/schema/#/$defs/PortRange/properties/startPort")

### startPort Type

`number`

## endPort




`endPort`

-   is required
-   Type: `number`
-   cannot be null
-   defined in: [DeliveryConfig](keel-defs-portrange-properties-endport.md "https&#x3A;//keel-prestaging.us-west-2.spinnaker.mgmt.netflix.net/schema/#/$defs/PortRange/properties/endPort")

### endPort Type

`number`
