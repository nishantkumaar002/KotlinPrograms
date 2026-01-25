fun main(){
    //Int data type
    val apples: Int = 5
    val bananas: Int = 3
    val totalFruits = apples + bananas
    println("Total fruits are " + totalFruits)

    //Long data type
    val distanceToTheMoon: Long = 384_400_000L
    println("Distance To The Moon is " + distanceToTheMoon)

    //Decimal (Double data type)
    val petrolPrice: Double = 102.63
    val litres: Double = 10.0
    val totalCost = petrolPrice * litres
    println("Total fuel cost " + totalCost)

    //Decimal (Float data type)
    val pi: Float = 3.14f
    println("The value for Pi is " + pi)

    //string data type
    val firstName: String = "Nishant"
    val lastName: String = "Kumar"
    val fullName: String = firstName + " " + lastName
    println(fullName)

    //Boolean data type (true/false)
    val isLoggedIn: Boolean = true
    println(isLoggedIn)

    //Char data type
    val grade: Char = 'A'
    println("Your Grade is: " + grade)
}