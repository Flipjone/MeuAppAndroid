package com.example.meuappandroid

import android.content.Intent
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.google.android.material.floatingactionbutton.FloatingActionButton

class ListActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_list)
        setTitle("Listagem")

        val botao = findViewById<FloatingActionButton>(R.id.FormButton)
        botao.setOnClickListener {
            val intent = Intent(this, NovoActivity::class.java)
            startActivity(intent)
        }
    }
}