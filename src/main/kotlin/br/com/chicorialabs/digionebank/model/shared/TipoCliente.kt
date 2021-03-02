package br.com.chicorialabs.digionebank.model.shared

enum class TipoCliente(val descricao: String) {
    PF("Pessoa Física"),
    PJ("Pessoa Jurídica");

    fun imprimeTipoDeClienteFormatado(){
        println("Cliente do tipo $descricao...")
    }

}