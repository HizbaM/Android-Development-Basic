package com.example.belajarandroidactivity

import android.content.Intent
import android.net.Uri
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ImageButton

class TravelActivity : AppCompatActivity() {

    var ibcal:ImageButton?=null
    var ibrout:ImageButton?=null
    var ibshar:ImageButton?=null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_travel)

        ibcal=findViewById(R.id.ibcall)
        ibrout=findViewById(R.id.ibroute)
        ibshar=findViewById(R.id.ibshare)

        ibcal!!.setOnClickListener{
            val phonenumber="+6262626262626"
            val phoneintent=Intent(Intent.ACTION_DIAL, Uri.parse("tel: $phonenumber"))
            startActivity(phoneintent)
        }

        ibrout!!.setOnClickListener {
            val mapintent=Intent(Intent.ACTION_VIEW, Uri.parse("geo: 1.6310548893879915, 124.70237823546154"))
            startActivity(mapintent)

        }
    }
}