package com.example.mykotlin.playgrond.basic

fun main() {
    var cast1:Any = "iamo"

  //  var cast2 = cast1 as String

//    println(cast2.length)

    if (cast1 is String){

        println(cast1)
    }

    if (cast1 !is String){

        println("not string")
    }

    var cast2 = cast1 as? Int

    println(cast2)
}