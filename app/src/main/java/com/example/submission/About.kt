package com.example.submission

import android.content.Intent
import android.net.Uri
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ImageView

class About : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_about)
        actionBar?.setDisplayHomeAsUpEnabled(true)

        val instagram : ImageView = findViewById(R.id.instagram_profile)
        val linkedin : ImageView = findViewById(R.id.linkedin_profile)
        instagram.setOnClickListener{
            val uriForApp : Uri = Uri.parse("https://www.instagram.com/_u/onirutla/")
            val intent = Intent(Intent.ACTION_VIEW ,uriForApp)
            startActivity(intent)
        }
        linkedin.setOnClickListener {
            val uriForApp : Uri = Uri.parse("https://www.linkedin.com/in/ricky-alturino-0a82a9198/")
            val intent = Intent(Intent.ACTION_VIEW ,uriForApp)
            startActivity(intent)
        }
    }
}
