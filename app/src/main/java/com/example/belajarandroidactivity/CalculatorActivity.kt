package com.example.belajarandroidactivity

import android.content.DialogInterface
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import androidx.appcompat.app.AlertDialog

class CalculatorActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_calculator)

        val inputangk1: EditText=findViewById(R.id.inputangka1)
        val inputangk2: EditText =findViewById(R.id.inputangka2)
        val buttontamba: Button=findViewById(R.id.buttontambah)
        val buttonkuran: Button=findViewById(R.id.buttonkurang)
        val buttonperse: Button=findViewById(R.id.buttonpersen)
        val buttonbag: Button=findViewById(R.id.buttonbagi)
        val buttonkal: Button=findViewById(R.id.buttonkali)
        val buttonclea: Button=findViewById(R.id.buttonclear0)
        val tvhasi: TextView=findViewById(R.id.tvhasil)

        val builder:AlertDialog.Builder=AlertDialog.Builder(this@CalculatorActivity)


            buttontamba.setOnClickListener {
            var angka1=inputangk1.text.toString().toInt()
                var angka2=inputangk2.text.toString().toInt()
                var hasil1:Int=angka1+angka2

                tvhasi.setText(hasil1.toString())

        }

        buttonkuran.setOnClickListener {
            var angka1=inputangk1.text.toString().toInt()
            var angka2=inputangk2.text.toString().toInt()
            var hasil1:Int=angka1-angka2

            tvhasi.setText(hasil1.toString())

        }

        buttonperse.setOnClickListener {
            var angka1=inputangk1.text.toString().toInt()
            var angka2=inputangk2.text.toString().toInt()
            var hasil1:Int=angka1%angka2

            tvhasi.setText(hasil1.toString())

        }

        buttonbag.setOnClickListener {
            var angka1=inputangk1.text.toString().toFloat()
            var angka2=inputangk2.text.toString().toFloat()
            var hasil1:Float=angka1/angka2

            tvhasi.setText(hasil1.toString())

        }

        buttonkal.setOnClickListener {
            var angka1=inputangk1.text.toString().toInt()
            var angka2=inputangk2.text.toString().toInt()
            var hasil1:Int=angka1*angka2

            tvhasi.setText(hasil1.toString())

        }

        buttonclea.setOnClickListener {


            builder.setTitle("Perhatian !")
            builder.setMessage("Kamu yakin ingin menghapus datanya?")
            builder.setCancelable(false)
            builder.setPositiveButton("Ya",DialogInterface.OnClickListener { dialog, which ->

                tvhasi.setText("0")
                inputangk1.setText("")
                inputangk2.setText("")
            })
            
            builder.setNegativeButton("Tidak",DialogInterface.OnClickListener { dialog, which ->  })
            builder.setIcon(R.drawable.baseline_info_24)

            val alertdialog:AlertDialog=builder.create()
            alertdialog.show()





        }

    }
}