fun main(args: Array<String>) {
    val state: String? = readLine()

    val capital: Any =
        when(state) {
            "CA" -> "Sacremento"
            "OR" -> "Salem"
            "CO" -> "Denver"
            "NJ","NY","VT" -> "East Coast"

            else -> "Unknown"
        }
    println("Capital of the State is ${capital}")
}