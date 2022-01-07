package com.polymath.dubgging

import android.os.Bundle
import android.util.Log
import androidx.appcompat.app.AppCompatActivity


private const val TAG = "MainActivity"

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        logging()
        division()
    }

    private fun division() {
        var numerator = 60
        var denominator = 4
        repeat(5) {
            Log.v(TAG, "The value is ${numerator / denominator}")
            denominator--
        }
    }

    private fun logging() {
        Log.v(TAG, "This is my first log")
    }
}