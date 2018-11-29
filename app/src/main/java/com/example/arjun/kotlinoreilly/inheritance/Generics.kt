package com.example.arjun.kotlinoreilly.inheritance

import com.example.arjun.kotlinoreilly.classes.Customer

interface Repository<T>{
    fun getById(id:Int):T
    fun getAll():List<T>
}

fun main(args: Array<String>) {
    var customerrepo=RepositoryImpl<Customer>()
    var customer=customerrepo.getById(10)
    var customers=customerrepo.getAll();
}