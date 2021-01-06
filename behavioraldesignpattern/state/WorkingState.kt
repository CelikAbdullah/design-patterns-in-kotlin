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
class WorkingState(private val passenger: Passenger): State {

    override fun earnMoney(){
        println("I am working to save some money for my vacation.")
        // earn some money
        passenger.work()
    }
    override fun enjoyVacation() = println("I am working right now. I can not enjoy the vacation")

    override fun buyTicket() {
        if(passenger.bankAccount > 50){
            println("I have enough money to buy a ticket.")
            // initiate state transition: Working -> HasMoney
            passenger.currentState = passenger.hasMoneyState
        }
    }
}