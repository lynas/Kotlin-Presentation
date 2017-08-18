package section_2

fun main(args: Array<String>) {
    val person = PersonInJava(1, "Sazzad")
    println(person.name)
    val p2 = PersonInKotlin(name = "Sazzad", id = 10)
    val p3 = PersonInKotlin(id = 20)
}