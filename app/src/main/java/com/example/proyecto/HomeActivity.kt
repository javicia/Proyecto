package com.example.proyecto

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle


enum class providerType{
    BASIC
}

class HomeActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_home)
        //Setup
        setup()
    }
    private fun setup(){
        title="Inicio"
    }
}