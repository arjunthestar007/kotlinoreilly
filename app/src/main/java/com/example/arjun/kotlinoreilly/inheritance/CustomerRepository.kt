package com.example.arjun.kotlinoreilly.inheritance

import com.example.arjun.kotlinoreilly.classes.Customer

interface CustomerRepository {

    val isEmpty:Boolean
        get() = true

    fun store(obj:Customer){
        // implement code
    }

    fun getById(id:Int):Customer
}

class SQLCustomerRepository:CustomerRepository{

    override fun getById(id: Int): Customer {

        return com.example.arjun.kotlinoreilly.classes.Customer(2,"",2)
    }

    override fun store(obj: Customer) {
        super.store(obj)
    }


    override val isEmpty: Boolean
        get() = false

}

interface  Interface1{
    fun funA(){
        println("funA from interface1")
    }
}

interface Interface2{
    fun  funA(){
        println("funB from interface1")

    }
}


class Class1And2:Interface1,Interface2{
    override fun funA() {
        println("Our own")
    }

//    override fun funA() {
//        super<Interface2>.funA();
//    }

}

fun main(args: Array<String>) {
    val c=Class1And2()
    c.funA()
}