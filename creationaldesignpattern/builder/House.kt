package creationaldesignpattern.builder

/*
* Product
*
* A 'Product' is a resulting object. Products constructed by
* different builders don't have to belong to the same class
* hierarchy or interface.
* */
class House {
    val buildingSteps = mutableListOf<String>()

    // used to add a step
    fun add(step:String) = buildingSteps.add(step)

    // used to print all steps made
    fun listSteps() {
        for(step in buildingSteps) println(step)
    }
}