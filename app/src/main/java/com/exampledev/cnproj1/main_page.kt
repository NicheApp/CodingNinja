package com.exampledev.cnproj1
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_main_page.*

class main_page : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main_page)

        button1.setOnClickListener{
            val intent = Intent(this,loginactivity::class.java)
            startActivity(intent)
        }
    }
}
