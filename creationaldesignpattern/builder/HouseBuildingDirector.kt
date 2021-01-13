package creationaldesignpattern.builder

/*
* Director
*
* The 'Director' class defines the order in which to call
* construction steps, so you can create and reuse specific
* configurations of products.
* */
class HouseBuildingDirector(var builder:HouseBuilder) {
    fun makeHouse(type:String){

        // steps that need to be executed for all building processes
        builder.apply {
            buildWalls()
            buildDoors()
            buildWindows()
            buildRoof()
        }
        // steps needed for different type of houses
        when(type){
            "HouseWithGarage" -> { builder.buildGarage() }
            "HouseWithFancyStatues" -> {builder.buildFancyStatues()}
            "HouseWithGarden" -> {builder.buildGarden()}
            "HouseWithSwimmingPool" -> {builder.buildSwimmingPool()}

            // why not combinate some steps ?
            "HouseWithGardenAndFancyStatues" -> {
                builder.apply {
                    buildGarden()
                    buildSwimmingPool()
                }
            }
            "HouseWithGardenAndGarageAndFancyStatues" -> {
                builder.apply {
                    buildGarden()
                    buildGarage()
                    buildFancyStatues()
                }
            }
        }
    }

}