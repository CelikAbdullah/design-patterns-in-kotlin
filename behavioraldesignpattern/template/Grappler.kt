package behavioraldesignpattern.template

/*
* Concrete Class
*
* A 'Concrete Class' can override all of the steps but not the template
* method itself.
* */

class Grappler : MixedMartialArtsFighter() {

    /*
    * Concrete classes have to implement all abstract operations of the base
    * class. They can also override some operations with a default implementation.
    * In our case, Grappler has to implement trainForOpponent() and createMatchPlan().
    * */
    override fun trainForOpponent() = println("I have to improve my grappling skills. ")
    override fun createMatchPlan() = println("I always plan to take my opponent down and beat him on the ground.")

    // we also override the "hook" to demonstrate that
    override fun adjustGamePlanDuringGame() {

        super.adjustGamePlanDuringGame()

        when(canTakeOpponentDown()){
            true -> println("My strategy worked. I should follow my game plan.")
            false -> println("He is too strong on his feet because he has great defense skills...I should change my game plan.")
        }
    }

    // a helper function that decides if takedown attempts are working or not
    private fun canTakeOpponentDown(): Boolean {
        val takeDownPossible = arrayOf(true, false)

        return takeDownPossible[(0..1).random()]
    }
}