package module7.Constructors

fun main() {
//    val vw = Car(brand = "VW", model = "Polo", color = "White")
//    val lada = Car(brand = "Lada", model = "Vesta", color = "Grey")
//    val bmw = Car(brand = "BMW", model = "X6")
//
//    printInfo(vw)
//    printInfo(lada)
//    printInfo(bmw)
    val renault = Car(descriptor = "Renault" to "Logan", color = "Brown")
    val vw = Car(brand = "VW", model = "Polo", color = "White")

    printInfo(vw)
    printInfo(renault)
}

fun printInfo(car: Car) {
    println("Brand - ${car.brand}, Model - ${car.model}, Color - ${car.color}")
}