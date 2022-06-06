package com.example.mykotlin.playgrond.basic
const val CONST_1 = 1234
fun main() {
    //mutable ตัวแปรเปลี่ยนค่าได้ (implicit ไม่ระบุ type)
    var var1 = "pongchai"
    var var2 = 123
    var var3 = true
    var var4 = 12.34f
    var var5 = 12.34

    var any1:Any = 123
    any1 = "any"
    any1 = true

    var1 = "cat"

    //mutable ตัวแปรเปลี่ยนค่าได้ (explicit ระบุ type)
    var var6:String = "pongchai"
    var var7:Int = 123
    var var8:Boolean = true
    var var9:Float = 12.34f
    var var10:Double = 12.34

    var6 = "cat"
    println("result : $var1 , $var6")

var money = 10_000_000
    println(money)

    //////////////////////////////////

    //Immutable ตัวแปรเปลี่ยนค่าไม่ได้ (runtime)

    var val1 = "Pongchai"
    val val2:String = "xxx"

    println(val2)

    println(CONST_1)


}


