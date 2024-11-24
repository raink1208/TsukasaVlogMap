package net.tsukasakingdom.vlogmapapi.application.model

import net.tsukasakingdom.vlogmapapi.domain.model.travel.SourceType

data class RegisterTravelSourceRequest(val sourceType: SourceType, val sourceUrl: String, val title: String)