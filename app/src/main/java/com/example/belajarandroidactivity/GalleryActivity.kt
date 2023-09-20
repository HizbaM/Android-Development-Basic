package com.example.belajarandroidactivity

import android.content.Intent
import android.os.Bundle
import android.view.View
import android.widget.AdapterView
import android.widget.GridView
import androidx.appcompat.app.AppCompatActivity

class GalleryActivity : AppCompatActivity() {
    private val imageIds = arrayOf(
        R.drawable.ahmadnaufal, // Ganti dengan ID gambar sesuai dengan gambar yang Anda miliki
        R.drawable.ahmadnaufalterang,
        R.drawable.ahmadnaufaltidur,
        //Tambahkan gambar-gambar lainnya di sini
    )

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_gallery)

        val gridView: GridView = findViewById(R.id.gridView)

        val adapter = ImageAdapter(this, imageIds)
        gridView.adapter = adapter

        gridView.setOnItemClickListener(AdapterView.OnItemClickListener { _, _, position, _ ->
            // Mengirim ID gambar yang dipilih kembali ke OpenGalleryActivity
            val selectedImageId = imageIds[position]
            val intent = Intent()
            intent.putExtra("selected_image_id", selectedImageId)
            setResult(RESULT_OK, intent)
            finish()
        })
    }
}
