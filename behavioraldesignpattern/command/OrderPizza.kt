package behavioraldesignpattern.command

/*
* Concrete Command
* A 'Concrete Command' implements various kinds of requests.
* It is not supposed to perform the work on its own but
* rather to pass the call to one of the business logic objects.
*
* Parameters required to execute a method on a receiving object
* can be declared as fields (here: meal) but they are optional.
* You can make 'Command' objects immutable by only allowing the
* initialization of these fields via the constructor (what I did
* in the following).
*
* Basically, what it does: A 'Concrete Command' encapsulates the
* 'Receiver' object (Cook) and calls the receiver-specific operation
* (cookMeal()) on that object when it is execution time.
* */

class OrderPizza(private val receiver: Cook, private val meal:String) : Command {

    override fun execute() = receiver.cookMeal(meal)
}