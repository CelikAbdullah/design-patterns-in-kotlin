package structuraldesignpattern.decorator

/*
* Concrete Component
*
* A 'Concrete Component' is a class of objects being wrapped.
* It defines the basic behavior which can be altered by
* decorators.
* */
class MalePerson(val bodyTemperature: Float) : Component {

    /*
    * 'Concrete Components' provide default implementations of
    * the operations defined in the 'Component' interface.
    * There might be several variations of these classes.
    *
    * For the sake of simplicity, we just return the
    * bodyTemperature field's value.
    * */
    override fun bodyTemperature():Float = bodyTemperature
}