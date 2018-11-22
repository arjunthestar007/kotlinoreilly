package com.example.arjun.kotlinoreilly.basics

fun main(args: Array<String>) {

    var myString="Not Empty"

    if(myString!=""){
        println("not empty");
    }
    else{
        println("isempty")
    }


    // use as expressions
    var myString1="Not Empty"

    var result=if(myString1!=""){
        "not empty"
    }
    else{
        "isempty"
    }

        println(result)


    var msg="Value";
    var whenresults=when(msg){
        "Value"-> {
            println("this is value")
            println(" second statement")
            "returning form value"
        }

        is String -> println("excellent")
        else->{
            println("other")
        }

    }
    println(whenresults)


}