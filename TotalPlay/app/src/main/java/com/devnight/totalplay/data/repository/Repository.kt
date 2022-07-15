package com.devnight.totalplay.data.repository

import com.devnight.totalplay.data.network.ApiService
import com.devnight.totalplay.domain.models.Models

class Repository {

    private val api = ApiService()


    suspend fun getSession(clientModel: Models.ClientModel): String  = api.getSession(clientModel).session
    suspend fun getListBanks(responseClient: Models.ResponseClient): List<Models.ModelReferencias> = api.getAllBanks(responseClient).referencias






}