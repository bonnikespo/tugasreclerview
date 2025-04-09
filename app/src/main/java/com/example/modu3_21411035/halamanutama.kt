package com.example.modu3_21411035

import android.media.MediaPlayer
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView.Adapter
import androidx.recyclerview.widget.RecyclerView.LayoutManager
import kotlinx.android.synthetic.main.activity_halamanutama.*

class halamanutama : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_halamanutama)

        val namaBuah = arrayOf("apel","pisang","manggis","naga","mangga","boni")
        val gambarBuah = arrayOf (
            R.drawable.apel,
            R.drawable.pisang,
            R.drawable.manggis,
            R.drawable.naga,
            R.drawable.mangga,
            R.drawable.boni
        )

        val suaraBuah = arrayOf (
            R.raw.apel,
            R.raw.pisangg,
            R.raw.manggis,
            R.raw.naga,
            R.raw.mangga,
            R.raw.bonni
        )

        val buahAdapter = BuahAdapter(namaBuah,gambarBuah,suaraBuah)

        rv_buah.apply {
            layoutManager = LinearLayoutManager(this@halamanutama)
            setHasFixedSize(true)
            adapter = buahAdapter
        }

    }
}