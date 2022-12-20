import java.util.Scanner

fun main(args: Array<String>) {
    val scanner = Scanner(System.`in`)
    var maximum = 0
    var count = 0
    var list = arrayListOf<Int>()
    while(scanner.hasNext()){
        list.add(scanner.nextInt())
    }
    maximum = list.sorted().last()
    list.forEach{
        if(it == maximum) {
            count++
        }
    }
    println("Total number: ${list.size}.")
    println("The greatest number: $maximum ($count time(s))")


//    other way

        val scanner1 = Scanner(System.`in`)
        val lst = mutableListOf<Int>()
        while (scanner1.hasNext()) { lst.add(scanner1.nextInt()) }
        print("""
        Total numbers: ${lst.size}
        The greatest number: ${lst.maxOf{ it }} (${lst.count( { it == lst.maxOf{ it }})} time(s)).
    """.trimIndent())

}
