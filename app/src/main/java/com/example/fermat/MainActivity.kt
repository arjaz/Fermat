package com.example.fermat

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        solveButton.setOnClickListener {
            if (inputIntEditText.text.isNotEmpty()) {
                val input = inputIntEditText.text.toString().toInt()
                if (input % 2 != 0 || input <= 0)  {
                    val pair = factorize(input)
                    aTextView.text = "a = " + pair.first.toString()
                    bTextView.text = "b = " + pair.second.toString()
                } else {
                    aTextView.text = "Provide proper number"
                    bTextView.text = ""
                }
            }
        }
    }
}
