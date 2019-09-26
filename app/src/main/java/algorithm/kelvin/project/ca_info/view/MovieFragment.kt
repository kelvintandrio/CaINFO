@file:Suppress("DEPRECATION")
package algorithm.kelvin.project.ca_info.view

import algorithm.kelvin.project.ca_info.R
import algorithm.kelvin.project.movieApps.*
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import kotlinx.android.synthetic.main.fragment_movie.*

class MovieFragment : Fragment() {
    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View? {
        return inflater.inflate(R.layout.fragment_movie, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        val moviePageAdapter = MainPageAdapter(requireFragmentManager())
        moviePageAdapter.addPageMenu(NowPlaying(), Popular(), Upcoming(), TopRelated())
        movie_viewpager.adapter = moviePageAdapter

    }
}
