package com.example.iklanin.ui

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import com.example.iklanin.R


class RegistrationActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_registration)
        supportActionBar?.setDisplayHomeAsUpEnabled(true)
        supportActionBar?.title = "Pendaftaran"

        val btnRegisterPengiklan = findViewById<Button>(R.id.btn_register_as_pengiklan)
        btnRegisterPengiklan.setOnClickListener {
            val intent = Intent(this, IdentitasDiriActivity::class.java)
            startActivity(intent)
        }

        val btnRegisterPenerbit = findViewById<Button>(R.id.btn_register_as_penerbit)
        btnRegisterPenerbit.setOnClickListener {
            val intent = Intent(this, PublisherIdentitasDiriActivity::class.java)
            startActivity(intent)
        }




    }
}
