package Kotlin

data class Person4(val name: String, var age:Int) {
}
fun main(args: Array<String>){
    val p1 = Person4("A", 10)
    val p2 = Person4("A", 10)
    println(p1 == p2)
    println(p1.equals(p2))
}