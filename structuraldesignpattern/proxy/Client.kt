package structuraldesignpattern.proxy
/*
* Client
*
* The 'Client' should work with both services and proxies
* via the same interface. This way you can pass a proxy into
* any code that expects a service object.
* */
class Client {
    companion object{
        @JvmStatic
        fun main(args: Array<String>){

            // creating the service
            val service: ServiceInterface = Service()

            // creating the proxy
            val proxy: ServiceInterface = Proxy(service)

            // executing a couple requests
            proxy.apply {
                request()
                request()
                request()
                request()
            }
        }
    }
}