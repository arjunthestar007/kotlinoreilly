package com.example.arjun.kotlinoreilly.basics

fun main(args: Array<String>) {

    for (a in 1..10){
        println(a)
    }


    val number=1..5

    for (a in number){
        println(a)
    }


    for (a in 10 downTo 1){
        println("down to $a")
    }


    for (a in 10 .. 1){
        println(a);
    }
//
//
//    for (a in 10 .. 1 step 2){
//        println("down to 2step $a")
//    }

    for (a in 1..10){
        println(a)
    }

    val  capitals= listOf("london","paris","rome","madrid");
    for (capital in capitals){
        println(capital)
    }


    var i=0;
    while (i<10){
        i++
        print("while $i")
    }



    do{
        var x=10
        x--
        println("do while $x")
    }while (x>10)



}