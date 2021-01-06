package behavioraldesignpattern.template

/*
* Concrete Class
*
* A 'Concrete Class' can override all of the steps but not the template
* method itself.
* */

class Boxer : MixedMartialArtsFighter() {

    /*
    * Concrete classes have to implement all abstract operations of the base
    * class. They can also override some operations with a default implementation.
    * In our case, Grappler has to implement trainForOpponent() and createMatchPlan().
    * */

    override fun trainForOpponent() = println("I have to work on my punches and endurance.")
    override fun createMatchPlan() = println("I came from boxing. So, I have to beat my opponent with hard punches.")

    // we don't override adjustGamePlanDuringMatch() because we do not have to
    // it is a hook function
    // in our case: a Boxer never adjust his game plan
    // in reality, this might be different

}