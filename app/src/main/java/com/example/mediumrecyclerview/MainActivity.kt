package com.example.mediumrecyclerview

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity()
{

    override fun onCreate(savedInstanceState: Bundle?)
    {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val tourList= arrayListOf<Tour>(
            Tour("Antalya Turu",R.drawable.tour1,"2000₺"),
            Tour("Karadeniz Turu",R.drawable.tour2,"3000₺"),
            Tour("Ege Turu",R.drawable.tour3,"2000₺"),
            Tour("Güneydoğu Anadolu Turu",R.drawable.tour4,"1000₺"),
            Tour("Doğu Expresi",R.drawable.tour5,"1000₺"),
            Tour("Eskişehir Turu",R.drawable.tour6,"1000₺"),
            Tour("Uludağ Turu",R.drawable.tour7,"1000₺"),
            Tour("Kapadokya Turu",R.drawable.tour8,"2000₺"))

        recyclerview.layoutManager=LinearLayoutManager(this)
        recyclerview.adapter=RecyclerviewAdapter(tourList)
    }
}
