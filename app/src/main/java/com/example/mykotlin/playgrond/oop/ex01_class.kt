package com.example.mykotlin.playgrond.oop

fun main() {
    val obj1 = PrimaryClass("iamo")
    obj1.display()

    val obj2 = Secondary("xxx", 555)
    obj2.display()

    val obj3 = PSClass(999)
    println("name : ${obj3.name} , score : {${obj3.score}} ")

    val obj4 = DateClass("xxx", 555)
    val obj5 = DateClass("xxx", 555)

    println(obj4 == obj5)
    println(obj4.toString())

}


class PrimaryClass(val name: String, val age: Int = 123) {

    init {
        println("ini")
    }

    fun display() {
        val result = "name : $name, age: $age,"
        println(result)
    }

}

class Secondary {
    var name: String
    var age: Int

    constructor() {
        this.name = ""
        this.age = 0

    }

    constructor(name: String, age: Int) {
        this.name = name
        this.age = age
    }

    init {
        println("ini")
    }

    fun display() {
        val result = "name : $name, age: $age,"
        println(result)
    }
}

class PSClass(val score: Int, val name: String) {
    constructor(score: Int) : this(name = "xx", score = score) {

    }

}

data class DateClass(var name: String, var age: Int) {

}
