fun main(args: Array<String>) {
    print("Enter a state abbreviation: ")
    val state: String? = readLine()

    if (state == "CO") {
        println("Capital is Denver")
    } else if (state == "CA") {
        println("Captial is Salem")
    } else {
        println("Not sure of the input")
    }
}