package creationaldesignpattern.abstractfactory.products

/*
* Concrete Product
*
* A 'Concrete Product' is an implementation of an
* abstract product. Concrete Products are grouped
* by variants. For example, below you can see the
* implementation of the abstract product 'Chair'
* as a 'Modern' variant.
* */
class ModernChair: Chair {
    override fun getStyleOfChair() =
        println("I am a chair with a modern style.")
}