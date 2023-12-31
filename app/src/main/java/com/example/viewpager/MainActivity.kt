package com.example.viewpager

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.viewpager.widget.ViewPager
import androidx.viewpager2.widget.ViewPager2
import com.example.viewpager.adapter.MyAdapter

class MainActivity : AppCompatActivity() {
    private lateinit var myAdapter: MyAdapter
    private lateinit var viewPager: ViewPager2
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        viewPager = findViewById(R.id.viewpager)
        myAdapter = MyAdapter(this)

        viewPager.orientation = ViewPager2.ORIENTATION_VERTICAL
        viewPager.adapter = myAdapter

    }
}