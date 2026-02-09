fun main(){
    // && AND Operator
    // || OR Operator
    // !  Negation

    val canVote = false
    val hasTicket = true
    val isAllowedToVote = canVote && hasTicket //false because both must be true
    val isAllowedToStadium = canVote || hasTicket //true because any one is true
    val isNotAdult = !canVote //Negation

    println("Is Allowed to vote : $isAllowedToVote")
    println("Is Allowed to enter stadium : $isAllowedToStadium")
    println("Is Not an Adult : $isNotAdult")
}