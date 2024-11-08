package com.example.coco.view

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.activity.viewModels
import com.example.coco.R

class SelectActivity : AppCompatActivity() {

    private val viewModel : SelectViewModel by viewModels()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_select)

        viewModel.getCurrentCoinList()

    }
}