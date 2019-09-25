fun main(args: Array<String>) {

    val x1 = 15
    val x2 = 45

    // Efficient Way
    val match = (x1 == x2)
    println("Match is ${match}")
//  More complex 0 if match, + if its greated, - if its lesser
    val match2 = x1.equals(x2)
    println("Match2 is ${match2}")

    

}