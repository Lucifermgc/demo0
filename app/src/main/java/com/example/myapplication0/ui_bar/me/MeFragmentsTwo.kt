package com.example.myapplication0.ui_bar.me

import android.content.Intent
import android.os.Bundle
import android.util.Log
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.fragment.app.Fragment
import androidx.lifecycle.Observer
import androidx.lifecycle.ViewModelProvider
import com.example.myapplication0.databinding.FragmentTwoBinding
import com.example.myapplication0.databinding.MefraTwoBinding
import ui_tab_2.FraTwo


open class MeFragmentsTwo :Fragment() {

    private var _binding: MefraTwoBinding ?=null

    private val binding get() = _binding!!

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

    }
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {

        _binding = MefraTwoBinding.inflate(inflater, container, false)
        val root = binding.root

       val textView: TextView = binding.sectionLabel

        return root
    }
    companion object {
        private const val ARG_SECTION_NUMBER = "section_number"

        @JvmStatic
        fun newInstance(sectionNumber: Int): MeFragmentsTwo {
            return MeFragmentsTwo().apply {
                arguments = Bundle().apply {
                    putInt(ARG_SECTION_NUMBER, sectionNumber)
                }
            }
        }
    }

    override fun onDestroyView() {
        super.onDestroyView()
        _binding = null
    }

}