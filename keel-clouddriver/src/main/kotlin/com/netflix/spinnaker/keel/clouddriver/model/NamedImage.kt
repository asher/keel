package com.netflix.spinnaker.keel.clouddriver.model

import java.time.Instant
import java.time.Period

data class NamedImage(
  val imageName: String,
  val attributes: Map<String, Any?>,
  val tagsByImageId: Map<String, Map<String, String?>?>,
  val accounts: Set<String>,
  val amis: Map<String, List<String>?>
)

object NamedImageComparator : Comparator<NamedImage> {
  override fun compare(a: NamedImage, b: NamedImage): Int =
    a.creationDate.compareTo(b.creationDate)
}

val NamedImage.creationDate: Instant
  get() =
    if (attributes["creationDate"] !is String) {
      // if no creation date, we will assume it is very old.
      // falling back to 3 years prior if creationDate is nil to support legacy resources
      Instant.now().minus(Period.ofYears(3))
    } else {
      attributes["creationDate"].toString().let(Instant::parse)
    }

val NamedImage.appVersion: String
  get() = tagsByImageId
    .values
    .first()
    ?.getValue("appversion")
    .toString()
    .substringBefore("/")
