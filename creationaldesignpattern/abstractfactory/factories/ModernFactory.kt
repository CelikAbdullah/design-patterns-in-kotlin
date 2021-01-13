package creationaldesignpattern.abstractfactory.factories

import creationaldesignpattern.abstractfactory.products.*

/*
* Concrete Factory
*
* A 'Concrete Factory' implements creation methods of the
* 'Abstract Factory'. Each 'Concrete Factory' corresponds
* to a specific variant of products and creates only those
* product variants.
* Here, 'ModernFactory' creates only the 'Modern' variants
* of the products chair, sofa and coffee table.
* */
class ModernFactory: AbstractFurnitureFactory {
    // used to create the 'Modern' variant of a chair
    override fun createChair(): Chair = ModernChair()
    // used to create the 'Modern' variant of a sofa
    override fun createSofa(): Sofa = ModernSofa()
    // used to create the 'Modern' variant of a coffee table
    override fun createCoffeeTable(): CoffeeTable = ModernCoffeeTable()
}