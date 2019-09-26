package algorithm.kelvin.project.ca_info.view

import algorithm.kelvin.project.ca_info.R
import algorithm.kelvin.project.movieApps.NowPlaying
import algorithm.kelvin.tvApps.AiringToday
import algorithm.kelvin.tvApps.OnTheAir
import algorithm.kelvin.tvApps.Popular
import algorithm.kelvin.tvApps.TopRated
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import kotlinx.android.synthetic.main.fragment_tv.*

class TVFragment : Fragment() {

    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View? {
        return inflater.inflate(R.layout.fragment_tv, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        val tvPageAdapter = MainPageAdapter(requireFragmentManager())
        tvPageAdapter.addPageMenu(AiringToday(), Popular(), OnTheAir(), TopRated())
        tv_viewpager.adapter = tvPageAdapter

    }
}
