package structuraldesignpattern.proxy

import java.time.LocalDateTime

/*
* Proxy
*
* The 'Proxy' class has a reference field that points to a
* 'Service' object. After the 'Proxy' finishes its processing
* ( e.g. lazy initialization, logging, access control, caching, etc.),
* it passes the request to the service object. Usually, proxies manage
* the full lifecycle of their service objects.
* */
class Proxy(private val service: ServiceInterface): ServiceInterface {


    override fun request() {
        // check access
        if(checkAccess()){
            // delegate the request to the real service object
            service.request()
            // after handling the request, perform some work like logging
            // (note: this could be done before executing the request)
            loggingAccess()
        }
    }

    // some dummy code to check access -  could be more complex of course :-)
    private fun checkAccess(): Boolean{
        println("I am the Proxy. I am checking access prior to executing a real request.")
        return true
    }

    // some dummy code to log access - could also be more complex of course :-)
    private fun loggingAccess() {
        println("I am the Proxy. I am logging the time of the request: ${LocalDateTime.now()}")
        println("------------------------------------------------------------")
    }
}