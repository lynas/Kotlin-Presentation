package section_3















fun printMe(name: String) {
    println(name)
}

























fun addNumbers(num1:Int, num2:Int) : Int {
    return num1 + num2
}
































fun unlimited(vararg numbers: Int) {

}



































fun testPair() : Pair<Int, Int>{ return Pair(1,2)}
fun testTriple() : Triple<String, String,Int>{
    return Triple("","",44)
}















fun input(){
    val (firstName, lastName, age) = testTriple()
    print(firstName)
}
