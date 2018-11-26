package com.example.arjun.kotlinoreilly.inheritance

abstract  class StoredEntity{

    val isactive=true

    abstract fun store()

    fun status():String{
        return isactive.toString()
    }
}


class Employee:StoredEntity(){
    override fun store() {
     println("store from employee")
    }
}

fun main(args: Array<String>) {
    val se=Employee()
    se.isactive
    se.store()
    se.status()
}