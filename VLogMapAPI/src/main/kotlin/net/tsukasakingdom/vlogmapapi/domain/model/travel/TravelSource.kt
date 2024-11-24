package net.tsukasakingdom.vlogmapapi.domain.model.travel

import de.huxhorn.sulky.ulid.ULID

class TravelSource (
    val sourceId: ULID,
    val type: SourceType,
    val title: String,
    val url: String,
)