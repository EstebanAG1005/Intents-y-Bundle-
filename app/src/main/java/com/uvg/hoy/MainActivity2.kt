package com.uvg.hoy

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_main2.*

class MainActivity2 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main2)

        val bundle = intent.extras
        var op = ""

        if (bundle != null) {

            val valor2 = bundle.getString("valor2")
            Toast.makeText(this, valor2, Toast.LENGTH_SHORT).show()

            op = valor2.toString()
        }

        btnRegresar.setOnClickListener {
            val intent: Intent = Intent()
            val valor1 = valorA.text.toString().toInt()
            val valor2 = valorB.text.toString().toInt()
            var res = 0

            if (op.equals("Suma")) {
                res = valor1 + valor2

            } else if (op.equals("Resta")) {
                res = valor1 - valor2

            } else if (op.equals("Multiplicacion")) {
                res = valor1 * valor2

            } else if(op.equals("Division")) {
                res = valor1 / valor2

            } else {
                res = 0
            }

            val resultadoString = res.toString()

            intent.putExtra("Resultado1", resultadoString)
            setResult(RESULT_OK, intent)
            finish()
        }

    }
}