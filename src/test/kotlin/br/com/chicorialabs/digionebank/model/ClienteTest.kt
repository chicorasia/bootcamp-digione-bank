package br.com.chicorialabs.digionebank.model

import org.hamcrest.CoreMatchers.`is`
import org.hamcrest.CoreMatchers.equalTo
import org.junit.Assert.*
import org.junit.Test

class ClienteTest{

    @Test
    fun deve_criarObjetoCliente_AoReceberParametros(){

        val cliente = Cliente(nome = "Han Solo", cpf = "111.111.111-22")
        assertThat(cliente.nome, `is`(equalTo("Han Solo")))
        assertThat(cliente.cpf,  `is`(equalTo("111.111.111-22")))

    }

    @Test
    fun deve_ValidarOToken_QuandoRecebeUmTokenCorreto(){

        val pessoa = Cliente(nome = "Han Solo", cpf = "111.111.111-22")
        var tokenTeste = pessoa.Token().atualizaToken(System.currentTimeMillis())

        assertTrue(pessoa.Token().validaToken(tokenTeste))

    }
}