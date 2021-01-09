package structuraldesignpattern.flyweight

/*
* Client
*
* The 'Client' calculates or stores the extrinsic state of flyweights.
* From the client's perspective, a flyweight is a template object
* which can be configured at runtime by passing some contextual
* data into parameters of its methods.
*
* Here, it passes random coordinates to the method move() of the
* PlayerType class which is our 'Flyweight'.
* */
class Client {

    companion object{
        @JvmStatic
        fun main(args:Array<String>){
            // create the factory
            val factory = FlyweightFactory()

            // check how much flyweights we have at the beginning
            factory.informationAboutFlyweights()

            println("++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++")
            // let's create players
            for (i in 1..100){
                println("Creating Player instance nr. $i")

                val name = "abdullah"       // shared state <-- intrinsic state
                val color = "green"         // shared state <-- intrinsic state

                // after 1st iteration, there is no need to create a new PlayerType instance
                val playerType = factory.getPlayerType(name, color)

                // here, we calculate unique/extrinsic states of the player randomly
                val xCoord = (0..200).random()   // unique state <-- extrinsic state
                val yCoord = (0..300).random()   // unique state <-- extrinsic state

                // in every iteration, a new Player instance is created that will use the one and only PlayerType instance
                val player = Player(xCoord, yCoord, playerType)
                println("HashCode of the Player in memory: $player")  // for verifying that it is different object
                player.move()
            }

            println("++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++")
            // check again the number of flyweights
            // the takeaway is clear: we have 100 Player instances in memory BUT only 1 PlayerType instance
            factory.informationAboutFlyweights()
        }
    }
}