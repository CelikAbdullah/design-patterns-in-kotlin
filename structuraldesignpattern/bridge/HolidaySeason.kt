package structuraldesignpattern.bridge

/*
* Implementation
* The 'Implementation' declares the interface that's common for all concrete
* implementations. It does not have to match the interface of the 'Abstraction'.
* In fact, the two interface can be entirely different.
* Typically the 'Implementation' interface provides only primitive operations,
* while the 'Abstraction' defines higher-level operations based on those
* primitives.
* An 'Abstraction' can only communicate with an implementation
* object via methods that are declared here.
* */
interface HolidaySeason {
    fun chooseHotel()
    fun bookingRoomInHotel()
    fun setHolidayLocation()
    fun buyClothes()

}