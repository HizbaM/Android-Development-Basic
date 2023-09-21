package com.example.belajarandroidactivity

import android.annotation.SuppressLint
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.widget.Button
import android.widget.EditText
import androidx.appcompat.app.AlertDialog
import androidx.appcompat.app.AppCompatActivity
import pl.droidsonroids.gif.GifImageView

class IntroLoginActivity : AppCompatActivity() {
    @SuppressLint("MissingInflatedId")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_intro_login)

        val btnLogin: Button = findViewById(R.id.btnlogin)
        val etUsername: EditText = findViewById(R.id.etusername)
        val etPassword: EditText = findViewById(R.id.etpassword)

        btnLogin.setOnClickListener {
            val username = etUsername.text.toString()
            val password = etPassword.text.toString()

            val alertDialogBuilder: AlertDialog.Builder = AlertDialog.Builder(this)

            if (username == "Hizba" && password == "ganteng") {
                val dialogView = LayoutInflater.from(this).inflate(R.layout.dialog_custom_ahmad, null)
                val gifImageView: GifImageView = dialogView.findViewById(R.id.gifImageView)

                alertDialogBuilder.setView(dialogView)
                alertDialogBuilder.setPositiveButton("OK") { dialog, _ ->
                    dialog.dismiss()
                }.show()
            } else {
                alertDialogBuilder.setMessage("Login gagal. Periksa kembali username dan password.")
                    .setPositiveButton("OK") { dialog, _ ->
                        dialog.dismiss()
                    }.show()
            }
        }
    }
}
