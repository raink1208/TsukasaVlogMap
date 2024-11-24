package net.tsukasakingdom.vlogmapapi.domain.repository

import de.huxhorn.sulky.ulid.ULID
import net.tsukasakingdom.vlogmapapi.domain.model.travel.TravelSource

interface ITravelSourceRepository {
    fun getAll(): List<TravelSource>
    fun findById(sourceId: ULID): TravelSource?
    fun save(source: TravelSource)
}