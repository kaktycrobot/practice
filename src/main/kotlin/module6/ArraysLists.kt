package module6

fun main() {
    val list = listOf(1, 2, 3, 4, 5)
    val mutableList = list.toMutableList()

//    mutableList.toList()

    val stringList = list.map {
        "This was a number $it"
    }
    stringList.forEach { println(it) }

    val mutableStringList = stringList.toMutableList()
    mutableStringList.add("new string")

    mutableStringList.forEach { println(it) }
}

/*способ с использованием removeAll
fun main() {
    val numbers = MutableList(10) { Random.nextInt(-10, 10) }
    println(numbers)
    numbers.removeAll { it < 0 }
    println(numbers)
}*/
/*способ с использованием итератора
fun main() {
    val numbers = MutableList(10) { Random.nextInt(-10, 10) }
    println(numbers)
    val iterator = numbers.iterator()
    while (iterator.hasNext()) {
        val item = iterator.next()
        if (item < 0)
            iterator.remove()
    }
    println(numbers)
}*/
/* способ с созданием второго списка
fun main() {
    val numbers = MutableList(10) { Random.nextInt(-10, 10) }
    println(numbers)
    val candidatesToRemove = mutableListOf<Int>()
    numbers.forEach {
        if (it < 0)
            candidatesToRemove.add(it)
    }
    numbers.removeAll(candidatesToRemove)
    println(numbers)

}*/

/*fun main() {
    val list = listOf(1, 2, 3, 4, 5)
    val mutableList = mutableListOf<Int>(1, 2, 3, 4, 5)
     println(list[list.lastIndex])

//    list[1] = 4
    println(mutableList.size)
    mutableList[1] = 4
    mutableList.add(6)
    mutableList.add(7)
    println(mutableList.size)
    println(mutableList.joinToString(","))

}*/

/*fun main() {
    val list = listOf(1, 2, 3, 4, 5)
    val carList = listOf<String>("Mercedes", "BMW", "Ferrari")
//    for (i in list.indices) {
//        println(list[i]*i)
//    }
//    list.forEach {item -> println(item)}
//    list.forEachIndexed { index, item ->
//        println(item * index)
//    }
    println(list.sumOf { it * 5 })
    println(carList.sumOf { it.length })
}*/

/*fun main() {
    val list = listOf(1, 2, 3, 4)
    val carList = listOf<String>("Mercedes", "BMW", "Ferrari")

    val emptyList = listOf<String>()
    val secondEmptyList = emptyList<String>()

    val secondList = List(5) {0}
    val secondCarList = List<String>(3) {index -> "Car №${index}"}

    val mutableList = mutableListOf<Int>(1, 2, 3, 4)
    val mutableCarList = mutableListOf<String>("Mercedes", "BMW", "Ferrari")

    val mutableSecondList = MutableList(5) {0}
    val mutableSecondCarList = MutableList<String>(3) {index -> "Car №${index}"}
}*/