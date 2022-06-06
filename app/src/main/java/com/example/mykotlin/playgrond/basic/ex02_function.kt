package com.example.mykotlin.playgrond.basic


fun main() {
    normalFunction()
    argumentFunction(1,2)
println(returnFunction())
    println(returnFunction2(4,5))

    optioalFunction(4)
    optioalFunction(x2=5,x1=4)

    val lambda1: (Int,Int) -> Int = {x1,x2 -> x1+x2}
    val lambda2 = {x1: Int,x2: Int -> if(x1 == 0 ){
        "0"
    } else {
        x2
    }}
    println(lambda1(6,8))
    println(lambda2(0,8))
}

fun normalFunction(){
    println("normal function")
}

fun argumentFunction(x1:Int ,x2:Int){
    println("sun: ${x1+x2}")
}

fun returnFunction():String{
   return  "returnFunction"
}

fun returnFunction2(x1:Int ,x2:Int) = x1+x2

fun optioalFunction(x1:Int ,x2:Int =0 ){
    println("sun: ${x1-x2}")
}