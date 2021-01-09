package structuraldesignpattern.flyweight

/*
* Flyweight
*
* The 'Flyweight' class contains the portion of the original object's state
* that can be shared between multiple objects. The same 'Flyweight' object
* can be used in many different contexts.
* The state stored inside a 'Flyweight' is called "intrinsic".
* The state passed to the methods of the 'Flyweight' is called "extrinsic".
*
* In our case below, name & color are 'intrinsic' and xCoord & yCoord are 'extrinsic'.
* */
class PlayerType(private val name: String,
                 private val color:String) {

    /*
    * Usually, the behavior of the original object remains in the flyweight
    * class. In this case, whoever calls a flyweight's method must also
    * pass the appropriate bits of the extrinsic state into the method's
    * parameters.
    * On the other hand, the behavior can be moved to the 'Context' class
    * which would use the linked flyweight merely as a data object.
    * */
    fun move(xCoord:Int, yCoord: Int) =
        println("Player $name with playing color $color" +
                " is moving to: $xCoord and $yCoord")
}