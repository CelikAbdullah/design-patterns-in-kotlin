package creationaldesignpattern.factorymethod


/*
* Concrete Product
*
* A 'Concrete Product' is an implementation of
* the 'Product' interface.
* */
class Truck:Transport {
    override fun deliver() =
        println("As a truck, I am delivering by land in a box.")
}