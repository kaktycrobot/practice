package module5
/*
fun main() {
    println("Enter a number")
    var n = readLine()?.toIntOrNull() ?: return

    printNumbers(n)
}

fun printNumbers(number: Int): Int {
    return if (number > 0) {
        println(number)
        printNumbers(number-1)
    }
    else 0
}
*/
fun main() {
    println("Enter a number")
    var n = readLine()?.toIntOrNull() ?: return

    println(calculateSum(n))
}
tailrec fun calculateSum(n: Int, currentSum: Int = 0) : Int {
    if (n == 0) return currentSum
    return calculateSum(n - 1, currentSum + n)
}