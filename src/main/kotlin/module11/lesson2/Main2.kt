package module11.lesson2

import module8.encapsulationAndInheritance.Developer
import module8.encapsulationAndInheritance.Person

fun main() {
    /* расширяющее приведение (upcast)
    val developer = Developer("Tony", 40)
    developer.writeCode()
    developer.getLevel()

    val person: Person = developer*/
    //-------------------------------------------
    //сужающее приведение (downcast)

    val person: Person = Developer("Bob", 56)
    val developer: Developer? = person as? Developer

    developer?.writeCode()
    println(developer?.getLevel())
}