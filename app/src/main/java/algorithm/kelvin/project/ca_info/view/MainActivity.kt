package algorithm.kelvin.project.ca_info.view

import algorithm.kelvin.project.ca_info.R
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    private val movie = MovieFragment()
    private val tv = TVFragment()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val mainPageAdapter = MainPageAdapter(supportFragmentManager)
        mainPageAdapter.addPageMenu(movie, tv)
        main_viewpager.adapter = mainPageAdapter
    }
}
