package com.example.test_slupchuk_lab_1

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import java.nio.file.attribute.AttributeView

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

    }
    public fun signupClick(view: View) {

            val intent = Intent(this@MainActivity, MainActivityRegistration::class.java)
            startActivity(intent)


    }


}