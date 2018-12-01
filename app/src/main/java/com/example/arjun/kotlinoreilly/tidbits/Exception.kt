package com.example.arjun.kotlinoreilly.tidbits

class  NotaNumberException(message:String):Throwable(message){

}

fun checkisNumber(obj:Any){
    when(obj){
        !is Int,Long,Long,Double->throw  NotaNumberException("this is not a number")
    }
}

fun main(args: Array<String>) {
    try{
        checkisNumber("A")

    }
    catch (e:NotaNumberException)   {
        println("it was not a number")
    }
}