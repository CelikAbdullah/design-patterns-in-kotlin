package creationaldesignpattern.abstractfactory.factories

import creationaldesignpattern.abstractfactory.products.Chair
import creationaldesignpattern.abstractfactory.products.CoffeeTable
import creationaldesignpattern.abstractfactory.products.Sofa

/*
* Abstract Factory
*
* The 'Abstract Factory' interface declares a set of methods for
* creating each of the abstract products.
* */
interface AbstractFurnitureFactory {
    // gets implemented by subclasses to create a chair of a particular variant
    fun createChair() : Chair
    // gets implemented by subclasses to create a sofa of a particular variant
    fun createSofa(): Sofa
    // gets implemented by subclasses to create a coffee table of particular variant
    fun createCoffeeTable(): CoffeeTable
}