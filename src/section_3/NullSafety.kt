package section_3

import section_2.PersonInJava

class Animal(val name: String, height: Int)

fun main(args: Array<String>) {
    val animal = Animal("Lion", 5)
    // val var

}

fun personJava(person: PersonInJava?) {
    if (person?.name == null) {
        // null safety
    }

}