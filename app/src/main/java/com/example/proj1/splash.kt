package com.example.proj1

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.os.Handler
import android.os.Looper


class splash : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.splash)
        Handler(Looper.getMainLooper()).postDelayed({
            val intent= Intent(this,signup::class.java)
            startActivity(intent)
            finish()
        },3000)
    }
}