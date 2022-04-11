package module6

/*вступление
fun main() {

    val map = mapOf<Int, String>(1 to "2", Pair(2, "123"))
    val mutableMap = mutableMapOf<Int, String>()
    val hashMap = hashMapOf(1 to "one", 2 to "two", 3 to "three")
    val treeMap = sortedMapOf(1 to "one")
    val  linkedHashMap = linkedMapOf<Int, Int>()

    map[222] = "1234"
    hashMap[222] = "1234"
    treeMap[222] = "1234"
    linkedHashMap[222] = 1234
}*/
fun main() {
    val priceList = mutableMapOf(
        "Milk" to 80,
        "Yogurt" to 50,
        "Apples" to 150,
        "Bananas" to 70,
        "Coca-Cola" to 100,
        "Orange juice" to 150
    )
    println(priceList.keys)
    println(priceList.values.maxOrNull())
    val maxValue = priceList.values.maxOrNull()
    println(priceList.filterValues { it == maxValue })

    priceList["Ice cream"] = 75
    priceList["Milk"] = 90
//    priceList.remove("Apples")

    for (entry in priceList.entries) {
        println("${entry.key} - ${entry.value}")
    }

    priceList.forEach { entry ->
        println("${entry.key} - ${entry.value}")
    }

    priceList.forEach { (key, value) ->
        println("$key - $value")
    }
/*    val priceListHash = hashMapOf(
        "Milk" to 80,
        "Yogurt" to 50,
        "Apples" to 150,
        "Bananas" to 70,
        "Coca-Cola" to 100,
        "Orange juice" to 150
    )
    val priceListSorted = sortedMapOf(
        "Milk" to 80,
        "Yogurt" to 50,
        "Apples" to 150,
        "Bananas" to 70,
        "Coca-Cola" to 100,
        "Orange juice" to 150
    )*/
    println(priceList)
//    println(priceListHash)
//    println(priceListSorted)

    val sortedMap = priceList.toSortedMap(compareBy<String> { it.length }.thenBy { it })
    println(sortedMap)
}