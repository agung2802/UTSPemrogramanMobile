package com.example.projectuts

import android.content.Intent
import android.os.Bundle
import android.util.Log
import android.widget.Button
import android.widget.EditText
import android.widget.Toast
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class Login : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_login)

        var register = findViewById<Button>(R.id.btnRegister)
        var username = findViewById<EditText>(R.id.fieldUsernameLogin)
        var password = findViewById<EditText>(R.id.fieldPasswordLogin)
        var login = findViewById<Button>(R.id.btnLogin)


        register.setOnClickListener{
            var intent = Intent(this, Register::class.java)
            startActivity(intent)
        }


        login.setOnClickListener{

            var strUsername = username.text.toString()
            var strPassword = password.text.toString()

            Log.v("blank username", strUsername.isBlank().toString())
            Log.v("empty username", strUsername.isEmpty().toString())
            Log.v("userName", strUsername)

            if (strUsername.isNullOrEmpty() || strPassword.isNullOrEmpty()){
                Toast.makeText(this, "Username and password required", Toast.LENGTH_SHORT).show()
            } else {
                Toast.makeText(this, "Login successfull", Toast.LENGTH_SHORT).show()

                val intent = Intent(this, Home::class.java)
                intent.putExtra("username", username.text.toString())
                startActivity(intent)
            }
        }
    }
}