package creationaldesignpattern.abstractfactory.products

/*
* Concrete Product
*
* A 'Concrete Product' is an implementation of an
* abstract product. Concrete Products are grouped
* by variants. For example, below you can see the
* implementation of the abstract product 'Sofa'
* as a 'Modern' variant.
* */
class ModernSofa: Sofa {
    override fun getStyleOfSofa() =
        println("I am a sofa with a modern style.")
}