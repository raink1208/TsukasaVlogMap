package domain.location

import de.huxhorn.sulky.ulid.ULID
import domain.source.TravelSource

data class VisitedRoute (
    override val locationId: ULID,
    override val locationName: String,
    override val type: LocationType,
    override val source: TravelSource,
    override val place: Coordinate,
    val origin: Coordinate,
    val destination: Coordinate
): VisitedLocation