package com.example.randomizerapp

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.ImageView

class ActivityCoin : AppCompatActivity() {
    lateinit var coinImage:ImageView
    lateinit var play:Button

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_coin)

        play=findViewById(R.id.PlayCoin)

        play.setOnClickListener(){
            playFlipCoin()
        }

        playFlipCoin()

    }

    //function for change random the coins
    private fun playFlipCoin() {
        val coin =CoinRandom(3)
        val flipCoin=coin.numberRandom()

        coinImage = findViewById(R.id.imageView2)

        val drawableResource = when (flipCoin) {
            1 -> R.drawable.cross
            2 -> R.drawable.face
            else->R.drawable.face
        }
        coinImage.setImageResource(drawableResource)
        coinImage.contentDescription=flipCoin.toString()
    }



}

class CoinRandom(private val numSides: Int) {

    /**
     * Do a random coin and return the result.
     */
    fun numberRandom(): Int {
        return (1..numSides).random()
    }
}
