package com.example.arjun.kotlinoreilly.function


fun hello(){
    println("helo")
}


fun throwingException():Nothing{
    throw Exception("this function throws an exception");
}


fun returnsafour():Int{
    return 4
}

fun sum(x:Int,y:Int):Int{
    return x+y
}


fun sum1(x:Int,y:Int):Int=x+y


fun takingString(name:String){
    println(name)
}

fun main(args: Array<String>) {
    hello()
    val value=returnsafour()
    takingString("taking a string")
    sum(3,5)
}