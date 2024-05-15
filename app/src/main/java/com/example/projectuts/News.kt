package com.example.projectuts

import android.app.Activity
import android.os.Bundle
import android.view.View
import android.view.ViewGroup
import android.widget.ArrayAdapter
import android.widget.TextView
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class News(private val context: Activity, private val title: Array<String>, private val description: Array<String>)
    : ArrayAdapter<String>(context, R.layout.activity_news, title) {

    override fun getView(position: Int, view: View?, parent: ViewGroup): View {
        val inflater = context.layoutInflater
        val rowView = inflater.inflate(R.layout.activity_news, null, true)

        val titleText = rowView.findViewById(R.id.titleNews) as TextView
        val subtitleText = rowView.findViewById(R.id.descNews) as TextView

        titleText.text = title[position]
        subtitleText.text = description[position]

        return rowView
    }
}