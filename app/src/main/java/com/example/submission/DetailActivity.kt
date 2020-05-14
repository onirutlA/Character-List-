package com.example.submission

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ImageView
import android.widget.TextView

class DetailActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_detail)

        val character = intent.getParcelableExtra<Character>("character")
        val tvNameDetail : TextView = findViewById(R.id.detail_character_name)
        val tvCharacterDetail : TextView = findViewById(R.id.detail_character)
        val tvBiography : TextView = findViewById(R.id.detail_biography)
        val ivCharacter : ImageView = findViewById(R.id.detail_character_image)

        tvNameDetail.text = character!!.name
        tvCharacterDetail.text = character.detail
        tvBiography.text = character.biography
        ivCharacter.setImageResource(character.image)
    }
}
