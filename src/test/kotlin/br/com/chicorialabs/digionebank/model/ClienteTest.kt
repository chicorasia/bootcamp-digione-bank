package br.com.chicorialabs.digionebank.model

import br.com.chicorialabs.digionebank.model.cliente.Cliente
import org.hamcrest.CoreMatchers.`is`
import org.hamcrest.CoreMatchers.equalTo
import org.junit.Assert.*
import org.junit.Test
import kotlin.test.assertFails

class ClienteTest{

    @Test
    fun deve_criarObjetoCliente_AoReceberParametros(){

        val cliente = Cliente(nome = "Han Solo", cpf = "111.111.111-22", senha = "1001")
        assertThat(cliente.nome, `is`(equalTo("Han Solo")))
        assertThat(cliente.cpf,  `is`(equalTo("111.111.111-22")))

    }

    @Test
    fun deve_ValidarOToken_QuandoRecebeUmTokenCorreto(){

        val pessoa = Cliente(nome = "Han Solo", cpf = "111.111.111-22", senha = "1001")
        val tokenTeste = pessoa.Token().atualizaToken(System.currentTimeMillis())

        assertTrue(pessoa.Token().validaToken(tokenTeste))

    }

    @Test
    fun deve_LancarException_QuandoRecebeUmTokenInvalido(){

        val pessoa = Cliente(nome = "Han Solo", cpf = "111.111.111-22", senha = "1001")
        val tokenTeste = 123456

        assertFails { pessoa.Token().validaToken(tokenTeste) }

    }

    @Test
    fun deve_LancarException_QuandoTentaLoginComSenhaIncorreta() {

        val pessoa = Cliente(nome = "Han Solo", cpf = "111.111.111-22", senha = "1001")

        assertFails(message = "Senha incorreta") { pessoa.login("2002") }
    }

    @Test
    fun deve_RealizarLogin_QuandoRecebeSenhaCorreta() {

        val pessoa = Cliente(nome = "Han Solo", cpf = "111.111.111-22", senha = "1001")

        assertTrue(pessoa.login("1001"))

    }
}