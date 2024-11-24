package domain.source

import de.huxhorn.sulky.ulid.ULID

class TravelSource (
    val sourceId: ULID,
    val type: SourceType,
    val url: String,
)