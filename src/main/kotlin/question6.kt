fun main(){
    commonInts()
}
fun commonInts() {
    val first = listOf(1,2,3,4,5,6,7)
    val second = listOf(2,4,6,8)
    println(first.intersect(second))
}
