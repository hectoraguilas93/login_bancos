package com.devnight.totalplay.data.network

import com.devnight.totalplay.core.RetrofitHelper
import com.devnight.totalplay.domain.models.Models
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.withContext
import retrofit2.Response

class ApiService {

    private val retrofit = RetrofitHelper.getRetrofit()

    suspend fun getSession(clientModel: Models.ClientModel): Models.ResponseClient {
        return withContext(Dispatchers.IO){
            retrofit.create(ApiClient::class.java).postClient(clientModel).body()!!
        }
    }


    suspend fun getAllBanks(session: Models.ResponseClient): Models.ResponseReferencias {
        return withContext(Dispatchers.IO){
            retrofit.create(ApiClient::class.java).postReferencias(session).body()!!
        }
    }


}