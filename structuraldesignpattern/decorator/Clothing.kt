package structuraldesignpattern.decorator

/*
* Base Decorator
*
* The 'Base Decorator' class has a field for referencing a wrapped object.
* The field's type should be declared as the 'Component' interface so it
* can contain both 'Concrete Components' and 'Concrete Decorators'.
* The 'Base Decorator' delegates all operations to the wrapped 'Component'.
*
* */
abstract class Clothing(private val wrappee: Component) : Component {

    /*
    * The 'Base Decorator' class follows the same interface as the other
    * 'Components'. The primary purpose of this class is to define the
    * wrapping interface for all 'Concrete Decorators'.
    * The default implementation of the wrapping code might include a
    * field for storing a wrapped 'Component' and the means to initialize
    * it.
    * */

    override fun bodyTemperature(): Float =
        // the 'Decorator' delegates all work to the wrapped 'Component'
        wrappee.bodyTemperature()
}