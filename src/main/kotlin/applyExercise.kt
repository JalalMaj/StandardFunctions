fun main(args: Array<String>) {
    Lock().unLock(
        Key().apply {
            secreteKey = "123"
            carve()
        }
    )
}

class Lock{
   fun unLock(key: Key){
       println("Unlocked the lock with the key $key")
   }

}

class Key{
    var secreteKey = ""
    fun carve(){
        println("Carving the key with code $secreteKey")
    }
}
