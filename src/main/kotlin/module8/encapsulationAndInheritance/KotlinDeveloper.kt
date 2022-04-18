package module8.encapsulationAndInheritance

class KotlinDeveloper : Developer {
    constructor(name: String, age: Int) : super(name, age)
    constructor(name: String, age: Int, experience: Int) : super(name,age,experience)
}
//
//fun test() {
//    val developer = KotlinDeveloper("Bob", 29)
//}