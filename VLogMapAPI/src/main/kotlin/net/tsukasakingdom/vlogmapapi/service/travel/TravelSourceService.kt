package net.tsukasakingdom.vlogmapapi.service.travel

import net.tsukasakingdom.vlogmapapi.domain.model.travel.TravelSource
import net.tsukasakingdom.vlogmapapi.domain.repository.ITravelSourceRepository
import org.springframework.stereotype.Service

@Service
class TravelSourceService(
    private val travelSourceRepository: ITravelSourceRepository
): ITravelSourceService {
    override fun getAllTravelSources(): List<TravelSource> {
        return travelSourceRepository.getAll()
    }

    override fun registerTravelSource(travelSource: TravelSource) {
        TODO("Not yet implemented")
    }
}