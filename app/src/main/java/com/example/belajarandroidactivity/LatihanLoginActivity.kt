package com.example.belajarandroidactivity

import android.annotation.SuppressLint
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import androidx.appcompat.app.AlertDialog

class LatihanLoginActivity : AppCompatActivity() {
    @SuppressLint("MissingInflatedId")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_latihan_login)

        var  inputUsername:EditText=findViewById(R.id.inputUsernameTxt)
        var inputPassword:EditText=findViewById(R.id.editTextTextPassword)
        val button:Button=findViewById(R.id.button2)


        button.setOnClickListener {


            var userName=inputUsername.text.toString()
            var password=inputPassword.text.toString()
            if (userName=="admin" && password=="123"){
                val intent=Intent(this, DashboardStore::class.java)
                startActivity(intent)
            }

            else{
                var builder=AlertDialog.Builder(this)
                builder.setMessage("Username atau Password Salah!")
                builder.setTitle("Alert!")
                builder.setPositiveButton("OK") { dialog, _ ->
                    dialog.dismiss()
                }.show()
                var alertDialog=builder.create()
                alertDialog.show()
            }
        }

    }
}