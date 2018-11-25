package com.example.arjun.kotlinoreilly.classes


object Global{
    val PI=3.14
}


fun main(args: Array<String>) {
    println(Global.PI)

    val localobject=object {
        val PI=3.1444
    }

    println(localobject.PI)

}