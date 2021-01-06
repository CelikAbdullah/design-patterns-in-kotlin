package behavioraldesignpattern.observer

/*
* Client
*
* The 'Client' creates 'Publisher' and 'Subscriber' objects separately and then
* registers 'Subscribers' for 'Publisher' updates.
* */
class Client {
    companion object{
        @JvmStatic
        fun main(args:Array<String>){

            // create a Publisher for Sport News
            val sportsMagazine : Publisher = SportsMagazine()

            // create some Subscribers interested in Sport
            val michael : Subscriber = SportsMagazineSubscriber("Michael")
            val laura : Subscriber = SportsMagazineSubscriber("Laura")

            // let the subscribers 'subscribe' to the publisher of Sport News
            sportsMagazine.subscribe(michael)
            sportsMagazine.subscribe(laura)

            // notify all subscribers
            sportsMagazine.notifySubscribers()


            // do the same for the other Publisher
            val politicsMagazine : Publisher = PoliticsMagazine()
            val peter : Subscriber = PoliticsMagazineSubscriber("Peter")
            val hannelore : Subscriber = PoliticsMagazineSubscriber("Hannelore")

            politicsMagazine.subscribe(peter)
            politicsMagazine.subscribe(hannelore)

            politicsMagazine.notifySubscribers()

            // Peter is not interested in Politics, he switched to Sports
            politicsMagazine.unsubscribe(peter)
            sportsMagazine.subscribe(peter)

            sportsMagazine.notifySubscribers()
            politicsMagazine.notifySubscribers()
        }
    }
}