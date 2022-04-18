package module8.encapsulationAndInheritance

open class Person (val name: String, val age: Int) {
    fun walk() = println("walking")
    fun eat() = println("eating")
    fun sleep() = println("sleeping")
}