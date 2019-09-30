@file:Suppress("DEPRECATION")
package algorithm.kelvin.project.sportsApps

import algorithm.kelvin.project.sportsApps.viewmodel.SportsViewModel
import algorithm.kelvin.project.sportsApps.vmfactory.SportsVMFactory
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.lifecycle.LifecycleOwner
import androidx.lifecycle.Observer
import androidx.lifecycle.ViewModelProviders
import api.sports.ApiRepositorySports
import com.bumptech.glide.Glide
import dataItem.adapter.setupAdapterData
import dataItem.data.Data
import io.reactivex.disposables.CompositeDisposable
import kotlinx.android.synthetic.main.fragment_all_sports.*
import kotlinx.android.synthetic.main.item_data_sports.view.*

class SportsFragment : Fragment() {
    private val sportsViewModel by lazy {
        ViewModelProviders.of(this, SportsVMFactory(sportsRepository = ApiRepositorySports(), compositeDisposable = CompositeDisposable()))
            .get(SportsViewModel::class.java)
    }

    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View? {
        return inflater.inflate(R.layout.fragment_all_sports, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        rvSports.setupAdapterData<Data.ListCatalogAllSports>(R.layout.item_data_sports, requireContext()) {
            data {
                Glide.with(this@SportsFragment).load(item?.thumbnail).into(viewAdapterData.imgSports)
                viewAdapterData.tvNameSports.text = item?.title
                viewAdapterData.tvDescriptionSports.text = item?.description
            }
            sportsViewModel.getAllSports().observe(requireContext() as LifecycleOwner, Observer {
                setData(it)
            })
            setLayoutManager(linearLayoutManager(),0)
            setAdapter()
        }
    }
}