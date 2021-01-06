package behavioraldesignpattern.observer

/*
* Concrete Subscriber
*
* A 'Concrete Subscriber' performs some actions in response to notifications
* issued by the 'Publisher'. All of these classes must implement the same
* interface so the 'Publisher' is not coupled to concrete classes.
* */

class SportsMagazineSubscriber(private val firstName: String) : Subscriber {
    override fun update(news: List<String>) {
        println("I am $firstName and I have received my news.")
        println("Let's look what we have in the news: ")
        for (headline in news) {
            println(headline)
        }
        println("----------------------------------------")
    }
}