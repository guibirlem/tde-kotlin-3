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
fun main2 () {
    val resultTest :Result = Result.Sucess("Sucesso")
    val teste = when(resultTest) {
        is Result.Sucess -> println("sucesso")
        is Result.Loading -> println("loading")
        is Result.Error -> println("error")

    }
    val pessoa3 : Pessoa= Pessoa("Maria", 25, "Engenheira")
    println(pessoa3)
}
open class Pessoa1 (val nome: String){

}
class Cliente (nome: String) : Pessoa1 (nome){

}
sealed class Result {
    data class Sucess(val message: String) : Result()
    data class Error(val error: String) : Result()
    data object Loading : Result()
}

//
fun main4 () {
    println("Digite o nome da pessoa:")
    val nome = readLine() ?: ""
    println("Digite a idade da pessoa:")
    val idade = readLine()?.toIntOrNull() ?: 0
    println("Digite a profissão da pessoa:")
    val profissao = readLine() ?: ""
    println("Digite o CPF da pessoa:")
    val cpf = readLine() ?: ""

    val p1 = Pessoa (nome, idade, profissao, cpf)
    val p2 = Pessoa (nome, idade, profissao, cpf)

    println(Pessoa(nome, idade, profissao, cpf))

}
data class Pessoa ( val name : String,
                    val age : Int,
                    val profession : String,
                    val cpf : String)




