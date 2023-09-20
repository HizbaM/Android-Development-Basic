package com.example.belajarandroidactivity

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.TextView

class LatihanVisibilityActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_latihan_visibility)
        val tvtek:TextView=findViewById(R.id.tvteks)
        val btnkli:Button=findViewById(R.id.btnklilk)

        btnkli.setOnClickListener{
            //munculkan teks

            if (tvtek.visibility == View.VISIBLE) {
                tvtek.visibility = View.INVISIBLE
            } else {
                tvtek.visibility = View.VISIBLE
            }
        }
    }
}