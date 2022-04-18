package module8.encapsulationAndInheritance

class ScalaDveloper : Developer {
    constructor(name: String, age: Int) : super(name, age)
    constructor(name: String, age: Int, experience: Int) : super(name, age, experience)

    override val paradigm = "functional"
}