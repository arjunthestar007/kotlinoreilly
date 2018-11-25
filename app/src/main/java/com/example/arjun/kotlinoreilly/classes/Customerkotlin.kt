package com.example.arjun.kotlinoreilly.classes

data class Customerkotlin(var id:Int,var name:String,var email:String){
    override fun toString(): String {
        return "{id:$name}"
    }
}


fun main(args: Array<String>) {

    val customer=Customerkotlin(1,"arjun","arjunarjun27@gmail.com")
    val customer1=Customerkotlin(1,"aaaan","arjunarjun27@gmail.com")

    println(customer)


}