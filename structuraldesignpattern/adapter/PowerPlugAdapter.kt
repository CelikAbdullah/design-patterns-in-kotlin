package structuraldesignpattern.adapter

/*
* The 'Adapter' is a class that is able to work with both the 'Client'
* and the 'Service/Adaptee':
* It implements the 'Client Interface', while wrapping the 'Service/Adaptee'
* object. The 'Adapter' receives calls from the 'Client' via the 'Adapter'
* interface and translates them into calls to the wrapped 'Service' object in
* a format it can understand.
*
* In a real-world application, when we are faced with a code base that we do not
* WANT to change (client) and a code base that we CANNOT change (service/adaptee)
* then we have to create an adapter as a middleman.
* The adapter would implement the interface we do not WANT to change ( client's interface )
* by using the interface of the code that we CANNOT change ( adaptee's interface ) .
* */

class PowerPlugAdapter(
    // accepts the 'Service/Adaptee'
    private val adaptee: AmericanLaptopPlug
    ): EuropeanLaptopPlugInterface {  // implements the client's interface

    // the interface is the same as the client's interface but under the hood the adaptee's interface will be used
    override fun chargeEuropeanLaptops() =
        // the 'Client' might believe that it calls chargeEuropeanLaptops() but in reality:
        // it calls chargeAmericanLaptops()
        adaptee.chargeAmericanLaptops()

}