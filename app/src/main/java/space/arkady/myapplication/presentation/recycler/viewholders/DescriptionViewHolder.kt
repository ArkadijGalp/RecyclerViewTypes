package space.arkady.myapplication.presentation.recycler.viewholders

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import kotlinx.android.synthetic.main.description_stage.view.*
import space.arkady.myapplication.R
import space.arkady.myapplication.models.BaseItem
import space.arkady.myapplication.models.Description3

class DescriptionViewHolder(itemView: View) : BaseItemViewHolder(itemView) {

    companion object {
        const val VIEW_TYPE = 3
        fun newInstance(parent: ViewGroup) =
            DescriptionViewHolder(
                LayoutInflater.from(parent.context)
                    .inflate(R.layout.description_stage, parent, false)
            )
    }

    override fun bindItem(item: BaseItem) {
        (item as Description3).apply {
            itemView.titleDescription.text =  titleDescription
            itemView.itemNameDescription.text = textDescription
        }
    }
}