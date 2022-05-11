package module11.lesson2

import kotlin.random.Random

fun main() {
    val boeing737 = Boeing737()
    fillAircraft(boeing737)
    println(boeing737.getInfo())
    boeing737.getSeatScheme()
    printPassengerInfo(boeing737, Seat(2, 'c'))

    println("========================================")

    val zeppelin = Zeppelin()
    fillAircraft(zeppelin)
    println(zeppelin.getInfo())
    zeppelin.getSeatScheme()
    printPassengerInfo(zeppelin, Seat(0, 'a'))

}

fun printPassengerInfo(aircraft: Aircraft, seat: Seat) {
    aircraft.getPassenger(seat)
        ?.getInfo()
        ?.let { println(it) }
        ?: println("there is no passenger")
}

fun fillAircraft(aircraft: Aircraft) {
    val aircraftPassengers = Random.nextInt(1, aircraft.capacity)
    for (i in 0 until aircraftPassengers) {
        val seat = aircraft.getAvailableSeat() ?: return

        val passenger = Passenger(
            name = "Ivan",
            lastName = "Petrov",
            document = getDocument(aircraft),
            seat = seat
        )
        aircraft.addPassenger(passenger)
    }
}

fun getDocument(aircraft: Aircraft): Document =
    if (aircraft is Zeppelin)
        DeputyID(
            number = Random.nextInt(100_000, 1_000_000).toString(),
            issueDate = "01.01.1970"
        )
    else
        ForeignPassport(
            series = Random.nextInt(1000, 9999).toString(),
            number = Random.nextInt(100_000, 999_999).toString()
        )


fun getRandomDocument() =
    when (Random.nextInt(0, 2)) {
        0 -> ForeignPassport(
            series = Random.nextInt(1000, 9999).toString(),
            number = Random.nextInt(100000, 999999).toString()
        )
        else -> DeputyID(
            number = Random.nextInt(100_000, 1_000_000).toString(),
            issueDate = "01.01.1970"
        )
    }