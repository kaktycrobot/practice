package test
fun main() {
    val list = listOf(1, 2, 3, 4, 5, 6, 7, 8, 9)
    println(list.random())
    println(list[(list.indices).random()])
}