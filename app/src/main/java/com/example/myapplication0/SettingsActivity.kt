package com.example.myapplication0

import android.annotation.SuppressLint
import android.content.Intent
import android.os.Bundle
import android.util.Log
import androidx.appcompat.app.AppCompatActivity
import androidx.preference.PreferenceFragmentCompat
import com.example.myapplication0.databinding.SettingsActivityBinding
import com.example.myapplication0.ui_bar.me.MeFragment

class SettingsActivity : AppCompatActivity() {

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


     /*   binding.settings.setOnClickListener{
            Log.d("test00","1")
            val intent = Intent(this,MeFragment::class.java)
            startActivity(intent)
        }*/
    }

  /*  class SettingsFragment : PreferenceFragmentCompat() {
        override fun onCreatePreferences(savedInstanceState: Bundle?, rootKey: String?) {
            setPreferencesFromResource(R.xml.root_preferences, rootKey)
        }
    }*/
}