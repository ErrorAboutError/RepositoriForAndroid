package com.example.test_slupchuk_lab_1

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View

class MainActivityRegistration : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main_registration)
    }
    public fun backClick(view: View) {

        val intent = Intent(this@MainActivityRegistration, MainActivity::class.java)
        startActivity(intent)


    }
}