package section_4

fun pairTest(){
    val listOfPair = listOf<Pair<String,String>>(Pair("Dhaka", "Bangladesh"), "Delli" to "India")

    for ((city, country) in listOfPair) {
        println(city)
    }

}