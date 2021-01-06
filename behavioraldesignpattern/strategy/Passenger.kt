package behavioraldesignpattern.strategy

import behavioraldesignpattern.strategy.DriveToAirportStrategy

/*
* This class is our 'Context'. It has a field for storing a reference to one
* of the strategies. The Context delegates the work to a linked strategy object
* instead of executing it on its own.
* The context is not responsible for selecting an appropriate algorithm for the
* job. Instead, the client passes the desired strategy to the context.
* The context does not know much about strategies. It works with all strategies
* through the same generic interface, which only exposes a single method
* (in our case: driveToAirport() ) for triggering the algorithm encapsulated
* within the selected strategy. This way the context becomes independent of
* concrete strategies which means that we can add new algorithms or modify
* existing ones without changing the code of the context or other strategies.
* */
class Passenger(
                // Using polymorphism, the 'behavioraldesignpattern.strategy.Client' can pass any concrete strategy to Context
                var strategy: DriveToAirportStrategy
){

    /*
    * The Context calls the execution method ( driveToAirport() ) on the linked
    * strategy object each time it needs to run the algorithm instead of
    * implementing multiple versions of the algorithm on its own.
    * Again, the Context doesn't know what type of strategy it works with or
    * how the algorithm is executed.
    * */
    fun applyDriveToAirportStrategy() {
        // delegate the work to a linked strategy object
        strategy.driveToAirport()
    }


}