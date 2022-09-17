package com.example.myapplication0.ui_bar.me

import android.content.Intent
import android.os.Bundle
import android.util.Log
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.fragment.app.Fragment
import androidx.lifecycle.ViewModelProvider
import androidx.viewpager.widget.ViewPager
import com.example.myapplication0.SettingsActivity
import com.example.myapplication0.databinding.FragmentMeBinding
import com.google.android.material.tabs.TabLayout
import ui_tab.SectionsPagerAdapter
import ui_tab_2.FraOne

class MeFragment : Fragment() {

    private var _binding: FragmentMeBinding? = null

    // This property is only valid between onCreateView and
    // onDestroyView.
    private val binding get() = _binding!!



    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        val meViewModel =
            ViewModelProvider(this).get(MeViewModel::class.java)

        _binding = FragmentMeBinding.inflate(inflater, container, false)
        val root: View = binding.root
        val MesectionsPagerAdapter = MeSectionsPagerAdapter(root.context,childFragmentManager)
        val viewPager: ViewPager = binding.viewPager
        viewPager.adapter = MesectionsPagerAdapter
        val tabs: TabLayout = binding.tabs
        tabs.setupWithViewPager(viewPager)

        binding.click.setOnClickListener {
            val intent = Intent(context, SettingsActivity::class.java)
            Log.d("test_me_click","$context")
            context ?. startActivity(intent)
        }

        return root
    }

    override fun onDestroyView() {
        super.onDestroyView()
        _binding = null
    }
}