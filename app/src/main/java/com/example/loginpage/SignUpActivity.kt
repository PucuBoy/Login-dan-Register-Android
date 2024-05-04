package com.example.loginpage

import android.content.Intent
import android.os.Bundle
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import com.example.loginpage.databinding.ActivitySignupBinding
import com.google.firebase.auth.FirebaseAuth


class SignUpActivity : AppCompatActivity() {
    private lateinit var binding: ActivitySignupBinding
    private lateinit var mAuth: FirebaseAuth

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivitySignupBinding.inflate(layoutInflater)
        setContentView(binding.root)

        mAuth = FirebaseAuth.getInstance()

        binding.buttonSignUp.setOnClickListener {
            val email = binding.editTextEmail.text.toString()
            val password = binding.editTextPassword.text.toString()

            mAuth.createUserWithEmailAndPassword(email, password)
                .addOnCompleteListener(this) {task ->
                    if (task.isSuccessful) {
                        Toast.makeText(this, "Akun Berhasil dibuat", Toast.LENGTH_SHORT).show()
                        val intent = Intent(this, LoginActivity::class.java)
                        startActivity(intent)
                        finish()
                    } else {
                        Toast.makeText(
                            this,
                            "Gagal membuat akun. Silahkan coba lagi.",
                            Toast.LENGTH_SHORT
                        ).show()
                    }
                }
        }
    }
}