package behavioraldesignpattern.command

/*
* Sender/Invoker
* The 'Sender/Invoker' class is responsible for initiating requests.
* This class must have a field for storing a reference to a command object.
* The 'Invoker/Sender' triggers that 'Command' instead of sending the
* request directly to the 'Receiver'.
* Note that the 'Sender/Invoker' is not responsible for creating the
* 'Command' object. Usually, it gets a pre-created command from the
* 'Client' via the constructor.
*
* Basically what it does: It encapsulates a 'Command' and let it
* execute when it is the right. It has no idea what the 'Command'
* is or what will happen when it is executed. That way, the
* Waiter can accept any 'Command'.
* */

class Waiter(private val command : Command) {

    fun executeOrder() = command.execute()
}