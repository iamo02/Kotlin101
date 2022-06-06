package com.example.mykotlin.playgrond.basic


fun main() {
    for (count in 0..10) {
        print("$count ")
    }
    println()

    for (count in 0 until  10) {
        print("$count ")
    }
    println()

    for (count in 10 downTo 0) {
        print("$count ")
    }
    println()

    for (count in 0 ..10 step  3) {
        print("$count ")
    }
    println()

    val arrayDemo = arrayOf("111",222,true)

    for (item in arrayDemo){
        print("$item ")
    }
}