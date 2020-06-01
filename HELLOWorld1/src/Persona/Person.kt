package Persona

class Person(val firstName: String, val lastName: String, var age: Int) {

    constructor(firstName: String, lastName: String):this(firstName, lastName,20)
    init{
        // block d'initialization
        println("Initialization")
    }
    fun present(){
        println("Hello $firstName $lastName")
    }
}
fun main(args:Array<String>) {
    var p = Person("A", "B", 0)
    // var p1 = Person3() Ce constructeur n'existe plus
    var pp = Person("C", "D")

}