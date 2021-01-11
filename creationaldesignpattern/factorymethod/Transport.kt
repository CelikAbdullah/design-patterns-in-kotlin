package creationaldesignpattern.factorymethod

/*
* Product
*
* The 'Product' declares the interface which is common to all
* objects that can be produced by the creator and its subclasses.
* */
interface Transport {
    fun deliver()
}