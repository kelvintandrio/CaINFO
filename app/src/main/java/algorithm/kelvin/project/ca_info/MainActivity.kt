package algorithm.kelvin.project.ca_info

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.fragment.app.Fragment
import androidx.fragment.app.FragmentManager
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    private val fragmentManager = supportFragmentManager

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        /** Tab Apps Movie **/
        imageMovie.setOnClickListener {
            setPageFragment(fragmentManager, MovieFragment())
        }

        /** Tab Apps TV **/
        imageTV.setOnClickListener {
            setPageFragment(fragmentManager, TVFragment())
        }
    }

    private fun setPageFragment(fragmentManager: FragmentManager, fragment: Fragment) {
        val fragmentTransaction = fragmentManager.beginTransaction().apply {
            replace(R.id.pageFragment, fragment)
        }
        fragmentTransaction.commit()
    }
}
