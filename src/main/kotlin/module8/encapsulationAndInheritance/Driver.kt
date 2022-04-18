package module8.encapsulationAndInheritance

class Driver(
    nameArg: String,
    ageArg: Int,
    val experience: Int
) : Person(nameArg, ageArg) {
    fun drive() = println("driving")
}