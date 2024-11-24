package net.tsukasakingdom.vlogmapapi.service.travel

import net.tsukasakingdom.vlogmapapi.domain.model.travel.TravelSource

interface ITravelSourceService {
    fun getAllTravelSources(): List<TravelSource>
    fun registerTravelSource(travelSource: TravelSource)
}