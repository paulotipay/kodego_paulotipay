fun main(){
    println("Enter Word: ")
    var word : String = readln()
    var pChecker = PalindromeChecker()
    pChecker.isWordPalindrome(word)
}

class PalindromeChecker{
    fun isWordPalindrome(word:String):Boolean {
        //reverse the word
        var reversedWord = word.reversed()
        //compare original string with reversed string
        //if equal then return true, otherwise false
        if(word.uppercase() == reversedWord.uppercase()){
            println("$word is a palindrome!")
            return true
        }else{
            println("$word is not a palindrome!")
            return false
        }

    }
}