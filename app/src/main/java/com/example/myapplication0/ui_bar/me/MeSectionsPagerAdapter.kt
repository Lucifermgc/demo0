package com.example.myapplication0.ui_bar.me

import android.content.Context
import android.util.Log
import androidx.fragment.app.Fragment
import androidx.fragment.app.FragmentManager
import androidx.fragment.app.FragmentPagerAdapter
import com.example.myapplication0.R

private val TAB_TITLES = arrayOf(
    R.string.me_1,
    R.string.me_2,
    R.string.me_3,
    R.string.me_4,
)

/**
 * A [FragmentPagerAdapter] that returns a fragment corresponding to
 * one of the sections/tabs/pages.
 */
class MeSectionsPagerAdapter(private val context: Context, fm: FragmentManager) :
    FragmentPagerAdapter(fm) {

    override fun getItem(position: Int): Fragment {
        // getItem is called to instantiate the fragment for the given page.
        // Return a PlaceholderFragment (defined as a static inner class below).
        Log.d("test","$position")

        if (position == 0){
            return MeFragmentsOne.newInstance(position+1)
        }
        else if (position == 1){
            return MeFragmentsTwo.newInstance(position+1)
        }
        else if (position == 2){
            return MeFragmentsThree.newInstance(position+1)
        }
        else{return return MeFragmentsOne.newInstance(position+1)}

    }

    override fun getPageTitle(position: Int): CharSequence? {
        return context.resources.getString(TAB_TITLES[position])
    }

    override fun getCount(): Int {
        // Show 2 total pages.
        return 4
    }
}