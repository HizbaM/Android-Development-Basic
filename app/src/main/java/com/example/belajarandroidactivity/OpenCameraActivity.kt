package com.example.belajarandroidactivity

import android.content.Intent
import android.graphics.Bitmap
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.provider.MediaStore
import android.widget.ImageButton
import android.widget.ImageView

class OpenCameraActivity : AppCompatActivity() {
    var ibcamer:ImageButton?=null
    var ivsampl:ImageView?=null
    val pic_id=123

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_open_camera)

        ibcamer=findViewById(R.id.ibcamera)
        ivsampl=findViewById(R.id.ivsample)

        ibcamer!!.setOnClickListener{
            val intent= Intent(MediaStore.ACTION_IMAGE_CAPTURE)
            startActivityForResult(intent,pic_id)
        }

    }

    override fun onActivityResult(requestCode: Int, resultCode: Int, data: Intent?) {
        super.onActivityResult(requestCode, resultCode, data)

        if (requestCode==pic_id){
            val photo:Bitmap=data?.extras?.get("data") as Bitmap

            ivsampl!!.setImageBitmap(photo)
        }
    }
}