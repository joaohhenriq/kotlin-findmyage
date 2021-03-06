package com.example.findmyage

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import kotlinx.android.synthetic.main.activity_main.*
import java.util.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }

    fun buttonClick(view: View){
        val userYear = Integer.parseInt(edtYear.text.toString())
        val currentYear = Calendar.getInstance().get(Calendar.YEAR)
        val result = currentYear - userYear

        txtViewAge.text = "Your age is $result years!"

        print("sadf")
    }
}