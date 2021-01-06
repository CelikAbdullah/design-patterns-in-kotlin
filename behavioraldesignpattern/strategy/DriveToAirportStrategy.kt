package behavioraldesignpattern.strategy/*
* The Strategy interface is common to all concrete strategies.
* It declares a method the Context uses to execute a strategy
* (here: driveToAirport() ).
* The Context uses this interface to call the algorithm defined
* by the 'Concrete Strategies'.
* */

interface DriveToAirportStrategy {
    fun driveToAirport()
}