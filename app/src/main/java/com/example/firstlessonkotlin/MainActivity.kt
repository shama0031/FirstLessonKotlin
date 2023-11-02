package com.example.firstlessonkotlin

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.TextView
import androidx.lifecycle.MutableLiveData
import com.example.firstlessonkotlin.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    private lateinit var binding: ActivityMainBinding
    private lateinit var textView: TextView
    private var x = 0
    private var i = true
    private var y = 0

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
//        val view = binding.root
        setContentView(binding.root)
        textView = binding.txtView
//        initLister()
        onButtonClick()
    }

//    private fun initLister() {
//        binding.btn1.setOnClickListener {
//            viewModel.onButtonClick()
//        }
//    }

    fun onButtonClick() {
        binding.btn1.setOnClickListener {
            if(i){
               if(x < 10){
                   x++
                   binding.txtView.text = x.toString()
                   if(x == 10) {
                       i = false
                       binding.btn1.text = "-1"

                   }
               }
            }else if(!i){
                if(x > 0){
                    x--
                    binding.txtView.text = x.toString()
                    if(x == 0) {
                        binding.btn1.text = "+1"
                        i = true
                    }
                }
            }
            y++
            if(y ==30){
                val intent = Intent(this, MainActivity2::class.java)
                startActivity(intent)
            }

        }

    }
}