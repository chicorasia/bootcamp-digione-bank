package br.com.chicorialabs.digionebank.model.conta

import br.com.chicorialabs.digionebank.exception.SaldoInsuficienteException
import java.math.BigDecimal

class Conta(
    val agencia: String,
    val numero: Int,
    var saldo: BigDecimal = BigDecimal.ZERO
) {

    fun deposita(valor: Double){
        val valorBigDecimal = valor.toBigDecimal()
        if(valorBigDecimal >= BigDecimal.ZERO){
            saldo += valorBigDecimal
        }
    }

    fun saca(valor: Double){
        if (podeSacar(valor)) saldo -= valor.toBigDecimal()
        else throw SaldoInsuficienteException("Saldo insuficiente para realizar a operação")
    }

    fun podeSacar(valor: Double): Boolean {
        return valor.toBigDecimal() <= saldo
    }
}