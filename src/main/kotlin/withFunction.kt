fun main(args: Array<String>) {
   with(Car()){
       speed = 80
       drive()
       println("The car is driving")
   }
}

class Car{
    var speed:Int = 50
    fun drive() {
        println("The car is driving @ $speed")
    }

}