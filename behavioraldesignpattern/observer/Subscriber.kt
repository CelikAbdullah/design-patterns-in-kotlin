package behavioraldesignpattern.observer

/*
 * Subscriber
 *
 * The 'Subscriber' interface declares the notification interface.
 * In most cases, it consists of a single update() method.
 * The method may have several parameters that let the 'Publisher'
 * pass some event details along with the update.
 * In our case: We pass the list of the news to the 'Subscribers'.
 *
 * Usually, 'Subscribers' need some contextual information to handle
 * the update correctly. For this reason, 'Publishers' often pass
 * some context data as arguments of the notification method.
 * E.g. the 'Publisher' can pass itself as an argument, letting
 * 'Subscriber' fetch any required data directly.
 * */
interface Subscriber {
    fun update(news:List<String>)
}