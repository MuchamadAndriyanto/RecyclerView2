package com.example.recyclerview

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import com.example.recyclerview.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    lateinit var binding : ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        val listBeritaData = arrayListOf(
            ListBerita("Piala Dunia U-20 Tidak Jadi Dilaksanakan di Indonesia",29,"Sport",R.drawable.baseline_sports_soccer_24),
            ListBerita("2 Polantas di Lubuklinggau Dimarahi Warga Karena Suka Menilang Pelajar",29,"Polisi",R.drawable.baseline_local_police_24),
            ListBerita("Viral Band Punk Korea Makan Pecel Pinggri Jalan",29,"Musik",R.drawable.baseline_music_note_24),
            ListBerita("Mobil Dari PendekarEsport Kecelakaan",29,"Game",R.drawable.baseline_directions_car_24),
            ListBerita("RRQ Dan ONIC ESPORT Berhasil Mengamankan Slot Upper Bracket",25,"Game",R.drawable.baseline_videogame_asset_24),
            ListBerita("Polda Metro Tangkap Tersangka Kasus Penipuan Perjalan Umrah",29,"Polisi",R.drawable.baseline_local_police_24),
            ListBerita("Terjadi Kebakaran Yang Melanda Rumah Di kel.Bintaro,Kec.Pesanggrahan,Jakarta Selatan",29,"Kebakaran",R.drawable.baseline_api_24)
        )
        val adapterBerita = BeritaAdapter(listBeritaData)
        //mengatur tataletak dari viewnya
        val lm = LinearLayoutManager(this, LinearLayoutManager.VERTICAL, false)
        //val gl = GridLayout(this)
        binding.rvBerita.layoutManager = lm
        binding.rvBerita.adapter = adapterBerita
    }


}