package net.tsukasakingdom.vlogmap

import com.charleskorn.kaml.Yaml
import kotlinx.serialization.decodeFromString
import java.nio.file.Files
import java.nio.file.Paths

fun main() {
    val resourcePath = ClassLoader.getSystemResource("apiKey.yml").toURI()
    val ymlContent = Files.readString(Paths.get(resourcePath))

    val keySetting = Yaml.default.decodeFromString<KeySetting>(ymlContent)

    val apiKey = keySetting.key

    val apiClient = GoogleMapAPIClient(apiKey)

    val response = apiClient.getPlaceByAddress("CAFE HUDSON 新宿ミロード店")
    println(response)


}