package space.arkady.myapplication.presentation.recycler.viewholders

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.RadioButton
import kotlinx.android.synthetic.main.todo_stage.view.*
import space.arkady.myapplication.R
import space.arkady.myapplication.models.BaseItem
import space.arkady.myapplication.models.ToDo4

class ToDoViewHolder(itemView: View) : BaseItemViewHolder(itemView) {

    companion object {
        const val VIEW_TYPE = 4
        fun newInstance(parent: ViewGroup) =
            ToDoViewHolder(
                LayoutInflater.from(parent.context).inflate(R.layout.todo_stage, parent, false)
            )
    }

    override fun bindItem(item: BaseItem) {
        (item as ToDo4).apply {
            itemView.nameItemTodo.text = itemName
            itemView.firstParameterTodo.text = firstParameter
            itemView.secondParameterTodo.text = secondParameter

            val checkButtonChoice = itemView.radioGroupTodo.checkedRadioButtonId
            val resultChoice = itemView.findViewById<RadioButton>(checkButtonChoice)
        }
    }
}