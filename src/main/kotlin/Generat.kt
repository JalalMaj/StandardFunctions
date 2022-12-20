import java.util.*

fun main(args: Array<String>) {
//    val number = readln().toDouble()
//    val logNumber = Math.log10(number) // fix this line
//    println(logNumber)
//
//
//
//        val line = readLine()!!
//        println(line)
//
//    val lin1 = readln()
//
//    val (a, b) = readLine()!!.split(' ')    // for input "Hello world!" a is "Hello" and b is "world!"
//    val (c, d, e) = readLine()!!.split(' ') // can read, for example "Go for it"
//    val scanner = Scanner(System.`in`)
//
//     //Scanner.next() reads only one word, not a line. If the user enters Hello, Kotlin, it will read Hello,.
//    //After you call scanner.nextLine() or scanner.nextInt() or something else, the program will anticipate input data.
//    // Here is an example of correct input data:
//    val line2 = scanner.nextLine() // read a whole line, i.e. "Hello, Kotlin"
//    val num = scanner.nextInt()   // read a number, i.e. 123
//    val string = scanner.next()   // read a string, i.e. "Hello"

//
//        val n = readLine()!!.toLong()
//        val m = readLine()!!.toLong()
//        println(n+m)
//    val scanner = Scanner(System.`in`)
//    val n = scanner.nextDouble()
//    val input = readln()
//    val n = input.toDouble()
//    println(n)
//    var string = ""
//    for(i in 0 until 5){
//        val input = readLine()!!
//        string += "$input "
//    }
//    println(string.removeSurrounding(" "))

    println("Eat. Sleep. Code.\n".repeat(7))
    println("\'H\' is the first letter of \"Hello world!\" string.")


//    // Printing large text
//    val largeString = """
//    This is the house that Jack built.
//
//    This is the malt that lay in the house that Jack built.
//
//    This is the rat that ate the malt
//    That lay in the house that Jack built.
//
//    This is the cat
//    That killed the rat that ate the malt
//    That lay in the house that Jack built.
//""".trimIndent() // removes the first and the last lines and trim indents
//    print(largeString)
//
//    val string = "I'm learning Kotlin!\n"
//    val repeatedTimes:Int = 6
//    println(string.repeat(repeatedTimes))

    val invitation = readLine().toBoolean() // read other value in the same way
    val gift = readLine().toBoolean()
    if(gift && invitation){
        println(true)
    }else println(false)
}
