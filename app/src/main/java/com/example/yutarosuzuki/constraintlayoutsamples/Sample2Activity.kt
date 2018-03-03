package com.example.yutarosuzuki.constraintlayoutsamples

import android.databinding.DataBindingUtil
import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import com.example.yutarosuzuki.constraintlayoutsamples.databinding.ActivitySample2Binding


class Sample2Activity: AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_sample2)
        DataBindingUtil.setContentView<ActivitySample2Binding>(this, R.layout.activity_sample2)
    }
}