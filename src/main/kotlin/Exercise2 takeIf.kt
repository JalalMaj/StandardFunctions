/**
 * You have a list of client names.
 * Using the take functions, print out a new list of client names that don’t start with the letter ‘A’.
 */

fun main(args: Array<String>) {
    val clients = listOf("Ahmed","Hassan","Samah","Rana","Ali","Amal","Shatha")
    println(clients)
    val clientsNew = arrayListOf<String>()
    for(client in clients){
        client.takeUnless { it[0].toLowerCase() == 'a' }
            ?.let{
                clientsNew.add(it)
            }
    }
    println(clientsNew)

    //Other Way
    val filteredClients = arrayListOf<String>()
    clients.filter {
                    it.first().toLowerCase() != 'a'
                    } . map { it }
                      .forEach { filteredClients.add(it) }

    println(filteredClients)

    //Other way
    val filteredClients1 = arrayListOf<String>()
    clients.filter {
        it.first().toLowerCase() != 'a'
    } . let {
       filteredClients1.addAll(it) }

    println(filteredClients1)
}