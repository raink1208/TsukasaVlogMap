package net.tsukasakingdom.vlogmapapi.domain.model.location

import de.huxhorn.sulky.ulid.ULID
import net.tsukasakingdom.vlogmapapi.domain.model.travel.TravelSource

data class VisitedRoute(
    val locationId: ULID,
    val name: String,
    val address: String,
    val type: LocationType,
    val place: Coordinate,
    val source: TravelSource
)