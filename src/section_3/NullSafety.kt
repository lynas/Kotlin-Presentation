package section_3

import section_2.PersonInJava

class Animal(val name: String, var height: Int)

fun main(args: Array<String>) {
    val animal = Animal("Lion", 5)
    animal.height = 90
    // val var

}

fun personJava(person: PersonInJava?) {
    if (person?.name != null) {
        // null safety
        printPersonName(person.name)
    }

}


fun printPersonName(name: String) {
    println(name)
}