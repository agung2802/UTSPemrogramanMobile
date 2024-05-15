package com.example.projectuts

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.Toast
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class Register : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_register)

        var username = findViewById<EditText>(R.id.fieldUsername)
        var password = findViewById<EditText>(R.id.password)
        var rePassword = findViewById<EditText>(R.id.repassword)
        var register = findViewById<Button>(R.id.btnRegister)

        register.setOnClickListener{
            if (username.text.toString().isNullOrEmpty() || password.text.toString().isNullOrEmpty() || rePassword.text.toString().isNullOrEmpty()){
                Toast.makeText(this, "All Field Required", Toast.LENGTH_SHORT).show()
            } else {
                if (!password.text.toString().equals(rePassword.text.toString())){
                    Toast.makeText(this, "Password and Re-enter Password Not Same", Toast.LENGTH_SHORT).show()
                } else {
                    register.setOnClickListener{
                        Toast.makeText(this, "Register successfull", Toast.LENGTH_SHORT).show()

                        val intent = Intent(this, Home::class.java)
                        intent.putExtra("username", username.text.toString())
                        startActivity(intent)
                    }
                }
            }
        }
    }
}