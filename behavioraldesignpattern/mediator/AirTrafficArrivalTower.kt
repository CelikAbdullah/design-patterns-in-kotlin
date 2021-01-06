package behavioraldesignpattern.mediator

/*
* Concrete Mediator
* A 'Concrete Mediator' encapsulate relations between various 'Components'.
* A 'Concrete Mediator' often keeps references to all 'Components' they manage
* and sometimes even manage their lifecycle.
*
* In our case:
* AirTrafficArrivalTower is a 'Concrete Mediator' responsible for handling the communication
* between the AirCraft objects that are approaching the airport.
*
* */
class AirTrafficArrivalTower(private val jumboJet: JumboJet,
                             private val helicopter: Helicopter) : Tower {

   init{
       // set the current 'Mediator' object of each 'Component' to establish links
       jumboJet.mediator = this
       helicopter.mediator = this
   }

    /*
    * When sth. happens with a 'Component', it notifies its 'Mediator'.
    * Upon receiving a notification, the 'Mediator' may do sth. on its
    * own or pass the request to another 'Component'.
    * */
    override fun notification(sender: AirCraft, event: String) {
        when(sender){
            is JumboJet -> {
                if(event== "Arrival At Landing Field"){
                    println("Arrival Tower reacts to arrival of the JumboJet: ")
                    helicopter.leavingHelicopterField()
                }
            }
            is Helicopter -> {
                if(event=="Arrival At Helicopter Field"){
                    println("Arrival Tower reacts to arrival of the Helicopter: ")
                    jumboJet.leavingLandingField()
                }
            }
        }
    }

    // optional
    override fun ready() = println("The Arrival Tower is ready to receive incoming events.")
}