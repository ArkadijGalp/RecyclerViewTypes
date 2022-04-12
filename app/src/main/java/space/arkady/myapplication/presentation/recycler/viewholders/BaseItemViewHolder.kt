package space.arkady.myapplication.presentation.recycler.viewholders

import android.view.View
import androidx.recyclerview.widget.RecyclerView
import space.arkady.myapplication.models.BaseItem

abstract class BaseItemViewHolder(
    itemView: View
) : RecyclerView.ViewHolder(itemView) {
    abstract fun bindItem(item: BaseItem)
}