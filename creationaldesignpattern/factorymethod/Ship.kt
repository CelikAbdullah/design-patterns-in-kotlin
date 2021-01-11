package creationaldesignpattern.factorymethod

/*
* Concrete Product
*
* A 'Concrete Product' is an implementation of
* the 'Product' interface.
* */
class Ship: Transport {
    override fun deliver() =
        println("As a ship, I am delivering by sea in container.")
}