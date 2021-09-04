package com.example.chessapp

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.view.View
import com.example.chessapp.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    lateinit var bindingClass: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        bindingClass = ActivityMainBinding.inflate(layoutInflater)
        setContentView(bindingClass.root)
    }
    fun getResult(view: View){
        if (!bindingClass.CAD.getText().toString().equals("")){
            if (!bindingClass.DAD.getText().toString().equals("")) {
                if (!bindingClass.weight.getText().toString().equals("")){
                    if (!bindingClass.rate.getText().toString().equals("")){
                        val weight = bindingClass.weight.text.toString().toInt()
                        val rate = bindingClass.rate.text.toString().toInt()
                        val CAD = bindingClass.CAD.text.toString().toInt()
                        val DAD = bindingClass.DAD.text.toString().toInt()
                        val k = 0.8244f * 0.0001f
//                        val k = 0.9357f * 0.0001f

                        val PAP = CAD - DAD
                        val s = rate * (Math.cbrt(weight.toDouble())) * PAP * k
                        bindingClass.result.text = when (s) {
                            in 0.88..1.12 -> "Стресс отсутствует"
                            else -> "Стресс"
                        }

                    }
                }
            }
        }
    }


}