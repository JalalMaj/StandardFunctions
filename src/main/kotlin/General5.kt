fun main(args: Array<String>) {
    ('a'..'z')
        .toMutableSet()
        .apply { readln().forEach(this::remove) }
        .forEach(::print)

    //Or
    readln().run { ('a'..'z').filter { it !in this }.forEach(::print) }
}