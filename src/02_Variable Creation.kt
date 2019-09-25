
/*

# val -> Value is set and is constant
#     -> Cannot be reassigned
//    -> Immutable
      -> Either type or the inital value is required

# var -> Value can be reassigned
#     -> Can be changed

*/

fun main(args: Array<String>) {
    val num1 = 45
//    num1 ++
    var num2 = 45
    num2 ++

    println("The initial value of the valiable is $num1")
    println("The initial value of the variable is $num2")

//    PASSIVE TYPE REFERENCE - PASSIVE
    var num3:Int = 45
    println("The Literal value is $num3")
//    ACTIVE TYPE REFERENCE - ACTIVE
    var num4:Double = num1.toDouble()
    println("The value of num4 is $num4")

}