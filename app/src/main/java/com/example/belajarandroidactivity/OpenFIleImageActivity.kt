package com.example.belajarandroidactivity

import android.content.Intent
import android.graphics.Bitmap
import android.net.Uri
import android.os.Bundle
import android.provider.MediaStore
import android.widget.ImageButton
import android.widget.ImageView
import androidx.activity.result.contract.ActivityResultContracts
import androidx.appcompat.app.AppCompatActivity

class OpenFIleImageActivity : AppCompatActivity() {
    var ibcamer: ImageButton? = null
    var ivsampl: ImageView? = null
    val pic_id = 123

    // Menambahkan variabel untuk menyimpan Uri gambar yang dipilih
    private var selectedImageUri: Uri? = null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_open_camera)

        ibcamer = findViewById(R.id.ibcamera)
        ivsampl = findViewById(R.id.ivsample)

        ibcamer!!.setOnClickListener {
            val intent = Intent(Intent.ACTION_GET_CONTENT)
            intent.type = "image/*"
            startActivityForResult(intent, pic_id)
        }
    }

    override fun onActivityResult(requestCode: Int, resultCode: Int, data: Intent?) {
        super.onActivityResult(requestCode, resultCode, data)

        if (requestCode == pic_id && resultCode == RESULT_OK) {
            selectedImageUri = data?.data

            selectedImageUri?.let {
                ivsampl?.setImageURI(it)
            }
        }
    }
}