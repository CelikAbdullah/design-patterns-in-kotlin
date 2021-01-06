package behavioraldesignpattern.command

/*
* Receiver
* The 'Receiver' class contains some business logic. Almost any object
* may act as a 'Receiver'. Most 'Commands' only handle the details of how
* a request is passed to the 'Receiver', while the 'Receiver' itself does
* the actual work.
*
* */
class Cook {

    // some helper functions - could be more ... :)
    private fun lookAtRecipe(meal:String) = println("First, I should take a look at the right recipe for $meal")
    private fun prepareIngredients(meal:String) = println("Then, I have to prepare the ingredients for $meal")
    private fun startCooking() = println("Now, let's go!")

    // method that will be called by a 'Concrete Command' object to execute the order/command
    fun cookMeal(meal:String){
        lookAtRecipe(meal)
        prepareIngredients(meal)
        startCooking()
    }

}