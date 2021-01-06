package behavioraldesignpattern.state


/*
* Context
* The 'Context' stores a reference to one of the concrete state objects and delegate
* to it all state-specific work. The 'Context' communicates with the state object
* via the state interface.
* */
class Passenger(var bankAccount: Int) {

    /*
    * Some variables holding the 'Concrete State' objects.
    * Note that the current state may have been changed by 'Context' or the
    * 'Concrete State' objects.
    * */
    var hasNoMoneyState : State = HasNoMoneyState(this)
    var workingState: State = WorkingState(this)
    var hasMoneyState: State = HasMoneyState(this)
    var inVacationState : State = AtVacationState(this)

    /*
    * The variable that holds the current state. This can be set by the 'Context'
    * (as we do in the following lines) or by the 'Concrete States'.
    * */
    var currentState: State = if(bankAccount>0){
        hasMoneyState
    } else{
        hasNoMoneyState
    }

    /*
    * The 'Context' just delegates the work
    * */
    fun earnMoney() = currentState.earnMoney()
    fun enjoyVacation() = currentState.enjoyVacation()
    fun buyTicket() = currentState.buyTicket()


    //+++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++

    // method that fills the bank account of the Passenger
    // not really related to the State Pattern concept - just a normal function
    fun work() {
        while (this.bankAccount<50) {
            this.bankAccount += (1..20).random()
        }
    }

    // method that empties the bank account of the Passenger
    // not really related to the State Pattern concept - just a normal function
    fun spendMoney(){
        while(this.bankAccount > 0) {
            this.bankAccount -= (1..20).random()
        }
    }
}