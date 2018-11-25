package com.example.arjun.kotlinoreilly.function

fun printStrings(vararg strings:String){
    for (valuew in strings){
        println(valuew)

    }

}


fun main(args: Array<String>) {
    printStrings("1")
    printStrings("1","2")
    printStrings("1","2","3")
    printStrings("1","2","3","4")



}