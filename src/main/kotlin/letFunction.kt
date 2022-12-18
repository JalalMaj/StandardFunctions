fun main(args: Array<String>) {
    val animals = listOf("cat","dog","mouse","bear","zebra")
    animals.map { it.length }
          .filter { it>3  }// it refers to the output of map
          .let{//list of Integers
              println(it)  // [5,4,5] refers to the output of filter (list)
              println("size of the list is ${it.size}") // 3
          }

    //another way to write it
    animals.map { it.length }
        .filter { it>3  }// it refers to the output of map
        .let{filteredList ->
            println(filteredList)  // [5,4,5] refers to the output of filter (list)
            println("size of the list is ${filteredList.size}") // 3
        }


    //If single method call then you can use ::

    animals.map { it.length }
        .filter { it>3 }
        .let (::println)

    //Let is used to filter for non-nullable variables
    println("Input your name")
    val name = readLine() // output nullable string
    name?.let { println("Your name is $name") }
}