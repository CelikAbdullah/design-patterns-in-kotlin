package behavioraldesignpattern.observer

class PoliticsMagazine: Publisher {

    // a list field for storing references to subscriber objects
    // here: we use a mutable list as data structure since adding & removing can happen frequently
    //       ( but we could also choose another data structure )
    private val subscribers: MutableList<Subscriber> = mutableListOf()

    // add a Subscriber to the list
    override fun subscribe(subscriber: Subscriber): Boolean = subscribers.add(subscriber)

    // remove a Subscriber from the list
    override fun unsubscribe(unsubscriber: Subscriber): Boolean = subscribers.remove(unsubscriber)

    // notify all registered subscribers
    override fun notifySubscribers() {

        // create so news
        val news = createPoliticsNews()

        for (subscriber in subscribers){
            subscriber.update(news)
        }
    }

    // just a normal function to create news randomly and notify the subscribers
    private fun createPoliticsNews(): List<String>{
        return listOf(
            "Joe Biden is the new president of the United States of America !!!",
            "Donald Trump is a crying like a baby after loosing the election",
            "The Corona Virus has destroyed the economies of the most countries in the world",
            "A German company in Mainz has found the vaccine against Covid-19"
        )
    }
}