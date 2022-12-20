import java.util.*
const val ZERO = 0
const val ONE = 1
const val FOUR = 4
const val ONE_THOUSAND = 1_000
/**
 * Groundhogs like to throw fun parties, and at their parties, they like to munch on Reese's peanut butter cups.
 * But not too much of it, or they will feel sick! A successful groundhog party should have
 * between 10 and 20 Reese's peanut butter cups (inclusive) unless it is the weekend.
 * In this case, they need 15 to 25 Reeses peanut butter cups (inclusive).

Write a Kotlin program that reads two values:

the first is the number of Reese's peanut butter cups;
the second is a boolean value that represents whether it is the weekend or not.
Output the boolean value that tells us whether the party is successful or not.
 */


fun main() {
//    val weekEnd = readLine()!!.toBoolean()
//    val numberPeanut = readLine()!!.toInt()
//    if (weekEnd) {
//        if (numberPeanut.toInt() in 15..25) {
//            println(true)
//        } else
//            println(false)
//    } else {
//        if (numberPeanut.toInt() in 10..20) {
//            println(true)
//        } else
//            println(false)
//}




//    val cups = readLine()!!.toInt()
//    val isWeekend = readLine()!!.toBoolean()
//    println(cups in if (isWeekend) 15..25 else 10..20)


//    val (a, b, c) = Array<Int>(3){readLine()!!.toInt()}
//    println(a in b..c || a in c..b)




//    val scanner = Scanner(System.`in`)
//    // put your code here
//    val a1 = scanner.nextInt()
//    val b1 = scanner.nextInt()
//    val c1 = scanner.nextInt()
//
//
//    val number = readln()!!.toInt()
//    if(number == 0) {
//        println("zero")
//    } else if(number>0) {
//        println("positive")
//    } else
//        println("negative")

//    val (A, B, H) = Array<Int>(3) { readLine()!!.toInt() }
//    if (H in A..B) {
//        println("Normal")
//    } else if (H < A) {
//        println("Deficiency")
//    } else {
//        println("Excess")
//    }

//    val number = readln().toInt()
//    if (number in -14..12 || number in 15..16 || number >= 19) {
//        println("True")
//    } else {
//        println("False")
//    }

    val result = findYears(600000.0)
    println(result)

//    var sum =0
//    do{
//        val number = readLine()!!.toInt()
//        sum++
//    } while(number!=0)
//    println(sum-1)

//    var (a, b, c, d) = Array<Int>(4) { readLine()!!.toInt() }.sorted()
//    var e = readLine()!!.toInt()
//    println(a)
//    println(b)
//    println(c)
//    println(d)
//    println(e in a..b || e in c..d)
//
//    val number = readLine()!!.toInt()
//    println(number !in 1..10)

//    val a = readLine()!!.toInt()
//    val b = readLine()!!.toInt()
//    val c = readLine()!!.toInt()
//    val d = readLine()!!.toInt()
//
//    for (x in 0..1000){
//        var root = a*x*x*x + b*x*x + c*x + d
//        if (root == 0) {
//           println(x)
//        }
//    }

    val scanner = Scanner(System.`in`)
    val (a, b, c, d) = Array(4) { scanner.nextLong() }

    (0..1000)
        .filter { 0L == d + (c + (b + a * it) * it) * it }
        .forEach { println(it) }


    
        (ONE..FOUR)
            .map { _ -> readln().toInt() }
            .let { (a, b, c, d) ->
                (ZERO..ONE_THOUSAND)
                    .filter { x -> a * x * x * x + b * x * x + c * x + d == ZERO }
                    .forEach(::println)
            }


}


fun findYears(depo: Double): Int{
    var deposit = depo
    val interestRate = 1.071
    val max = 700000
    var years = 0
    do {
        years++
        deposit *= interestRate
    } while(deposit <= max)
    return years
}


