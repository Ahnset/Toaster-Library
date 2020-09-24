package com.icgen.toasterlibrary

import android.content.Context
import android.widget.Toast

class ToasterMessage {

    fun s(context: Context, msg:String) {
        Toast.makeText(context, msg, Toast.LENGTH_LONG).show()
    }
}