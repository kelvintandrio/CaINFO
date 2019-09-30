package algorithm.kelvin.project.sportsApps.vmfactory

import algorithm.kelvin.project.sportsApps.viewmodel.SportsViewModel
import androidx.lifecycle.ViewModel
import androidx.lifecycle.ViewModelProvider
import api.movie.ApiRepository
import api.sports.ApiRepositorySports
import io.reactivex.disposables.CompositeDisposable

@Suppress("UNCHECKED_CAST")
class SportsVMFactory(val sportsRepository: ApiRepositorySports, val compositeDisposable: CompositeDisposable): ViewModelProvider.Factory {
    override fun <T : ViewModel?> create(modelClass: Class<T>): T = SportsViewModel(sportsRepository, compositeDisposable) as T
}