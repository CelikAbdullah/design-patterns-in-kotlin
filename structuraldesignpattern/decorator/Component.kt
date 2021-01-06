package structuraldesignpattern.decorator

/*
* Component
*
* The 'Component' declares the common interface for wrappers and
* wrapped objects.
* */
interface Component {
    /*
    * The 'Component' interface defines operations that can be
    * altered by decorators.
    * */
    fun bodyTemperature(): Float
}