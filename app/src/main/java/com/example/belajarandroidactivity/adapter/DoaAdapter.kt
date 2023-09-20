
package com.example.belajarandroidactivity.Adapter2

import android.provider.ContactsContract.Data
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.example.belajarandroidactivity.model.Doa
import com.example.belajarandroidactivity.R



class DoaAdapter (val data : ArrayList<Doa>) :
        RecyclerView.Adapter<DoaAdapter.DoaViewHolder>() {
        class DoaViewHolder (view: View) : RecyclerView.ViewHolder(view){
                val doaharian : TextView = view.findViewById(R.id.doa)
                val DoaGambar : ImageView = view.findViewById(R.id.gambardoa)

        }

        override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): DoaViewHolder {
                val view = LayoutInflater.from(parent.context)
                        .inflate(R.layout.itemdoa,parent, false)
                return DoaViewHolder(view)
        }

        override fun getItemCount(): Int = data.size



        override fun onBindViewHolder(holder: DoaViewHolder, position: Int) {
                val item = data.get(position)
                holder.doaharian.text = item.Doa
                holder.DoaGambar.setImageResource(item.Gambar)
        }

}
