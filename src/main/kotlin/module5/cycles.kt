package module5
/*fun main() {
    println("Enter a number")
    val n = readLine()?.toIntOrNull() ?: return
    var i: Int = 0
    var sum = 0
    while (i <= n) {
        println(i)
        sum += i
        i++
    }
    println("Sum of first $n number - $sum")
}

fun main() {
    println("Enter a number")
    val n = readLine()?.toIntOrNull() ?: return
    var sum = 0
    for (j in 0..n) {
        if (j % 2 !=0) continue
        println(j)
        sum += j
    }

    println("Sum of first $n number - $sum")
}*/
fun main() {
    whileFun(100)
    doWhileFun(100)
}
fun whileFun(currentSum: Int) {
    var count = 0
    var sum = currentSum
    println("Enter a start number")
    var n = readLine()?.toIntOrNull() ?: return
    while (sum < 100) {
        println("current number - $n")
        sum += n
        println("sum - $sum")
        n++
        count++
    }
    println("number count - $count")
}
fun doWhileFun(currentSum:Int) {
    var count = 0
    var sum = currentSum
    println("Enter a start number")
    var n = readLine()?.toIntOrNull() ?: return
    do {
        println("current number - $n")
        sum += n
        println("sum - $sum")
        n++
        count++
    } while (sum < 100)
    println("number count - $count")
}