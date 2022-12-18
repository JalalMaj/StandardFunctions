fun main(args: Array<String>) {
    Car().apply {
        speed = 80
        drive()
    }
        .also {
            println("car is driving")
            println("Car speed is ${it.speed}")
        }
}