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
import org.jetbrains.annotations.ApiStatus

class CreateUserActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_create_user)

        val btncrearcuenta: Button = findViewById(R.id.btn_crearuser)
        btncrearcuenta.setOnClickListener {
            mensajecrearcuenta ()
            val intentbtncrearcuenta = Intent(this, LoginActivity::class.java)
            startActivity(intentbtncrearcuenta)
            finish()
        }

        val btngooglecrear: Button = findViewById(R.id.btn_google_crearuser)
        btngooglecrear.setOnClickListener {
            mensajetemportalgooglecrear()
        }

        val btnyatienescuenta: TextView = findViewById(R.id.txt_btn_yatienesunacuenta)

        btnyatienescuenta.setOnClickListener {
        val intentbtnyatienescuenta = Intent(this, LoginActivity::class.java)
        startActivity(intentbtnyatienescuenta)
        finish()
        }
    }

    private fun mensajetemportalgooglecrear() {
        val toast = Toast.makeText(this, "Registro Google", Toast.LENGTH_SHORT)
        toast.show()

        Handler(Looper.getMainLooper()).postDelayed({
            toast.cancel()
        }, 1000)
    }

    private fun mensajecrearcuenta () {
        val toast = Toast.makeText(this, "Registro Exitoso", Toast.LENGTH_SHORT)
        toast.show()

        Handler(Looper.getMainLooper()).postDelayed({
            toast.cancel()
        }, 1000)
    }
}