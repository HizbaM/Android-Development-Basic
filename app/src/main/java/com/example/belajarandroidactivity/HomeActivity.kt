package com.example.belajarandroidactivity

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.google.android.material.button.MaterialButton

class HomeActivity : AppCompatActivity() {

    var buttonpinda:MaterialButton?=null
    var buttonshar:MaterialButton?=null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_home)

        buttonpinda=findViewById(R.id.buttonpindah)
        buttonshar=findViewById(R.id.buttonshare)

        buttonpinda!!.setOnClickListener { val intent=Intent(this,DetailActivity::class.java)
        startActivity(intent)}

        buttonshar!!.setOnClickListener{val intent=Intent(Intent.ACTION_SEND)
        intent.putExtra(Intent.EXTRA_TEXT,"Halo Kawan!")
            intent.setType("text/plain")
            startActivity(Intent.createChooser(intent,"Share To:"))
        }
    }


}