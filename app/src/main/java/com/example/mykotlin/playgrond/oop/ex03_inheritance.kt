package com.example.mykotlin.playgrond.oop

import java.util.*

fun main() {
val cat = Cat()
    cat.say()
    cat.run(20)
}

open class Animal {
    var name = "-"
    var age = 0

   open fun say() {
        println("$name say:Foooooo")
    }
}

class Cat : Animal(), Event{
    override  fun say(){
       name = "iamo"
        println("$name say:meowww")
    }

    override fun run(speed: Int) {
        println("$name speed:20")
    }
}

interface  Event{
    fun run(speed : Int)
}