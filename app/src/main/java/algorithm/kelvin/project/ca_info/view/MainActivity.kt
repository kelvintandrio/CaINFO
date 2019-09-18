package algorithm.kelvin.project.ca_info.view

import algorithm.kelvin.project.ca_info.R
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import kotlinx.android.synthetic.main.activity_main.*

@Suppress("DEPRECATION")
class MainActivity : AppCompatActivity() {
    private val movie = MovieFragment()
    private val tv = TVFragment()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        var tabNow = tabMovie
        tabNow.setBackgroundColor(resources.getColor(R.color.colorTabItem))

        val mainPageAdapter = MainPageAdapter(supportFragmentManager)
        mainPageAdapter.addPageMenu(movie, tv)
        main_viewpager.adapter = mainPageAdapter

        imageMovie.setOnClickListener {
            main_viewpager.currentItem = 0
            tabNow.setBackgroundColor(resources.getColor(R.color.colorWhite))
            tabNow = tabMovie
            tabNow.setBackgroundColor(resources.getColor(R.color.colorTabItem))
        }

        imageTV.setOnClickListener {
            main_viewpager.currentItem = 1
            tabNow.setBackgroundColor(resources.getColor(R.color.colorWhite))
            tabNow = tabTV
            tabNow.setBackgroundColor(resources.getColor(R.color.colorTabItem))
        }
    }
}
