fun main(args: Array<String>) {
    val clients = arrayListOf<String?>()
    do{
        println("Enter client name")
        val input = readLine()
        input?.let {
            if (it?.toLowerCase() != "stop") {
                if (it == "") clients.add(null)
                else clients.add(it)
            }
        }
    }while(input?.toLowerCase() != "stop")

    clients.forEach{
        it?.let{
            println("Hello $it")
        }
    }
}

