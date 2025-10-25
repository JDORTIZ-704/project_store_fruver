package com.ucompensar.project_store.activities

import android.content.Intent
import android.os.Bundle
import android.os.Handler
import android.os.Looper
import android.widget.Button
import android.widget.TextView
import android.widget.Toast
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import com.ucompensar.project_store.MainActivity
import com.ucompensar.project_store.R

class LoginActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_login)

        val createUserButton: TextView = findViewById(R.id.btn_login_to_register)

        createUserButton.setOnClickListener {
            val intent = Intent(this, CreateUserActivity::class.java)
            startActivity(intent)
            finish()
        }

        val googleButton: Button = findViewById(R.id.btn_google_get_into_user)

        googleButton.setOnClickListener {
            temporaryMessageEnterGoogle()
        }

        val loginButton: Button = findViewById(R.id.btn_create_user_login)

        loginButton.setOnClickListener {
            val intent = Intent(this, MainActivity::class.java)
            startActivity(intent)
            finish()
            temporaryMessageEnter()
        }
    }

    private fun temporaryMessageEnterGoogle () {
        val toast = Toast.makeText(this, "Google Login", Toast.LENGTH_SHORT)
        toast.show()

        Handler(Looper.getMainLooper()).postDelayed({
            toast.cancel()
        },1000)
    }

    private fun temporaryMessageEnter () {
        val toast = Toast.makeText(this, "Welcome", Toast.LENGTH_SHORT)
        toast.show()

        Handler(Looper.getMainLooper()).postDelayed({
            toast.cancel()
        },1000)
    }

}
