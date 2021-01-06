package behavioraldesignpattern.iterator

/*
* Collection
*
* The 'Collection' interface declares one or multiple methods
* for getting 'Iterators' compatible with the 'Collection'.
* Note that the return type of the methods must be declared as
* the 'Iterator' interface so that the 'Concrete Collections'
* can return various kinds of 'Iterators'.
*
* */
interface Team {
    fun createIterator(): TeamIterator
}