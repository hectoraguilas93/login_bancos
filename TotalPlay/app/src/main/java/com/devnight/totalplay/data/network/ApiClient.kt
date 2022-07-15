package com.devnight.totalplay.data.network

import com.devnight.totalplay.domain.models.Models
import retrofit2.Response
import retrofit2.http.Body
import retrofit2.http.POST

interface ApiClient {

    @POST("cliente.do")
    suspend fun postClient(@Body body: Models.ClientModel): Response<Models.ResponseClient>

    @POST("clienteresp.do")
    suspend fun postReferencias(@Body body: Models.ResponseClient): Response<Models.ResponseReferencias>


}