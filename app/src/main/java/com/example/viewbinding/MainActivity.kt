package com.example.viewbinding

import android.app.Activity
import android.content.res.ColorStateList
import android.graphics.Color
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.renderscript.ScriptGroup.Binding
import android.widget.Toast
import com.example.viewbinding.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    lateinit var binding: ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding=ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)



        binding.btn.setOnClickListener(){
            if(binding.box.isChecked){
                Toast.makeText(this,"You are successfully signed up",Toast.LENGTH_LONG).show()
            }
            else{
                binding.box.buttonTintList= ColorStateList.valueOf(Color.RED)
                Toast.makeText(this,"Accept Terms and Condition",Toast.LENGTH_LONG).show()
            }
        }

    }
}