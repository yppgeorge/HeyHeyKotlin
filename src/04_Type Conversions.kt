fun main(args: Array<String>) {

    val myInt = 42
    val muLongVariable: Long = myInt.toLong()

//    DETERMINING TYPE OF A VARIABLE
    println("Type is ${muLongVariable::class.qualifiedName}")

//    DOWNCASTING - TYruncating the value
    val mylong2 = 49.2
    var myInt2 = mylong2.toInt()
    println("The value of myLong2 is ${mylong2}")
    println("The value of myLong2 is ${myInt2}")


//    UPCASTING
    val myInt3 = 5231
    val myDouble3 = myInt3.toDouble()
    println("The Value of myInt3 is ${myInt3}")
    println("The value of myDouble3 is ${myDouble3}")

}