package com.ucompensar.project_store.activities

import android.graphics.Color
import android.graphics.LinearGradient
import android.graphics.Shader
import android.os.Bundle
import android.widget.TextView
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import com.ucompensar.project_store.R

class WelcomeActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_welcome)

//        // dentro de onCreate
//        val textView = findViewById<TextView>(R.id.txt_welcome)
//
//        // Creamos el degradado (de arriba a abajo)
//        val textShader = LinearGradient(
//            0f, 0f, 0f, textView.textSize * textView.lineCount,
//            intArrayOf(
//                Color.parseColor("#53E88B"), // Color arriba (verde claro)
//                Color.parseColor("#15BE77")  // Color abajo (verde oscuro)
//            ),
//            null,
//            Shader.TileMode.CLAMP
//        )
//
//        // Asignamos el degradado al texto
//        textView.paint.shader = textShader

    }
}