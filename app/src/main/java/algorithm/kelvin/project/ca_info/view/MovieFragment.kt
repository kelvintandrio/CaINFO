package algorithm.kelvin.project.ca_info.view

import algorithm.kelvin.project.ca_info.R
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import dataItem.adapter.setupAdapterData
import dataItem.data.Data
import kotlinx.android.synthetic.main.fragment_movie.*
import kotlinx.android.synthetic.main.item_data_movie.view.*

class MovieFragment : Fragment() {

    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View? {
        return inflater.inflate(R.layout.fragment_movie, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        rvMovie.setupAdapterData<Data.ListCatalog>(R.layout.item_data_movie, requireContext()) {
            data {
                view.tvTitleMovie.text = item?.title
                view.tvReleaseDateMovie.text = item?.releaseDate
            }
        }
    }
}
