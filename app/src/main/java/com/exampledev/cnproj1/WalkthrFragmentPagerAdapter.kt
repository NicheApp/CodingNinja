package com.exampledev.cnproj1

import androidx.fragment.app.Fragment
import androidx.fragment.app.FragmentManager
import androidx.fragment.app.FragmentPagerAdapter

class WalkthrFragmentPagerAdapter(fragmentManager: FragmentManager): FragmentPagerAdapter(fragmentManager) {
    override fun getItem(position: Int): Fragment {
        return when(position){

            0 -> FirstWalkthrFragment.newInstance()
            1 -> SecondWalkthrFragment.newInstance()
            2 -> ThirdWalkthrFragment.newInstance()
            else -> FirstWalkthrFragment.newInstance()
        }
    }

    override fun getCount() = 3
}