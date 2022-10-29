package com.example.myapptodoin

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.os.Handler
import android.os.Looper
import com.example.myapptodoin.databinding.ActivitySplashBinding

class Splash : AppCompatActivity() {
    private lateinit var binding:ActivitySplashBinding
    private lateinit var handler: Handler
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding=ActivitySplashBinding.inflate(layoutInflater)
        val view=binding.root
        setContentView(view)
        handler=Handler(Looper.myLooper()!!)
        handler.postDelayed({
           startActivity(Intent(this,MainActivity::class.java))
        },4000)
    }
}