package edu.temple.helloworld

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        // set listener function for button
        findViewById<Button>(R.id.button).setOnClickListener({v, -> (v as Button).text = "You Clicked the Button"})
    }
}