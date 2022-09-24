import org.junit.Test
import org.junit.jupiter.api.Assertions.*

class PalindromeCheckerTest{
    @Test
    //racecar -> true
    fun wordEnteredIsAPalindrome(){
        var pChecker = PalindromeChecker()
        assertEquals(true,pChecker.isWordPalindrome("racecar"))
    }

    @Test
    fun wordEnteredIsNotAPalindrome(){
        var pChecker = PalindromeChecker()
        assertEquals(false,pChecker.isWordPalindrome("Hello"))
    }

    @Test
    fun wordEnteredIsAPalindromeWithUpperAndLowerCase(){
        var pChecker = PalindromeChecker()
        assertEquals(true,pChecker.isWordPalindrome("RaceCar"))
    }
}