package behavioraldesignpattern.iterator

/*
* Concrete Collection
*
* A 'Concrete Collection' returns new instances of a particular
* 'Concrete Iterator' class each time the 'Client' requests one.
*
* In our case:
* 'BasketBallTeam' provides a method that returns a 'BasketBallTeamIterator'.
* The 'Client' is going to call 'createIterator()' whenever it needs
* an iterator that traverses a set of player instances.
* */

class BasketBallTeam(private val teamSet: Set<Player>): Team{

    override fun createIterator(): TeamIterator =
        BasketBallIterator(teamSet)
}