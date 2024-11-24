package net.tsukasakingdom.vlogmap

import com.google.gson.Gson
import okhttp3.OkHttpClient
import okhttp3.Request
import java.net.URLEncoder

class GoogleMapAPIClient(private val apiKey: String) {
    private val GEOCODING_API_URL = "https://maps.googleapis.com/maps/api/geocode/json?key=${apiKey}&language=ja"

    private val client = OkHttpClient()
    private val gson = Gson()

    fun getPlaceByAddress(address: String): GeocodingResponse? {
        val encodedAddress = URLEncoder.encode(address, "UTF-8")
        val url = "$GEOCODING_API_URL&address=$encodedAddress"

        val request = Request.Builder().url(url).build()

        client.newCall(request).execute().use { response ->
            if (!response.isSuccessful) {
                println("Error: ${response.code} ${response.message}")
                return null
            }

            val responseBody = response.body?.string()
            if (responseBody == null) {
                println("Response is Empty")
                return null
            }
            println(responseBody)

            val geocodingResponse = gson.fromJson(responseBody, GeocodingResponse::class.java)

            return geocodingResponse
        }
    }
}