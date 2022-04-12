package space.arkady.myapplication.presentation.recycler.viewholders

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import kotlinx.android.synthetic.main.title_first_stage.view.*
import space.arkady.myapplication.R
import space.arkady.myapplication.models.BaseItem
import space.arkady.myapplication.models.TitlePage1

class TitleViewHolder(itemView: View) : BaseItemViewHolder(itemView) {

    companion object {
        const val VIEW_TYPE = 1
        fun newInstance(parent: ViewGroup) = TitleViewHolder(
            LayoutInflater.from(parent.context).inflate(
                R.layout.title_first_stage, parent, false
            )
        )
    }

    override fun bindItem(item: BaseItem) {
        (item as TitlePage1).apply {
            itemView.nameTitle.text = titleName
            itemView.nameTitle2.text = firstItem
        }
    }
}