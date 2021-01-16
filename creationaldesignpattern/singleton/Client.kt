package creationaldesignpattern.singleton

/*
* Client
*
* The 'Client' can only create the 'Singleton' instance via the creation method since
* the constructor of 'Government' is private.
* */
class Client {
    companion object{
        @JvmStatic
        fun main(args:Array<String>){

            //val government = Government()  <--- this is not possible because of private constructor
            var government = Government.getGovernmentOf("Germany")
            println("This is the government of ${government.country} ")

            println("--------------------------------------------------------------------")

            println(government)       // <--- for demonstration purposes: this output and ...
            government = Government.getGovernmentOf("France")
            println(government)      // <---- ... the output of this should be the same showing that the returned 'Government' instance is the same

            println("--------------------------------------------------------------------")
            println("This is the government of ${government.country} ")   // we can also not change the government; it is still the the government of Germany
        }
    }
}