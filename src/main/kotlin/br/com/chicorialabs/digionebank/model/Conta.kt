package br.com.chicorialabs.digionebank.model

import java.math.BigDecimal

class Conta(
    val agencia: String,
    val numero: String,
    var saldo: BigDecimal = 0.0.toBigDecimal()
) {

    fun deposita(valor: BigDecimal){

    }

    fun saca(valor: BigDecimal){

    }
}