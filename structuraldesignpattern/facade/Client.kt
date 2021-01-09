package structuraldesignpattern.facade

/*
* Client
*
* The 'Client' uses the 'Facade' instead of calling the subsystem
* objects directly.
* */
class Client {

    companion object{
        @JvmStatic
        fun main(args:Array<String>){

            // the client talks only to the facade object
            val operator = Operator()
            operator.operation()
        }
    }
}