package com.example.belajarandroidactivity

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.example.belajarandroidactivity.Adapter2.DoaAdapter
import com.example.belajarandroidactivity.adapter.DoaHarianAdapter
import com.example.belajarandroidactivity.model.Doa
import com.example.belajarandroidactivity.model.DoaHarian

class DoaHarianActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_doa_harian)

        val Doa: RecyclerView =
            findViewById(R.id.rvdoaharian)

        val namaDoa = getString(R.string.doalatin)
        val doaArab = getString(R.string.doaarab)

        val data = arrayListOf<DoaHarian>(
            DoaHarian("Doa Bangun Tidur",doaArab,namaDoa)
            )

        val adapter = DoaHarianAdapter(data)

        Doa.adapter = adapter

        Doa.layoutManager =
            LinearLayoutManager( this,
                LinearLayoutManager.VERTICAL,false)

    }
}