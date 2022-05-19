package module11.lesson5

fun main() {

}

//fun Int.isEven(): Boolean {
//    return this % 2 == 0
//}

fun printNumber(number: Int) {
//    println(number.isEven())
//    println(5.isEven())

    val a = Int.random()
    val b = Int.random()
}

fun Int.Companion.random() : Int {
    return (System.currentTimeMillis() % 43).toInt()
}

val Int.isEven
    get() = this % 2 == 0