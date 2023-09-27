package com.example.belajarandroidactivity

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.os.Handler

class LatihanSplashScreenActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_latihan_splash_screen)
//        Handler() harus pake package android.os
        Handler().postDelayed({
//            action setelah 3 detik
//            intent explicit = pindah halaman
            val intent =
                Intent(this,LatihanLoginActivity::class.java)
            startActivity(intent)
        },3000)
    }
}