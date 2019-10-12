package com.exampledev.cnproj1

import android.content.Intent
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import kotlinx.android.synthetic.main.thirdwalkthrfragment.*


class thirdwalkintent : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.thirdwalkthrfragment)


        next.setOnClickListener{
            val intent = Intent(this,main_page::class.java)
            startActivity(intent)
        }
    }
}