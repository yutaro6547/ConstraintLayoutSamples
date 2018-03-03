package com.example.yutarosuzuki.constraintlayoutsamples

import android.databinding.DataBindingUtil
import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import com.example.yutarosuzuki.constraintlayoutsamples.databinding.ActivitySample4Binding


class Sample4Activity: AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_sample4)
        DataBindingUtil.setContentView<ActivitySample4Binding>(this, R.layout.activity_sample4)
    }
}