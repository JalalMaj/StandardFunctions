/**
 * Whenever a car is built, the company logs must be updated and the police notified.
 * Implement this functionality in a program.
 */

fun main(args: Array<String>) {
    CarCreation().apply {
        printCreation()
    }
        .also {
            println(" LOG: A new car $it is build")
            println(" A new car is build which is $it")
        }
}

class CarCreation{
    fun printCreation(){
        println("The car is created")
    }
}