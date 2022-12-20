/**
 * Have the user introduce 10 numbers.
 * Print a list that contains only odd numbers and make sure to exclude the numbers 3 and 13.
 */

fun main(args: Array<String>) {
    val list = arrayListOf<Int>()
    for(i in 1 .. 10){
        println("Enter a number")
        var number1 = readLine()?:""
        number1.toInt().takeUnless { it % 2 == 0 || it == 3 || it == 13  }
            ?.let{
                list.add(it)
            }
    }
    println(list)

    var a = 5678
    var result = (a.div(10))%10
    println(result)
}