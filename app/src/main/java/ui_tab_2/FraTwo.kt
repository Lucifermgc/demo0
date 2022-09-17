package ui_tab_2

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.Window
import com.example.myapplication0.databinding.FraOneBinding
import com.example.myapplication0.databinding.FraTwoBinding

class FraTwo : AppCompatActivity() {
    private lateinit var binding: FraTwoBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        binding = FraTwoBinding.inflate(layoutInflater)
        requestWindowFeature(Window.FEATURE_NO_TITLE)
        setContentView(binding.root)



    }
}