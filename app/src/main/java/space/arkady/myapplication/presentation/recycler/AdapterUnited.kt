package space.arkady.myapplication.presentation.recycler

import android.annotation.SuppressLint
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import space.arkady.myapplication.models.*
import space.arkady.myapplication.presentation.recycler.viewholders.*
import java.lang.IllegalStateException

class AdapterUnited : RecyclerView.Adapter<BaseItemViewHolder>() {

    private var items: List<BaseItem> = emptyList()


    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): BaseItemViewHolder {
        return when (viewType) {
            TitleViewHolder.VIEW_TYPE -> TitleViewHolder.newInstance(parent)
            DateAndTimeViewHolder.VIEW_TYPE -> DateAndTimeViewHolder.newInstance(parent)
            DescriptionViewHolder.VIEW_TYPE -> DescriptionViewHolder.newInstance(parent)
            ToDoViewHolder.VIEW_TYPE -> ToDoViewHolder.newInstance(parent)
            AssignViewHolder.VIEW_TYPE -> AssignViewHolder.newInstance(parent)
            AttachmentsViewHolder.VIEW_TYPE -> AttachmentsViewHolder.newInstance(parent)
            else -> throw IllegalStateException("Wrong viewHolder type")
        }
    }

    override fun onBindViewHolder(holder: BaseItemViewHolder, position: Int) {
        holder.bindItem(items[position])
    }

    override fun getItemViewType(position: Int): Int {
        return when (items[position]) {
            is TitlePage1 -> TitleViewHolder.VIEW_TYPE
            is DateAndTime2 -> DateAndTimeViewHolder.VIEW_TYPE
            is Description3 -> DescriptionViewHolder.VIEW_TYPE
            is ToDo4 -> ToDoViewHolder.VIEW_TYPE
            is Assign5 -> AssignViewHolder.VIEW_TYPE
            is Attachments6 -> AttachmentsViewHolder.VIEW_TYPE
            else -> throw IllegalStateException("Wrong view view type")
        }
    }

    override fun getItemCount() = items.size

    @SuppressLint("NotifyDataSetChanged")
    fun submitList(data: List<BaseItem>) {
        items = data
        notifyDataSetChanged()
    }
}
