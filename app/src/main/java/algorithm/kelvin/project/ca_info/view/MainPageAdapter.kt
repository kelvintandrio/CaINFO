package algorithm.kelvin.project.ca_info.view

import androidx.fragment.app.Fragment
import androidx.fragment.app.FragmentManager
import androidx.fragment.app.FragmentPagerAdapter

class MainPageAdapter(fragmentManager: FragmentManager) : FragmentPagerAdapter(fragmentManager) {
    private val pageInfoCatalog: MutableList<Fragment> = mutableListOf()

    override fun getItem(page: Int): Fragment = pageInfoCatalog[page]

    override fun getCount(): Int = pageInfoCatalog.size

    fun addPageMenu(vararg fragments: Fragment) {
        for (fragment in fragments)
            this.pageInfoCatalog.add(fragment)
    }
}