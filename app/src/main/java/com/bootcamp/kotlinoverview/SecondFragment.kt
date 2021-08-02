package com.bootcamp.kotlinoverview

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import android.widget.Toast
import androidx.fragment.app.Fragment


class SecondFragment : Fragment(R.layout.second_fragment) {

    lateinit var btnToast: Button
    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        val view = inflater.inflate(R.layout.second_fragment, null)
        btnToast = view.findViewById(R.id.btnToast)
        return view.rootView
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        btnToast.setOnClickListener {
            Toast.makeText(activity, "I am Groot!", Toast.LENGTH_LONG).show()
        }
    }
}