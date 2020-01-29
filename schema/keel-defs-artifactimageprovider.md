# Untitled object in DeliveryConfig Schema

```txt
https://keel-prestaging.us-west-2.spinnaker.mgmt.netflix.net/schema/#/$defs/ImageProvider/oneOf/0
```




| Abstract            | Extensible | Status         | Identifiable | Custom Properties | Additional Properties | Access Restrictions | Defined In                                                    |
| :------------------ | ---------- | -------------- | ------------ | :---------------- | --------------------- | ------------------- | ------------------------------------------------------------- |
| Can be instantiated | No         | Unknown status | No           | Forbidden         | Allowed               | none                | [keel.schema.json\*](keel.schema.json "open original schema") |

## 0 Type

`object` ([Details](keel-defs-artifactimageprovider.md))

# undefined Properties

| Property                              | Type    | Required | Nullable       | Defined by                                                                                                                                                                                                            |
| :------------------------------------ | ------- | -------- | -------------- | :-------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------- |
| [deliveryArtifact](#deliveryArtifact) | Merged  | Required | cannot be null | [DeliveryConfig](keel-defs-deliveryartifact.md "https&#x3A;//keel-prestaging.us-west-2.spinnaker.mgmt.netflix.net/schema/#/$defs/ArtifactImageProvider/properties/deliveryArtifact")                                  |
| [artifactStatuses](#artifactStatuses) | `array` | Optional | cannot be null | [DeliveryConfig](keel-defs-artifactimageprovider-properties-artifactstatuses.md "https&#x3A;//keel-prestaging.us-west-2.spinnaker.mgmt.netflix.net/schema/#/$defs/ArtifactImageProvider/properties/artifactStatuses") |

## deliveryArtifact




`deliveryArtifact`

-   is required
-   Type: merged type ([Details](keel-defs-deliveryartifact.md))
-   cannot be null
-   defined in: [DeliveryConfig](keel-defs-deliveryartifact.md "https&#x3A;//keel-prestaging.us-west-2.spinnaker.mgmt.netflix.net/schema/#/$defs/ArtifactImageProvider/properties/deliveryArtifact")

### deliveryArtifact Type

merged type ([Details](keel-defs-deliveryartifact.md))

one (and only one) of

-   [Untitled object in DeliveryConfig](keel-defs-debianartifact.md "check type definition")
-   [Untitled object in DeliveryConfig](keel-defs-dockerartifact.md "check type definition")

## artifactStatuses




`artifactStatuses`

-   is optional
-   Type: unknown\[]
-   cannot be null
-   defined in: [DeliveryConfig](keel-defs-artifactimageprovider-properties-artifactstatuses.md "https&#x3A;//keel-prestaging.us-west-2.spinnaker.mgmt.netflix.net/schema/#/$defs/ArtifactImageProvider/properties/artifactStatuses")

### artifactStatuses Type

unknown\[]
