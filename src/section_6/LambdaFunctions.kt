package section_6

fun main(args: Array<String>) {
    val names = listOf("Java","Kotlin","Scala","Groovy","Other")

    val filterName: List<String> = names.filter { it.length > 2 }
    val mapName: List<Int> = names.map { it.length }


}