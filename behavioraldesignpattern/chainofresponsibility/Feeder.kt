package behavioraldesignpattern.chainofresponsibility

/*
* Handler
*
* The 'Handler' declares the interface, common for all concrete
* 'Handlers'. It usually contains just a single method for handling
* requests, but sometimes it may also have another method for setting
* the next 'Handler' on the chain.
* 'Handlers' are usually self-contained and immutable, accepting all
* necessary data just once via the constructor.
*
* In our case: a Feeder is someone who feeds an animal.
* For example: a MonkeyFeeder is feeding a monkey when the food (request) is a banana, etc.
* */

interface Feeder {
    fun handle(food:String)
}