package com.example.arjun.kotlinoreilly.classes

import java.lang.IllegalArgumentException
import java.util.*

//
//class Customer(initid:Int,initName:String) {
//
//    var id:Int=initid;
//    var name:String=initName;
//
//}

//class Customer(var id:Int,var name:String=""){
//    init {
//        name=name.toUpperCase()
//    }
//
//    constructor(email:String):this(0,""){
//
//    }
//}

class Customer(var id: Int, var name: String, val yearofBirth: Int){

    val age:Int
    get() = Calendar.getInstance().get(Calendar.YEAR)-yearofBirth  // custom getter for read only property

    var socialSecuritynumber:String=""    // custom setter
    set(value) {
        if(!value.startsWith("SN"))
            throw IllegalArgumentException("Social number start with SN")
        field=value     // field is current field
    }





    fun customerAsString():String{

        return "Id: $id--Name $name"
    }

}




fun main(args: Array<String>) {
    val customer=Customer(10, "arjun",1992)

    customer.id
    customer.name
    customer.socialSecuritynumber="SN1234"

    println(customer.age)
    println(customer.socialSecuritynumber)

    println(customer.customerAsString());


}