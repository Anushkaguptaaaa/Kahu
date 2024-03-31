package com.example.kahuloginpage

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.kahuloginpage.databinding.ActivityMainBinding


class MainActivity : AppCompatActivity() {

    private lateinit var binding : ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        initUI()
    }
    private fun initUI(){
   binding.fabBack.setOnClickListener{

    }
      binding.btnSignUp.setOnClickListener{

}
        binding.tvForgotPassword.setOnClickListener{

        }
        binding.tvSignUp.setOnClickListener {

        }

}
}