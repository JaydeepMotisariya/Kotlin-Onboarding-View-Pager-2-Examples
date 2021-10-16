package com.riseup.viewpager

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.Toast
import androidx.fragment.app.Fragment
import androidx.viewpager2.widget.ViewPager2
import com.riseup.viewpager.adapter.ViewPagerFragmentAdapter
import com.riseup.viewpager.fragment.fragment_one
import com.riseup.viewpager.fragment.fragment_three
import com.riseup.viewpager.fragment.fragment_two
import me.relex.circleindicator.CircleIndicator3

class MainActivity : AppCompatActivity() {

    //Created by Jaydeep Motisariya
    //Date 16th Oct 2021

    private val data = mutableListOf<String>()
    private val fragmentList = ArrayList<Fragment>()
    private lateinit var viewPager: ViewPager2
    private lateinit var indicator: CircleIndicator3
    private lateinit var btnNext: Button
    private lateinit var btnBack: Button

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        castView()
        addToList()
        fragmentList.add(fragment_one())
        fragmentList.add(fragment_two())
        fragmentList.add(fragment_three())

        // viewPager.adapter = ViewPagerAdapter(data, this)
        viewPager.adapter = ViewPagerFragmentAdapter(this, fragmentList)
        viewPager.orientation = ViewPager2.ORIENTATION_HORIZONTAL

        indicator.setViewPager(viewPager)

        btnNext.setOnClickListener {
            viewPager.apply {
                beginFakeDrag()
                fakeDragBy(-10f)
                endFakeDrag()
            }
        }

        btnBack.setOnClickListener {
            viewPager.apply {
                beginFakeDrag()
                fakeDragBy(10f)
                endFakeDrag()
            }
        }

    }

    private fun castView() {

        viewPager = findViewById(R.id.view_pager2)
        indicator = findViewById(R.id.indicator)
        btnNext = findViewById(R.id.btn_next)
        btnBack = findViewById(R.id.btn_back)

    }

    private fun addToList() {
        for (item in 1..3) {
            data.add("item $item")
        }
    }


}