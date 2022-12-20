fun main(args: Array<String>) {
    val numbers = mutableListOf<Int>()

    while (true) {
        val line = readLine() ?: break

        line.split(Regex("\\s+")).map { it.toInt() }.also { numbers.addAll(it) }
    }

    println("Total numbers: ${numbers.size}.\n" +
            "The greatest number: ${numbers.maxOrNull()} (${numbers.count { it == numbers.maxOrNull() }} time(s)).")
}