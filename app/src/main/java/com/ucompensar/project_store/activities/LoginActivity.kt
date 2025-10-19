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
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import com.ucompensar.project_store.R

class LoginActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_login)

        val btn_primeringreso: TextView = findViewById(R.id.txt_btn_primeringreso)

        btn_primeringreso.setOnClickListener {
            val intent = Intent(this, CreateUserActivity::class.java)
            startActivity(intent)
            finish()
        }

        val btn_google_login: Button = findViewById(R.id.btn_google_login)

        btn_google_login.setOnClickListener {
            mensajetemporalgoogle()
        }

        val btn_ingreso: Button = findViewById(R.id.btn_entrar_login)

        btn_ingreso.setOnClickListener {
            val intent = Intent(this, SplashActivity::class.java)
            startActivity(intent)
            finish()

            mensajetemporalentrar()
        }
    }

    private fun mensajetemporalgoogle () {
        val toast = Toast.makeText(this, "Ingreso Google", Toast.LENGTH_SHORT)
        toast.show()

        Handler(Looper.getMainLooper()).postDelayed({
            toast.cancel()
        },1000)
    }

    private fun mensajetemporalentrar () {
        val toast = Toast.makeText(this, "Bienvenido", Toast.LENGTH_SHORT)
        toast.show()

        Handler(Looper.getMainLooper()).postDelayed({
            toast.cancel()
        },1000)
    }

}
