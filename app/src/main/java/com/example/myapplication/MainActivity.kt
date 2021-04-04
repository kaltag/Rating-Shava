package com.example.myapplication

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.RatingBar;
import android.widget.TextView
import android.widget.Toast;
import java.text.DecimalFormat


class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        setTitle("Шава 0.0.2")

        val rbLavash = findViewById<RatingBar>(R.id.ratingBarLavash)
        val rbSouse = findViewById<RatingBar>(R.id.ratingBarSouse)
        val rbOvosh = findViewById<RatingBar>(R.id.ratingBarOvosh)
        val rbMeet = findViewById<RatingBar>(R.id.ratingBarMeet)
        val rbSoch = findViewById<RatingBar>(R.id.ratingBarSochnost)
        val rbSize = findViewById<RatingBar>(R.id.ratingBarSize)
        val rbStr = findViewById<RatingBar>(R.id.ratingBarStructure)
        val rbSit = findViewById<RatingBar>(R.id.ratingBarSitnost)
        val rbEat = findViewById<RatingBar>(R.id.ratingBarEat)
        val rbVkus = findViewById<RatingBar>(R.id.ratingBarVkus)

        val button = findViewById<Button>(R.id.button)
        val TxtScore = findViewById<TextView>(R.id.TextScore)


        button.setOnClickListener {
            var Score =(rbLavash.rating/10 + rbSouse.rating/5 + rbOvosh.rating/10 + rbMeet.rating/5 + rbSoch.rating/10 + rbSize.rating/5 + rbStr.rating/5 + rbSit.rating/5 + rbEat.rating/10 + rbVkus.rating)
            if(Score >= 10)
                TxtScore.text = "10"
            else
                TxtScore.text = Score.toString()
        }


    }
}