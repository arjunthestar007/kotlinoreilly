package com.example.arjun.kotlinoreilly.function


fun sum(a:Int,b:Int,c:Int=0,d:Int=0):Int{

    return a+b+c+d
}


// email default
fun printDetails(name:String,email:String="",phone:String=""){
    println("name: $name - email:$email -phone:$phone")
}

fun main(args: Array<String>) {
    println(sum(5,5))
    println(sum(5,5,1))
    println(sum(1,1,d=0))

    printDetails("arjun",email = "222 555") // named parameter
}