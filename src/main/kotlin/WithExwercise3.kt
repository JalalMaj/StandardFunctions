/**
 * A store has a supply of shoes, shirts and jackets, as well as a method to print out the inventory.
 * Create a variable of type store, update its stock and print out the inventory.
 */

fun main(args: Array<String>) {
    var store = Store()
    with(store){
        shoes = 30
        shirts = 100
        jackets = 25
        printInventory()
    }
}

class Store{
    var shoes = 0
    var shirts = 0
    var jackets = 0

    fun printInventory(){
        println("The store has the following: \n 1. $shoes shoes \n 2. $shirts shirts \n 3. $jackets jackets")
    }
}