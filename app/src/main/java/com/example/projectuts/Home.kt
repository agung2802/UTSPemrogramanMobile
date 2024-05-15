package com.example.projectuts

import android.content.Intent
import android.os.Bundle
import android.widget.ArrayAdapter
import android.widget.ListView
import android.widget.TextView
import android.widget.Toast
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class Home : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_home)

        var listNews = findViewById<ListView>(R.id.listView)
        var welcome = findViewById<TextView>(R.id.welcomeText);
        welcome.text = "welcome " + intent.extras?.get("username") ?: "Welcome"

        val language = arrayOf<String>("C","C++","Java",".Net","Kotlin","Ruby","Rails","Python","Java Script","Php","Ajax","Perl","Hadoop")
        val description = arrayOf<String>(
            "C programming is considered as the base for other programming languages",
            "C++ is an object-oriented programming language.",
            "Java is a programming language and a platform.",
            ".NET is a framework which is used to develop software applications.",
            "Kotlin is a open-source programming language, used to develop Android apps and much more.",
            "Ruby is an open-source and fully object-oriented programming language.",
            "Ruby on Rails is a server-side web application development framework written in Ruby language.",
            "Python is interpreted scripting  and object-oriented programming language.",
            "JavaScript is an object-based scripting language.",
            "PHP is an interpreted language, i.e., there is no need for compilation.",
            "AJAX allows you to send and receive data asynchronously without reloading the web page.",
            "Perl is a cross-platform environment used to create network and server-side applications.",
            "Hadoop is an open source framework from Apache written in Java."
        )

        val news = News(this, language, description)
        listNews.adapter = news

        listNews.setOnItemClickListener(){adapterView, view, position, id ->
            val itemAtPos = adapterView.getItemAtPosition(position)
            val itemIdAtPos = adapterView.getItemIdAtPosition(position)
            Toast.makeText(this, "Click on item at $itemAtPos its item id $itemIdAtPos", Toast.LENGTH_LONG).show()
        }



    }
}