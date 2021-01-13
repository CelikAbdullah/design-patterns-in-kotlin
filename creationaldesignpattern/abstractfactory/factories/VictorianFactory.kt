package creationaldesignpattern.abstractfactory.factories

import creationaldesignpattern.abstractfactory.products.*

/*
* Concrete Factory
*
* A 'Concrete Factory' implements creation methods of the
* 'Abstract Factory'. Each 'Concrete Factory' corresponds
* to a specific variant of products and creates only those
* product variants.
* Here, 'VictorianFactory' creates only the 'Victorian' variants
* of the products chair, sofa and coffee table.
* */
class VictorianFactory: AbstractFurnitureFactory {
    // used to create the 'Victorian' variant of a chair
    override fun createChair(): Chair = VictorianChair()
    // used to create the 'Victorian' variant of a sofa
    override fun createSofa(): Sofa = VictorianSofa()
    // used to create the 'Victorian' variant of a coffee table
    override fun createCoffeeTable(): CoffeeTable = VictorianCoffeeTable()
}