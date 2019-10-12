package com.exampledev.cnproj1

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment

class SecondWalkthrFragment:Fragment() {

    companion object {
        fun newInstance() = SecondWalkthrFragment()
    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View? {
        return inflater.inflate(R.layout.secondwalkthrfragment,container,false)
    }
}