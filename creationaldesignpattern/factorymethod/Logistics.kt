package creationaldesignpattern.factorymethod

/*
* Creator
*
* The 'Creator' class declares the factory method that returns new
* 'Product' objects. It is important that the return type of this
* method matches the 'Product' interface.
* You can declare the factory method as abstract to force all subclasses
* to implement their own versions of the method (what we did below).
* As an alternative, the base factory method can return some default
* product type.
* */
abstract class Logistics {


    fun planDelivery() {
        // create the concrete product
        val transport: Transport = createTransport()
        // do some stuff
        transport.deliver()
    }

    // factory method - note: the return type has to match the 'Product' interface
    // every subclass has to provide an implementation for this
    // specifically, each subclass has to return a 'Concrete Product'
    abstract fun createTransport() : Transport
}