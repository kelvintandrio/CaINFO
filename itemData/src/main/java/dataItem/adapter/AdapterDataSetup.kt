package dataItem.adapter

import android.content.Context
import android.view.View
import androidx.paging.PagedList
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView

fun <T> RecyclerView.setupAdapterData(layout: Int, context: Context, setData: AdapterDataSetup<T>.() -> Unit) {
    setData(AdapterDataSetup(layout, context, this))
}

@Suppress("UNCHECKED_CAST")
class AdapterDataSetup<T>(layout: Int, context: Context, recyclerView: RecyclerView) {
    private var adapterData = AdapterData<T>(layout, context)
    val linearLayoutManager = LinearLayoutManager(context)

    fun data(data: Binding<T>.() -> Unit) {
        adapterData.setData(data as Binding<*>.(view: View, position: Int, item: Any?) -> Unit)
    }

    /*fun setData(list: List<T>?) {
        adapterData.addListData(list)
    }*/

    fun setData(list: PagedList<T>?) {
        adapterData.submitList(list)
    }

    init {
        recyclerView.adapter = adapterData
    }
}