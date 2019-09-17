package dataItem.data

import com.google.gson.annotations.SerializedName

data class Movie(
    @field:SerializedName("results")
    val dataMovie: ArrayList<Data.ListCatalog>? = null
)