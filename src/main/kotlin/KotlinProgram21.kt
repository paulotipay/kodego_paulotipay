fun main(){

    //instantiation - process of creating an object
    var myObject = MyClass("Hello World!")
    var myGenericObject = MyGenericClass("Hi")

}
//Generics
class MyGenericClass<T>(value:T ){
    init{
        println(value.toString().length)
    }
}
//Non generic class
class MyClass(value : String){
    init{
        println(value.length)
    }
}



/*
Class -> objects
object -> variable
       -> functions(process)
uppercase -> first letter
examples.
String
Int


 */