package com.example.diceroller

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.widget.Button
import android.widget.ImageView
import android.widget.TextView
import android.widget.Toast
import kotlin.random.Random

class MainActivity : AppCompatActivity() {
   lateinit var image: ImageView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
       val diceRoll:Button =findViewById(R.id.button)
        image= findViewById(R.id.text)
        diceRoll.setOnClickListener {
           rollDice()
        }


    }


    private fun rollDice(){

        var number= Random.nextInt(6)+1
       var rollDiceResult= when(number) {
            1 -> R.drawable.dice_1
            2 -> R.drawable.dice_2
            3 -> R.drawable.dice_3
            4 -> R.drawable.dice_4
            5 -> R.drawable.dice_5
            else  -> R.drawable.dice_6
        }
        image.setImageResource(rollDiceResult)

    }
}
