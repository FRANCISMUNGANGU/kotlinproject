fun main(){
    longestWord()
}
fun longestWord(){
    val list = listOf("cat","Hippopotomonstrosesquippedaliophobia","whiskey","longestword")
    println(listOf(list.maxByOrNull { it.length }))
}