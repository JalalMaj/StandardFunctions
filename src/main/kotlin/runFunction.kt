fun main(args: Array<String>) {
    val newCar = NewCar().run{
        speed = 70
        drive()
        println("The car is driving")
        this
    }
    println(newCar)

    run{
        val otherCar = NewCar()
        otherCar.speed = 90
        otherCar.drive()
        println("Other car is driving")
    }
}

class NewCar{
    var speed = 80
    fun drive(){
        println("The car is driving at speed $speed")
    }
}