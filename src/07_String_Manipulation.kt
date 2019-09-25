fun main(args: Array<String>) {

    var aString = "Hello"
    println(aString)

    var empty = String()
    println("$empty")

    var charArray  = aString.toCharArray()
    println(charArray.toList())

    aString += "And welcome"
    println(aString)

    val length = aString.length
    for (i:Int in 0 until length){
        val c = aString.get(i)
        println(c)
    }

}
