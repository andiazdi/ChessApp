package com.example.chessapp

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import com.example.chessapp.databinding.ActivityMainBinding
import com.example.chessapp.databinding.ActivityMenuBinding

class MenuActivity : AppCompatActivity() {
    lateinit var bindingClass: ActivityMenuBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        bindingClass = ActivityMenuBinding.inflate(layoutInflater)
        setContentView(bindingClass.root)
    }
    fun onMainActivity(view: View) {
        val intent = Intent(this@MenuActivity, MainActivity::class.java)
        startActivity(intent)
    }

    fun onInfoActivity(view: View) {
        val intent = Intent(this@MenuActivity, InfoActivity::class.java)
        startActivity(intent)
    }
}