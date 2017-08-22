package section_3


fun printMe(name: String) {
    println(name)
}


fun addNumbers(num1: Int, num2: Int) {
    unlimited(1, 2, 3, 4)
}


fun unlimited(vararg numbers: Int) {
    for (number in numbers) {

    }
}


// loop over


fun testPair(): Pair<Int, Int> {
    return Pair(1, 2)
}

fun testTriple(): Triple<String, String, Int> {
    return Triple("", "", 44)
}


fun input() {
    val data = testTriple()
    print(data.first)

    val list = listOf(Pair("dhaka", "Bangladesh"), "delli" to "india")

    for ((city, country) in list) {

    }

}

// deconstruction














