package com.example.mykotlin.playgrond.basic

// List,set,map
fun main() {

    //Dynamic size

    val list1 = mutableListOf<Any>("11",22,true)
    val list2 = mutableListOf<Int>(11,22,33)
    val list3 = mutableListOf<Int>()
    list1.add("iamo")

    for (item in list1) {
       println(item)
    }

    //Fixed size

    val list4 = listOf<Any>("11",22,true)
    val list5 = listOf<Int>(11,22,33)
    val list6 = listOf<Int>()

   // list4.add("iamo")

    for (item in list4) {
        println(item)
    }

    //Extension
    val listException = arrayOf<Int>(123, 456, 789)

    println("Sum: ${listException.sum()}")
    println("Sum By : ${listException.sumBy { item -> item }}")
    println("in 123 : ${123 in listException}")
    println("all > 100 : ${listException.all { item -> item > 100 }}")
    println("all >= 789 : ${listException.any { item -> item >= 789 }}")
    println("none = 111 : ${listException.none { item -> item == 111 }}")
}