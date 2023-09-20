package com.example.belajarandroidactivity

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import android.widget.Toast

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val labelfor:TextView=findViewById(R.id.labelform)
        val labelnam:TextView=findViewById(R.id.labelnama)
        val inputnam:EditText=findViewById(R.id.inputnama)
        val labelkela:TextView=findViewById(R.id.labelkelas)
        val inputkela:EditText=findViewById(R.id.inputkelas)
        val labelkodebuk:TextView=findViewById(R.id.labelkodebuku)
        val inputkodebuk:EditText=findViewById(R.id.inputkodebuku)
        val buttonsubmi:Button=findViewById(R.id.buttonsubmit)
        val printnam:TextView=findViewById(R.id.printnama)
        val printkela:TextView=findViewById(R.id.printkelas)
        val printkodebuk:TextView=findViewById(R.id.printkodebuku)



        buttonsubmi.setOnClickListener {
            Toast.makeText(this,"${inputnam.text} kamu meminjam buku ${printkodebuk.text}",Toast.LENGTH_SHORT).show()

            printnam.text=inputnam.text
            printkela.text=inputkela.text
            printkodebuk.text=inputkodebuk.text
            val kodebuku=inputkodebuk.text.toString()
            when(kodebuku){
                "123"->printkodebuk.text="Harry Popot"
                "456"->printkodebuk.text="Herman Maman"
                "789"->printkodebuk.text="Step by Step Nikahin Anime"
            }

        }
    }


}