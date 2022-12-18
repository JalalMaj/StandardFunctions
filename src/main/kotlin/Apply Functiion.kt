fun main(args: Array<String>) {
    val myCar = MyCar().apply{
        speed = 50
        color = "red"
        startCar()
    }
    println(myCar) // Object is returned by apply findtion
    //when used run we need to put this
}

class MyCar{
    var speed = 80
    var color = "blue"
    fun startCar(){
        println("Starting the car, speed $speed and color $color")
    }
}