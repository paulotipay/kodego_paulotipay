fun main(){
    var myCar = Car()

    myCar.inches = 10
    println( myCar.inches)
    myCar.displayInInches()
}
class Car{
    var inches : Int = 0;
    var modelName:String = ""
        get() = field
        set(value){
            field = value
        }

    var fuelVolume:Int = 0
        get() = field
        set(value){
            if(value < 0){
                println("invalid value")
            }else{
                field = value
            }
        }

    init{
        println("Object Created!")
        println("modelName is $modelName")
        println("fuelVolume is $fuelVolume")
    }

    fun accelerate(fuelVolume: Int){
        this.fuelVolume = this.fuelVolume - fuelVolume
    }
    fun checkFuel(){
        println("Current fuel volume is $fuelVolume")
    }
    fun displayInInches(){
        println("$inches inch")
    }

}