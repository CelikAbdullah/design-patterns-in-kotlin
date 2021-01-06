package behavioraldesignpattern.chainofresponsibility

/*
* Base Handler
*
* The 'Base Handler' is an optional class where you can put the
* boilerplate code that is common to all 'Handler' classes.
* Usually, this class defines a field for storing a reference
* to the next 'Handler'. The 'Clients' can build a chain by
* passing a 'Handler' to the constructor or setter of the
* previous 'Handler'. The class may also implement the default
* handling behavior : it can pass execution to the next 'Handler'
* after checking for its existence.
* */

abstract class BaseFeeder: Feeder {

    // field for storing a reference to the next 'Handler'
    // I make it nullable here because there might not be a next 'Handler' in the chain
    var nextFeeder: Feeder? = null

    // usually, we would define a setter method here, but Kotlin generates setters
    // automatically for us behind the scenes so that we can set the value of 'nextFeeder'
    // later by using the property access syntax


    // base method passes the request to the next 'Handler' - this is common for all 'Concrete Handlers'
    // The 'Concrete Handlers' override this function to try to handle the request on its own
    override fun handle(food: String) {
        // when current handler has a next handler, then let the next handler handle the request
        nextFeeder?.let{
            it.handle(food)
        }
    }
}