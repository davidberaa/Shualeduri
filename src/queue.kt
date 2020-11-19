import java.util.LinkedList

fun main() {
    val firstMarket: marketQueue = marketQueue()
    firstMarket.queue.add(1)
    firstMarket.queue.add(2)
    firstMarket.queue.add(3)
    firstMarket.queue.add(4)
    firstMarket.queue.add(5)     // რიგში ჩამდგარი ადამიანების მიმდევრობა და რაოდენოდა.

    firstMarket.peopleInQueue()  // თავდაპირველად ადამიანების რაოდენობა და რიგის მიმდევრობა
    firstMarket.bougthProd()     // რიგში პირველმა მდგომმა იყიდა პროდუქტები და დატოვა რიგი, რიგში დარჩენილი ადმიანების რაოდენობა და მიმდევრობა.
    firstMarket.bougthProd()     // შესაბამისად მომდევნო ადამიანმა იყიდა პროდუქტი და დატოვა რიგი...
}

class marketQueue {
    val queue = LinkedList<Int>()

    fun peopleInQueue() {
        println("Currently in queue are " + (queue.indexOfLast { true } + 1) + " people.")
        println("People in queue: $queue.")
    }

    fun bougthProd(){
        val left: Int = queue.pop()
        println("Number $left bought products and left queue.")
        println("There are " + (queue.indexOfLast { true } + 1) + " people left in queue.")
        println("People left in queue: $queue.")
    }

}