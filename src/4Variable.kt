 fun main(){
     val name = "Nishant" //var is Read-Only Reference. Immutability: val is similar to the final keyword in Java.
     println("Hello " + name) //println("Hello $name")

     var name2 = "Nishant" // var is Mutable Variable.
     println(name2)
     name2 = "Kumar"
     println(name2)
 }