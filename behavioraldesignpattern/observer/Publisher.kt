package behavioraldesignpattern.observer

/*
* Publisher/Observable
*
* The 'Publisher' issues events of interest to other objects.
* These events occur when the 'Publisher' changes its state
* or executes some behaviors.
* A 'Publisher' can contain a subscription infrastructure that
* lets new 'Subscribers' join and current 'Subscribers' leave the
* list.
* */
interface Publisher {


    // method used to add a 'Subscriber' to the list
    fun subscribe(subscriber: Subscriber): Boolean
    // method used to remove a 'Subscriber' from the list
    fun unsubscribe(unsubscriber: Subscriber) : Boolean

    fun notifySubscribers()
}