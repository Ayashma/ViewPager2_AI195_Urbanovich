package com.example.viewpager2.Fragments

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import com.example.viewpager2.databinding.FragmentSecondBinding

class FragmentSecond : Fragment() {

    private lateinit var binding: FragmentSecondBinding

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        binding = FragmentSecondBinding.inflate(inflater, container, false)
        return binding.root
    }

    companion object {
        fun newInstance(position: Int): FragmentSecond {
            val args = Bundle()
            args.putInt("position", position)
            val fragment = FragmentSecond()
            fragment.arguments = args
            return fragment
        }
    }
}