import kotlin.math.pow

fun main(args: Array<String>) {
    var array = arrayListOf<Int>()
    (1..4)
        .map { _ -> readLine()!!.toInt() }.forEach { array.add(it) }

    println(array)

    (1..4)
        .map { _ -> readLine()!!.toInt() }
        .let { (a, b, c, d) -> // output of map will be a b c d
            (0..1_000)
                .filter { it ->
                    a * it * it * it + b * it * it + c * it + d == 0
                }.forEach(::println)
        }


    val (a, b, c, d) = Array(4) { readln().toInt() }
    val eq: (Float) -> Float = { x -> x.pow(3) * a + x.pow(2) * b + x * c + d }

    (0..1000)
        .filter { x -> eq(x.toFloat()) == 0f }
        .forEach { println(it.toInt()) }

    // find roots of ax2 +bx + c = 0
    var array1 = arrayListOf<Float>()
    (1..3)
        .map { _ -> readLine()!!.toFloat() }
        .let { it ->
            array1.addAll(it)
        }
  val equation: (Float) -> (Float) = { x-> array1[0] * x.pow(2) + array1[1] * x.pow(2) + array1[2]}
    (0..1000)
        .filter { x -> equation(x.toFloat()) == 0f }
        .forEach(::println)

}
