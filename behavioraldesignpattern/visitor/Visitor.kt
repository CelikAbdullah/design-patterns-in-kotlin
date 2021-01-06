package behavioraldesignpattern.visitor

/*
* Visitor
*
* The 'Visitor' interface declares a set of visiting methods that can
* take 'Concrete Elements' of an object structure as arguments.
* Note that these methods may have the same names if the program is
* written in a language that supports overloading, but the type of
* their parameters must be different.
* */

interface Visitor {
    /*
    * The 'Visitor' interface declares a set of visiting methods that
    * correspond to 'Element' classes. The signature of a visiting
    * method allows the visitor to identify the exact class of the
    * component that it is dealing with.
    * */

    fun visitResidentialBuilding(residentialBuilding: ResidentialBuilding)
    fun visitBank(bank: Bank)
    fun visitCoffeeShop(coffeeShop: CoffeeShop)
}