package com.example.whatsapp

import androidx.fragment.app.Fragment
import androidx.fragment.app.FragmentManager
import androidx.fragment.app.FragmentPagerAdapter

class TabAdapter(supportFragmentManager: FragmentManager) : FragmentPagerAdapter(supportFragmentManager) {
    override fun getCount(): Int {
        return  3

    }

    override fun getItem(position: Int): Fragment {

        if (position==0)
        {
            return  ChatFragement()
        }
        else if (position==1)
        {
            return StatusFregement()
        }
        else if (position==2)
        {
            return  CallFragement()
        }
        else
        {
            return  CallFragement()
        }
    }
}