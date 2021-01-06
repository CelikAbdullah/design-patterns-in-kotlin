package behavioraldesignpattern.visitor

/*
* Concrete Element
*
* Each 'Concrete Element' must implement the acceptance method.
* The purpose of this method is to redirect the call to the proper
* method of the 'Visitor' corresponding to the current 'Element'
* class.
* Be aware that even if a base 'Element' class implements this
* method, all subclasses must still override this method in their
* own classes and call the appropriate method on the 'Visitor'
* object.
*
* */

class Bank : Element {
    override fun accept(visitor: Visitor) =
        // redirect the accept() call to 'visitBank()' method
        visitor.visitBank(this)


    // method that is going to be called by the 'Concrete Visitor'
    // when it 'visits' a Bank element
    fun negotiateTheftInsurance() =
        println("As a bank, we are negotiating with the insurance agent.")

}