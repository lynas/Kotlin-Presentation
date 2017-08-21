package section_4

fun conditionTest1(input: Int) {
    val result = if (input > 100) {
        println("GT")
        "GT"
    } else {
        println("LT")
        "LT"
    }
}