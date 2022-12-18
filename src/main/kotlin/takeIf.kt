import kotlin.random.Random

fun main(args: Array<String>) {
    for(i in 1.. 10) {
        val number = Random.nextInt(100)
        val evenOrNull = number.takeIf { it % 2 == 0 } // if it is even will return the number else will return null
        println(number)
        println(evenOrNull)
    }

    println("-------------------------------------------------")


    for(i in 1.. 10) {
        val number = Random.nextInt(100)
        val oddOrNull = number.takeUnless { it % 2 == 0 } // if it is odd will return the number else will return null
        println(number)
        println(oddOrNull)
    }
}