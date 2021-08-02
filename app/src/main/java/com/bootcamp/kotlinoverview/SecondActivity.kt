package com.bootcamp.kotlinoverview

import android.os.Bundle
import android.widget.Button
import androidx.appcompat.app.AppCompatActivity
import androidx.fragment.app.add
import androidx.fragment.app.commit
import androidx.fragment.app.replace

class SecondActivity : AppCompatActivity() {
    lateinit var secondFragmentBtn: Button
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_second)

        secondFragmentBtn = findViewById(R.id.btnSecondFragment)

        secondFragmentBtn.setOnClickListener {
            /*val fragmentTransaction = supportFragmentManager.beginTransaction()
            val secondFragment = SecondFragment()
            fragmentTransaction.add(secondFragment, "hh")
            fragmentTransaction.commit()*/
            // Create and commit a new transaction
            supportFragmentManager.commit {
                add<SecondFragment>(R.id.fragment_container_view).addToBackStack("SECOND")
            }
        }
    }

    override fun onBackPressed() {
        if (supportFragmentManager.backStackEntryCount == 0) {
            super.onBackPressed()
        } else {
            supportFragmentManager.popBackStack()
        }
    }
}