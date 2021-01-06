package behavioraldesignpattern.mediator
/*
* Component
* Components are various classes that contain some business logic. Each 'Component'
* has a reference to a 'Mediator', declared with the 'Mediator' interface.
* The 'Component' is not aware of the actual class of the 'Mediator', so you can
* reuse the 'Component' in other programs by linking it to a different mediator.
*
* 'Components' must not be aware of other 'Components'. If something important happens
* within or to a 'Component', it must only notify the 'Mediator'. When the 'Mediator'
* receives the notification, it can easily identify the sender, which might be just
* enough to decide what component should be triggered in return.
* From the perspective of a 'Component', it all looks like a total black box.
* The sender does not know who'll end up handling its request and the receiver doesn't
* know who sent the request in the first place.
* */
class Helicopter: AirCraft(){

    fun landingOnHelicopterField() {
        println("I am a helicopter. I land on the landing field.")
        mediator.notification(this, "Arrival At Helicopter Field")
    }

    fun leavingHelicopterField() {
        println("I am a helicopter. I leave the landing field.")
        mediator.notification(this, "Departure From Helicopter Field")
    }


}