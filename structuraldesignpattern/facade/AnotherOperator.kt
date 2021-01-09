package structuraldesignpattern.facade

/*
* Additional Facade
*
* An 'Additional Facade' class can be created to prevent polluting
* a single facade with unrelated features that might make it yet
* another complex structure. Additional facades can be used by both
* clients and other facades.
* */
class AnotherOperator {

    // e.g.: this facade can is linked to the subsystems PaymentProcessing and Suppliers
    //       and can therefore execute operations provided by them
    private val paymentProcessing = PaymentProcessingSubsystem()
    private val suppliers = SuppliersSubsystem()

    // the client only knows this method
    // under the hood, the methods paymentProcessing() and supply() are invoked
    fun anotherOperation(){
        paymentProcessing.paymentProcessing()
        suppliers.supply()
    }
}