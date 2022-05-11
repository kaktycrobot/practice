package module11.lesson3

enum class Color(val hex: String) : Drawable {
    WHITE("#FFF"),
    BLACK("#000"),
    RED("#F00") {
        override fun draw() {
            println("Overridden draw fun")
        }
    },
    GREEN("#0F0"),
    BLUE("#00F"),
    GREY("#888");

    fun someMethod() {
        println("print something")
    }

    override fun draw() {
        println("draw color $hex")
    }
}