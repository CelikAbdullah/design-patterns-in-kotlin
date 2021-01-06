package behavioraldesignpattern.iterator

/*
* Concrete Iterator
*
* A 'Concrete Iterator' implements specific algorithms for traversing a
* collection. The 'Iterator' object should track the traversal progress
* on its own. This allows several 'Iterators' to traverse the same
* collection independently of each other.
*
* In our case: I decided to give each 'Concrete Iterator' a different
* collection to traverse. Here, 'SoccerTeamIterator' gets an array
* of Player objects and knows how to traverse an array.
* */
class SoccerTeamIterator(private val team: Array<Player>) : TeamIterator {

    private var position: Int = 0

    // check if collection has an element
    override fun hasNext(): Boolean = position < team.size

    /*
    * Just returns a Player object from the given Array via the index operator.
    * We could make it more complex by adding some algorithms. But I wanted to
    * keep it simple.
    * */
    override fun next(): Player {
        val player: Player = team[position]
        position += 1
        return player
    }
}