package com.example.belajarandroidactivity

import android.annotation.SuppressLint
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.example.belajarandroidactivity.Adapter2.DoaAdapter
import com.example.belajarandroidactivity.model.Doa

class Latihan45 : AppCompatActivity() {
    @SuppressLint("MissingInflatedId")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_latihan45)

        val btnselengkapny:Button=findViewById(R.id.btnselengkapnya)

        val Doa: RecyclerView =
        findViewById(R.id.listdzikir)

        val data = arrayListOf<Doa>(
            Doa("Doa masuk kamar mandi",R.drawable.doaharian),
            Doa("Doa terhindar dari dajjal",R.drawable.doaharian),
            Doa("Doa makan",R.drawable.doaharian),
            Doa("Doa Rezeki",R.drawable.doaharian),
            Doa("Doa masuk surga",R.drawable.doaharian),
            Doa("Doa masuk islam",R.drawable.doaharian),
            Doa("Doa masuk masjid",R.drawable.doaharian),

            )

        val adapter = DoaAdapter(data)

        Doa.adapter = adapter

        Doa.layoutManager =
            LinearLayoutManager( this,
                LinearLayoutManager.VERTICAL,false)

        btnselengkapny.setOnClickListener { val intent=Intent(this,DoaHarianActivity::class.java)
        startActivity(intent)
        }

    }

    override fun onBackPressed() {
    }


    }
