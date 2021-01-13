package creationaldesignpattern.builder

/*
* Concrete Builder
*
* A 'Concrete Builder' provides different implementations of the
* construction steps. It may produce products that do not
* follow the common interface.
*
* */
class ExpensiveHouseBuilder: HouseBuilder {

    private lateinit var house: House

    init {
        reset()
    }

    private fun reset(){
        house = House()
    }

    override fun buildWalls() {
        println("I am a builder that builds the walls with expensive materials.")
        house.add("Step Building Walls: Expensive materials are used.")
    }


    override fun buildDoors() {
        println("I am a builder that builds the doors with expensive materials.")
        house.add("Step: Building Doors -> Expensive materials are used.")
    }


    override fun buildWindows() {
        println("I am a builder that builds the windows with expensive materials.")
        house.add("Step: Building Windows -> Expensive materials are used.")
    }


    override fun buildRoof() {
        println("I am a builder that builds the roof with expensive materials.")
        house.add("Step: Building Roof -> Expensive materials are used.")
    }


    override fun buildGarage() {
        println("I am a builder that builds the garage with expensive materials.")
        house.add("Step: Building Garage -> Expensive materials are used.")
    }

    override fun buildFancyStatues() {
        println("I am a builder that builds the fancy statues with expensive materials.")
        house.add("Step: Building Fancy Statues -> Expensive materials are used.")
    }

    override fun buildSwimmingPool() {
        println("I am a builder that builds the swimming pool with expensive materials.")
        house.add("Step: Building Swimming Pool -> Expensive materials are used.")
    }

    override fun buildGarden() {
        println("I am a builder that builds the garden with expensive & beautiful flowers.")
        house.add("Step: Building Garden -> Expensive & beautiful flowers are used.")
    }

    // used to return the House object
    override fun getResult(): House {
        val builtProduct = house
        reset()
        return builtProduct
    }
}