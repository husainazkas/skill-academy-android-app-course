package com.husainazkas.myskillacademy.presenter.fragments

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.husainazkas.myskillacademy.R

/**
 * A simple [Fragment] subclass.
 * Use the [EmbeddedFragment.getInstance] factory method to
 * get an instance of this fragment.
 */
class EmbeddedFragment : Fragment() {

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_embedded, container, false)
    }

    companion object {
        /**
         * Use this factory method to create a new instance of
         * this fragment using the provided parameters.
         *
         * @return A new instance of fragment EmbeddedFragment.
         */

        private var instance: Fragment? = null

        @JvmStatic
        fun getInstance(): Fragment {
            return instance ?: EmbeddedFragment().also { instance = it }
        }
    }
}