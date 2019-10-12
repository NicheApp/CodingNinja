package com.exampledev.cnproj1

import android.content.Intent
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import kotlinx.android.synthetic.main.thirdwalkthrfragment.*

class ThirdWalkthrFragment:Fragment() {

    companion object {
        fun newInstance() = ThirdWalkthrFragment()
    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View? {
        return inflater.inflate(R.layout.thirdwalkthrfragment,container,false)

    }

}