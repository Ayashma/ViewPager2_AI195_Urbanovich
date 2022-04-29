package com.example.viewpager2.Fragments

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.example.viewpager2.databinding.FragmentFirstBinding


class FragmentFirst : Fragment() {

    private lateinit var binding: FragmentFirstBinding

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        binding = FragmentFirstBinding.inflate(inflater, container, false)
        return binding.root
    }

    companion object {
        fun newInstance(position: Int): FragmentFirst {
            val args = Bundle()
            args.putInt("position", position)
            val fragment = FragmentFirst()
            fragment.arguments = args
            return fragment
        }
    }
}