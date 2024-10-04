package com.example.testex

fun main(){
    var comp = ""

    println("Please enter a valid Input")
    var user  = readln()
    val rand1: Int  = (1..3).random()

    when(rand1){
        1-> comp="Rock"
        2 -> {
            comp = "Paper"
        }
        3 -> {
            comp  = "Scissor"
        }
    }

    val winner = when{
        user == comp -> "Draw"
        user == "Rock" && comp =="Paper" -> "Lost"
        user =="Paper" && comp == "Scissor" ->  "Lost"
        user == "Scissor" && comp == "Rock" -> "Lost"
        else -> "WIn"
    }
    println(winner)


}

