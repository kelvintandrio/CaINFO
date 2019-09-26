package dataItem.data

import com.google.gson.annotations.SerializedName

data class TV(
    @field:SerializedName("results")
    val dataTV: ArrayList<Data.ListCatalogTV>? = null
)