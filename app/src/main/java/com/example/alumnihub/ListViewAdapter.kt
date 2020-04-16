package com.example.alumnihub

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.bumptech.glide.Glide
import com.bumptech.glide.request.RequestOptions

class ListViewAdapter(private val listAnggota : ArrayList<item_anggota.Anggota>) : RecyclerView.Adapter<ListViewAdapter.ListViewHolder>() {

            private lateinit var onItemClickCallback : OnItemClickCallback

             fun setOnItemClickCallback(onItemClickCallback : OnItemClickCallback){
                this.onItemClickCallback = onItemClickCallback
            }

        inner class ListViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
            var rvName : TextView = itemView.findViewById(R.id.nama_anggota)
            var rvKelas : TextView = itemView.findViewById(R.id.kelas_anggota)
            var rvDetail : TextView = itemView.findViewById(R.id.detail_anggota)
            var photoAnggota : ImageView = itemView.findViewById(R.id.img_anggota)
        }


        override fun onCreateViewHolder(viewgroup : ViewGroup, i : Int): ListViewHolder {
            val view : View = LayoutInflater.from(viewgroup.context).inflate(R.layout.anggota_row , viewgroup, false)
            return ListViewHolder(view)
        }

        override fun getItemCount(): Int {
            return listAnggota.size
        }

        override fun onBindViewHolder(holder: ListViewHolder, position: Int) {
            val anggota = listAnggota[position]

            Glide.with(holder.itemView.context)
                .load(anggota.Photo)
                .apply(RequestOptions().override(55,55))
                .into(holder.photoAnggota)

            holder.rvName.text = anggota.Nama
            holder.rvKelas.text = anggota.Kelas
            holder.rvDetail.text = anggota.Quote



            holder.itemView.setOnClickListener{
                onItemClickCallback.onItemClicked(listAnggota[holder.adapterPosition])
            }
        }

        interface OnItemClickCallback {
            fun onItemClicked(data: item_anggota.Anggota)
        }

}