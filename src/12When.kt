fun main(){
    //when(value){......}

    val grade = "B"
    when(grade){
        "A" -> println("Excellent")
        "B" -> println("Good Job")
        "C" -> println("Keep Improving")
        else -> println("Need More Work")
    }


    //using when with range
    val score = 82
    when(score){
        in 90..100 ->{println("Grade A: Excellent")}
        in 80..89 ->{println("Grade B")}
        in 70..79 ->{println("Grade C")}
        in 60..69 ->{println("Grade D")}
        in 0..59 ->{println("Grade F")}
        else -> { println("Invalid Score")}
    }

    //
    when(grade){
        "A","B"-> println("You Passed")
        "C","D"-> println("You Passed with low grade")
        "F"-> println("You Failed")
        else -> println("Invalid Score")
    }

    val hasGoodAttendance = true
    when{
        score >= 90 && hasGoodAttendance -> println("Excellent with Bonus")
        score >= 80 && hasGoodAttendance -> println("Very Good")
        else -> println("Need Improvement")
    }


    val score1 = when(score){
        in 90..100 ->"A"
        in 80..89 ->"B"
        in 70..79 ->"C"
        in 60..69 ->"D"
        else -> "F"
    }
}