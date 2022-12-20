//fun main() = (readLine()!!.toBoolean() && readLine()!!.toBoolean()).let(::println)

fun main() {
//    val x = readLine().toBoolean() // read other value in the same way
//    val y = readLine().toBoolean()
//    val z = readLine().toBoolean()
//    val result = !(x && y) || z
//    println(result)
//
//
//        val (x1, y1, z1) = Array<Boolean>(3) { readLine()!!.toBoolean() }
//        println(!(x1 && y1) || z1)


//    val seven = 7.0
//    val five = 5
//
//    val toShort = seven.toShort()            // line 4
//    val sum = seven + five                   // line 5
//    val difference = seven - five.toDouble() // line 6
//    val toByte = seven.toByte()              // line 7
//    val mul = seven * five
//
//
//    val d0 = 1.0
//    val f0 = 1f
//    val l0 = 30L
//
//    val d: Double = 1.0 % 10f         // Line 1
//    val f: Float = d0.toLong() + 1.0f  // Line 2
//    val l: Long = f0.toInt() + 4L      // Line 3
//    val n: Int = l0.toByte() + 2      // Line 4

    val yourApples: UInt = 5U
    val friendsApples: UInt = 7U
    println(yourApples + friendsApples)

    // do not change the code below
    println("${yourApples::class.simpleName}")
    println("${friendsApples::class.simpleName}")

    val (a,b,c) = Array<Int>(3) { readLine()!!.toInt() }
    println(a+b == 20 || a+c ==20 || b+c == 20)

}