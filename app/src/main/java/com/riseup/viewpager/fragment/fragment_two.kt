package com.riseup.viewpager.fragment

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import com.riseup.viewpager.R

class fragment_two : Fragment(){
    //Created by Jaydeep Motisariya
    //Date 16th Oct 2021
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        return inflater.inflate(R.layout.item_page2, container, false)
    }
}