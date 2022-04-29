package com.example.viewpager2.Fragments

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import com.example.viewpager2.databinding.FragmentThirdBinding

class FragmentThird : Fragment() {

    private lateinit var binding: FragmentThirdBinding

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        binding = FragmentThirdBinding.inflate(inflater, container, false)
        return binding.root
    }

    companion object {
        fun newInstance(position: Int): FragmentThird {
            val args = Bundle()
            args.putInt("position", position)
            val fragment = FragmentThird()
            fragment.arguments = args
            return fragment
        }
    }
}