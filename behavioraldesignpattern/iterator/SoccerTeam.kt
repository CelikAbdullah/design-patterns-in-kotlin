package behavioraldesignpattern.iterator

/*
* Concrete Collection
*
* A 'Concrete Collection' returns new instances of a particular
* 'Concrete Iterator' class each time the 'Client' requests one.
*
* In our case:
* 'SoccerTeam' provides a method that returns a 'SoccerTeamIterator'.
* The 'Client' is going to call 'createIterator()' whenever it needs
* an iterator that traverses an array of player instances.
* */
class SoccerTeam(private val teamArray: Array<Player>) : Team {

    override fun createIterator(): TeamIterator =
        SoccerTeamIterator(teamArray)
}