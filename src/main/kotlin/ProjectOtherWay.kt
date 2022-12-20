import java.util.*

fun main() {
    SortingTool.readInputs()
    SortingTool.printResult()
}

object SortingTool {

    private val numbersList = mutableListOf<Int>()

    fun readInputs() {
        val scanner = Scanner(System.`in`)
        while (scanner.hasNext()) {
            val input = scanner.nextLine()

            if (input == "/exit") break
            if (input.isBlank()) continue
            parse(input)
        }
    }

    fun printResult() {
        val greatestNumber = numbersList.maxOrNull() ?: return
        val greatestNumberOccurrences = numbersList.count { it == greatestNumber }
        println("Total numbers: ${numbersList.size}.\n" +
                "The greatest number: $greatestNumber ($greatestNumberOccurrences time(s)).")
    }

    private fun parse(str: String) {
        val list = str.trim().split("\\s+".toRegex()).map {
            it.toIntOrNull() ?: throw IllegalArgumentException("$it is not a number")
        }
        numbersList.addAll(list)
    }
}