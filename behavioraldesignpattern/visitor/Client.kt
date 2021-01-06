package behavioraldesignpattern.visitor

/*
* Client
*
* The 'Client' usually represents a collection or some other
* complex object (for example, a 'Composite' tree).
* Usually, client's are not aware of all the 'Concrete Element'
* classes because they work with objects from that collection
* via some abstract interface.
* */
class Client {

    companion object {
        @JvmStatic
        fun main(args:Array<String>){
            /*
            * The 'Client' code can run 'Visitor' operations over any set of elements
            * without figuring out their concrete classes. The accept() operation
            * directs a call to the appropriate operation in the 'Visitor' object.
            * */

            // create the collection of 'Concrete Elements' that will be visited by a 'Concrete Visitor'
            val concreteElements = arrayOf(ResidentialBuilding(), Bank(), CoffeeShop())

            // create a visitor
            val insuranceAgent: Visitor = InsuranceAgent()

            // let the 'Visitor' visit the 'Concrete Visitor' objects
            for (concreteElement in concreteElements){
                concreteElement.accept(insuranceAgent)
            }
        }
    }
}