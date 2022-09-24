fun main(){

//    var testObject = Test("John", 23)
//    println(testObject.name)

    var testObject2 = Test("Jayson", 25)
    println(testObject2.name)
}

class Test(nameParam: String, ageParam:Int){

    var name:String = nameParam
        get(){
            println(1%2)
            return field
        }set(value){
            field = value
        }

    var age: Int = ageParam


}