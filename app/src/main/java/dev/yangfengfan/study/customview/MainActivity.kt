package dev.yangfengfan.study.customview

import android.os.Bundle
import android.view.Menu
import androidx.annotation.LayoutRes
import androidx.annotation.StringRes
import androidx.appcompat.app.AppCompatActivity
import androidx.fragment.app.Fragment
import androidx.fragment.app.FragmentPagerAdapter
import androidx.viewpager.widget.ViewPager
import com.google.android.material.tabs.TabLayout

class MainActivity : AppCompatActivity() {
    var pageModels: MutableList<PageModel> = ArrayList()
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val pager = findViewById<ViewPager>(R.id.pager)
        pager.adapter = object : FragmentPagerAdapter(supportFragmentManager) {
            override fun getCount(): Int {
                return pageModels.size
            }

            override fun getItem(p0: Int): Fragment {
                val pageModel = pageModels[p0]
                return PageFragment.newInstance(pageModel.sampleLayoutRes, pageModel.practiceLayoutRes)
            }

            override fun getPageTitle(position: Int): CharSequence? {
                return getString(pageModels[position].titleRes)
            }
        }
        val tabLayout = findViewById<TabLayout>(R.id.tabLayout)
        tabLayout.setupWithViewPager(pager)
    }

    override fun onCreateOptionsMenu(menu: Menu?): Boolean {
        return super.onCreateOptionsMenu(menu)
    }

    inner class PageModel internal constructor(@field:LayoutRes @param:LayoutRes var sampleLayoutRes: Int, @field:StringRes @param:StringRes var titleRes: Int, @field:LayoutRes @param:LayoutRes var practiceLayoutRes: Int)

    init {
        pageModels.add(PageModel(R.layout.sample_color, R.string.title_draw_color, R.layout.practice_color))
        pageModels.add(PageModel(R.layout.sample_circle, R.string.title_draw_circle, R.layout.practice_circle))
        pageModels.add(PageModel(R.layout.sample_rect, R.string.title_draw_rect, R.layout.practice_rect))
        pageModels.add(PageModel(R.layout.sample_point, R.string.title_draw_point, R.layout.practice_point))
        pageModels.add(PageModel(R.layout.sample_oval, R.string.title_draw_oval, R.layout.practice_oval))
        pageModels.add(PageModel(R.layout.sample_line, R.string.title_draw_line, R.layout.practice_line))
        pageModels.add(PageModel(R.layout.sample_round_rect, R.string.title_draw_round_rect, R.layout.practice_round_rect))
        pageModels.add(PageModel(R.layout.sample_arc, R.string.title_draw_arc, R.layout.practice_arc))
        pageModels.add(PageModel(R.layout.sample_path, R.string.title_draw_path, R.layout.practice_path))
        pageModels.add(PageModel(R.layout.sample_histogram, R.string.title_draw_histogram, R.layout.practice_histogram))
        pageModels.add(PageModel(R.layout.sample_pie_chart, R.string.title_draw_pie_chart, R.layout.practice_pie_chart))
    }
}