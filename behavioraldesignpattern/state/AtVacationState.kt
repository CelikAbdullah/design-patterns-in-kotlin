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
class AtVacationState(private val passenger: Passenger): State {

    override fun earnMoney() = println("I am at vacation. No need to earn money.")
    override fun buyTicket() = println("I've already bought a ticket. No need to buy a ticket.")

    override fun enjoyVacation() {
        println("A lot of sun makes me happy...:) ")

        println("On the last day of our trip, I should buy some souvenirs.")
        passenger.spendMoney()

        if (passenger.bankAccount == 0){
            println("I spent all of my money at vacation. The vacation is over.")

            // initiate state transition: InVacation -> HasNoMoney
            passenger.currentState = passenger.hasNoMoneyState
        }
    }
}