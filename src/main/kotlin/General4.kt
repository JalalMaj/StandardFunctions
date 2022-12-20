
import java.util.*
import kotlin.collections.HashSet

fun main(args: Array<String>) {
    val word = readln()
    var alphabet = "abcdefghijklmnopqrstuvwxyz"
    val result = arrayListOf<Char>()
    var output = ""
    alphabet.forEach {
       result.add(it)
   }

    for(char in word){
        result.remove(char.toLowerCase())
    }
    result.forEach {
        output+=it
    }
    println(output)


    //other way
    val input = Scanner(System.`in`)
    val word1 = input.next()

    for (letter in 'a'..'z') {
        if (letter in word1)continue
        print(letter)
    }

    // other way
    print((('a'..'z').toSet() - readln().toSet()).joinToString(""))

    //other way
    val input1 = Scanner(System.`in`)
    val string = input1.next()

    //Other way
    val input2 = readLine()!!
    println(('a'..'z').filter { it !in input2.toLowerCase() }.joinToString(""))

    //other way

    ('a'..'z')
        .toMutableSet()
        .apply { readln().forEach(this::remove) }
        .forEach(::print)

    for (i in 'a'..'z') {
        if (!string.contains(i)) print(i)
    }

    for (i in 1..3) {
        if (i == 1)
            continue
        print(1)
        loop@ for (j in 1..2) {
            for (k in 1..2) {
                if (i == 2 || j == 3) break@loop
                print(2)
            }
            if (j == 1) return
            print(3)
        }
    }


}