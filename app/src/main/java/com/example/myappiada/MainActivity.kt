package com.example.myappiada

import android.media.MediaPlayer
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import kotlinx.android.synthetic.main.activity_main.*
import java.util.*


class MainActivity : AppCompatActivity() {

    lateinit var badumtiss: MediaPlayer

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        this.badumtiss = MediaPlayer.create(this, R.raw.badumtss)

        showJokers()

        btnJoker.setOnClickListener {
            showJokers()
        }
    }

    fun showJokers() {
        val jokers = resources.getStringArray(R.array.jokers)
        val numberJoker = Random().nextInt(jokers.size)
        txtJoke.text = jokers[numberJoker]
        playSong()
    }
    private fun playSong(){
        badumtiss.start()
    }

}