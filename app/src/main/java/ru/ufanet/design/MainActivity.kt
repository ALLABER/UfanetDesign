package ru.ufanet.design

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import ru.ufanet.design.databinding.ActivityMainBinding
import ru.ufanet.ui_kit.customView.test.EmotionalFaceView

class MainActivity : AppCompatActivity() {

    private lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        val view = binding.root
        setContentView(view)

        binding.emotionalFaceView.setOnClickListener{
            setState()
        }
    }

    private fun setState() {
        if (binding.emotionalFaceView.happinessState == EmotionalFaceView.SAD) {
            binding.emotionalFaceView.happinessState = EmotionalFaceView.HAPPY
        } else {
            binding.emotionalFaceView.happinessState = EmotionalFaceView.SAD
        }
    }
}