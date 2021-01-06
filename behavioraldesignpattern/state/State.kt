package behavioraldesignpattern.state

/*
* State
* The 'State' interface declares the state-specific methods. These methods
* should make sense for all 'Concrete States' because we don't want some
* of your states to have useless methods that will never be called.
* */
interface State {
    fun earnMoney()
    fun buyTicket()
    fun enjoyVacation()
}