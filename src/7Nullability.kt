fun main(){
    var firstName: String = "Nishant"
    //firstName = null //Not allowed

    var lastName: String? = "Kumar"
    println(lastName)
    lastName = null
    println(lastName)

    var lastName1: String? = "Kumar"
    if(lastName1 != null){
        val uppperCaseLastName = lastName1.uppercase()
        println(uppperCaseLastName)
    }else{
        println("No Last Name")
    }
}