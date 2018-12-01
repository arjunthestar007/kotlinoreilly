package com.example.arjun.kotlinoreilly.tidbits

open class Person{

}

class Employee:Person(){

    fun vacationDays(days:Int){
        if(days<60){
            println("you need more vacation")
        }
    }
}

class Contractor:Person(){

}

fun hasVacations(obj:Person){
    if(obj is Employee){
        obj.vacationDays(12);  // cast not needed it do smart casting
    }
}

fun main(args: Array<String>) {
    var input:Any=10

    val str= input as? String  // remove classcastexception

    println(str?.length)  // safe
}