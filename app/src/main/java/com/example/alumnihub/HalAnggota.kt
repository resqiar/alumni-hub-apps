package com.example.alumnihub

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.Menu
import android.view.MenuItem
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView

class HalAnggota : AppCompatActivity() {

        private lateinit var rvAnggota : RecyclerView
        private var daftarAnggota : ArrayList<item_anggota.Anggota> = arrayListOf()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_hal_anggota)

            rvAnggota = findViewById(R.id.rv_anggota)
            rvAnggota.setHasFixedSize(true)

        daftarAnggota.addAll(DataAnggota.dataAnggota.listData)
        showRecyclerList()

    }

    private fun showSelectedItem(anggota : item_anggota.Anggota){
        val moveIntent = Intent(this@HalAnggota, Detail::class.java)

        moveIntent.putExtra(Detail.EXTRA_NAMA, anggota.Nama)
        moveIntent.putExtra(Detail.EXTRA_TTL, anggota.TTL)
        moveIntent.putExtra(Detail.EXTRA_KELAS, anggota.Kelas)
        moveIntent.putExtra(Detail.EXTRA_TELP, anggota.Telp)
        moveIntent.putExtra(Detail.EXTRA_IG, anggota.IG)
        moveIntent.putExtra(Detail.EXTRA_ALAMAT, anggota.Alamat)
        moveIntent.putExtra(Detail.EXTRA_QUOTE, anggota.Quote)
        moveIntent.putExtra(Detail.EXTRA_PHOTO, anggota.Photo)
        startActivity(moveIntent)
    }

    private fun showRecyclerList() {
        rvAnggota.layoutManager = LinearLayoutManager(this)
        val listAnggotaAdapter = ListViewAdapter(daftarAnggota)
        rvAnggota.adapter = listAnggotaAdapter

        listAnggotaAdapter.setOnItemClickCallback(object : ListViewAdapter.OnItemClickCallback{
            override fun onItemClicked(data: item_anggota.Anggota) {
                showSelectedItem(data)
            }
        })

    }

    override fun onCreateOptionsMenu(menu: Menu): Boolean {
        menuInflater.inflate(R.menu.menu_main, menu)
        return super.onCreateOptionsMenu(menu)
    }

    override fun onOptionsItemSelected(item: MenuItem): Boolean {
        setMode(item.itemId)
        return super.onOptionsItemSelected(item)
    }

    private fun setMode(selectedMode: Int){
        when(selectedMode){
            R.id.about ->{
                val moveIntent = Intent(this@HalAnggota, About::class.java)
                startActivity(moveIntent)
            }
        }
    }

}
