package creationaldesignpattern.builder

/*
* Builder
*
* The 'Builder' interface declares product construction steps that are
* common to all types of builders.
* */

interface HouseBuilder {
    fun buildWalls()
    fun buildDoors()
    fun buildWindows()
    fun buildRoof()
    fun buildGarage()
    fun buildFancyStatues()
    fun buildSwimmingPool()
    fun buildGarden()

    fun getResult(): House
}