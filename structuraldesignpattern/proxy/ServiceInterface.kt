package structuraldesignpattern.proxy

/*
* Service Interface
*
* The 'Service Interface' declares the interface of the 'Service'.
* The 'Proxy' must follow this interface to be able to disguise itself
* as a 'Service' object.
* */
interface ServiceInterface {
    fun request()
}