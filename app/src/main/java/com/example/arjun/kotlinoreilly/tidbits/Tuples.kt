package com.example.arjun.kotlinoreilly.tidbits

import com.example.arjun.kotlinoreilly.classes.Customerkotlin

fun capitalandPopulation(country:String):Pair<String,Long>{

    return Pair("madrid",230000)
}

fun countryInformation(country:String):Triple<String,String,Long>{
return Triple("madrid","Europe",24000)
}


fun main(args: Array<String>) {

    val  result= capitalandPopulation("madrid")
    println(result.first)
    println(result.second)

    val countryinfo= countryInformation("spain")
    println(countryinfo.first)
    println(countryinfo.second)
    println( countryinfo.third)

    // deconstructing values

    val(country,population)= capitalandPopulation("mad");
    println("deconstructing $country of population $population")


    var (id,name,email)=Customerkotlin(1,"arjun","marjun@gmail.com")

    println(email)



}