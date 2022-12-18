/**
 * A coffee shop serves cups of coffee. A cup of coffee has a client name and a method for preparing the coffee.
 * Read a client name from the console, then call the sellCoffee method of the coffee shop.
 * Create a coffee cup object, initialise it and serve it to the client.
 */

fun main(args: Array<String>) {
    println("Please enter the name of the client")
    val name = readLine()!!.trim()
    CoffeeShop().sellCoffee(name)
}

class CoffeeShop{
    fun sellCoffee(name:String){
        CoffeeCup().apply{
            clientName = name
            println("Please serve the cup to $clientName")

        }
    }

}

class CoffeeCup{
    var clientName = ""
    fun prepareCoffee(){
        println("brewing the coffee")
    }
}