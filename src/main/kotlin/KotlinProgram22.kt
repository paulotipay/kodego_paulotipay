fun main(){
    println("Enter your name:")
    var name :String = readln()

    println("Enter your age:")
    var age :Int = readln().toInt()

    displayNameAndAge(name,age)
}
//no return no parameter
fun displayName(){
    println("Peter")
}
//no return with 1 parameter
fun displayMessage(msg: String){
    println("The message is \"$msg\"")
}

//no return with 2 parameter
fun displayNameAndAge(name: String,age: Int){
    println("Your name is $name")
    println("Your age is $age")
}


//function -> methods -> stored procedure -> sub procedure

//built-in/standard functions in kotlin
//abstraction

//println()
//toInt()
//readln()
//main()
//arrayOf()
//listOf()

//user-defined function