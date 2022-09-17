package ui_tab

import android.content.Context
import android.util.Log
import androidx.fragment.app.Fragment
import androidx.fragment.app.FragmentManager
import androidx.fragment.app.FragmentPagerAdapter
import com.example.myapplication0.R

private val TAB_TITLES = arrayOf(
    R.string.tab_text_1,
    R.string.tab_text_2,
    R.string.tab_text_3,
    R.string.tab_text_4,
    R.string.tab_text_5,
    R.string.tab_text_6,
    R.string.tab_text_7,
    R.string.tab_text_8,
    R.string.tab_text_9,

)

/**
 * A [FragmentPagerAdapter] that returns a fragment corresponding to
 * one of the sections/tabs/pages.
 */
class SectionsPagerAdapter(private val context: Context, fm: FragmentManager) :
    FragmentPagerAdapter(fm) {

    override fun getItem(position: Int): Fragment {
        // getItem is called to instantiate the fragment for the given page.
        // Return a PlaceholderFragment (defined as a static inner class below).
        Log.d("test","$position")

        if (position == 0){
            return FragmentsOne.newInstance(position+1)
        }
        else if (position == 1){
            return FragmentsTwo.newInstance(position+1)
        }
        else if (position == 2){
            return FragmentsThree.newInstance(position+1)
        }
        else{return return FragmentsOne.newInstance(position+1)}

    }

    override fun getPageTitle(position: Int): CharSequence? {
        return context.resources.getString(TAB_TITLES[position])
    }

    override fun getCount(): Int {
        // Show 2 total pages.
        return 9
    }
}