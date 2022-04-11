package module7.Modifiers

fun main() {
    val renault = Car(descriptor = "Renault" to "Logan", color = "Brown")
/*    println("Current speed - ${renault.currentSpeed}")
    println("Current fuel - ${renault.fuelCount}")

    renault.accelerate(100.0)
    println("Current speed - ${renault.currentSpeed}")
    println("Current fuel - ${renault.fuelCount}")

    renault.decelerate(50.0)
    println("Current speed - ${renault.currentSpeed}")
    println("Current fuel - ${renault.fuelCount}")*/

//    renault.currentSpeed = 1000.0
//    renault.currentSpeed = -1000.0

    println("Current speed - ${renault.currentSpeed}")

    println("Wheels count - ${Car.wheelsCount}")
    val classType = Car.getCarClass(3.8)
    println(classType)

    val car = Car("Audi", "A3")
//    car.getCarClass()

}