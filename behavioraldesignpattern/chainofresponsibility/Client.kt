package behavioraldesignpattern.chainofresponsibility

/*
* Client
*
* The 'Client' may compose chains just once or compose them dynamically,
* depending on the application's logic. Note that a request can be sent to
* any 'Handler' in the chain - it does not have to be the first one.
* */
class Client {
    companion object{
        @JvmStatic
        fun main(args: Array<String>){

            // create the 'Concrete Handlers'
            val monkeyFeeder: BaseFeeder = MonkeyFeeder()
            val snakeFeeder: BaseFeeder = SnakeFeeder()
            val tigerFeeder: BaseFeeder = TigerFeeder()

            // set the chain : MonkeyFeeder -> SnakeFeeder -> TigerFeeder
            monkeyFeeder.nextFeeder = snakeFeeder
            snakeFeeder.nextFeeder = tigerFeeder

            // a bunch of foods for the animals to eat
            val foods = listOf("Chicken", "Meat", "Banana", "Carrot" , "Meat", "Mice pups","Grape" , "Meat", "Carrot", "Chicken", "Hamster", "Mice pups", "Meat")

            // start at the beginning of the chain
            for (food in foods){
                monkeyFeeder.handle(food)
            }


            println("----------------------------------------------------------")
            println("All monkeys are dead. MonkeyFeeder has no job to do. ")

            // but we don't have to start at the beginning
            for(food in foods) {
                snakeFeeder.handle(food)
            }
        }
    }
}