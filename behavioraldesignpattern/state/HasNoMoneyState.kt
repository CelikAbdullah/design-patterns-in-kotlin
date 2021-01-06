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
class HasNoMoneyState(private val passenger: Passenger): State {

    override fun earnMoney() {
        println("I have no money. I should earn some money.")

        // initiate state transition: HasNoMoney -> Working
        passenger.currentState = passenger.workingState
    }

    override fun buyTicket() = println("I have no money. So, I am not able to buy a ticket.")
    override fun enjoyVacation() = println("I can not enjoy my vacation because I am broke.")


}