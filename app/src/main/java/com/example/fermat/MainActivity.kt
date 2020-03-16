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
                Log.d("userspace", "SHIT")
                // val (a, b) = factorize(inputIntEditText.text.toString().toInt())
                // aTextView.text = a.toString()
                // bTextView.text = b.toString()
                val pare = factorize(inputIntEditText.text.toString().toInt())
                aTextView.text = "a = " + pare.first.toString()
                bTextView.text = "b = " + pare.second.toString()
            }
        }
    }
}
