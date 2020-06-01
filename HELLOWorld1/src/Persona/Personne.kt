package Persona

class Personne(val  prenom : String = "A", val  nom : String = "B",  var age : Int = 0) {
}
    fun main(args: Array<String>) {
        var p: Personne = Personne()
        println(p.prenom)
        println(p.nom)

    }
