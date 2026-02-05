fun main(){
    val firstName = "Nishant"
    val lastName = "Kumar"
    val fullName = firstName + " " + lastName
    println(fullName)

    //String templates
    val messageCount = 12
    var welcomeMessage = "Hello, " + firstName + "! You have " + messageCount + " unread message"
    println(welcomeMessage)
    welcomeMessage = "hello, $firstName You have $messageCount unread message"
    println(welcomeMessage)

    //Common functions string templates
    val message = "Hello Kotlin"
    println("Length: ${message.length}")
    println("Uppercase: ${message.uppercase()}")
    println("Lowercase: ${message.lowercase()}")
    println("First five letters: ${message.substring(0,5)}")
    println("Dose it contain 'Kotlin': ${message.contains("Kotlin")}")

    //Multi line string
    val poem = """
        Roses are red,
        Violets are blue,
        Kotlin is fun,
        And so are you!
    """.trimIndent() //.trimIndent() is for remove unwanted space
    println(poem)

    //Multi line string Templates
    val userName = "Nishant"
    val appName = "Kotlin Learner"
    val greatings = """
        Hello, $userName
        Welcome to the $appName
        we are excited to help you learn kotlin
    """.trimIndent()
    println(greatings)
}