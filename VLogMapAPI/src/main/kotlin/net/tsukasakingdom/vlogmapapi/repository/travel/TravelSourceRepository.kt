package net.tsukasakingdom.vlogmapapi.repository.travel

import de.huxhorn.sulky.ulid.ULID
import net.tsukasakingdom.vlogmapapi.domain.model.travel.TravelSource
import net.tsukasakingdom.vlogmapapi.domain.repository.ITravelSourceRepository
import org.springframework.stereotype.Repository

@Repository
class TravelSourceRepository: ITravelSourceRepository {
    override fun getAll(): List<TravelSource> {
        TODO("Not yet implemented")
    }

    override fun findById(sourceId: ULID): TravelSource? {
        TODO("Not yet implemented")
    }

    override fun save(source: TravelSource) {
        TODO("Not yet implemented")
    }
}