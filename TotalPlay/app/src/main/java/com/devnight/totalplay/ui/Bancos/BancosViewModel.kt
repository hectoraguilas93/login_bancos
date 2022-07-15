package com.devnight.totalplay.ui.Bancos

import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.devnight.totalplay.domain.models.Models
import com.devnight.totalplay.domain.usescase.UsesCase
import kotlinx.coroutines.launch

class BancosViewModel:ViewModel() {

    val setList = MutableLiveData<List<Models.ModelReferencias>?>()
    val usesCase = UsesCase()


    fun createRecycler(session: String){
        viewModelScope.launch {
            val result = usesCase.invokeListBanks(
                Models.ResponseClient(session)
            )
            if (!result.isNullOrEmpty())
                setList.postValue(result)
        }
    }






}