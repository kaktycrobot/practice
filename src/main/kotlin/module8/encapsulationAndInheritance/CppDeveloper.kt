package module8.encapsulationAndInheritance

class CppDeveloper : Developer {
    constructor(name: String, age: Int) : super(name, age)
    constructor(name: String, age: Int, experience: Int) : super(name,age,experience)
}