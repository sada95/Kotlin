package Kotlin

/*class Person3(val firstName: String, val lastName: String, var age: Int) {
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
    var p = Person3("A", "B", 0)
    // var p1 = Person3() Ce constructeur n'existe plus
    var pp = Person3("C", "D")
}*/
//**************************version ajouter des fonctions dans la classe**************************
class Person3 (val firstName: String, val lastName: String, var age: Int){
    constructor(firstName: String, lastName: String):this(firstName, lastName,20)
    init{
        // block d'initialization
        println("Initialization")
    }
    var single: Boolean = false
        get() {
            return field
        }
        set(value) {
            field = value
            println("setter")
        }
    fun present(){
        println("Hello $firstName $lastName")
    }
    fun greet(p: Person3){
        println("${p.firstName} greets ${this.firstName}")
    }
}
fun main(args:Array<String>) {
    var p = Person3("A", "B", 0)
    // var p1 = Person3() Ce constructeur n'existe plus
    var pp = Person3("C", "D")
    p.present()
    p.greet(pp)
}