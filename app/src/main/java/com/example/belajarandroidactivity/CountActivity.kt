package com.example.belajarandroidactivity

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.widget.Button
import android.widget.TextView
import android.widget.Toast
import kotlin.math.log

class CountActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_count)

        val tvnumbe: TextView =findViewById(R.id.tvnumber)
        val buttoncoun: Button=findViewById(R.id.buttoncount)
        val buttonrese: Button=findViewById(R.id.buttonreset)
        val buttonminu: Button=findViewById(R.id.buttonminus)
        var numberup:Int=0

        buttoncoun.setOnClickListener {
            numberup+=1
            tvnumbe.text=numberup.toString()
        }
        Log.d("number", "Hasilnya: ${tvnumbe.text}")

        buttonrese.setOnClickListener {
            numberup=0
            tvnumbe.text=numberup.toString()
        }

        buttonminu.setOnClickListener {
            numberup-=1
            tvnumbe.text=numberup.toString()
        }


    }
}