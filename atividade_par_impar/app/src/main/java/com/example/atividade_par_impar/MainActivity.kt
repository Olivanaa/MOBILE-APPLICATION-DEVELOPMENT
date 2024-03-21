package com.example.atividade_par_impar

import android.os.Bundle
import android.widget.Toast
import androidx.activity.ComponentActivity
import com.example.atividade_par_impar.databinding.ActivityMainBinding

import kotlin.random.Random

class MainActivity : ComponentActivity() {

    private lateinit var binding: ActivityMainBinding
    private var listaNumeros = listOf(1,2,3,4,5)
    private var listaOpcao = listOf("Par", "Impar")
    private var playerChoice: Int = 0
    private var opcao: String = ""

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.viewUm.setOnClickListener{
            println("clicou no um")
            playerChoice = 1


        }
        binding.viewDois.setOnClickListener{
            println("clicou no dois")
            playerChoice = 2

        }
        binding.viewTres.setOnClickListener{
            println("clicou no tres")
            playerChoice = 3

        }
        binding.viewQuatro.setOnClickListener{
            println("clicou no quatro")
            playerChoice = 4

        }
        binding.viewCinco.setOnClickListener{
            println("clicou no cinco")
            playerChoice = 5

        }
        binding.viewPar.setOnClickListener{
            println("clicou no par")
            opcao = "par"
            exibirResultado()

        }
        binding.viewImpar.setOnClickListener{
            println("clicou no impar")
            opcao = "impar"

            exibirResultado()
        }

    }

    private fun escolhaApp(): Int{
        val appChoice: Int = Random.nextInt(5)
        binding.viewEscolhaApp.setText(appChoice).toString()
        println(appChoice)

        return appChoice
    }

    private fun vencedor(playerChoice: Int, appChoice: Int, opcao: String): String {
        val appChoice = escolhaApp()
        val resultado = playerChoice + appChoice

        if (resultado % 2 == 0) {

            if (opcao.equals("par", ignoreCase = true)) {
                return "Você venceu! O resultado é par e você escolheu 'Par'."
            } else {
                return "Você perdeu! O resultado é par e você escolheu 'Ímpar'."
            }
        } else {

            if (opcao.equals("ímpar", ignoreCase = true)) {
                return "Você venceu! O resultado é ímpar e você escolheu 'Ímpar'."
            } else {
                return "Você perdeu! O resultado é ímpar e você escolheu 'Par'."
            }
        }

    }

    private fun exibirResultado() {
        val appChoice = escolhaApp()
        val resultado = vencedor(playerChoice, appChoice, opcao)
        binding.viewResultado.text = resultado
    }

}


