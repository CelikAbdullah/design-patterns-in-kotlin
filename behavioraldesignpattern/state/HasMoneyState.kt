package behavioraldesignpattern.state

/*
* Concrete State
* A 'Concrete State' provide their own implementations for the state-specific
* methods. To avoid duplication of similar code across multiple states, we may
* provide intermediate abstract classes that encapsulate some common behavior.
*
* 'State' objects may store a reference to the 'Context' object. Through this
* reference, the 'Concrete State' can fetch any required info from the 'Context'
* object, as well as initiate 'State' transitions.
* */
class HasMoneyState(private val passenger: Passenger): State {

    override fun earnMoney() = println("No need to work anymore. I have enough money.")
    override fun buyTicket() = println("Now, I should buy a ticket.")

    override fun enjoyVacation() {
        println("I am ready to start my vacation.")
        // initiate state transition: HasMoney -> InVacation
        passenger.currentState = passenger.inVacationState
    }
}