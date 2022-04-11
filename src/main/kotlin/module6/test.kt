package module6

fun main() {
    println("How many phone numbers do you want to add?")
    var inputNumber: Int = readLine()?.toIntOrNull() ?: 0
    while (inputNumber <= 0) {
        println("Number must be positive\nEnter number again")
        inputNumber = readLine()?.toIntOrNull() ?: 0
            }
    val phoneBook = mutableListOf<String>()
    for (i in 0 until inputNumber) {
        val number = readLine().toString()
        phoneBook.add(number)
    }
//    phoneBook.forEach { item -> println(item) }
    println(phoneBook)
}