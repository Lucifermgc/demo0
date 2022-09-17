package ui_tab_2

import android.os.Bundle
import android.view.Window
import androidx.appcompat.app.AppCompatActivity
import androidx.fragment.app.Fragment
import androidx.navigation.findNavController
import androidx.navigation.ui.AppBarConfiguration
import androidx.navigation.ui.setupActionBarWithNavController
import androidx.navigation.ui.setupWithNavController
import com.example.myapplication0.MainActivity
import com.example.myapplication0.R
import com.example.myapplication0.databinding.ActivityMainBinding
import com.example.myapplication0.databinding.FraOneBinding
import com.google.android.material.bottomnavigation.BottomNavigationView


open class FraOne : AppCompatActivity() {
    private lateinit var binding: FraOneBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        binding = FraOneBinding.inflate(layoutInflater)
        requestWindowFeature(Window.FEATURE_NO_TITLE)
        setContentView(binding.root)



    }
}