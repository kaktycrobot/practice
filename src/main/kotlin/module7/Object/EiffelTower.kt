package module7.Object

object EiffelTower {
    private var backlightsOn = false
    val height = 324
    fun turnOnBacklights() {
        println("backlights on")
        backlightsOn = true
    }

    fun turnOffBacklights() {
        println("backlights off")
        backlightsOn = false
    }
}