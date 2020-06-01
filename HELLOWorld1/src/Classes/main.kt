package Classes

fun sayHello(gretting:String ,vararg itemsToGreet:String){
    itemsToGreet.forEach{
        println("$gretting $itemsToGreet")
}
}

fun greetPerson(gretting: String = "Hello" , name: String = "Kotlin") = println("$gretting $name")

fun main(){
    val person = Person()
    person.printInfo()
}