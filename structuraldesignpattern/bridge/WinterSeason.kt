package structuraldesignpattern.bridge

/*
* Concrete Implementation
* A 'Concrete Implementation' contain platform-specific code.
* */
class WinterSeason: HolidaySeason {
    override fun chooseHotel() =
        println("In the winter season, the hotel should be near of a mountain with a lot of snow.")

    override fun bookingRoomInHotel() =
        println("In the winter season, the hotel room should be a room with a view of the mountain")

    override fun setHolidayLocation() =
        println("In the winter season, I should spend my holiday weeks in a place where I can enjoy the snow.")

    override fun buyClothes() =
        println("In the winter season, I should buy some winter clothes.")
}