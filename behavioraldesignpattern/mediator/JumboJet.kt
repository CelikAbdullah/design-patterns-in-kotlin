package behavioraldesignpattern.mediator

/*
* Component
* 'Components' are various classes that contain some business logic. Each 'Component'
* has a reference to a 'Mediator', declared with the 'Mediator' interface.
* The 'Component' is not aware of the actual class of the 'Mediator', so you can
* reuse the 'Component' in other programs by linking it to a different 'Mediator'.
*
* 'Components' must not be aware of other 'Components'. If something important happens
* within or to a 'Component', it must only notify the 'Mediator'. When the 'Mediator'
* receives the notification, it can easily identify the sender, which might be just
* enough to decide what component should be triggered in return.
* From the perspective of a 'Component', it all looks like a total black box.
* The sender does not know who'll end up handling its request and the receiver doesn't
* know who sent the request in the first place.
* */
class JumboJet: AirCraft(){

    fun landingOnField() {
        println("I am a JumboJet. I land on the landing field.")

        /*
        * 'Concrete Components' do not talk to each other. They have only
        * one communication channel, which is sending notifications to the
        * 'Mediator'.
        * */
        mediator.notification(this, "Arrival At Landing Field")
    }

    fun leavingLandingField() {
        println("I am a JumboJet. I leave the landing field.")
        
        /*
        * 'Concrete Components' do not talk to each other. They have only
        * one communication channel, which is sending notifications to the
        * 'Mediator'.
        * */
        mediator.notification(this, "Departure From Landing Field")
    }

}