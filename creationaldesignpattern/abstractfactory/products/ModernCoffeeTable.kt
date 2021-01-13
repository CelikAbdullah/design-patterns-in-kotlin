package creationaldesignpattern.abstractfactory.products

/*
* Concrete Product
*
* A 'Concrete Product' is an implementation of an
* abstract product. Concrete Products are grouped
* by variants. For example, below you can see the
* implementation of the abstract product 'CoffeeTable'
* as a 'Modern' variant.
* */
class ModernCoffeeTable : CoffeeTable {
    override fun getStyleOfCoffeeTable() =
        println("I am a coffee table with a modern style.")
}