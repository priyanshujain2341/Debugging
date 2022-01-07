package com.polymath.dubgging

import android.os.Bundle
import android.util.Log
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity


private const val TAG = "MainActivity"

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val myTextView: TextView = findViewById(R.id.hello_world)
        myTextView.text = "Hello, Debugging!"
        logging()
        division()
    }

    private fun division() {
        val numerator = 60
        var denominator = 5
        repeat(4) {
            Thread.sleep(3000)
            Log.d(TAG, "The denominator is: ${denominator}")
            findViewById<TextView>(R.id.hello_world).setText("${numerator/denominator}")
            denominator--
        }
    }

    private fun logging() {
        Log.v(TAG, "This is my first log")
    }
}