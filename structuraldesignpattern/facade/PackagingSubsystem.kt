package structuraldesignpattern.facade

/*
* One part of the 'Complex Subsystem'
*
* The 'Complex Subsystem' consists of dozens of various objects
* To make them all do something meaningful, you have to dive deep
* into the subsystem's implementation details, such as initializing
* objects in the correct order and supplying them with data in the
* proper format.
*
* Subsystem classes are not aware of the facade's existence. They
* operate within the same and work with each other directly.
* */

class PackagingSubsystem {
    fun packaging() = println("Just doing some packaging.")
}