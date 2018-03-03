package com.example.yutarosuzuki.constraintlayoutsamples

import android.databinding.DataBindingUtil
import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import com.example.yutarosuzuki.constraintlayoutsamples.databinding.ActivitySample1Binding


class Sample1Activity: AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_sample1)
        DataBindingUtil.setContentView<ActivitySample1Binding>(this, R.layout.activity_sample1)
    }

}