package behavioraldesignpattern.state

class Client {

    companion object{
        @JvmStatic
        fun main(args:Array<String>){

            // create an instance of our Context class
            val passenger: Passenger = Passenger(0)

            passenger.apply {
                println("-----------Passenger's Current State: HasNoMoney-----------")
                buyTicket()       // how ? when Passenger has no money, he/she can not buy a ticket
                enjoyVacation()   // how ? when Passenger has no money, he/she can not buy a ticket
                earnMoney()       // so, we have to earn some money; this will change Passenger's state to 'Working'

                println("-----------Passenger's Current State: Working-----------")
                enjoyVacation()    // trying to enjoy vacation at work ? Nah, that won't work ...
                earnMoney()        // Instead, earn some money
                buyTicket()        // this will change Passenger's state to 'HasMoney'

                println("-----------Passenger's Current State: HasMoney-----------")
                earnMoney()        // why ? Passenger has already enough money
                buyTicket()        // now, Passenger can buy a ticket
                enjoyVacation()    // this will change Passenger's state to 'AtVacation'

                println("-----------Passenger's Current State: AtVacation-----------")
                earnMoney()        // why ? Passenger is at vacation
                buyTicket()        // why ? Passenger has already bought a ticket
                enjoyVacation()    // enjoy sun, buy some souvenirs and ... put Passenger's state into 'HasNoMoney' again
            }
        }
    }
}