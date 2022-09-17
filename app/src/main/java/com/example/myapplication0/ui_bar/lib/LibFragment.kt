package com.example.myapplication0.ui_bar.lib

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.viewpager.widget.ViewPager
import com.example.myapplication0.databinding.FragmentLibBinding
import com.google.android.material.tabs.TabLayout
import ui_tab.SectionsPagerAdapter

open class LibFragment : Fragment() {
 //   private val makeList = ArrayList<Make>()
  //  private val doPicture = ArrayList<Do>()

    private var _binding: FragmentLibBinding? = null

    // This property is only valid between onCreateView and
    // onDestroyView.
    private val binding get() = _binding!!

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {

        _binding = FragmentLibBinding.inflate(inflater, container, false)
        val root: View = binding.root

        val sectionsPagerAdapter = SectionsPagerAdapter(root.context,childFragmentManager)
        val viewPager: ViewPager = binding.viewPager
        viewPager.adapter = sectionsPagerAdapter
        val tabs: TabLayout = binding.tabs
        tabs.setupWithViewPager(viewPager)


 /*       initMakes()
        val layoutManager = LinearLayoutManager(context)
        layoutManager.orientation = LinearLayoutManager.HORIZONTAL
        binding.recyclerView.layoutManager = layoutManager
        val adapter = Adapter(makeList)
        binding.recyclerView.adapter = adapter


        initDoes()
        val layoutManager2 = LinearLayoutManager(context)
        binding.recyclerView2.layoutManager = layoutManager2
        val adapter2 = Adapter2(doPicture)
        binding.recyclerView2.adapter = adapter2
*/
        return root

    }

  /*  private fun initMakes(){
        makeList.add(Make("Hot"))
        makeList.add(Make("New"))
        makeList.add(Make("Girl"))
        makeList.add(Make("Animals"))
        makeList.add(Make("Love"))
        makeList.add(Make("Flowers"))
        makeList.add(Make("Holidays"))
        makeList.add(Make("number1"))
        makeList.add(Make("number2"))
        makeList.add(Make("number3"))
        makeList.add(Make("number4"))
        makeList.add(Make("number5"))
    }

    private fun initDoes(){
        doPicture.add(Do(R.drawable.draw2))
        doPicture.add(Do(R.drawable.draw3))
        doPicture.add(Do(R.drawable.draw4))
        doPicture.add(Do(R.drawable.draw5))
        doPicture.add(Do(R.drawable.draw6))
        doPicture.add(Do(R.drawable.draw7))
    }*/

    override fun onDestroyView() {
        super.onDestroyView()
        _binding = null
    }
}