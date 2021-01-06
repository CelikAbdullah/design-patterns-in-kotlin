package behavioraldesignpattern.mediator

/*
* Base Component Class
*
* Contains the code that is common to all 'Component' objects.
* */
abstract class AirCraft {
    /*
    * 'Components' communicate with a 'Mediator' using the 'Mediator' interface (here: Tower).
    * Thanks to that, you can use the same 'Components' in other contexts by linking them
    * with different 'Mediator' objects.
    * */
    lateinit var mediator: Tower
}