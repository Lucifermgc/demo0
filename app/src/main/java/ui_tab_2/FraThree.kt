package ui_tab_2

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.Window
import com.example.myapplication0.databinding.FraOneBinding
import com.example.myapplication0.databinding.FraThreeBinding

class FraThree : AppCompatActivity() {
    private lateinit var binding: FraThreeBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        binding = FraThreeBinding.inflate(layoutInflater)
        requestWindowFeature(Window.FEATURE_NO_TITLE)
        setContentView(binding.root)



    }
}