package section_3















fun printMe(name: String) {
    println(name)
}

























fun addNumbers(num1:Int, num2:Int) : Int {
    return num1 + num2
}
































fun unlimited(vararg nums: Int) {

}



































fun testReturn() : Pair<Int, Int>{ return Pair(1,2)}
fun testReturn2() : Triple<String, String,Int>{
    return Triple("","",44)
}















fun input(){
    val (firstName, lastName, age) = testReturn2()
    print(firstName)
}
