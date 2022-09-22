package com.example.myapplication0.ui_bar.exp

import android.content.res.Resources
import android.graphics.Color
import android.os.Bundle
import android.util.Log
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.fragment.app.Fragment
import androidx.lifecycle.ViewModelProvider
import androidx.recyclerview.widget.LinearLayoutManager
import com.example.myapplication0.R
import com.example.myapplication0.databinding.FragmentExpBinding


class ExpFragment : Fragment() {

    private var _binding: FragmentExpBinding? = null

    private val doPicture = ArrayList<Do>()
    private val makeList = ArrayList<Make>()
    private val makeList2 = ArrayList<Make>()
    private val makeList3 = ArrayList<Make>()
   // private val data = listOf(R.string.exp_1,R.string.exp_2,R.string.exp_3)
    // This property is only valid between onCreateView and
    // onDestroyView.
    private val binding get() = _binding!!

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        val dashboardViewModel =
            ViewModelProvider(this).get(ExpViewModel::class.java)

        _binding = FragmentExpBinding.inflate(inflater, container, false)


        val root: View = binding.root

        //toolbar
        binding.toolbar.title = "Explore"
        binding.toolbar.setTitleTextColor(Color.parseColor("#FF000000"))


        val textView: TextView = binding.textExp
        dashboardViewModel.text.observe(viewLifecycleOwner) {
            textView.text = it
        }


        initMakes1()

        val layoutManager = LinearLayoutManager(context)
        binding.recyclerView.layoutManager = layoutManager
        layoutManager.orientation = LinearLayoutManager.VERTICAL

        val adapter = RecycleAdapter(makeList)
        binding.recyclerView.adapter = adapter


     /*   for (text in data){
            when (text) {
                R.string.exp_1 -> {
                    initMakes1()
                    val layoutManager = LinearLayoutManager(view?.context)
                    binding.recyclerView.layoutManager = layoutManager
                    val adapter = RecycleAdapter(makeList)
                    binding.recyclerView.adapter = adapter

                    initDoes1()
                    val layoutManager2 = LinearLayoutManager(view?.context)
                    layoutManager2.orientation = LinearLayoutManager.HORIZONTAL
                    binding2.recyclerView2.layoutManager = layoutManager2
                    val adapter2 = RecycleAdapter2(doPicture)
                    binding2.recyclerView2.adapter = adapter2
                }
                R.string.exp_2 -> {
                    initMakes2()
                    val layoutManager = LinearLayoutManager(view?.context)
                    binding.recyclerView.layoutManager = layoutManager
                    val adapter = RecycleAdapter(makeList)
                    binding.recyclerView.adapter = adapter

                    initDoes2()
                    val layoutManager2 = LinearLayoutManager(view?.context)
                    layoutManager2.orientation = LinearLayoutManager.HORIZONTAL
                    binding2.recyclerView2.layoutManager = layoutManager2
                    val adapter2 = RecycleAdapter2(doPicture)
                    binding2.recyclerView2.adapter = adapter2
                }
                else -> {
                    initMakes3()
                    val layoutManager = LinearLayoutManager(view?.context)
                    binding.recyclerView.layoutManager = layoutManager
                    val adapter = RecycleAdapter(makeList)
                    binding.recyclerView.adapter = adapter

                    initDoes3()
                    val layoutManager2 = LinearLayoutManager(view?.context)
                    layoutManager2.orientation = LinearLayoutManager.HORIZONTAL
                    binding2.recyclerView2.layoutManager = layoutManager2
                    val adapter2 = RecycleAdapter2(doPicture)
                    binding2.recyclerView2.adapter = adapter2
                }
            }
        }*/



        return root


    }

    override fun onDestroyView() {
        super.onDestroyView()
        _binding = null
    }

    private fun initMake(){

    }

    private fun initMakes1(){
        makeList.add(Make("Disney"))
    }
    private fun initMakes2(){
        makeList2.add(Make("Oil Painting"))
    }
    private fun initMakes3(){
        makeList3.add(Make("Famous Oil Painting"))
    }

    private fun initDoes1(){
        doPicture.add(Do(R.drawable.draw2))
        doPicture.add(Do(R.drawable.draw3))
        doPicture.add(Do(R.drawable.draw4))
        doPicture.add(Do(R.drawable.draw5))
        doPicture.add(Do(R.drawable.draw6))
        doPicture.add(Do(R.drawable.draw7))
        doPicture.add(Do(R.drawable.draw8))
    }
    private fun initDoes2(){
        doPicture.add(Do(R.drawable.draw3))
        doPicture.add(Do(R.drawable.draw4))
        doPicture.add(Do(R.drawable.draw5))
        doPicture.add(Do(R.drawable.draw6))
        doPicture.add(Do(R.drawable.draw7))
        doPicture.add(Do(R.drawable.draw8))
        doPicture.add(Do(R.drawable.draw9))
    }
    private fun initDoes3(){
        doPicture.add(Do(R.drawable.draw4))
        doPicture.add(Do(R.drawable.draw5))
        doPicture.add(Do(R.drawable.draw6))
        doPicture.add(Do(R.drawable.draw7))
        doPicture.add(Do(R.drawable.draw8))
        doPicture.add(Do(R.drawable.draw9))
        doPicture.add(Do(R.drawable.draw10))
    }
}