package structuraldesignpattern.decorator

/*
* Client
*
* The 'Client' can wrap 'Components' in multiple layers of 'Decorators',
* as long as it works with all objects via the 'Component' interface.
* */
class Client {
    companion object{
        @JvmStatic
        fun main(args:Array<String>){
            /*
            * The 'Client' code works with all objects using the 'Component' interface.
            * This way it can stay independent of the concrete classes of 'Components'
            * it works with.
            * */


            // the 'Client' code can support both simple 'Components' ...
            val michael: Component = MalePerson(37.0f)
            println("Body temperature without any clothing is ${michael.bodyTemperature()}°C")

            // ... as well as decorated ones.
            val sweater: Component = Sweater(michael)
            println("Body temperature after wearing a sweater is ${sweater.bodyTemperature()}°C")

            // Note how 'Decorators' can wrap not only simple 'Components' but the other 'Decorators' as
            // well.
            val jacket: Component = Jacket(sweater)
            println("Body temperature after wearing a jacket on top of sweater is ${jacket.bodyTemperature()}°C")
        }
    }
}