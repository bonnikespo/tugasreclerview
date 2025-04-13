package com.example.modu3_21411035

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

textRegister.setOnClickListener{
    val intent = Intent(this,RegisterActivity::class.java)
    startActivity(intent)
}
                button.setOnClickListener {
                    val username = editTextTextEmailAddress.text.toString()
                    val password = editTextTextPassword.text.toString()

                    if (username == "admin" && password == "1234") {
                        val intent = Intent(this, halamantugas::class.java)
                        startActivity(intent)
                        finish() // Supaya tidak bisa kembali ke login dengan tombol back
                    } else {
                        Toast.makeText(this, "Login gagal", Toast.LENGTH_SHORT).show()
                    }
                }





    }
}