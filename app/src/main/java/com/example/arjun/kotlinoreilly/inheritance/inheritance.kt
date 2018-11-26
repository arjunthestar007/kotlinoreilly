package com.example.arjun.kotlinoreilly.inheritance


open class Person{

    open fun validate():String{
    return ""
    }

}
open class Customer: Person() {

    override fun validate() :String{
        return "customer class"
    }

//    constructor():super(){
//
//    }

}

class Specialcustomer: Customer(){

    override fun validate():String {
     return ""
    }

}

fun main(args: Array<String>) {
    val customer= Customer()
    println(customer.validate())
}