import br.com.chicorialabs.digionebank.model.TipoCliente

fun main(){

    TipoCliente.values().forEach {
        println("${it.name}: ${it.descricao}")
    }

    TipoCliente.PF.imprimeTipoDeClienteFormatado()
    TipoCliente.PJ.imprimeTipoDeClienteFormatado()

}