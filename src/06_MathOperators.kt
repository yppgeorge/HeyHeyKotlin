import kotlin.math.abs
import kotlin.math.absoluteValue
import kotlin.math.round

fun main(args: Array<String>) {

    var num1 = 15
    var num2 = 10

    val sum = num1 + num2
    val sum1 = num1.plus(num2)

    val diff = num1 - num2
    val diff1 = num1.minus(num2)

    val multi = num1 * num2
    val multi1 = num1.times(num2)

    val division = num1 / num2
    val division1 = num1.div(num2)

    val modulus = num1 % num2
    val modulus1 = num1.rem(num2)

//    INCREMENT
    num1 ++
    num1.inc()

//    DECREMENT
    num2 --
    num2.dec()

//    ABSOLUTE
    var neg = -123.76
    var abs = abs(neg)

//    Round
    var urundai = round(abs)

}