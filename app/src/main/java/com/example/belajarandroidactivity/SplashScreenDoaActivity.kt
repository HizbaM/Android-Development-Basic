package com.example.belajarandroidactivity

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.os.Handler


class SplashScreenDoaActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_splash_screen_doa)

        Handler().postDelayed({
            val mulaiintent=Intent(this,Latihan45::class.java)
            startActivity(mulaiintent)
        }, 1200)
    }
}