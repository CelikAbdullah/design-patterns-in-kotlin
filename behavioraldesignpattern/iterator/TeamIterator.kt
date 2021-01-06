package behavioraldesignpattern.iterator

/*
* Iterator
*
* The 'Iterator' interface declares the operations required for traversing
* a collection: fetching the next element, retrieving the current position,
* restarting iteration, etc..
* */
interface TeamIterator {
    fun hasNext(): Boolean      // check if underlying collection has a next element
    fun next() : Player         // return an element from the underlying collection
}