package com.exampledev.cnproj1

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_cvpage.*

class CVpage : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_cvpage)

        button4.setOnClickListener {
            val intent = Intent(this,main_page3::class.java)
            startActivity(intent)
        }
    }
}
