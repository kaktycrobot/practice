package module5

/*
fun main() {
    println("Enter a")
    val a: Int = readLine()?.toIntOrNull() ?: return
    println("Enter b")
    val b: Int = readLine()?.toIntOrNull() ?: return
    println("Enter c")
    val c: Int = readLine()?.toIntOrNull() ?: return

    val x = solveEquation(a, b, c)
    if (x == null)
        println("No solutions")
    else
        println(x)
}
fun solveEquation(a: Int, b: Int, c: Int): Double? {
    if (a == 0) return null
    return (c - b) / a.toDouble()
}
fun max(a: Int, b: Int): Int = if (a > b) a else b
fun printIfPositive(n: Int) {
    if (n > 0)
        println(n)
    println(n + 1000)
}*/
fun main() {
    println("Input your exp lvl")
    val inputExp = readLine()?.toIntOrNull() ?: return
    val result: String = getDevPosition(inputExp)
    println("Yor position is " + result)
}
fun getDevPosition(expirience: Int): String {
    return when (expirience) {
        0 -> "intern"
        in 1..2 -> "junior"
        in 3..4 -> "middle"
        in 4..5 -> "senior"
        else -> "leading"
    }
}
/*fun getUserAccess(isAuthorised: Boolean, role: String): String {
    return when {
        !isAuthorised -> "Restricted"
        role == "Admin" -> "Full"
        role == "Moderator" -> "Limited"
        else -> "Common"
    }
}*/