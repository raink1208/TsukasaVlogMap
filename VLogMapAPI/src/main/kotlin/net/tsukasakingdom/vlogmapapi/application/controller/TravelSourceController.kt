package net.tsukasakingdom.vlogmapapi.application.controller

import net.tsukasakingdom.vlogmapapi.application.model.RegisterTravelSourceRequest
import net.tsukasakingdom.vlogmapapi.domain.model.travel.TravelSource
import net.tsukasakingdom.vlogmapapi.service.travel.ITravelSourceService
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.PostMapping
import org.springframework.web.bind.annotation.RequestBody
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RestController

@RestController
@RequestMapping("v1/travels")
class TravelSourceController(
    private val travelSourceService: ITravelSourceService
) {
    @GetMapping("/")
    fun getTravelSourceList(): List<TravelSource> {
        return travelSourceService.getAllTravelSources()
    }

    @PostMapping("/")
    fun registerSource(@RequestBody request: RegisterTravelSourceRequest): TravelSource {
        TODO()
    }
}