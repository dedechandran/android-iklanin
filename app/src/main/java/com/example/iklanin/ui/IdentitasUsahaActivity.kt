package com.example.iklanin.ui

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import com.example.iklanin.R

class IdentitasUsahaActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_identitas_usaha)
        supportActionBar?.setHomeAsUpIndicator(R.drawable.ic_close)
        supportActionBar?.title = "Identitas Usaha"

        val btnLanjutkan = findViewById<Button>(R.id.btn_kirim_usaha)
        btnLanjutkan.setOnClickListener {
            val dialog = ConfirmationDialog()
            dialog.show(supportFragmentManager,"Confirmation Dialog")
        }
    }
}
