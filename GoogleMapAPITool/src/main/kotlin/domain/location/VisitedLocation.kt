package domain.location

import de.huxhorn.sulky.ulid.ULID
import domain.source.TravelSource

interface VisitedLocation {
    val locationId: ULID
    val locationName: String
    val type: LocationType
    val source: TravelSource
    val place: Coordinate
}