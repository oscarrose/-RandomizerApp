package com.example.randomizerapp

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.ImageView

class RollDice : AppCompatActivity() {

    lateinit var rollImage: ImageView
    lateinit var playRoll: Button


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_roll_dice)

        playRoll=findViewById(R.id.PlayRoll)

        playRoll.setOnClickListener(){
            playRollDice()
        }
        playRollDice()
    }

    //function for change random the dice
    private fun playRollDice() {
        val roll =RollRandom(6)
        val numberDice=roll.numberRandom()

        rollImage = findViewById(R.id.imageView)

        val drawableResource = when (numberDice) {
            1 -> R.drawable.alea1
            2 -> R.drawable.alea2
            3->R.drawable.alea3
            4-> R.drawable.alea4
            5->R.drawable.alea5
            6->R.drawable.alea6
            else->R.drawable.alea2
        }
        rollImage.setImageResource(drawableResource)
        rollImage.contentDescription=numberDice.toString()
    }



}

class RollRandom(private val numSides: Int) {

    /**
     * Do a random coin and return the result.
     */
    fun numberRandom(): Int {
        return (1..numSides).random()
    }
}