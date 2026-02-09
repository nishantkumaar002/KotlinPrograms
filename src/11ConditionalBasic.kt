fun main(){
    val score = 75
    if(score >= 90){
        println("Excelent you got an A.")
    }else if(score >= 80){
        println("Grade: B.")
    }else if(score >= 70){
        println("Grade: C.")
    }else if(score >= 60){
        println("Grade: D.")
    }else{
        println("Grade: F You can do better next time.")
    }

    val grade = if(score >= 90){
        "A"
    }else if(score >= 80){
        "B"
    }else if(score >= 70){
        "C"
    }else{
        "F"
    }

    println(grade)

}