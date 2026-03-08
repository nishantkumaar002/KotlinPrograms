fun main() {
    print("Enter your name : ")
    val name = readLine()
    println("Hello $name")

    println("Enter your score")
    val score = readLine()?.toInt()
    println(score)
    if (score != null) {
        if (score >= 50){
            println("Passed")
        }else{
            println("You Failed")
        }
    }
}