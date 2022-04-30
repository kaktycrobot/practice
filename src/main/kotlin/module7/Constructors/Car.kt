package module7.Constructors

//import java.lang.invoke.TypeDescriptor
import kotlin.random.Random

/*первый вариант
class Car(brandArg: String, modelArg: String, colorArg: String) {
    val brand = brandArg
    val model = modelArg
    val color = colorArg*/
class Car(val brand: String, val model: String, val color: String = "White") {

    constructor(descriptor: Pair<String, String>, color: String) : this(
        brand = descriptor.first,
        model = descriptor.second,
        color = color
    ) {
        println("secondary constructor")
    }

    init {
        println("Car init")
    }
    var currentSpeed = 0.0

    init {
        println("Second init")
    }
    fun move() {
        val distance = Random.nextInt(1,10)
        println("Car passed $distance km")
    }

    fun start() {
        println("Car started")
    }

    fun stop() {
        println("Car stopped")
    }
}