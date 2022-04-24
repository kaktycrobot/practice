package module6

fun main() {
    var testList = mutableListOf<Int>( (-20..20).random())
    println(testList)
    testList.forEach {
        if (it < 0) testList.remove(it)
    }
    println(testList)

}