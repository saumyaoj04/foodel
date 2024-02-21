package com.example.proj1

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.LayoutInflater
import com.example.proj1.databinding.ActivityLoginBinding
import com.example.proj1.databinding.SignupBinding

class Login : AppCompatActivity() {
    private val binding:ActivityLoginBinding by lazy{
        ActivityLoginBinding.inflate(layoutInflater)
    }
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(binding.root)
        binding.btnLog.setOnClickListener {
            val intent=Intent(this,signup::class.java)
            startActivity(intent)
        }
        binding.dontHave.setOnClickListener {
            val intent = Intent(this, SignupBinding::class.java)
            startActivity(intent)
        }
    }
}