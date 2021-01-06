package structuraldesignpattern.bridge

/*
* Refined Abstraction
* The 'Refined Abstraction' provides variants of control logic. Like their
* parent, they work with different implementations via the general 'Implementation'
* interface.
* */
class BackPacker(private val season: HolidaySeason) : Passenger(season) {
    override fun prepareForSeason() =
        season.buyClothes()
}