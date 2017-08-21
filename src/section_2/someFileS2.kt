package section_2

object Global{
    val PI = 3.1416
}

fun main(args: Array<String>) {
    println(Global.PI)
    val personInJava = PersonInJava(1,"Sazzad")
    val personInKotlin = PersonInKotlin(1, "Sazzad")
    val personInKotlin2 = PersonInKotlin(name = "Sazzad", id = 2)

}

// data class
// copy
// named parameter
// default value