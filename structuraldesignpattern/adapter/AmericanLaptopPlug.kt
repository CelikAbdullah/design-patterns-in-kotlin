package structuraldesignpattern.adapter

/*
* Service/Adaptee
* The 'Service' is some useful class (usually 3rd-party or legacy).
* The 'Client' can not use this class directly because it has an
* incompatible interface.
*
* In a real-word application, this might a library to which we do not have access.
* We have to accept this interface as it is and its interface is different than
* the client's interface. So, this would be the code part we COULD not change.
* */
class AmericanLaptopPlug {
    fun chargeAmericanLaptops() =
        println("I charge american-style laptops because I can only fit in american sockets.")
}