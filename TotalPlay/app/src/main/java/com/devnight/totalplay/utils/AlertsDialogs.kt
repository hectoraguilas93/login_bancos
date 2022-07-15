package com.devnight.totalplay.utils

import android.app.Dialog
import android.content.Context
import android.content.DialogInterface
import android.graphics.Color
import android.graphics.drawable.ColorDrawable
import android.os.Bundle
import android.view.View
import android.view.Window.FEATURE_NO_TITLE
import android.widget.Button
import androidx.appcompat.app.AlertDialog

class AlertsDialogs(context: Context, texto: String): AlertDialog.Builder(context) {



    init {
        setCancelable(false)
        setMessage(texto)
    }


    override fun setNeutralButton(
        text: CharSequence?,
        listener: DialogInterface.OnClickListener?
    ): AlertDialog.Builder {
        return super.setNeutralButton(text, listener)
    }

    override fun setNegativeButton(
        text: CharSequence?,
        listener: DialogInterface.OnClickListener?
    ): AlertDialog.Builder {
        return super.setNegativeButton(text, listener)
    }

    override fun setPositiveButton(
        text: CharSequence?,
        listener: DialogInterface.OnClickListener?
    ): AlertDialog.Builder {
        return super.setPositiveButton(text, listener)
    }






}