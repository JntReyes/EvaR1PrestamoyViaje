package com.example.myapplication

import android.os.Bundle
import com.google.android.material.bottomnavigation.BottomNavigationView
import androidx.appcompat.app.AppCompatActivity
import androidx.navigation.findNavController
import androidx.navigation.ui.AppBarConfiguration
import androidx.navigation.ui.setupActionBarWithNavController
import androidx.navigation.ui.setupWithNavController
import kotlinx.android.synthetic.main.activity_main2.*

class Main2Activity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main2)

        //Manejar el evento de C
        // click en el boton
        btnCalcular.setOnClickListener(){
            var varKmrec: Double = edtKmrecorridos.text.toString().toDouble()
            var varPreGas: Double = edtPrecioGas.text.toString().toDouble()
            var varDinGas: Double = edtDinGas.text.toString().toDouble()
            var varTiempoT: Double = edtTiempotar.text.toString().toDouble()

            // Formula Consumo de gasolina (en litros y pesos) por cada 100 km.
            var res1 =  1 * varDinGas / varKmrec
            var resp1 = varDinGas / varPreGas / varKmrec * 1

            // Formula Consumo de gasolina (en litros y pesos) por cada km.
            var res2 =  100 * varDinGas / varKmrec
            var resp2 = varDinGas / varPreGas / varKmrec * 100

            //Formula Velocidad media (en km/h)
            var res3 =  1 * varTiempoT / varKmrec



            txvResultado1.text = "Por 100 km, consumo ${res2} pesos y ${resp2} litros y "

            txvResultado2.text = " por 1 km, consumo ${res1} pesos y ${resp1} litros y "

            txvResultado3.text = " la velocidad media (km/h) es  ${res3} km/h "
        }

    }
}
