package module7.Modifiers

import kotlin.random.Random

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
        private set
    private var fuelCount = 0.0

    init {
        println("Second init")
    }
    fun accelerate(speed: Double) {
        val needFuel = speed*0.1
        if (fuelCount > needFuel) {
            currentSpeed += speed
            useFuel(needFuel)
        }
        else
            println("Car has not enough fuel")
    }
//    fun decelerate(speed: Double) {
//        val finalSpeed = currentSpeed - speed
//        currentSpeed = if (finalSpeed < 0) 0
//        else finalSpeed
//    }

    fun decelerate(speed: Double) {
        currentSpeed = maxOf(0.0, currentSpeed - speed)
    }

    private fun useFuel(fuelCount: Double) {
        this.fuelCount -= fuelCount
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

    companion object {
        const val wheelsCount = 4
        fun getCarClass(lenght: Double): String = when {
            lenght < 3.6 -> "A"
            lenght < 3.9 -> "B"
            lenght < 4.3 -> "C"
            lenght < 4.6 -> "D"
            lenght < 5 -> "E"
            else -> "F"
        }
    }
}