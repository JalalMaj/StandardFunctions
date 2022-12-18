/**
 * Read a text from the console. If it’s not null, convert it to an Int, double it and print it to the console.
 */

fun main(args: Array<String>) {
    println("Input a number")
    val input = readLine()
      input?.let {
          val number = it.toInt()
        println("The double od $number is ${number*2}")
    }

    /**
     * Read 3 animals from the console and add them to a list. If you read an empty string, add a null to the list.
    For each animal in the list, print a ‘feeding the animal’ message.

     */
    val animalsList = arrayListOf<String?>()
    println("Please enter the number of animals that you want to add")
    val size = readLine()!!.toInt()
    for(i in 0..size-1){
        println("Input the animal")
        val input = readLine()
        input?.let{
            if(it == "") {
                animalsList.add(null)
            }
            else {
                animalsList.add(it)
            }
        }

    }
    animalsList.forEach {
        it?.let{println("Feeding $it") }} // filtering out the null values

    println(animalsList)


}