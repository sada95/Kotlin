import kotlin.math.sqrt
fun main() {
    println("hello kotlin")
    println(1+1)
    println(50/3)
    println(3.5*2)
    println(50.3/3.0)
    println(1.0/3.0)
    println(2.times(3))
    val x = 6
    val y:Int = 6
    println(x)
    println(y)
    //x = 5 // error: val cannot be reassigned
    var z = 10
    z = 20
    println(z) //20
    x.toString()

    var s = x.toString()
    println(s)

    //println(6 is String) //error: incompatible types: String and Int
    println("6" is String)
    val s1:String = "hhh"

    //val d:Double = 5 // error: the integer literal does not conform to the expected type Double
    val d:Double = 5.0

    val d1:Double = 5.toDouble()

    val i = 5

    println("J'ai $i paires de chaussettes ")

    val j = 10
    println("J'ai ${i+j} paires de chaussettes")

    sqrt(d1)
    //error: unresolved reference: sqrt faudra importer : import kotlin.math.sqrt
    sqrt(d1)
    println(sqrt(5.0))
    println(kotlin.math.PI)
    val nb1 = 50
    val nb2 = 60
    if (nb1 > nb2){
        println("Tres bien")
    } else {
        println("passable")
    }

    //range
    if(nb1 in 1..100){
        println(nb1)
    }
    if(nb1 in 1..100){
        println("nb1 est entre 1 et 100")
    }
    //nb1 est entre 1 et 100

    when(nb1){
        0 -> println("Zero")
        in 1..100 -> println("Entre 1 et 100")
        else -> println("Superieur a 101 (strictement)")
    }
    //Entre 1 et 100

    when(nb1){
        0 -> println("Zero")
        in 1..100 -> println("Entre 1 et 100")
        else -> println("Pas dans l'intervalle considere")
    }
    //Entre 1 et 100
    //var e:Int = null //error: null can not be a value of a non-null type Int

    var e:Int? = null

    if (e!=null){
        println("e n est pas null")
    } else {
        println("e est null")
    }
    //e est null
    println(e.toString()) // null
    if(e != null){
        println("e.method() est ok")
    }

    var h = 10
    h?.dec()
//******************array , list **************************************************************

    var school = listOf("Thies","Bambey","Dakar")
    println(school)   //[Thies, Bambey, Dakar]

    var schoolm = mutableListOf("Ziguinchor","St Louis")
    println(schoolm)  //[Ziguinchor, St Louis]

    schoolm.remove("Ziguinchor")
    println(schoolm)  //[St Louis]

    //school.remove("Thies") // error fonction remove

    for(element in school){
        println(element)
    }
    //ThiesBambeyDakar

    for(element in school){
        println(element+" ")
    }
    //Thies Bambey Dakar

    var newschool = arrayOf("ISM", 1, "SupDeco")
    println(newschool)  //[Ljava.lang.Object;@5904c3dc

            println(newschool[0]) //ISM

    println(java.util.Arrays.toString(newschool))  //[A, B]

    var myA = Array(5){it*2}

    println(myA) //[Ljava.lang.Integer;@1d70dc00

            println(java.util.Arrays.toString(myA)) //[0, 2, 4, 6, 8]


    var newschooll = arrayOf("A", "B")
    for(elt in newschooll){
        println(elt + " ")
    }
}