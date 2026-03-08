fun main(){
    println("Grading Student 1")
    println("Grading Student 2")
    println("Grading Student 3")
    println("Grading Student 4")
    println("Grading Student 5")
    /*for(variable in range){

    }*/
    println("---ForLoops---")
    for(i in 1..5) {
        println("Grading Student $i")
    }

    //print only even number
    println("---step loop---")
    for (i in 2..10 step 2) {
        println("The even number: $i")
    }

    //counting down
    for (i in 5 downTo 1) {
        println("Counting down to New Year: $i")
    }
    println("Happy New Year")

    println("---loop + if---")
    for(student in 1..5){
        val score = student * 10 + 30
        if (score >= 50){
            println("Student $student scored $score:Passed")
        }else{
            println("Student $student scored $score:Failed")
        }
    }

    println("--nested loop--")
    for(i in 1..3) {
        for(j in 1..3) {
            print("$i$j")
            print(" ")
        }
        println()
    }

    println("--break--")
    for(i in 1..10){
        if(i == 5) break
        println(i)
    }
    println("After Break")

    println("--continue--")
    for(i in 1..10){
        if(i == 5) continue
        println(i)
    }
    println("After Continue")
}