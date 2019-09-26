package dataItem.data

import com.google.gson.annotations.SerializedName

object Data {
    data class ListCatalog(
        @field:SerializedName("id") val id: Int? = null,
        @field:SerializedName("title") val title: String? = null,
        @field:SerializedName("release_date") val releaseDate: String? = null,
        @field:SerializedName("poster_path") val poster: String? = null
    )
    data class ListCatalogTV(
        @field:SerializedName("id") val id: Int? = null,
        @field:SerializedName("name") val title: String? = null,
        @field:SerializedName("first_air_date") val releaseDate: String? = null,
        @field:SerializedName("backdrop_path") val poster: String? = null
    )
}