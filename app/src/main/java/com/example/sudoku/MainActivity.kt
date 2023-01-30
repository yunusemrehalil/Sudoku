package com.example.sudoku

import android.annotation.SuppressLint
import android.os.Build
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.annotation.RequiresApi
import com.example.sudoku.databinding.ActivityMainBinding

@SuppressLint("StaticFieldLeak")
private lateinit var binding: ActivityMainBinding

class MainActivity : AppCompatActivity() {
    @RequiresApi(Build.VERSION_CODES.M)
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.apply {
            cv17.setOnClickListener(){
                cv17.setBackgroundColor(getColor(R.color.teal_200))
            }
            cv18.setOnClickListener(){
                cv18.setBackgroundColor(getColor(R.color.teal_200))
            }
            cv19.setOnClickListener(){
                cv19.setBackgroundColor(getColor(R.color.teal_200))
            }
            click1.setOnClickListener(){
                tv17.text = "1"
            }
        }




    }
}