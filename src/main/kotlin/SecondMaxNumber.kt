fun secondLargest(){
    var number = listOf(1,2,3,4,5,6,7,8,9,10,11)
    var first = Int.MIN_VALUE
    var second = Int.MIN_VALUE

    for (n in number){
        if(n > first){
            second = first
            first = n
        }
        else if (n !=first && n > second){
            second = n
        }
    }

    println(listOf("${second}"))

}
fun main (){
    secondLargest()
}

