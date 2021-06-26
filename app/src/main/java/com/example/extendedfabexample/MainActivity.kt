package com.example.extendedfabexample

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Toast
import androidx.core.view.isVisible
import com.google.android.material.floatingactionbutton.ExtendedFloatingActionButton
import com.google.android.material.floatingactionbutton.FloatingActionButton

class MainActivity : AppCompatActivity() {
    private lateinit var mAddFab: FloatingActionButton
    private lateinit var mExtendedFAB: ExtendedFloatingActionButton

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        mAddFab = findViewById(R.id.add_fab)
        mExtendedFAB = findViewById(R.id.extended_fab)

        mAddFab.visibility = View.GONE

        mExtendedFAB.shrink()

        mExtendedFAB.setOnClickListener {

            if (mAddFab.isVisible) {
                mAddFab.visibility = View.GONE
                mExtendedFAB.shrink()
            } else {
                mExtendedFAB.extend()
                mAddFab.visibility = View.VISIBLE
            }
        }

        mAddFab.setOnClickListener {
            Toast.makeText(applicationContext, "Add FAB clicked!", Toast.LENGTH_LONG).show()
        }
    }
}