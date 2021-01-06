package behavioraldesignpattern.observer

/*
* Concrete Publisher
*
* A 'Concrete Publisher' that provides an implementation for
* the subscriptions mechanism defined in the 'Publisher' interface.
*
* It also contains some business logic like creating news before
* notifying the registered 'Subscribers'.
* */
class SportsMagazine : Publisher {

    // a list field for storing references to subscriber objects
    // here: we use a mutable list as data structure since adding & removing can happen frequently
    //       ( but we could also choose another data structure )
    private val subscribers: MutableList<Subscriber> = mutableListOf()

    // adds a Subscriber to the list
    override fun subscribe(subscriber: Subscriber) = subscribers.add(subscriber)

    // removes a Subscriber from the list
    override fun unsubscribe(unsubscriber: Subscriber) = subscribers.remove(unsubscriber)

    // notify all registered subscribers
    override fun notifySubscribers() {

        // create some news
        val news= createSportNews()

       /*
        * When a new event happens, the 'Publisher' goes over the
        * subscription list and calls the notification method
        * declared in the 'Subscriber' interface on each 'Subscriber'
        * object.
       * */
        for (subscriber in subscribers){
            subscriber.update(news)
        }
    }


    // just a normal function to create news randomly and notify the subscribers
    private fun createSportNews(): List<String> =
        listOf(
            "The German National Team is World Cup Winner !",
            "FC Barcelona lost in the CL-Semifinal AGAIN !!!",
            "FC Liverpool has won the Premier League after 30 years!!",
            "Conor McGregor has lost to Khabib Nurmagedov !",
            "Sebastian Vettel is leaving Ferrari Formula 1 team at the end of the season !"
        )

}