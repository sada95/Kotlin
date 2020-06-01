package Classes

class Person(val  prenom : String = "sada" , val  nom : String = "Anne" ) {

  var nickName:String? = null
    set(value) {
        field = value
        println("the new nickName is $value")
    }
    get() {
        println("the returned value is $field")
        return field
    }
  fun printInfo(){
      val nickNameToPrint = nickName?: "no nickName"
      println("$prenom ($nickNameToPrint) $nom")
  }
}