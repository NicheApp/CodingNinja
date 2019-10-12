package com.exampledev.cnproj1


import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.MenuItem
import android.view.WindowManager
import androidx.fragment.app.Fragment
import kotlinx.android.synthetic.main.thirdwalkthrfragment.*
import kotlinx.android.synthetic.main.walkthr_main.*

class walkthr_main : AppCompatActivity() {


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.walkthr_main)

        getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN,
            WindowManager.LayoutParams.FLAG_FULLSCREEN);

        val pagerAdapter = WalkthrFragmentPagerAdapter(supportFragmentManager)
        viewPager.adapter = pagerAdapter
    }

    override fun onPostCreate(savedInstanceState: Bundle?) {
        super.onPostCreate(savedInstanceState)

    }

    private fun selectDrawerItem(item: MenuItem) {
        when (item.itemId) {
            R.id.fragmentfirstimage -> viewPager.currentItem = 0
            R.id.fragmentsecondimage -> viewPager.currentItem = 1
            R.id.fragmentthirdimage -> viewPager.currentItem = 2
            else -> viewPager.currentItem = 0
        }

    }

    private fun replaceFragment(fragment: Fragment) {
        val fragmentTransaction = supportFragmentManager.beginTransaction()
        fragmentTransaction.replace(R.id.fragmentContainer, fragment)
        fragmentTransaction.commit()
    }

}


