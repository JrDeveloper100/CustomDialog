package com.example.customdialog

import android.app.Dialog
import android.content.Context
import android.graphics.Color
import android.graphics.drawable.ColorDrawable
import android.view.Window
import android.widget.TextView
import androidx.appcompat.app.AlertDialog

object CustomDialog {

    fun show(context: Context, title: String, message: String, backgroundColor: Int = Color.WHITE, onDismiss: () -> Unit) {
        val builder = AlertDialog.Builder(context)
        builder.setTitle(title)
            .setMessage(message)
            .setPositiveButton("Action 1") { _, _ ->
                // Dismiss the dialog and invoke the callback
                onDismiss()
            }
            .setNegativeButton("Action 2"){ _, _ ->
                onDismiss()
            }
            .setCancelable(false)

        val dialog = builder.create()
        dialog.window?.setBackgroundDrawableResource(R.drawable.dialog_bg)
//        dialog.window?.setBackgroundDrawable(ColorDrawable(Color.TRANSPARENT))
      dialog.show()
        dialog.getButton(AlertDialog.BUTTON_NEGATIVE).setTextColor(context.resources.getColor(R.color.red))
        dialog.getButton(AlertDialog.BUTTON_POSITIVE).setTextColor(context.resources.getColor(R.color.red))
    }

    fun alertDialog1(context: Context){
        val dialog = Dialog(context)
        dialog.requestWindowFeature(Window.FEATURE_NO_TITLE)
        dialog.setCancelable(false)
        dialog.setContentView(R.layout.custom_dialog_layout1)
        dialog.window?.setBackgroundDrawableResource(R.drawable.dialog_bg)
        val btnAction1 : TextView = dialog.findViewById(R.id.btnAction1)
        val btnAction2 : TextView = dialog.findViewById(R.id.btnAction2)
        btnAction1.setOnClickListener {
            dialog.dismiss()
        }
        btnAction2.setOnClickListener {
            dialog.dismiss()
        }
        dialog.show()
    }

    fun alertDialog2(context: Context){
        val dialog = Dialog(context)
        dialog.requestWindowFeature(Window.FEATURE_NO_TITLE)
        dialog.setCancelable(false)
        dialog.setContentView(R.layout.custom_dialog_layout2)
        dialog.window?.setBackgroundDrawableResource(R.drawable.dialog_bg)
        val btnAction1 : TextView = dialog.findViewById(R.id.btnAction1)
        val btnAction2 : TextView = dialog.findViewById(R.id.btnAction2)
        btnAction1.setOnClickListener {
            dialog.dismiss()
        }
        btnAction2.setOnClickListener {
            dialog.dismiss()
        }
        dialog.show()
    }

    fun alertDialog3(context: Context){
        val dialog = Dialog(context)
        dialog.requestWindowFeature(Window.FEATURE_NO_TITLE)
        dialog.setCancelable(false)
        dialog.setContentView(R.layout.custom_dialog_layout3)
        dialog.window?.setBackgroundDrawableResource(R.drawable.dialog_bg2)
        val btnAction1 : TextView = dialog.findViewById(R.id.btnAction1)
        val btnAction2 : TextView = dialog.findViewById(R.id.btnAction2)
        btnAction1.setOnClickListener {
            dialog.dismiss()
        }
        btnAction2.setOnClickListener {
            dialog.dismiss()
        }
        dialog.show()
    }

    fun alertDialog4(context: Context){
        val dialog = Dialog(context)
        dialog.requestWindowFeature(Window.FEATURE_NO_TITLE)
        dialog.setCancelable(false)
        dialog.setContentView(R.layout.custom_dialog_layout4)
        dialog.window?.setBackgroundDrawableResource(R.drawable.dialog_bg2)
        val btnAction1 : TextView = dialog.findViewById(R.id.btnAction1)
        val btnAction2 : TextView = dialog.findViewById(R.id.btnAction2)
        btnAction1.setOnClickListener {
            dialog.dismiss()
        }
        btnAction2.setOnClickListener {
            dialog.dismiss()
        }
        dialog.show()
    }

    fun alertDialog5(context: Context){
        val dialog = Dialog(context)
        dialog.requestWindowFeature(Window.FEATURE_NO_TITLE)
        dialog.setCancelable(false)
        dialog.setContentView(R.layout.custom_dialog_layout5)
        dialog.window?.setBackgroundDrawableResource(R.drawable.dialog_bg3)
        val btnAction1 : TextView = dialog.findViewById(R.id.btnAction1)
        val btnAction2 : TextView = dialog.findViewById(R.id.btnAction2)
        btnAction1.setOnClickListener {
            dialog.dismiss()
        }
        btnAction2.setOnClickListener {
            dialog.dismiss()
        }
        dialog.show()
    }

    fun alertDialog6(context: Context){
        val dialog = Dialog(context)
        dialog.requestWindowFeature(Window.FEATURE_NO_TITLE)
        dialog.setCancelable(false)
        dialog.setContentView(R.layout.custom_dialog_layout6)
        dialog.window?.setBackgroundDrawableResource(R.drawable.dialog_bg3)
        val btnAction1 : TextView = dialog.findViewById(R.id.btnAction1)
        val btnAction2 : TextView = dialog.findViewById(R.id.btnAction2)
        btnAction1.setOnClickListener {
            dialog.dismiss()
        }
        btnAction2.setOnClickListener {
            dialog.dismiss()
        }
        dialog.show()
    }

}