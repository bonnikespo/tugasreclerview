package com.example.modu3_21411035

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_halamantugas.*

class halamantugas : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_halamantugas)

bttugas4.setOnClickListener {
    val intent = Intent(this, halamanutama::class.java)
    startActivity(intent)
}
        bttugas5.setOnClickListener{
            val intent = Intent(this,halamantgs5::class.java)
            startActivity(intent)
        }
    }
}