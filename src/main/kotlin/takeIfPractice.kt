/**
 * You have a list of numbers.
 * Using the take functions, print out a list that contains only the even numbers in order(sorted)
 */

fun main(args: Array<String>) {
    val list = arrayListOf(20,39,55,99,88,22,12,1,3,5,7,10,8,6,4,88,66,55,30)
    println(list)
    val numbersEven = arrayListOf<Int>()
    list.forEach {
        it.takeIf { it % 2 ==0 }
            ?.let{// if not null add it ->: should use ?
                numbersEven.add(it)
            }
    }
    println(numbersEven.sorted())

    // Or use filter function

    val anotherList = arrayListOf<Int>()
    list.filter { it %2 == 0 }.map { it }.sorted().forEach { anotherList.add(it) }
    println(anotherList)

    //other way

    val anotherList1 = arrayListOf<Int>()
    list.filter { it %2 == 0 }.let{
        anotherList1.addAll(it.sorted())
    }
    println(anotherList1)


    // Sort initial array

    for (i in 0.. list.size - 1) {
        for(j in i .. list.size - 1){
            if(list[j] <= list[i]) {
//                var temp = list[i]
//                list[i]= list [j]
//                list[j] = temp

                list[i] = list[j] .also { list[j] = list[i] }
            }
        }
    }
   println(list)
}