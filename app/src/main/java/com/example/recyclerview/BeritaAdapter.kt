package com.example.recyclerview

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView

class BeritaAdapter (var listBerita: ArrayList<ListBerita>): RecyclerView.Adapter<BeritaAdapter.ViewHolder>() {
    class ViewHolder(view: View) : RecyclerView.ViewHolder(view) {
        var judul = view.findViewById<TextView>(R.id.txtJudul)
        var tanggal = view.findViewById<TextView>(R.id.txtTanggal)
        var kategori = view.findViewById<TextView>(R.id.txtKategori)
        var img = view.findViewById<ImageView>(R.id.imgBerita)

    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): BeritaAdapter.ViewHolder {
        var view = LayoutInflater.from(parent.context).inflate(R.layout.item_berita, parent, false)
        return ViewHolder(view)
    }

    override fun onBindViewHolder(holder: BeritaAdapter.ViewHolder, position: Int) {
        holder.judul.text = listBerita[position].judul
        holder.tanggal.text = listBerita[position].tanggal.toString()
        holder.kategori.text = listBerita[position].kategori
        holder.img.setImageResource(listBerita[position].img)

    }

    override fun getItemCount(): Int {
        return listBerita.size
    }
}