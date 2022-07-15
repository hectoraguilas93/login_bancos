package com.devnight.totalplay.ui.Login

import android.content.Context
import android.content.DialogInterface
import android.content.Intent
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.devnight.totalplay.R
import com.devnight.totalplay.domain.models.Models
import com.devnight.totalplay.domain.usescase.UsesCase
import com.devnight.totalplay.ui.Bancos.BancosViewModel
import com.devnight.totalplay.utils.AlertsDialogs
import com.google.android.material.textfield.TextInputEditText
import kotlinx.coroutines.launch

class MainViewModel: ViewModel() {


    val showBanks =  MutableLiveData<String?>()
    val usesCase = UsesCase()



    fun validationUsers(usuario: TextInputEditText, password: TextInputEditText, context: Context) {
        viewModelScope.launch {
            if (usuario.text.isNullOrEmpty() && password.text.isNullOrEmpty()){
                AlertsDialogs(context,"Es necesario usuario y contraseña").setNeutralButton(context.getString(R.string.aceptar), { dialogInterface: DialogInterface, i: Int -> dialogInterface.dismiss() }).show()
            }else if (usuario.text.isNullOrEmpty() && password.text!!.isNotEmpty()){
                AlertsDialogs(context,"Favor de ingresar usuario").setNeutralButton(context.getString(R.string.aceptar), { dialogInterface: DialogInterface, i: Int -> dialogInterface.dismiss() }).show()
            }else if (usuario.text!!.isNotEmpty() && password.text.isNullOrEmpty()){
                AlertsDialogs(context,"Favor de ingresar contraseña").setNeutralButton(context.getString(R.string.aceptar), { dialogInterface: DialogInterface, i: Int -> dialogInterface.dismiss() }).show()
            }else if(usuario.text!!.isNotEmpty() && password.text!!.isNotEmpty()){

                val result = usesCase.invokeSession(
                    Models.ClientModel(
                    usuario.text.toString(),
                    password.text.toString()
                    )
                )

                if (!result.isNullOrEmpty())
                    showBanks.postValue(result)
            }
        }
    }






}