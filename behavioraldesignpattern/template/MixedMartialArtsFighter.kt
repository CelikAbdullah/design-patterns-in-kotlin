package behavioraldesignpattern.template

/*
* Abstract Class
*
* The 'Abstract Class' declares methods that act as steps of an
* algorithm, as well as the actual template method which calls
* these methods in a specific order.
* The steps may either be declared abstract or have some default
* implementation.
* */

abstract class MixedMartialArtsFighter {

    /*
    * The 'Abstract Class' defines a template method that contains
    * a skeleton of some algorithm, composed of calls to (usually)
    * abstract primitive operations.
    * Its subclasses should implement these operations, but leave
    * the template method itself intact
    * */


    /*
    * Our template method. It can not be changed by subclasses.
    * In Kotlin every function is a final one; so no need to add 'final' keyword here.
    * It defines the skeleton of an algorithm.
    * */
    fun fight(){
        studyOpponent()    // <-- we provide a default implementation for this step (see below)
        trainForOpponent() // <-- this step is declared as 'abstract'; so each subclass has to provide an implementation
        fightAgainstOpponent()   // <-- this is another template method; an 'Abstract Class' can have more than one
    }

    // has a default implementation ( studying an opponent means watching his old fights -> that is the same for every fighter, I guess )
    // I also add the 'open' keyword since subclasses might want to override it
    open fun studyOpponent() = println("As a fighter, I have to watch old fights of my opponent to study him.")

    // has to be implemented by subclasses since training sessions of fighters might be different
    abstract fun trainForOpponent()

    // template method II -> more than one template method is allowed
    fun fightAgainstOpponent(){
        createMatchPlan()        // <-- this step has to be implemented by subclasses
        adjustGamePlanDuringGame()   // this is a hook
    }

    // has to be implemented by subclasses since every fighter might come up with a different game plan
    abstract fun createMatchPlan()

    /*
    * A "hook". Subclasses may override them but it is not mandatory since the hooks already have
    * default (but empty) implementation. Hooks provide additional extension points in some
    * crucial places of the algorithm. In most cases, a "hook" is used to integrate one or more
    * conditional branches within an algorithm. You can see an example of this in the
    * Grappler.kt subclass.
    * */
    open fun adjustGamePlanDuringGame(){}
}