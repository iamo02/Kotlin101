package com.example.mykotlin.playgrond.oop

import java.util.*

fun main() {
    println(InjectionUtils.name)
    println(InjectionUtils.getFoo1())
    println(InjectionUtils == InjectionUtils)
    println("========================")

    println(MyClass.create() == MyClass.create() )
    MyClass.fingesSnap()

    var obj1 = object {
        var x1 = 9
        var x2 =11

        fun sim() = x1+x2
    }
    println(obj1.sim())

    


}


// singleton
//static
object InjectionUtils {
    var name = "pongchai"

    fun getFoo1() = 1234

}

class MyClass(){
    var name = "iamo"
    fun getFoo1() = 1234

    companion object{
        //static

       private var instant : MyClass?=null

        fun create(): MyClass {
            if(instant == null){
                instant = MyClass()
            }
            return instant!!
        }

        fun fingesSnap(){
            println("OMG")
        }
    }
}