package behavioraldesignpattern.command

/*
* Client
* The 'Client' creates and configures 'Concrete Command' objects.
* It must pass all of the request parameters, including a 'Receiver'
* instance, into the constructor of the 'Command'. After that, the
* resulting 'Command' may be associated with one or multiple
* 'Senders/Invokers'.
* */
class Client {
    companion object{
        @JvmStatic
        fun main(args:Array<String>){
            // receiver
            val cook = Cook()

            // concrete command
            val pizza : Command = OrderPizza(cook, "Pizza Margherita")
            val soup : Command = OrderPizza(cook, "Chicken Noodle Soup")

            // sender/invoker
            var waiter = Waiter(pizza)
            waiter.executeOrder()

            // we can do the same for soup
            waiter = Waiter(soup)
            waiter.executeOrder()
        }
    }
}