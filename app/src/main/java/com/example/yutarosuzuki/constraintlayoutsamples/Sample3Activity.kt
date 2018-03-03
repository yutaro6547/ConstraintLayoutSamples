package com.example.yutarosuzuki.constraintlayoutsamples

import android.databinding.DataBindingUtil
import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import com.example.yutarosuzuki.constraintlayoutsamples.databinding.ActivitySample3Binding


class Sample3Activity: AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_sample3)
        DataBindingUtil.setContentView<ActivitySample3Binding>(this, R.layout.activity_sample3)
    }
}