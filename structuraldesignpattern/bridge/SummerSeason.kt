package structuraldesignpattern.bridge

/*
* Concrete Implementation
* A 'Concrete Implementation' contain platform-specific code.
* */
class SummerSeason : HolidaySeason {
    override fun chooseHotel() =
        println("In the summer season, the hotel should be near the beach.")

    override fun bookingRoomInHotel() =
        println("In the summer season, the hotel room should be a room with a view of the sea.")

    override fun setHolidayLocation() =
        println("In the summer season, I should spend my holiday weeks in a place where I can enjoy the sun and the ocean.")

    override fun buyClothes() =
        println("In the summer season, I should buy some summer clothes.")
}