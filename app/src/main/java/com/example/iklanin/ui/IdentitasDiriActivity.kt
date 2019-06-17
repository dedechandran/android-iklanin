package com.example.iklanin.ui

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import com.example.iklanin.R

class IdentitasDiriActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_identitas_diri)
        supportActionBar?.setHomeAsUpIndicator(R.drawable.ic_close)
        supportActionBar?.title = "Identitas Diri"

        val btnLanjutkan = findViewById<Button>(R.id.btn_lanjutkan_identitas_diri)
        btnLanjutkan.setOnClickListener {
            val intent = Intent(this, IdentitasUsahaActivity::class.java)
            startActivity(intent)
        }
    }
}
