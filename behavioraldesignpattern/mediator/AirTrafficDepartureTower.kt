package behavioraldesignpattern.mediator

import behavioraldesignpattern.mediator.AirCraft
import behavioraldesignpattern.mediator.Helicopter
import behavioraldesignpattern.mediator.JumboJet
import behavioraldesignpattern.mediator.Tower

/*
* Concrete Mediator
* A 'Concrete Mediator' encapsulate relations between various 'Components'.
* A 'Concrete Mediator' often keeps references to all 'Components' they manage
* and sometimes even manage their lifecycle.
*
* In our case:
* AirTrafficDepartureTower is a 'Concrete Mediator' responsible for handling the communication
* between the AirCraft objects that are leaving the airport.
*
* */

class AirTrafficDepartureTower(private val jumboJet: JumboJet,
                               private val helicopter: Helicopter) : Tower{

    init{
        // set the current 'Mediator' object of each 'Component' to establish links
        jumboJet.mediator = this
        helicopter.mediator = this
    }

    override fun notification(sender: AirCraft, event: String) {
        when(sender){
            is JumboJet -> {
                if(event== "Departure From Landing Field"){
                    println("Departure Tower reacts to departure of the JumboJet: ")
                    helicopter.landingOnHelicopterField()
                }
            }
            is Helicopter -> {
                if(event=="Departure From Helicopter Field"){
                    println("Departure Tower reacts to departure of the Helicopter: ")
                    jumboJet.leavingLandingField()
                }
            }
        }
    }

    // optional
    override fun ready() = println("The Departure Tower is ready to receive incoming events.")
}