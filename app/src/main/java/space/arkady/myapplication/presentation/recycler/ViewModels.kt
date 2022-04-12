package space.arkady.myapplication.presentation.recycler

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import space.arkady.myapplication.models.*

class ViewModels : ViewModel() {
    val data: LiveData<List<BaseItem>> get() = _data
    private val _data = MutableLiveData<List<BaseItem>>()

    init {
        loadData()
    }

    private fun loadData() {
        val items = listOf<BaseItem>(
            TitlePage1("Create Actionable Plans for Product - Phase 01", "Task todo"),
            DateAndTime2("Today", "16:00", "0/2"),
            Description3( "Description: ", "Imagine that you have a two-weeks holiday in Caribbeans in 3 days if you complete this task before thedeadline"),
            ToDo4("Research", "Define", "Todo"),
            Assign5("Assign"),
            Attachments6("Attachments")
        )
        _data.value = items
    }
}