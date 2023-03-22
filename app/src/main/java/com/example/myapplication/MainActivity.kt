package com.example.myapplication

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.widget.Toast
import androidx.core.content.res.ResourcesCompat
import com.example.myapplication.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    lateinit var binding : ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.btnBox1.setOnClickListener{
            binding.tvMessageBox1.setTextColor(getColor(R.color.purple_200))
            binding.btnBox1.setTextColor(ResourcesCompat.getColor(resources, R.color.button_color,null))

            Log.e("MainActivity",getString(R.string.tv_message3))
            Toast.makeText(applicationContext,getString(R.string.tv_message3),Toast.LENGTH_SHORT).show()
        }
        binding.btnBox2.setOnClickListener{
            binding.tvMessageBox2.setTextColor(getColor(R.color.teal_200))
            binding.btnBox2.setTextColor(ResourcesCompat.getColor(resources, R.color.button_color,null))

            Log.e("MainActivity",getString(R.string.tv_message4))
            Toast.makeText(applicationContext,getString(R.string.tv_message4),Toast.LENGTH_SHORT).show()
        }

    }
}