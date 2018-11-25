package com.example.arjun.kotlinoreilly.classes

enum class Priority(val value:Int) {
    MINOR(-1){
        override fun toString(): String {
            return "MINOR PRIORITY"
        }
    },
    NORMAL(0),
    MAJOR(1),
    CRITICAL(10)
}


fun main(args: Array<String>) {

    val pri=Priority.NORMAL

    println(pri);

    println(pri.value);
    println(pri.ordinal);
    println(Priority.CRITICAL.ordinal);

    val pri1=Priority.MINOR
    println("priority minor $pri1")


    for (priorityinList in Priority.values()){
        println(priorityinList)
    }

    val p=Priority.valueOf("MAJOR").value
    println(" value of major $p")

}