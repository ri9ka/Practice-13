package com.example.ex

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.EditText
import android.widget.TextView
import android.widget.Toast

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }
    fun SecondActivity(view: View) {
        val intent : Intent = Intent(this@MainActivity, SecondActivity::class.java )
        when (view.id){
            R.id.button -> startActivity(intent)
        }
    }

    fun ButtonClick (view: View){
        val edt1 : EditText = findViewById(R.id.editTextNumber3)
        val edt2 : EditText = findViewById(R.id.editTextNumber4)
        val tv4 : TextView = findViewById(R.id.textView4)

        if (edt1.text.toString() == "" && edt2.text.toString() == "" || edt1.text.toString() == "" || edt2.text.toString() == ""){
            Toast.makeText(this@MainActivity, "введите данные", Toast.LENGTH_SHORT).show()}

        else {
            val a : String = edt1.text.toString()
            val b : String = edt2.text.toString()

            val d : Int = b.toInt()
            val c : Int = a.toInt()

            val cd : Int = c*d

            val result : String = cd.toString()

            tv4.text = "$result"}
    }
}