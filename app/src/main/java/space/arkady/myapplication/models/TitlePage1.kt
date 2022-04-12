package space.arkady.myapplication.models


data class TitlePage1(
    val titleName: String,
    val firstItem: String? = null
) : BaseItem()