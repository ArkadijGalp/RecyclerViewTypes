package space.arkady.myapplication.presentation.recycler.viewholders

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import space.arkady.myapplication.R
import space.arkady.myapplication.models.BaseItem
import space.arkady.myapplication.models.DateAndTime2
import java.text.SimpleDateFormat

class DateAndTimeViewHolder(itemView: View) : BaseItemViewHolder(itemView) {

    companion object {
        const val VIEW_TYPE = 2
        fun newInstance(parent: ViewGroup) =
            DateAndTimeViewHolder(
                LayoutInflater.from(parent.context).inflate(R.layout.time_stage, parent, false)
            )
    }

    override fun bindItem(item: BaseItem) {
        (item as DateAndTime2).apply {
            SimpleDateFormat.getDateInstance()
        }
    }
}