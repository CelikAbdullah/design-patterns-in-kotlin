package structuraldesignpattern.proxy

/*
* Service
*
* The 'Service' is a class that provides some useful business logic.
* */
class Service: ServiceInterface {

    // some dummy code for handling the request - could be more complex
    override fun request() = println("I am the real service. I am handling the request.")

}