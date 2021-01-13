package creationaldesignpattern.abstractfactory.factories

import creationaldesignpattern.abstractfactory.products.*

/*
* Concrete Factory
*
* A 'Concrete Factory' implements creation methods of the
* 'Abstract Factory'. Each 'Concrete Factory' corresponds
* to a specific variant of products and creates only those
* product variants.
* Here, 'ArtDecoFactory' creates only the 'Art Deco' variants
* of the products chair, sofa and coffee table.
* */
class ArtDecoFactory : AbstractFurnitureFactory {
    // used to create the 'Art Deco' variant of a chair
    override fun createChair(): Chair = ArtDecoChair()
    // used to create the 'Art Deco' variant of a sofa
    override fun createSofa(): Sofa = ArtDecoSofa()
    // used to create the 'Art Deco' variant of a coffee table
    override fun createCoffeeTable(): CoffeeTable = ArtDecoCoffeeTable()
}