/**        -------------------------    */
// [Template no Kotlin Playground](https://pl.kotl.in/WcteahpyN)

enum class Nivel { BASICO, INTERMEDIARIO, AVANÇADO }

enum class Experiencia { INICIANTE,  JUNIOR, PLENO, SENIOR }

data class Usuario(var nome: String, var email: String, var senha: String)

data class ConteudoEducacional(var nome: String, val duracao: Int = 60)

data class Formacao(val nome: String, var conteudos: List<ConteudoEducacional>) {

    var inscritos = mutableListOf<Usuario>()
    
    fun matricular(usuario: Usuario) {
        //TODO("Utilize o parâmetro $usuario para simular uma matrícula (usar a lista de $inscritos).")
       inscritos.add(usuario)
    }
}

fun main() {
  //  TODO("Analise as classes modeladas para este domínio de aplicação e pense em formas de evoluí-las.")
 //   TODO("Simule alguns cenários de teste. Para isso, crie alguns objetos usando as classes em questão.")
    var bootcamp1 = ConteudoEducacional("Kotlin", 90)
    var bootcamp2 = ConteudoEducacional("Github")
    var usuario1 = Usuario("Fernando", "fernando@gmail.com.br", "1234")
    var usuario2 = Usuario("Augusto", "augusto@hotmail.com.br", "1221")
 
    println(bootcamp1)
    println(bootcamp2)
    println(usuario1)
    println(usuario2)
}


