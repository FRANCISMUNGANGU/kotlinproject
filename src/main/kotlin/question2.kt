fun main(){
    evenNumber()
}
fun evenNumber(){
    var myList = listOf(1, 2, 3, 4, 5, 6, 7, 8, 9, 10)
    var filteredList = myList.filter { x -> x % 2 == 0 }
    println("Filtered List : ${filteredList}")
    println(listOf(filteredList.sum()))
}