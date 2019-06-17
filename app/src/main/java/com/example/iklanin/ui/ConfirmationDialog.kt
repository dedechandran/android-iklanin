package com.example.iklanin.ui

import android.app.Dialog
import android.content.Intent
import android.os.Bundle
import android.widget.Toast
import androidx.appcompat.app.AlertDialog
import androidx.fragment.app.DialogFragment
import com.example.iklanin.R

class ConfirmationDialog : DialogFragment() {
    override fun onCreateDialog(savedInstanceState: Bundle?): Dialog {
        return activity?.let {
            // Use the Builder class for convenient dialog construction
            val builder = AlertDialog.Builder(it)
            builder.setMessage(R.string.dialog_confirmation_message)
                .setPositiveButton(
                    R.string.yes
                ) { _, _ ->
                    activity?.finish()
                    val intent = Intent(activity, LoginActivity::class.java)
                    activity?.startActivity(intent)
                    Toast.makeText(activity,"Pendaftaran Berhasil, Silahkan Check Email Anda",Toast.LENGTH_LONG).show()
                }
                .setNegativeButton(
                    R.string.no
                ) { dialog, _ ->
                    dialog.cancel()
                }
            // Create the AlertDialog object and return it
            builder.create()
        } ?: throw IllegalStateException("Activity cannot be null")
    }
}