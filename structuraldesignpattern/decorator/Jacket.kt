package structuraldesignpattern.decorator

/*
* Concrete Decorator
*
* A 'Concrete Decorator' defines extra behaviors that can be added to
* 'Components' dynamically. 'Concrete Decorators' override methods of
* the 'Base Decorator' and execute their behavior either before or
* after calling the parent method.
* */
class Jacket(private val wrappee:Component): Clothing(wrappee) {

    override fun bodyTemperature(): Float = super.bodyTemperature() + providedWarmth()

    // extra method
    private fun providedWarmth():Float = 0.4f
}