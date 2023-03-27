fun main(){
    findChar()
}
fun findChar (){
    var words = listOf("Kiwi", "apple", "blue", "green", "grapes")
    for (matches in words){
        if(matches.contains('a')){
            println(listOf(matches))
        }
        else{
            continue
        }
    }
}