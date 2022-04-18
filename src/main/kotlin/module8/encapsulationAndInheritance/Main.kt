package module8.encapsulationAndInheritance

fun main() {
    val ktDev = KotlinDeveloper("Lex", 23)
    val javaDev = JavaDeveloper(name = "Ivan", age = 32, experience = 7)
    val cppDev = CppDeveloper(name = "Bob", age = 40, experience = 20)
    val developer = Developer(name = "Adolf", age = 100, experience = 100)
    val scalaDev = ScalaDveloper(name = "Rock", age = 48, experience = 5)

    ktDev.writeCode()
    println("ktDev level - ${ktDev.getLevel()}")
    println("experience - ${ktDev.experience}")

    javaDev.writeCode()
    println("javaDev level -${javaDev.getLevel()}")
    println("experience - ${javaDev.experience}")

    cppDev.writeCode()
    println("cppDev level - ${cppDev.getLevel()}")
    println("experience - ${cppDev.experience}")

    developer.writeCode()
    println("developer level - ${developer.getLevel()}")
    println("experience - ${developer.experience}")

    println("javaDev paradigm - ${javaDev.paradigm}")
    println("scalaDev paradigm - ${scalaDev.paradigm}")

}