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

    println("---Method 2: The Safe Call Operator ---")
    val uppercaseLastName = lastName?.uppercase()
    println(uppercaseLastName)

    println("---Method 3: The Elvis Operator ---")
    lastName = null
    val uppercaseLastNameOrEmpty = lastName?.uppercase() ?: "No Last Name"
    println(uppercaseLastNameOrEmpty)

    println("---Method 4: The non null assertion (Not Safe)---")
    lastName = "Kumar"
    val upperCaseNullAssertion = lastName!!.uppercase()
    println(upperCaseNullAssertion)
}