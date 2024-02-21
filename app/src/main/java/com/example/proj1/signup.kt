package com.example.proj1

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.KeyEvent
import android.view.View
import com.example.proj1.databinding.SignupBinding

class signup : AppCompatActivity(), View.OnClickListener,View.OnFocusChangeListener,View.OnKeyListener {
    private val binding: SignupBinding by lazy{
        SignupBinding.inflate(layoutInflater)
    }
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(binding.root)
        binding.alreadyHave.setOnClickListener {
            val intent=Intent(this,Login::class.java)
            startActivity(intent)
        }
    }

    override fun onClick(v: View?) {
        TODO("Not yet implemented")
    }

    override fun onFocusChange(v: View?, hasFocus: Boolean) {
        TODO("Not yet implemented")
    }

    override fun onKey(v: View?, keyCode: Int, event: KeyEvent?): Boolean {
        TODO("Not yet implemented")
    }
}