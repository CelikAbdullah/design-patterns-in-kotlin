package behavioraldesignpattern.strategy

/*
* The behavioraldesignpattern.strategy.Client creates a specific strategy object and passes it to the
* 'Context' (here: behavioraldesignpattern.strategy.Passenger) . It should be aware of the differences
* between strategies in order to make the right choice.
* */
class Client {
    companion object {
        @JvmStatic
        fun main(args:Array<String>){
            lateinit var strategy: DriveToAirportStrategy
            lateinit var passenger: Passenger

            /*
            * (1..3).random() will create a number between 1 & 3 ( see also : https://kotlinlang.org/api/latest/jvm/stdlib/kotlin.ranges/random.html#random )
            * NOTE:
            * We could also ask the user of this application to select one strategy,
            * but here, I decided to just pick a number randomly
            * We could also select one 'Concrete Strategy' based on other factors such
            * as budget or time constraints but that would make the behavioraldesignpattern.strategy.Client more complex
            * ( in real-world applications that might be the case but here, I wanted to
            * keep the strategy-selecting logic very simple )
            *
            * */
            when((1..3).random()){
                1 -> {
                    strategy = DriveToAirportWithBusStrategy()    // create a 'Concrete Strategy'
                    passenger = Passenger(strategy)               // create a 'Context' with 'Concrete Strategy'
                    passenger.applyDriveToAirportStrategy()       // perform the strategy
                }
                2 -> {
                    strategy = DriveToAirportWithCarStrategy()    // create a 'Concrete Strategy'
                    passenger = Passenger(strategy)               // create a 'Context' with 'Concrete Strategy'
                    passenger.applyDriveToAirportStrategy()       // perform the strategy
                }
                3 -> {
                    strategy = DriveToAirportWithTaxiStrategy()   // create a 'Concrete Strategy'
                    passenger = Passenger(strategy)               // create a 'Context' with 'Concrete Strategy'
                    passenger.applyDriveToAirportStrategy()       // perform the strategy
                }
            }

            println("Some time later...")

            /*
            * Usually, the 'Context' exposes a setter method which lets the 'behavioraldesignpattern.strategy.Client' replace
            * the 'Strategy' associated with the 'Context' at runtime.
            * But in Kotlin, we do not have to implement a setter method since it is
            * created for us automatically. Therefore, we can change the 'Strategy' at runtime
            * by using the property access syntax.
            * */
            passenger.strategy = DriveToAirportWithBikeStrategy()  // change the strategy at runtime
            passenger.applyDriveToAirportStrategy()                // perform new strategy
        }
    }
}