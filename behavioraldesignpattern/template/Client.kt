package behavioraldesignpattern.template

/*
* Client
*
* The 'Client' does not have to know the concrete class of an object it works with, as
* long as it works with objects through the interface of their base class.
* */

class Client {

    companion object{
        @JvmStatic
        fun main(args:Array<String>){

            val grappler : MixedMartialArtsFighter = Grappler()

            // the 'Client' calls the template method to execute the algorithm.
            grappler.fight()

            println("+++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++")

            val boxer: MixedMartialArtsFighter = Boxer()

            // the 'Client' calls the template method to execute the algorithm.
            boxer.fight()

        }
    }
}