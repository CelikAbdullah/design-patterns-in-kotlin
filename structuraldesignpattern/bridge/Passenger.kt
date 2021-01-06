package structuraldesignpattern.bridge

/*
* Abstraction
* The 'Abstraction' provides high-level control logic. It relies on the
* implementation object ( here: HolidaySeason ) to do the actual low-level
* work.
* The 'Abstraction' may list the same methods as the 'Implementation', but
* usually it declares some complex behaviors that rely on a wide variety of
* primitive operations declared by the 'Implementation'.
* */

abstract class Passenger(private val season: HolidaySeason) {

    fun chooseHolidayLocation() =
        season.setHolidayLocation()

    fun planHoliday() {
        season.chooseHotel()
        season.bookingRoomInHotel()
    }

    abstract fun prepareForSeason()
}