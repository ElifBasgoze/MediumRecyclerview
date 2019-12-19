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
            Tour("Antalya",R.drawable.tour1,2000),
            Tour("Karadeniz",R.drawable.tour2,3000),
            Tour("Ege",R.drawable.tour3,2000),
            Tour("Güneydoğu",R.drawable.tour4,1000),
            Tour("Doğu Expresi",R.drawable.tour5,1000),
            Tour("Eskişehir",R.drawable.tour6,1000),
            Tour("Uludağ",R.drawable.tour7,1000),
            Tour("Kapadokya",R.drawable.tour8,2000))

        recyclerview.layoutManager=LinearLayoutManager(this)
        recyclerview.adapter=RecyclerviewAdapter(tourList)
    }
}
