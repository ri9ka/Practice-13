package com.example.ex

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import android.widget.Toast

class SecondActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_second)
    }
    fun MainActivity (view: View) {
        val intent: Intent = Intent(this@SecondActivity, MainActivity::class.java)
        when (view.id) {
            R.id.button2 -> startActivity(intent)
        }
    }

       fun ButtonClick (view: View) {
           val edt1 : EditText = findViewById(R.id.editTextNumber3)
           val edt2 : EditText = findViewById(R.id.editTextNumber4)
           val tv4 : TextView = findViewById(R.id.textView4)
           val b5 : Button = findViewById(R.id.button5)
           val b3 : Button = findViewById(R.id.button3)
           val b4 : Button = findViewById(R.id.button4)

           if (edt1.text.toString() == "" && edt2.text.toString() == "" || edt1.text.toString() == "" || edt2.text.toString() == "") {
               Toast.makeText(this@SecondActivity, "введите данные", Toast.LENGTH_SHORT).show()
           } else {
               b5.setOnClickListener{
                   var a : String = edt1.text.toString()
                   var b : String = edt2.text.toString()

                   var c : Double = a.toDouble()
                   var d : Double = b.toDouble()

                   var cd : Double = Math.sqrt(c*c + d*d)

                   var result : String = cd.toString()

                   tv4.text = "$result"
               }
               b3.setOnClickListener{
                   var a : String = edt1.text.toString()
                   var b : String = edt2.text.toString()

                   var c : Double = a.toDouble()
                   var d : Double = b.toDouble()

                   var cd : Double = (Math.sqrt(c*c + d*d))* c * d

                   var result : String = cd.toString()

                   tv4.text = "$result"
               }
               b4.setOnClickListener{
                   var a : String = edt1.text.toString()
                   var b : String = edt2.text.toString()

                   var c : Double = a.toDouble()
                   var d : Double = b.toDouble()

                   var cd : Double = (c * d)/2

                   var result : String = cd.toString()

                   tv4.text = "$result"
               }
           }
       }
    }