package behavioraldesignpattern.visitor

/*
* Element
*
* The 'Element' interface declares a method for 'accepting' visitors.
* This method should have one parameter declared with the type of the
* 'Visitor' interface.
* */

interface Element {
    fun accept(visitor: Visitor)
}