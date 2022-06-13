package com.example.mykotlin.playgrond.basic


fun main() {
    val array1 = arrayOf(123, "iamo", true)
    val array2 = arrayOf<Int>(123, 456, 789)
    val array3 = intArrayOf(123, 456, 789)

    array1[1] = 98

    println(array1[1])

    for (item in array1) {
        println("For array 1 $item")
    }

    array2.forEach { item -> println("forEach array 2  $item") }


    //without initializing

    val array4 = arrayOfNulls<Any>(10)
    array4[0] = "cat"
    array4[8] = 1234

    array4.forEach { item -> println("forEach array4   $item") }

    val array5 = arrayOfNulls<Int>(10)
    array5[0] = 987
    array5[8] = 1234

    array5.forEach { item -> println("forEach array5   $item") }

    val array6 = IntArray(10)
    array6[0] = 987
    array6[8] = 1234

    array6.forEach { item -> println("forEach array6   $item") }

    //initializing

    val array7 = Array(5) { index ->
        if (index % 2 == 0) {
            "iamo"
        } else {
            index * 2
        }
    }

    array7.forEach { item -> println("forEach array7   $item") }

    //Extension

    val arrayException = arrayOf<Int>(123, 456, 789)

    println("Sum: ${arrayException.sum()}")
    println("Sum By : ${arrayException.sumBy { item -> item }}")
    println("in 123 : ${123 in arrayException}")
    println("all > 100 : ${arrayException.all { item -> item > 100 }}")
    println("all >= 789 : ${arrayException.any { item -> item >= 789 }}")
    println("none = 111 : ${arrayException.none { item -> item == 111 }}")
}