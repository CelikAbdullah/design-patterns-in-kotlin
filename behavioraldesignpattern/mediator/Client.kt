package behavioraldesignpattern.mediator

/*
* Client
* Just a normal class that puts all the pieces of the Mediator Pattern together.
* */
class Client {

    companion object{
        @JvmStatic
        fun main(args:Array<String>){
            val jumboJet = JumboJet()            // jumboJet that wants to land on the field
            val helicopter = Helicopter()        // helicopter that wants to land on the helicopter field

            // aircraft objects that approach the airport has to talk to arrival tower
            val airTrafficArrivalTower : Tower = AirTrafficArrivalTower(jumboJet, helicopter)

            airTrafficArrivalTower.ready()  // just prints that the arrival tower is ready

            println("After some time ...")
            println("-------------------------------------------")
            jumboJet.landingOnField()
            println("After some time ...")
            println("-------------------------------------------")
            helicopter.landingOnHelicopterField()

            println("After some time ...")
            println("-------------------------------------------")

            // aircraft objects that leave the airport has to talk to departure tower
            // ( here: we reuse the existing 'Component' objects by linking them with another 'Mediator' object)
            val airTrafficDepartureTower : Tower = AirTrafficDepartureTower(jumboJet, helicopter)

            airTrafficDepartureTower.ready()  // just prints that the departure tower is ready

            println("After some time ...")
            println("-------------------------------------------")
            jumboJet.leavingLandingField()
            println("After some time ...")
            println("-------------------------------------------")
            helicopter.leavingHelicopterField()
        }
    }
}