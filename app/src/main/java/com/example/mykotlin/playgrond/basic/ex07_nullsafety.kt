package com.example.mykotlin.playgrond.basic

fun main() {
    //  val null1:String = null
    var null2: String? = null
    println(null2?.length)

    // println(null2!!.length)
    null2 = "iamo"
    println(null2?.length)

    //Elvis operator

    var null3 = null2 ?: "Pongchai"

    println(null3)

    null2?.let {
        //todo
        println(null2)
    }

}

class DemoNull{
    lateinit var name1: String
    var name2:String? = null
}