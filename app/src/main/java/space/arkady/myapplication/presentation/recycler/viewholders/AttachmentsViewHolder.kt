package space.arkady.myapplication.presentation.recycler.viewholders

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import kotlinx.android.synthetic.main.attachments_stage.view.*
import space.arkady.myapplication.R
import space.arkady.myapplication.models.Attachments6
import space.arkady.myapplication.models.BaseItem

class AttachmentsViewHolder(itemView: View) : BaseItemViewHolder(itemView) {

    companion object {
        const val VIEW_TYPE = 6
        fun newInstance(parent: ViewGroup) =
            AttachmentsViewHolder(
                LayoutInflater.from(parent.context).inflate(R.layout.attachments_stage, parent, false)
            )
    }

    override fun bindItem(item: BaseItem) {
        (item as Attachments6).apply {
            itemView.nameAttachments.text = nameItem
        }
    }
}