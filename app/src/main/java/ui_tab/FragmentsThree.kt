package ui_tab

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
import com.example.myapplication0.databinding.FragmentThreeBinding
import ui_tab_2.FraOne
import ui_tab_2.FraThree


open class FragmentsThree :Fragment() {
    private lateinit var pageViewModel: PageViewModel
    private var _binding: FragmentThreeBinding ?=null

    private val binding get() = _binding!!

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        pageViewModel = ViewModelProvider(this).get(PageViewModel::class.java).apply {
            setIndex(arguments?.getInt(ARG_SECTION_NUMBER) ?: 1)
        }
    }
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {

        _binding = FragmentThreeBinding.inflate(inflater, container, false)
        val root = binding.root

             val textView: TextView = binding.sectionLabel
             pageViewModel.text.observe(viewLifecycleOwner, Observer {
                 textView.text = it
             })
        binding.fragmentView3.setOnClickListener {

            Log.d("test_click","it")
            val intent = Intent(context, FraThree::class.java)
            Log.d("test_click","$context")
            context ?. startActivity(intent)

        }
        return root
    }
    companion object {
        private const val ARG_SECTION_NUMBER = "section_number"

        @JvmStatic
        fun newInstance(sectionNumber: Int): FragmentsThree {
            return FragmentsThree().apply {
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