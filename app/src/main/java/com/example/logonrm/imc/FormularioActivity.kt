package com.example.logonrm.imc

import android.content.Intent
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_formulario.*

class FormularioActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_formulario)

        btCalcular.setOnClickListener {
            val telaResultado = Intent (this, ResultadoActivity::class.java)

            telaResultado.putExtra("Peso",
                    inputPeso.editText?.text.toString())

            telaResultado.putExtra("Altura",
                    inputAltura.editText?.text.toString())

            startActivity(telaResultado)
        }

        btLimpar.setOnClickListener {
            inputAltura.editText?.setText("")
            inputPeso.editText?.setText("")
            //!! para executar não importa o que aconteca
            //? chamada de seguranca, evita no pointer exception
        }
    }
}
