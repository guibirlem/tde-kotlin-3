fun main() {
    val pessoa = Pessoa("João", 30)
    println("Nome: ${pessoa.nome}, Idade: ${pessoa.idade}")
    pessoa.caminhar()
    pessoa.falar()
}

class Pessoa(val nome: String, val idade: Int)

//
fun main1 () {
    val Nome = readline ()!!
    val Idade = readline()!!.toInt()
    val Profissao = readLine()!!

    val pessoa = Pessoa (profissao = Profissao, nome = Nome, idade = Idade)
    println (pessoa)
}
data class Pessoa (val nome: String, val idade: Int , var profissao: String)
    fun caminhar() = println("caminhando")
    fun falar() = println("falando")
}
//



