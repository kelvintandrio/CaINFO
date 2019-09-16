package dataItem.adapter

import android.content.Context
import android.util.Log
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.paging.PagedListAdapter
import androidx.recyclerview.widget.RecyclerView

class AdapterData<T>(private val layoutItemData: Int, private val context: Context): PagedListAdapter<T, RecyclerView.ViewHolder>(DataDiffUtil()) {
    private lateinit var setupData: Binding<*>.(view: View, position: Int, item: Any?) -> Unit
    private var itemData: T? = null

    private fun getItem() : T? = itemData

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): RecyclerView.ViewHolder {
        return DataViewHolder(LayoutInflater.from(parent.context).inflate(layoutItemData, parent, false))
    }

    override fun onBindViewHolder(holder: RecyclerView.ViewHolder, position: Int) {
        val itemHolder = holder as DataViewHolder
        itemData = getItem(position)
        if(itemData != null) {
            try {
                itemHolder.setItemListData(setupData, getItem(), position)
            }
            catch (e: UninitializedPropertyAccessException) {
                throw IllegalArgumentException("'bind' is not working")
            }
        }
    }

    fun setData(binding: Binding<*>.(view: View, position: Int, item: Any?) -> Unit) {
        this.setupData = binding
    }

}

@Suppress("UNCHECKED_CAST")
class DataViewHolder(view: View): RecyclerView.ViewHolder(view) {
    fun<T> setItemListData(setup: Binding<*>.(view: View, position: Int, item: T) -> Unit, item: Any?, position: Int) = itemView.run {
        val setupData = Binding(this, item, position)
        setup(setupData, setupData.viewAdapterData, setupData.position, setupData.item as T )
    }
}