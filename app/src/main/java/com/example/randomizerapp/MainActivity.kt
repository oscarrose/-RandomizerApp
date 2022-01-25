package com.example.randomizerapp

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class MainActivity : AppCompatActivity() {

    lateinit var rollButton: Button
    lateinit var coinButton:Button
    //----------------------------------------------
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        //---------------------------------------------------------
        rollButton=findViewById(R.id.rollButton)
        coinButton=findViewById(R.id.coinButton)

        rollButton.setOnClickListener(){
            val intent=Intent(this,RollDice::class.java);
            startActivity(intent)
        }

        coinButton.setOnClickListener(){
            val intent=Intent(this,ActivityCoin::class.java);
            startActivity(intent)
        }


    }

}