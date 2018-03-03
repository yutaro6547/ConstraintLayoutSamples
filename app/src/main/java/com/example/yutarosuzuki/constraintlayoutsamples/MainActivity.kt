package com.example.yutarosuzuki.constraintlayoutsamples

import android.content.Intent
import android.databinding.DataBindingUtil
import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import com.example.yutarosuzuki.constraintlayoutsamples.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val binding = DataBindingUtil.setContentView<ActivityMainBinding>(this, R.layout.activity_main)
        binding.sample1.setOnClickListener {
            startActivity(Intent(this, Sample1Activity::class.java))
        }
        binding.sample2.setOnClickListener {
            startActivity(Intent(this, Sample2Activity::class.java))
        }
        binding.sample3.setOnClickListener {
            startActivity(Intent(this, Sample3Activity::class.java))
        }
        binding.sample4.setOnClickListener {
            startActivity(Intent(this, Sample4Activity::class.java))
        }
    }
}
