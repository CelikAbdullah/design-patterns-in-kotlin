package creationaldesignpattern.builder

/*
* Client
*
* The 'Client' must associate one of the builder objects with the director.
* Usually, it is done just once, via parameters of the director's constructor.
* The the director uses that builder object for all further construction.
*
* However, there is an alternative approach for the when the 'Client' passes
* the 'Builder' object to the production method of the 'Director'. In this case,
* you can use a different 'Builder' each time you produce something with the
* 'Director'.
* */
class Client {
    companion object{
        @JvmStatic
        fun main(args:Array<String>){
            // create the cheap house builder
            val cheapHouseBuilder: HouseBuilder = CheapHouseBuilder()
            // pass it to the director
            val director : HouseBuildingDirector = HouseBuildingDirector(cheapHouseBuilder)
            // ask the director to make a house with garden using the given cheap house builder
            director.makeHouse("HouseWithGarden")
            // get the house from the cheap house builder
            val house1 = cheapHouseBuilder.getResult()
            // look at the construction steps made
            house1.listSteps()

            println("-------------------------------------------------------------------------")

            // create an expensive house builder
            val expensiveHouseBuilder : HouseBuilder = ExpensiveHouseBuilder()
            // replace the cheap house builder with the expensive house builder
            director.builder = expensiveHouseBuilder
            // ask the director again to create a house of certain type using the expensive house builder
            director.makeHouse("HouseWithGardenAndGarageAndFancyStatues")
            // get the result
            val house2 = expensiveHouseBuilder.getResult()
            // look at the final construction steps
            house2.listSteps()

            // ...
            // we can do the same for the other house types, too
        }
    }
}