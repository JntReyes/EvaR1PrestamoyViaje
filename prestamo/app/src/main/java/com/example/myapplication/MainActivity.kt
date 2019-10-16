package com.example.myapplication

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.EditText
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        //Manejar el evento de C
        // lick en el boton
        btnCalcular.setOnClickListener(){
            var varCap: Double = edtCapital.text.toString().toDouble()
            var varInter: Double = edtInteres.text.toString().toDouble()
            var varTime: Double = edtTiempo.text.toString().toDouble()

            var res = varCap * (Math.pow((1 + varInter), varTime) * 1) / (Math.pow((1 + varInter), varTime) - 1)

            var intTot = 54

            txvResultado.text = "el monto de los pagos es de ${res.toString()} pesos, " +
                    "el interes es de ${intTot.toString()} y " +
                    "el pago total es ${(res + intTot).toString()}"
        }

        //Hacer las modificaciones necesarias para el calculo de los tres valores Resistencia,
        //corriente y voltaje

    }
}
