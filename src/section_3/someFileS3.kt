package section_3

import section_2.PersonInJava
import section_2.PersonInKotlin

fun main(args: Array<String>) {
    val person = PersonInJava(1, "Sazzad")
    println(person.name)
    val p2 = PersonInKotlin(name = "Sazzad", id = 10)
}