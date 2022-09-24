fun main(){
    var numbers = arrayListOf<Int>()
    var numbersArray = intArrayOf()

    for(i in 0..4){
        println("Enter number $i")
        var num = readln().toInt()
        numbers.add(num)

    }

    println(total(*numbersArray)) //4,5,1

}

fun total(vararg numbers:Int): Int{
    var total : Int = 0
    for(value in numbers){
        total = total + value
    }
    return total
}