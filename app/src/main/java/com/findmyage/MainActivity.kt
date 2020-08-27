package com.findmyage

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_main.*
import java.util.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        bucheck.setOnClickListener {

            val userDOB =Integer.parseInt(buyear.text.toString())
            val currentYear=Calendar.getInstance().get(Calendar.YEAR)
            val userAge=currentYear-userDOB

            

            buage.text = "Your Age Is $userAge Years"
        }
    }
}