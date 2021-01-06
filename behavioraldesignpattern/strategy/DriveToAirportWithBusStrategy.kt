package behavioraldesignpattern.strategy

import behavioraldesignpattern.strategy.DriveToAirportStrategy

/*
* One of the 'Concrete Strategies'. It implements a different variation
* of an algorithm the Context uses.
* ( For the sake of simplicity, I keep that algorithm very simply by just
* printing something to the console.)
*
* 'Concrete Strategies' implement the algorithm while following the base
* Strategy interface (here: behavioraldesignpattern.strategy.DriveToAirportStrategy ). The interface
* makes them interchangeable in the 'Context' (polymorphism).
* */
class DriveToAirportWithBusStrategy: DriveToAirportStrategy {
    override fun driveToAirport() =
        println("I am driving to the airport with a bus.")

}