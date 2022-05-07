package module10.lesson1

class SmartFridge : Callable {
    override val vendor = "LG"

    override fun call(number: String) {
        println("smart fridge calling $number")
    }
}