package dataItem.adapter

import androidx.paging.PagedList
import androidx.recyclerview.widget.GridLayoutManager
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import androidx.recyclerview.widget.StaggeredGridLayoutManager

fun <T> RecyclerView.setupAdapterData(layout: Int, setData: AdapterDataSetup<T>.() -> Unit) {
    setData(AdapterDataSetup(layout, this))
}

@Suppress("UNCHECKED_CAST")
class AdapterDataSetup<T>(layout: Int, private val recyclerView: RecyclerView) {
    private val linearLayoutManagerHorizontal = "LINEAR LAYOUT MANAGER HORIZONTAL"
    private val gridLayoutManager = "GRID LAYOUT MANAGER"
    private val staggeredGridLayoutManagerVertical = "STAGGERED GRID LAYOUT MANAGER VERTICAL"
    private val staggeredGridLayoutManagerHorizontal = "STAGGERED GRID LAYOUT MANAGER HORIZONTAL"
    private val default = "DEFAULT"
    private var adapterData = AdapterData<T>(layout)

    fun data(data: Binding<T>.() -> Unit) {
        adapterData.setData(data as Binding<*>.() -> Unit)
    }

    fun linearLayoutManager(): String = default

    /*fun setData(list: List<T>?) {
        adapterData.addListData(list)
    }*/

    fun setLayoutManager(layoutManager: String, grid: Int) {
        when(layoutManager) {
            linearLayoutManagerHorizontal -> recyclerView.layoutManager = LinearLayoutManager(recyclerView.context, LinearLayoutManager.HORIZONTAL, false)
            gridLayoutManager -> recyclerView.layoutManager = GridLayoutManager(recyclerView.context, grid)
            staggeredGridLayoutManagerVertical -> recyclerView.layoutManager = StaggeredGridLayoutManager(grid, StaggeredGridLayoutManager.VERTICAL)
            staggeredGridLayoutManagerHorizontal -> recyclerView.layoutManager = StaggeredGridLayoutManager(grid, StaggeredGridLayoutManager.HORIZONTAL)
            default -> recyclerView.layoutManager = LinearLayoutManager(recyclerView.context)
        }
    }

    fun setData(list: PagedList<T>?) {
        adapterData.submitList(list)
    }

    fun setAdapter() {
        recyclerView.adapter = adapterData
    }
}