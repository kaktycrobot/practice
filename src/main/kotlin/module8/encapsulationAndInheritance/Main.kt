package module8.encapsulationAndInheritance

fun main() {
    val ktDev = KotlinDeveloper("Lex", 23)
    val javaDev = JavaDeveloper(name = "Ivan", age = 32, experience = 7)
    val cppDev = CppDeveloper(name = "Bob", age = 40, experience = 20)

    ktDev.writeCode()
    println("experience - ${ktDev.experience}")
    javaDev.writeCode()
    println("experience - ${javaDev.experience}")
    cppDev.writeCode()
    println("experience - ${cppDev.experience}")

}