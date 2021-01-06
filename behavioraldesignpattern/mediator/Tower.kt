package behavioraldesignpattern.mediator

/*
* Mediator
* The 'Mediator' interface declares methods of communication with 'Components' which usually include just
* a single notification method. 'Components' may pass any context as arguments of this method, including
* their own objects, but only in such a way that no coupling occurs between a receiving 'Component' and
* the sender's class.
* */
interface Tower {
    fun notification(sender: AirCraft, event:String)

    fun ready() // <---- optional
}