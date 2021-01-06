package structuraldesignpattern.decorator

/*
* Concrete Decorator
*
* A 'Concrete Decorator' defines extra behaviors that can be added to
* 'Components' dynamically. 'Concrete Decorators' override methods of
* the 'Base Decorator' and execute their behavior either before or
* after calling the parent method.
* */
class Sweater(private val wrappee: Component): Clothing(wrappee) {

    override fun bodyTemperature(): Float =
        /*
        * 'Concrete Decorators' call the wrapped 'Component' and alter its result in some way.
        * They may call parent implementation of the operation, instead of calling the
        * wrapped 'Component' directly. This approach simplifies extension of decorator
        * classes.
        * Concretely, 'Concrete Decorators' can execute their behavior either before or after
        * the call to a wrapped 'Component'
        * */
        super.bodyTemperature() + providedWarmth()


    // extra method
    private fun providedWarmth():Float = 0.1f

}