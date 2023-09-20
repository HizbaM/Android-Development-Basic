package com.example.belajarandroidactivity.adapter

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageButton
import android.widget.RelativeLayout
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.example.belajarandroidactivity.Adapter2.DoaAdapter
import com.example.belajarandroidactivity.R
import com.example.belajarandroidactivity.model.DoaHarian

class DoaHarianAdapter (val data:ArrayList<DoaHarian>)
    :RecyclerView.Adapter<DoaHarianAdapter.DoaHarianViewHolder>()
{
    class DoaHarianViewHolder (view: View)
        :RecyclerView.ViewHolder(view)

    {
        val tvjuduldo:TextView=view.findViewById(R.id.tvjuduldoa)
        val tvdoaara:TextView=view.findViewById(R.id.tvdoaarab)
        val tvdoalati:TextView=view.findViewById(R.id.tvdoalatin)
        val ibcollaps:ImageButton=view.findViewById(R.id.ibcollapse)

        val rlisido:RelativeLayout=view.findViewById(R.id.rlisidoa)

    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): DoaHarianViewHolder {
        val view= LayoutInflater.from(parent.context)
            .inflate(R.layout.item_doa_harian, parent,false)
        return DoaHarianViewHolder(view)
    }

    override fun getItemCount(): Int {
        return data.size
    }

    override fun onBindViewHolder(holder: DoaHarianViewHolder, position: Int) {
        val item=data.get(position)
        holder. tvjuduldo.text=item.judul
        holder. tvdoaara.text=item.teksarab
        holder. tvdoalati.text=item.tekslatin

        holder.ibcollaps.setOnClickListener{

            if(holder.rlisido.visibility==View.GONE){
                holder.rlisido.visibility=View.VISIBLE
                holder.ibcollaps.setBackgroundResource(R.drawable.baseline_arrow_back_24)
            }else{
                holder.rlisido.visibility=View.GONE
                holder.ibcollaps.setBackgroundResource(R.drawable.baseline_keyboard_arrow_right_24)
            }
        }


        }





}