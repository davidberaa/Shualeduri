import java.util.Stack

fun main() {

    val fifo: ammoMagazine = ammoMagazine()

    fifo.stack.push(1)
    fifo.stack.push(2)
    fifo.stack.push(3)
    fifo.stack.push(4)
    fifo.stack.push(5)  // გადავტენეთ მჭიდი 5 ტყვიით ბოლოა შესაბამისად ნომერი "5" ტყვია.

    fifo.magazineCheck()     // შევამოწმოთ ტყვიების მიმდევრობა მჭიდში
    fifo.shoot()             // პირველი გასროლა, რომელი ტყვია გაისროლა იარაღმა და როგორ დარჩა ტყვიების მიმდევრობა მჭიდში.

}

class ammoMagazine {
    val stack = Stack<Int>()

    fun magazineCheck(){
        println("Current ammo in magazine: $stack")
    }
    fun shoot(){
        val fire: Int = stack.pop()
        println("Shot ammo number: $fire")
        println("Ammo left in magazine: $stack")
    }
}