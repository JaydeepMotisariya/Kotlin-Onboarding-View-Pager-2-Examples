package com.riseup.viewpager.adapter

import androidx.fragment.app.Fragment
import androidx.fragment.app.FragmentActivity
import androidx.viewpager2.adapter.FragmentStateAdapter

class ViewPagerFragmentAdapter(fa: FragmentActivity, private val fragments:ArrayList<Fragment>): FragmentStateAdapter(fa) {

    //Created by Jaydeep Motisariya
    //Date 16th Oct 2021

    override fun getItemCount(): Int = fragments.size

    override fun createFragment(position: Int): Fragment = fragments[position]

}