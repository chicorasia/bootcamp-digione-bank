package br.com.chicorialabs.digionebank.model

import org.hamcrest.CoreMatchers.`is`
import org.hamcrest.CoreMatchers.equalTo
import org.junit.Assert.*
import org.junit.Test

class PessoaTest{

    @Test
    fun deve_criarObjetoPessoa_AoReceberParametros(){

        val pessoa = Pessoa(nome = "Han Solo", cpf = "111.111.111-22")
        assertThat(pessoa.nome, `is`(equalTo("Han Solo")))
        assertThat(pessoa.cpf,  `is`(equalTo("111.111.111-22")))

    }

    @Test
    fun deve_ValidarOToken_QuandoRecebeUmTokenCorreto(){

        val pessoa = Pessoa(nome = "Han Solo", cpf = "111.111.111-22")
        var tokenTeste = pessoa.Token().atualizaToken(System.currentTimeMillis())

        assertTrue(pessoa.Token().validaToken(tokenTeste))

    }
}