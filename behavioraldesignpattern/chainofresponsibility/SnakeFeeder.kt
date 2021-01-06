package behavioraldesignpattern.chainofresponsibility

/*
* Concrete Handler
* A 'Concrete Handler' contains the actual code for processing requests.
* Upon receiving a request, each 'Handler' must decide whether to process
* it and whether to pass it along the chain.
* */
class SnakeFeeder: BaseFeeder() {
    override fun handle(food: String) {
        when(food){
            // tries to handle the request
            "Chicken" -> println("As a feeder of snakes, I will take the $food passed along the chain.")
            "Hamster" -> println("As a feeder of snakes, I will take the $food passed along the chain.")
            "Mice pups" -> println("As a feeder of snakes, I will take the $food passed along the chain.")

            // if it can't, pass it to the next 'Handler' in the chain (when it exists, of course)
            else -> super.handle(food)
        }

    }
}