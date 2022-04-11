package module7.Classes

import kotlin.random.Random
import kotlin.random.nextInt

class Car {
    val brand = "Audi"
    val model = "A3"
    val color = "Red"

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