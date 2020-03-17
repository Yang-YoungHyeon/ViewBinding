package com.sample.myapplication

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle

/** Binding class name automatically generated for xml name */
import com.sample.myapplication.databinding.ActivityMainBinding //viewBinding

class MainActivity : AppCompatActivity() {
    //viewBinding
    private lateinit var viewBinding : ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        //viewBinding init
        viewBinding = ActivityMainBinding.inflate(layoutInflater)

        //setContentView
        setContentView(viewBinding.root)

        //view Using
        viewBinding.tvTitle.text = "This is Title.."
        viewBinding.tvSubTitle.setText("This is subTitle..")
    }
}
