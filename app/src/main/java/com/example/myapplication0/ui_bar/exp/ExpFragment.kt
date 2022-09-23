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
    private val doPicture2 = ArrayList<Do>()
    private val doPicture3 = ArrayList<Do>()
    private val doPicture4 = ArrayList<Do>()
    private val doPicture5 = ArrayList<Do>()
    private val makeList = ArrayList<Make>()

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
        val adapter = RecycleAdapter(makeList)
        binding.recyclerView.adapter = adapter


        return root

    }

    override fun onDestroyView() {
        super.onDestroyView()
        _binding = null
    }


    private fun initMakes1(){
        initPicture()
        makeList.add(Make(null,null,"test1",R.drawable.draw1))
        makeList.add(Make("Disney",doPicture,null,null))
        makeList.add(Make("Oil Painting",doPicture2,null,null))
        makeList.add(Make("Famous Oil Painting",doPicture3,null,null))
        makeList.add(Make("Famous2",doPicture4,null,null))
        makeList.add(Make("Famous3",doPicture5,null,null))
    }

    private fun initPicture(){
        doPicture.add(Do(R.drawable.draw2))
        doPicture.add(Do(R.drawable.draw3))
        doPicture.add(Do(R.drawable.draw4))
        doPicture.add(Do(R.drawable.draw5))

        doPicture2.add(Do(R.drawable.draw3))
        doPicture2.add(Do(R.drawable.draw4))
        doPicture2.add(Do(R.drawable.draw5))
        doPicture2.add(Do(R.drawable.draw6))

        doPicture3.add(Do(R.drawable.draw4))
        doPicture3.add(Do(R.drawable.draw5))
        doPicture3.add(Do(R.drawable.draw6))
        doPicture3.add(Do(R.drawable.draw7))

        doPicture4.add(Do(R.drawable.draw5))
        doPicture4.add(Do(R.drawable.draw6))
        doPicture4.add(Do(R.drawable.draw7))
        doPicture4.add(Do(R.drawable.draw8))

        doPicture5.add(Do(R.drawable.draw6))
        doPicture5.add(Do(R.drawable.draw7))
        doPicture5.add(Do(R.drawable.draw8))
        doPicture5.add(Do(R.drawable.draw9))
    }


    /*private fun initDoes1(){
        doPicture.add(Do(R.drawable.draw2))
        doPicture.add(Do(R.drawable.draw3))
        doPicture.add(Do(R.drawable.draw4))
        doPicture.add(Do(R.drawable.draw5))
        doPicture.add(Do(R.drawable.draw6))
        doPicture.add(Do(R.drawable.draw7))
        doPicture.add(Do(R.drawable.draw8))
    }*/

}