package com.example.belajarandroidactivity

import android.content.Intent
import android.os.Bundle
import android.widget.ImageButton
import android.widget.ImageView
import androidx.appcompat.app.AppCompatActivity

class OpenGalleryActivity : AppCompatActivity() {
    var ibGallery: ImageButton? = null
    var ivImage: ImageView? = null
    val pic_id = 123

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_open_gallery)

        ibGallery = findViewById(R.id.ibcamera)
        ivImage = findViewById(R.id.ivsample)

        ibGallery!!.setOnClickListener {
            // Membuka galeri gambar dari aplikasi
            val intent = Intent(this, GalleryActivity::class.java)
            startActivityForResult(intent, pic_id)
        }
    }

    override fun onActivityResult(requestCode: Int, resultCode: Int, data: Intent?) {
        super.onActivityResult(requestCode, resultCode, data)

        if (requestCode == pic_id && resultCode == RESULT_OK) {
            // Mengambil ID gambar yang dipilih dari GalleryActivity
            val selectedImageId = data?.getIntExtra("selected_image_id", 0)

            if (selectedImageId != null) {
                // Menampilkan gambar yang dipilih di ImageView
                ivImage?.setImageResource(selectedImageId)
            }
        }
    }
}