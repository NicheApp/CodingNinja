package com.exampledev.cnproj1

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment

class FirstWalkthrFragment:Fragment() {

    companion object {
        fun newInstance() = FirstWalkthrFragment()
    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View? {
        return inflater.inflate(R.layout.firstwalkthrfragment,container,false)
    }
}