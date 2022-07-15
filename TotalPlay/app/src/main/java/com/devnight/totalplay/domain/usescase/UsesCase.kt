package com.devnight.totalplay.domain.usescase

import com.devnight.totalplay.data.repository.Repository
import com.devnight.totalplay.domain.models.Models

class UsesCase {


    private val respo = Repository()

    suspend fun invokeSession(clientModel: Models.ClientModel): String? = respo.getSession(clientModel)

    suspend  fun invokeListBanks(session: Models.ResponseClient): List<Models.ModelReferencias>? = respo.getListBanks(session)

}