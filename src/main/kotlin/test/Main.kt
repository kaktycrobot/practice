package test

import java.util.SortedMap

fun main() {
    val testList = MutableList(10) { (-20..20).random() }
    println(testList)
    val filtered = testList.filterNot { it > 0 }

    println(filtered)

}