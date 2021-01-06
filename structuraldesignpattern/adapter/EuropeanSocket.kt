package structuraldesignpattern.adapter

/*
* Client
* The 'Client' is a class that contains the existing business logic of the program.
* The 'Client' code does not get coupled to the concrete 'Adapter' class as long as
* it works with the 'Client' interface. Thanks to this, you can introduce new types
* of 'Adapters' into the program without breaking the existing 'Client' code.
* This can be useful when the interface of the 'Service' class gets changed or
* replaced. If that happens, you can just create a new 'Adapter' class without changing
* the 'Client' code.
*
* Usually, that is the code we do not want to change. Imagine a real-world application which
* contains a much larger code base. Changing the existing code base might cause a lot of
* bugs. So, we do not want change this.
* */

class EuropeanSocket {

    fun chargeEuropeanLaptops(plug: EuropeanLaptopPlugInterface){
        println("As an european socket I can only accept european-style plugs.")
        plug.chargeEuropeanLaptops()
    }

    companion object{
        @JvmStatic
        fun main(args:Array<String>){

            // the Client
            val europeanSocket = EuropeanSocket()

            val europeanLaptopPlug : EuropeanLaptopPlugInterface = EuropeanLaptopPlug()
            // the Client has the same interface as EuropeanLaptopPlug, so this call will be okay
            europeanSocket.chargeEuropeanLaptops(europeanLaptopPlug)     // this call is OK :)

            // this will be our Service/Adaptee; it has a different interface than the client
            val americanLaptopPlug = AmericanLaptopPlug()
            //europeanSocket.fitEuropeanPlugs(americanLaptopPlug)   // this call is not okay !!

            // therefore, we have to wrap 'americanLaptopPlug' into the 'Adapter' object
            // the 'Adapter' object implements the interface of the Client by using the
            // wrapped adaptee's incompatible interface under the hood
            val powerPlugAdapter: EuropeanLaptopPlugInterface = PowerPlugAdapter(americanLaptopPlug)
            europeanSocket.chargeEuropeanLaptops(powerPlugAdapter)    // this call is now okay :=)
        }
    }

}