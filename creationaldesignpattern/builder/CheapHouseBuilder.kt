package creationaldesignpattern.builder

/*
* Concrete Builder
*
* A 'Concrete Builder' provides different implementations of the
* construction steps. It may produce products that do not
* follow the common interface.
*
* */
class CheapHouseBuilder : HouseBuilder {

    private lateinit var house: House

    init {
        reset()
    }

    private fun reset(){
        house = House()
    }

    override fun buildWalls() {
        println("I am a builder that builds the walls with cheap materials.")
        house.add("Step Building Walls: Cheap materials are used.")
    }


    override fun buildDoors() {
        println("I am a builder that builds the doors with cheap materials.")
        house.add("Step: Building Doors -> Cheap materials are used.")
    }


    override fun buildWindows() {
        println("I am a builder that builds the windows with cheap materials.")
        house.add("Step: Building Windows -> Cheap materials are used.")
    }


    override fun buildRoof() {
        println("I am a builder that builds the roof with cheap materials.")
        house.add("Step: Building Roof -> Cheap materials are used.")
    }


    override fun buildGarage() {
        println("I am a builder that builds the garage with cheap materials.")
        house.add("Step: Building Garage -> Cheap materials are used.")
    }

    override fun buildFancyStatues() {
        println("I am a builder that builds the fancy statues with cheap materials.")
        house.add("Step: Building Fancy Statues -> Cheap materials are used.")
    }

    override fun buildSwimmingPool() {
        println("I am a builder that builds the swimming pool with cheap materials.")
        house.add("Step: Building Swimming Pool -> Cheap materials are used.")
    }

    override fun buildGarden() {
        println("I am a builder that builds the garden with cheap & ugly flowers.")
        house.add("Step: Building Garden -> Cheap & ugly flowers are used.")
    }

    // used to return the House object
    override fun getResult(): House {
        val builtProduct = house
        reset()
        return builtProduct
    }
}