package com.example.alumnihub

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.Menu
import android.view.MenuItem
import android.widget.ImageView
import android.widget.TextView
import com.bumptech.glide.Glide
import kotlinx.android.synthetic.main.activity_detail.*

class Detail : AppCompatActivity() {

    companion object {
        const val EXTRA_NAMA = "extra_nama"
        const val EXTRA_TTL = "extra_ttl"
        const val EXTRA_KELAS = "extra_kelas"
        const val EXTRA_TELP = "extra_telp"
        const val EXTRA_IG = "extra_ig"
        const val EXTRA_ALAMAT = "extra_alamat"
        const val EXTRA_QUOTE = "extra_quote"
        const val EXTRA_PHOTO = "extra_photo"
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_detail)

        val imgDetail : ImageView = findViewById(R.id.img_detail)
        val nama : TextView = findViewById(R.id.nama_detail)
        val ttl : TextView = findViewById(R.id.ttl_detail)
        val kelas : TextView = findViewById(R.id.kelas_detail)
        val ig : TextView = findViewById(R.id.ig_detail)
        val telp : TextView = findViewById(R.id.telp_detail)
        val alamat : TextView = findViewById(R.id.alamat_detail)
        val quote : TextView = findViewById(R.id.quote_detail)
        val namaAtas : TextView =findViewById(R.id.nama_detail_top)


        val nameIntent: String = intent.getStringExtra(EXTRA_NAMA)
        val ttlIntent: String = intent.getStringExtra(EXTRA_TTL)
        val kelasIntent: String = intent.getStringExtra(EXTRA_KELAS)
        val igIntent : String= intent.getStringExtra(EXTRA_IG)
        val telpIntent: String = intent.getStringExtra(EXTRA_TELP)
        val alamatIntent : String= intent.getStringExtra(EXTRA_ALAMAT)
        val quoteIntent : String = intent.getStringExtra(EXTRA_QUOTE)
        val photoIntent : Int = intent.getIntExtra(EXTRA_PHOTO, 0)

        Glide.with(this)
            .load(photoIntent)
            .into(imgDetail)

        nama.text = nameIntent
        ttl.text = ttlIntent
        kelas.text = kelasIntent
        ig.text = igIntent
        telp.text = telpIntent
        alamat.text = alamatIntent
        quote.text = quoteIntent
        namaAtas.text = nameIntent


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
                val moveIntent = Intent(this@Detail, About::class.java)
                startActivity(moveIntent)
            }
        }
    }
}
