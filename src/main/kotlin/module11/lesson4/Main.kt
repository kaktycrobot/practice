package module11.lesson4

import module11.lesson1.Car
import module8.encapsulationAndInheritance.Developer
import module8.encapsulationAndInheritance.Person

fun main() {
/*    val list: List<String> = List(5) { "" }
    val intList = listOf(1, 2, 3, 4)

    println(genericFun(5))
    println(genericFun("hello"))
    println(genericFun(Car()))
    println(genericFun(null))*/
//    val object1 = Generic<Int>(5)
//    val object2 = Generic<String>("Generic String")
//    val object3 = Generic<Car>(Car())
//
//    val person = Generic<Person>(Person("Den", 32))
//    person.setItem(Developer("Developer", 21))

    val first = Generic<Number>(5.0)
    val second = Generic<Number>(10)
    sum(first, second)
}

fun <T> genericFun(input: T): String {
    return input?.toString() ?: "object is null"
}

fun sum(a: Generic<Number>, b: Generic<Number>): Int? {
    val first = a.item?.toInt() ?: return null
    val second = b.item?.toInt() ?: return null
    return first + second

}