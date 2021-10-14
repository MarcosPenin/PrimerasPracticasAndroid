package com.example.contador

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import android.widget.Toast
import androidx.constraintlayout.widget.ConstraintLayout

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val x=findViewById<Button>(R.id.button2)
        val y=findViewById<TextView>(R.id.textView2)
        val z=findViewById<TextView>(R.id.textView)

        var contador = 0
        var v=findViewById<ConstraintLayout>(R.id.Pantalla1);
        var color=true

        x.setOnClickListener(){
            contador++
           y.setText(contador.toString())

            if (color) {
                v.setBackgroundResource(android.R.color.holo_green_light);
                color = false;
            } else {
                v.setBackgroundResource(android.R.color.white);
                color = true;

            }
            if(contador>19){
                z.setText("No sigas, es peligroso")
            }

            if(contador>40){
                z.setText("Por favor, para")
            }

            if(contador>=50){
                val intent = Intent(this@MainActivity,Vacio::class.java)
                startActivity(intent)
                Toast.makeText(this,"Hasta aquí hemos llegado",Toast.LENGTH_SHORT).show()
            }

        }

    }
}