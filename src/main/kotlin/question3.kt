fun main() {
    palindromeString()
}
fun palindromeString(){
    println(isPalindrome("wow").toString())
}
fun isPalindrome(value:String):Boolean{
    var result: Boolean = true
    for (x in value.length - 1 downTo 0){
        if (value[x] != value[value.length - 1 - x]){
            result = false
            break
        }
    }
    return result
}