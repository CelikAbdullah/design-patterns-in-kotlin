package structuraldesignpattern.facade

/*
* Facade
*
* The 'Facade' provides convenient access to a particular part
* of the subsystem's functionality. It knows where to direct
* the client's request and how to operate all the moving parts
* */
class Operator {

    // e.g.: this facade can is linked to the subsystem WareHouse, Packaging and Delivery
    //       and can therefore execute operations provided by them
    private val wareHouse = WareHouseSubsystem()
    private val packaging = PackagingSubsystem()
    private val delivery = DeliverySubsystem()


    // there might be another facade object that the the operator might use
    // to execute operations of different subsystems
    val anotherOperator = AnotherOperator()


    // the client only knows this method
    // under the hood, the methods storing(), packaging(),
    // delivery() paymentProcessing() and supply() are invoked
    fun operation(){
        wareHouse.storing()
        packaging.packaging()

        // use another facade - prevents polluting this facade with unrelated
        // features
        anotherOperator.anotherOperation()

        delivery.delivery()
    }
}