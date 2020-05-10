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
        val tvNameDetail : TextView = findViewById(R.id.name_character_detail)
        val tvCharacterDetail : TextView = findViewById(R.id.description_character_detail)
        val tvBiography : TextView = findViewById(R.id.biography_character_detail)
        val ivCharacter : ImageView = findViewById(R.id.photo_character_detail)

        tvNameDetail.text = character!!.name
        tvCharacterDetail.text = character.detail
        tvBiography.text = character.biography
        ivCharacter.setImageResource(character.image)
    }
}
