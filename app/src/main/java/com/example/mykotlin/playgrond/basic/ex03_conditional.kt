package com.example.mykotlin.playgrond.basic


fun main() {
    var ex1 = if (true) {
        1234
    } else {
        9999
    }
    var ex2 = if (true) 1234 else 9999

    // switch case

    when (val name = "iamo") {
        "pongchai" -> {
            println(name)
        }
        "iamo", "xxx" -> {
            println("iamo or xxxx ")
        }
        else -> {
            println("default case ")
        }
    }
    val score  = 40
    when(score){
        in 0..10 ->{
            println("D")
        }

        in 10.. 50 -> {
            println("A")
        }
    }

    println(ex1)
    println(ex2)
}