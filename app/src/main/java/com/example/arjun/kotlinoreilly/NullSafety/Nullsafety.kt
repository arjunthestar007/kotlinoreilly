package com.example.arjun.kotlinoreilly.NullSafety

import com.example.arjun.kotlinoreilly.classes.Customerjava






fun main(args: Array<String>) {

    var message:Int=10

    println(message)


    var nullmessage:String?=null

    println(nullmessage?.length)


    val customerjava=Customerjava()

    println(customerjava?.name?.length)  // removes the below if code

    if(customerjava!=null){
        if(customerjava.name!=null){
            println(customerjava.name.length)

        }
    }

}