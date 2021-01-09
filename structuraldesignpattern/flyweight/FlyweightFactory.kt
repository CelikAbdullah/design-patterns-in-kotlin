package structuraldesignpattern.flyweight

import java.util.HashMap

/*
* Flyweight Factory
*
* The 'Flyweight Factory' manages a pool of existing 'Flyweight' objects.
* With the factory, clients do not create 'Flyweights' instances directly.
* Instead, they call the factory, passing it bits of the intrinsic state
* of the desired 'Flyweight'.
* The factory looks over previously created 'Flyweight' instances and either
* returns an existing one that matches search criteria or creates a new one
* if nothing is found.
* */
class FlyweightFactory {

    // our pool of existing Flyweight instances
    private var playerTypes: MutableMap<String, PlayerType> = HashMap()

    // if 'Flyweight' with given name & color exists, then return it from the pool
    // otherwise, create a new one, put it into the pool and return it to caller
    fun getPlayerType(name: String, color: String): PlayerType {
        val key = createKey(name, color)

        var result = playerTypes[key]

        if (result == null) {
            println("Can not find a flyweight, creating a new one.")
            result = PlayerType(name, color)
            playerTypes[key] = result
        }
        return result
    }

    // used for demonstration purposes later in the 'Client' class to show that an existing Flyweight object
    // is re-used all the time
    fun informationAboutFlyweights(){
        println("Number of flyweights: ${playerTypes.count()}")
        println("These have the following keys: ")
        for(element in playerTypes){
            println(element.key)
        }
    }

    // just a helper method to create keys for a lookup within the hashtable
    private fun createKey(name: String, color:String): String = name + "_" +  color
}