package com.example.whatsapp

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.viewpager.widget.ViewPager
import com.example.whatsapp.databinding.ActivityScreenBinding
import com.google.android.material.tabs.TabLayout
import com.google.android.material.tabs.TabLayout.OnTabSelectedListener
import com.google.android.material.tabs.TabLayout.TabLayoutOnPageChangeListener
import java.util.Objects

class ScreenActivity : AppCompatActivity() {
    private lateinit var tabLayout : TabLayout
    lateinit var viewPager : ViewPager

    lateinit var binding: ActivityScreenBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityScreenBinding.inflate(layoutInflater)
        setContentView(binding.root)
        initview()
    }

    private fun initview() {


//  for tab layout
        binding.tabLayout.addTab(binding.tabLayout.newTab().setText("Chat"))
        binding.tabLayout.addTab(binding.tabLayout.newTab().setText("Status"))
        binding.tabLayout.addTab(binding.tabLayout.newTab().setText("Call"))


// view pager add

       var adapter = TabAdapter(supportFragmentManager)
        binding.viewPager.adapter = adapter


//        view pager and tablayput connect

        binding.viewPager.addOnPageChangeListener(TabLayoutOnPageChangeListener(binding.tabLayout))


        // tablayout - cilick - fragement change

        binding.tabLayout.addOnTabSelectedListener(object :OnTabSelectedListener{
            override fun onTabSelected(tab: TabLayout.Tab?) {
                if (tab != null) {
                    binding.viewPager.currentItem = tab.position
                }
            }

            override fun onTabUnselected(tab: TabLayout.Tab?) {
            }

            override fun onTabReselected(tab: TabLayout.Tab?) {

            }

        })
    }
}