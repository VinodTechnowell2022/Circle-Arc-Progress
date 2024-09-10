package com.example.myapplication

import android.os.Bundle
import android.view.View
import android.widget.Button
import androidx.appcompat.app.AppCompatActivity
import com.example.myapplication.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    private lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        startFirstBarProgress()
        startSecondBarProgress()
        startThirdBarProgress()

    }

    private fun startThirdBarProgress() {
        binding.bar3.setUnit("Max Attendance 1000")
        binding.bar3.setMaxValues(1000F)
        binding.bar3.setCurrentValues(177F)
    }

    private fun startSecondBarProgress() {
        binding.bar2.setUnit("Max steps 1000")
        binding.bar2.setMaxValues(1000F)
        binding.bar2.setCurrentValues(300F)
    }

    private fun startFirstBarProgress() {
        binding.bar1.setUnit("Result in %")
        binding.bar1.setMaxValues(100F)
        binding.bar1.setCurrentValues(80F)
    }


}