package com.example.advancedtask2

import android.app.AlertDialog
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup

fun ViewGroup.myInflator(layout : Int) : View =
    LayoutInflater.from(context).inflate(layout,this,false)

fun View.showAlertDialog(title: String , message : String , positiveButton : String ,negativeButton : String , neutralButton : String){

    val builder = AlertDialog.Builder(context)

    builder.setTitle(title)
    builder.setMessage(message)
    builder.setPositiveButton(positiveButton) {_,_ ->}
    builder.setNegativeButton(negativeButton) {_,_ ->}
    builder.setNeutralButton(neutralButton)   {_,_ ->}

    val dialog: AlertDialog = builder.create()
    dialog.show()


}

