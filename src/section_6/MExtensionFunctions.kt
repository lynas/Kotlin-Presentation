package section_6

fun String.hello() {
    println("Hey String")
}

fun main(args: Array<String>) {
    println("".hello())
    "this".shouldEqual("this")

}


fun String.shouldEqual(value: String) = value == this
// infix
