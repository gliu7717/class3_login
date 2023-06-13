package com.example.class3_login.activities
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.class3_login.databinding.ActivitySignUpBinding

class SignUpActivity : AppCompatActivity() {
    lateinit var binding: ActivitySignUpBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivitySignUpBinding.inflate(layoutInflater)
        setContentView(binding.root)
        setListeners()
    }

    private fun setListeners(){
        binding.tvSignIn.setOnClickListener { it -> onBackPressed()
        }
    }

}