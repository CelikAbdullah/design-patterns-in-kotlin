package behavioraldesignpattern.iterator


/*
* Client
*
* The 'Client' works with both 'Collections' and 'Iterators'
* via their interfaces. This way the 'Client' is not coupled
* to concrete classes, allowing you to use various 'Collections'
* and 'Iterators' with the same 'Client' code.
*
* Typically, 'Clients' don't create 'Iterators' on their own,
* but instead get them from 'Collections'. Yet, in certain cases,
* the 'Client' can create one directly; for example, when the
* 'Client' defines its own special 'Iterator'.
* */
class Client {

    companion object{
        @JvmStatic
        fun main(args: Array<String>){

            // build the team
            val soccerTeam: Team = SoccerTeam(
                arrayOf(
                    Player("Abdullah", "Celik", 31, "soccer"),
                    Player("Michael", "Heiser", 25, "soccer"),
                    Player("Peter", "Husten", 28, "soccer"),
                    Player("Laura", "Krank", 29, "soccer")
                )
            )

            // get the iterator
            // normally, we do no have to create an iterator for an array because
            // Kotlin provides one for us via the iterator() method
            // BUT that's okay for learning the Iterator Pattern
            val soccerTeamIterator: TeamIterator = soccerTeam.createIterator()

            // iterator through the collection (whatever it is: array, list, etc.)
            while(soccerTeamIterator.hasNext()){
                val player : Player = soccerTeamIterator.next()
                println("Player's First Name: ${player.firstName}")
                println("Player's Last Name: ${player.lastName}")
                println("Player's Age : ${player.age}")
                println("Player is playing : ${player.sport}")
                println("--------------------------------------------")
            }


            println("+++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++")

            // do the same for the BasketBall team
            val basketBallTeam: Team = BasketBallTeam(
                setOf(
                    Player("LeBron", "James", 38, "basketball"),
                    Player("Michael", "Jordan", 30, "basketball"),
                    Player("Dirk", "Nowitzky", 28, "basketball"),
                    Player("James", "Harden", 29, "basketball")
                )
            )

            // normally, we do no have to create an iterator for a set because
            // Kotlin provides one for us via the iterator() method
            // BUT that's okay for learning the Iterator Pattern
            val basketBallTeamIterator : TeamIterator = basketBallTeam.createIterator()

            while(basketBallTeamIterator.hasNext()){
                val player: Player = basketBallTeamIterator.next()
                println("BasketBall Player's First Name: ${player.firstName}")
                println("BasketBall Player's Last Name: ${player.lastName}")
                println("BasketBall Player's Age : ${player.age}")
                println("BasketBall Player is playing : ${player.sport}")
                println("--------------------------------------------")
            }
        }
    }
}