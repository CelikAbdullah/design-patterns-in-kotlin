package creationaldesignpattern.singleton

/*
* Singleton
*
* The 'Singleton' class declares the static method
* 'getGovernmentOf()' that returns the same instance
* of its own class. The Singleton's constructor should
* be hidden from the client code. Calling the creation
* method should be the only way of getting the 'Singleton'
* object.
*
* NOTE: In Kotlin, you can use the keyword 'object' to
*       turn a class into a 'Singleton' class.
*       So, here: just typing 'object Government { ... }
*       would lead to the same result.
*
* But I wanted to show you the idea of a Singleton class which
* is very simple. We only have to consider two things:
*     1.) the class has to have a private constructor
*     2.) we have a static creation method that acts as
*         a constructor. Under the hood, this method calls
*         the private constructor to create an object and saves
*         it in a static field. All following calls to this
*         method return the cached object.
*
* */
class Government private constructor(val country: String) {

    companion object {
        // static field
        private var government: Government? = null

        // creation method
        fun getGovernmentOf(country: String): Government {

            // under the hood:
            if(government==null){
                // call the private constructor
                government = Government(country)
            }
            // and return static field
            return government as Government
        }
    }
}