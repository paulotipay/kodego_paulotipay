import java.lang.NumberFormatException
import java.util.InputMismatchException

fun main() {

    var num = arrayOf<Int>(4,2,6,1)

    println("Enter number 1:")
    var num1: Int = readln().toInt()

    println("Enter number 2:")
    var num2: Int = readln().toInt()

    println("Enter number 3:")
    var num3: Int = readln().toInt()

    var total: Int = num1 + num2 + num3

    println("Total is $total")
    try {
        println("Divide by how many?")
        var divisor: Int = readln().toInt()
        println("The answer is ${total / divisor}")
    }catch(e:Exception){
        println(e.message)
        println("Exception Occured!")
    }
}