package ui_tab

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.Transformations
import androidx.lifecycle.ViewModel

class PageViewModel : ViewModel() {

    private val _index = MutableLiveData<Int>()
    val text:LiveData<String> = Transformations.map(_index){
        "Hey! Here is $it section"
    }

    fun setIndex(index: Int) {
        _index.value = index
    }
}