package com.example.iklanin.ui

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.iklanin.R

class PublisherIdentitasDiriActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_publisher_identitas_diri)
        supportActionBar?.setHomeAsUpIndicator(R.drawable.ic_close)
        supportActionBar?.title = "Identitas Diri"

    }
}
