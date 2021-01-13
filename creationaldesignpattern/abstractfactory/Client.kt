package creationaldesignpattern.abstractfactory

import creationaldesignpattern.abstractfactory.factories.AbstractFurnitureFactory
import creationaldesignpattern.abstractfactory.factories.ArtDecoFactory
import creationaldesignpattern.abstractfactory.factories.ModernFactory
import creationaldesignpattern.abstractfactory.factories.VictorianFactory
import creationaldesignpattern.abstractfactory.products.Chair
import creationaldesignpattern.abstractfactory.products.CoffeeTable
import creationaldesignpattern.abstractfactory.products.Sofa

/*
* Client
*
* Although 'Concrete Factories' (e.g. ModernFactory) instantiate 'Concrete
* Products' (e.g. ModernSofa, ModernChair, ModernCoffeeTable), signatures of
* their creation methods must return  corresponding abstract products (e.g. Sofa,
* Chair, CoffeeTable). This way the client code that uses a factory does not
* get coupled to the specific variant of the product it gets from a factory.
* The 'Client' can work with any concrete factory/product variant, as long
* as it communicates with their objects via abstract interfaces.
*
* */
class Client {
    companion object{
        @JvmStatic
        fun main(args:Array<String>){

            var furnitureFactory : AbstractFurnitureFactory = ArtDecoFactory()
            var chair : Chair = furnitureFactory.createChair()
            chair.getStyleOfChair()
            var sofa : Sofa = furnitureFactory.createSofa()
            sofa.getStyleOfSofa()
            var coffeeTable: CoffeeTable = furnitureFactory.createCoffeeTable()
            coffeeTable.getStyleOfCoffeeTable()
            println("------------------------------------------------------------")

            furnitureFactory = ModernFactory()
            chair = furnitureFactory.createChair()
            chair.getStyleOfChair()
            sofa = furnitureFactory.createSofa()
            sofa.getStyleOfSofa()
            coffeeTable = furnitureFactory.createCoffeeTable()
            coffeeTable.getStyleOfCoffeeTable()
            println("------------------------------------------------------------")

            furnitureFactory = VictorianFactory()
            chair = furnitureFactory.createChair()
            chair.getStyleOfChair()
            sofa = furnitureFactory.createSofa()
            sofa.getStyleOfSofa()
            coffeeTable = furnitureFactory.createCoffeeTable()
            coffeeTable.getStyleOfCoffeeTable()
            println("------------------------------------------------------------")
        }
    }
}