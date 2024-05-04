package com.example.loginpage

import android.content.Intent
import android.os.Bundle
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import com.example.loginpage.databinding.ActivityLoginBinding
import com.google.firebase.auth.FirebaseAuth
import com.google.firebase.auth.FirebaseAuthInvalidCredentialsException
import com.google.firebase.auth.FirebaseAuthInvalidUserException

class LoginActivity : AppCompatActivity() {
    private lateinit var binding: ActivityLoginBinding
    private lateinit var mAuth: FirebaseAuth

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityLoginBinding.inflate(layoutInflater)
        setContentView(binding.root)

        mAuth = FirebaseAuth.getInstance()

        binding.textViewSignUp.setOnClickListener {
            val intent = Intent(this, SignUpActivity::class.java)
            startActivity(intent)
        }

        binding.buttonSignIn.setOnClickListener {
            val email = binding.editTextEmail.text.toString()
            val password = binding.editTextPassword.text.toString()
            val confirmPassword = binding.editTextConfirmPassword.text.toString()

            if (password == confirmPassword) {
                mAuth.signInWithEmailAndPassword(email, password)
                    .addOnCompleteListener(this) { task ->
                        if (task.isSuccessful) {
                            val intent = Intent(this, MainActivity::class.java)
                            startActivity(intent)
                            Toast.makeText(this, "Sign in berhasil", Toast.LENGTH_SHORT).show()
                        } else {
                            when (task.exception) {
                                is FirebaseAuthInvalidUserException -> {
                                    Toast.makeText(
                                        this,
                                        "Akun tidak ditemukan. Silahkan buat akun terlebih dahulu",
                                        Toast.LENGTH_SHORT
                                    ).show()
                                }
                                is FirebaseAuthInvalidCredentialsException -> {
                                    Toast.makeText(
                                        this,
                                        "Kata sandi salah. Silahkan coba lagi.",
                                        Toast.LENGTH_SHORT
                                    ).show()
                                }
                                else -> {
                                    Toast.makeText(
                                        this, "Gagal melakukan autentikasi. Silahkan coba lagi.",
                                        Toast.LENGTH_SHORT
                                    ).show()
                                }
                            }
                        }
                    }
            } else {
                Toast.makeText(
                    this,
                    "Kata sandi dan konfirmasi sandi tidak cocok. Silahkan Coba lagi",
                    Toast.LENGTH_SHORT
                ).show()
            }
        }
    }
}
