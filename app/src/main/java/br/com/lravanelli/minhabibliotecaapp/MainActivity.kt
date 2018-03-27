package br.com.lravanelli.minhabibliotecaapp

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import br.com.lravanelli.minhabiblioteca.Calculadora
import br.com.lravanelli.minhabiblioteca.CustomToast

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val calc = Calculadora()
        val resultado = calc.somar(1,1)

        CustomToast.showToast(this, "Bls")


    }
}
