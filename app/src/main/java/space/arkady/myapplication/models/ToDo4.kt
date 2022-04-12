package space.arkady.myapplication.models

data class ToDo4(
    val firstParameter: String,
    val secondParameter: String,
    val itemName: String? = null
) : BaseItem()
