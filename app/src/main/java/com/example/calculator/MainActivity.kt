package com.example.calculator

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View.OnClickListener
import android.widget.Button
import android.widget.EditText

class MainActivity : AppCompatActivity() {
    var etfirstvalue: EditText? = null
    var etSecondvalue: EditText? = null
    var btnAddbutton: Button? = null
    var btnSubbutton: Button? = null
    var btnModulusbutton: Button? = null
    var btnMultiplybutton: Button? = null
    var btnResultbutton: Button? = null
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        calculation()
    }

    fun castView() {
        etfirstvalue = findViewById(R.id.etFirstvalue)
        etSecondvalue = findViewById(R.id.etSecondvalue)
        btnAddbutton = findViewById(R.id.btnAddbutton)
        btnSubbutton = findViewById(R.id.btnSubbutton)
        btnModulusbutton = findViewById(R.id.btnModulusbutton)
        btnMultiplybutton = findViewById(R.id.btnMultiplybutton)
        btnResultbutton = findViewById(R.id.btnResultbutton)
    }

    fun calculation() {
        castView()
        btnAddbutton!!.setOnClickListener {
            val result = etfirstvalue?.text.toString().toDouble()!! + etSecondvalue?.text.toString()
                .toDouble()
            btnResultbutton?.text = result.toString()
        }
        btnSubbutton!!.setOnClickListener {
            val result = etfirstvalue?.text.toString().toDouble()!! - etSecondvalue?.text.toString()
                .toDouble()
            btnResultbutton?.text = result.toString()
        }
        btnModulusbutton!!.setOnClickListener {
            val result = etfirstvalue?.text.toString().toDouble()!! % etSecondvalue?.text.toString()
                .toDouble()
            btnResultbutton?.text = result.toString()
        }
        btnMultiplybutton!!.setOnClickListener {
            val result = etfirstvalue?.text.toString().toDouble()!! * etSecondvalue?.text.toString()
                .toDouble()
            btnResultbutton?.text = result.toString()
        }
    }
}