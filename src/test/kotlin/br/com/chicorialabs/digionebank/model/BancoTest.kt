package br.com.chicorialabs.digionebank.model

import org.hamcrest.CoreMatchers.`is`
import org.hamcrest.CoreMatchers.equalTo
import org.junit.Assert.*
import org.junit.Test

class BancoTest{

    @Test
    fun deve_CriarUmBanco_AoReceberParametros() {

        val banco = Banco(nome = "DigiOneBank", numero = 42)
        assertThat(banco.info(), `is`(equalTo("DigiOneBank - 42")))
    }
}