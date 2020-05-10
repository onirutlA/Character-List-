package com.example.submission

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.Menu
import android.view.MenuItem

import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView

class MainActivity : AppCompatActivity() {
    private var list: ArrayList<Character> = arrayListOf()
    private lateinit var lvCharacter : RecyclerView
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        lvCharacter = findViewById(R.id.lv_character)
        lvCharacter.setHasFixedSize(true)

        list.addAll(CharacterData.listCharacterData)
        showRecyclerList()
    }

    override fun onCreateOptionsMenu(menu: Menu?): Boolean {
        menuInflater.inflate(R.menu.main_menu, menu)
        return true
    }

    override fun onOptionsItemSelected(item: MenuItem): Boolean {
        when (item.itemId) {
            R.id.action_about -> {
                val intentAbout = Intent(this@MainActivity, About::class.java)
                startActivity(intentAbout)
                return true
            }
            else -> {
                super.onOptionsItemSelected(item)
                return false
            }
        }
    }

    private fun showRecyclerList(){
        lvCharacter.layoutManager = LinearLayoutManager(this)
        val listCharacterAdapter = ListCharacterAdapter(list)
        lvCharacter.adapter = listCharacterAdapter
    }
}


