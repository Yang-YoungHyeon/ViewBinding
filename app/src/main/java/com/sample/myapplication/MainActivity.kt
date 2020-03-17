package com.sample.myapplication

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView
/** Binding class name automatically generated for xml name */
import com.sample.myapplication.databinding.ActivityMainBinding //viewBinding

class MainActivity : AppCompatActivity() {
    //Binding
    private lateinit var viewBinding : ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        viewBinding.tvTitle.setText("This is viewBinding...")
    }
}
