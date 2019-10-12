package com.exampledev.cnproj1

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_main_page2.*

class main_page2 : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main_page2)
        button2.setOnClickListener{
            val intent = Intent(this,CVpage::class.java)
            startActivity(intent)
        }
    }
}
