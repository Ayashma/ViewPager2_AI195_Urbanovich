package com.example.viewpager2

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.viewpager2.adapter.FragmentStateAdapter
import com.example.viewpager2.Fragments.FragmentFirst
import com.example.viewpager2.Fragments.FragmentSecond
import com.example.viewpager2.Fragments.FragmentThird
import com.example.viewpager2.databinding.ActivityMainBinding
import com.google.android.material.tabs.TabLayoutMediator

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        val binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.vpager.adapter = MyAdapter(this)

        TabLayoutMediator(binding.tabLayout, binding.vpager) { tab, pos ->
            tab.text = "Page $pos"
        }.attach()

    }

    class MyAdapter(fragment: AppCompatActivity) : FragmentStateAdapter(fragment) {

        override fun getItemCount(): Int = 3

        private val list = arrayListOf(
            FragmentFirst.newInstance(1),
            FragmentSecond.newInstance(2),
            FragmentThird.newInstance(3)
        )

        override fun createFragment(position: Int) = list[position]
    }
}