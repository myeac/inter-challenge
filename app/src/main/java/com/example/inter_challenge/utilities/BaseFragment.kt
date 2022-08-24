package com.example.inter_challenge.utilities

import android.os.Bundle
import android.view.View
import androidx.fragment.app.Fragment
import androidx.lifecycle.LifecycleOwner
import org.koin.core.component.KoinComponent

abstract class BaseFragment: Fragment(), KoinComponent {

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        setUpView()
        addObservers(viewLifecycleOwner)
    }

    open fun addObservers(owner: LifecycleOwner) = Unit

    open fun setUpView() = Unit

}