package com.example.myapplication0

import android.annotation.SuppressLint
import android.content.Intent
import android.os.Bundle
import android.util.Log
import android.view.View
import androidx.appcompat.app.AlertDialog
import androidx.appcompat.app.AppCompatActivity
import androidx.preference.PreferenceFragmentCompat
import com.example.myapplication0.databinding.SettingsActivityBinding
import com.example.myapplication0.ui_bar.me.MeFragment

class SettingsActivity : AppCompatActivity()/*,View.OnClickListener*/ {

    @SuppressLint("ResourceAsColor")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        val binding = SettingsActivityBinding.inflate(layoutInflater)
        setContentView(binding.root)
 /*       if (savedInstanceState == null) {
            supportFragmentManager
                .beginTransaction()
                .replace(R.id.settings, SettingsFragment())
                .commit()

        }
        supportActionBar?.setDisplayHomeAsUpEnabled(true)*/
        supportActionBar?.hide()

        binding.toolbar.title = "Settings"
        binding.toolbar.setTitleMargin(300,10,0,0)
        binding.toolbar.setNavigationIcon(R.drawable.ic_setting_back)
        binding.toolbar.setBackgroundColor(R.color.purple_200)
        binding.toolbar.setNavigationOnClickListener {
            Log.d("test00","1")
            finish()
        }


        binding.text4.setOnClickListener{
            Log.d("test00","1")
            AlertDialog.Builder(this).apply {
                setTitle("Rate It 5-Star")
                setMessage("Something import.")
                setCancelable(false)
                setPositiveButton("5-STAR"){ _, _ ->
                }
                setNegativeButton("Later"){ _, _ ->
                }
                show()
            }
        }
    }

  /*  class SettingsFragment : PreferenceFragmentCompat() {
        override fun onCreatePreferences(savedInstanceState: Bundle?, rootKey: String?) {
            setPreferencesFromResource(R.xml.root_preferences, rootKey)
        }
    }*/

/*    override fun onClick(v: View?) {
        when(v?.id){
            R.id.text4->{
                Log.d("testRateus","okk")
                AlertDialog.Builder(this).apply {
                    setTitle("Rate It 5-Star")
                    setMessage("Something import.")
                    setCancelable(false)
                    setPositiveButton("5-STAR"){ _, _ ->
                    }
                    setNegativeButton("Later"){ _, _ ->
                    }
                    show()
                }
        }
        }
    }*/
}