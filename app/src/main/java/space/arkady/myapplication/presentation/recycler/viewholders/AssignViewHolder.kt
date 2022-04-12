package space.arkady.myapplication.presentation.recycler.viewholders

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import kotlinx.android.synthetic.main.assign_stage.view.*
import space.arkady.myapplication.R
import space.arkady.myapplication.models.Assign5
import space.arkady.myapplication.models.BaseItem

class AssignViewHolder(itemView: View) : BaseItemViewHolder(itemView) {

    companion object {
        const val VIEW_TYPE = 5
        fun newInstance(parent: ViewGroup) =
            AssignViewHolder(
                LayoutInflater.from(parent.context).inflate(R.layout.assign_stage, parent, false)
            )
    }

    override fun bindItem(item: BaseItem) {
        (item as Assign5).apply {
            itemView.itemNameAssign.text = nameItem
        }
    }
}