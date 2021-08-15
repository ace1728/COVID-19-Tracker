package com.kc.covid19tracker

import okhttp3.OkHttpClient
import okhttp3.Request

object Client {
    private val okHttpClient = OkHttpClient();
    // tells whjich info we want /want to search
    private val request=Request.Builder()
        .url("https://data.covid19india.org/data.json")
        .build()
    //fetching the info
    val api= okHttpClient.newCall(request)
}