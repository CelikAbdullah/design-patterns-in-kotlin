package structuraldesignpattern.flyweight

/*
* Context
*
* The 'Context' class contains the extrinsic state, unique across
* all original objects. When a 'Context' is paired with one of the
* 'Flyweight' objects, it represents the full state of the original
* object.
* */
class Player(private val xCoord:Int,
             private val yCoord:Int,
             private val playerType:PlayerType) {

    fun move() = playerType.move(xCoord, yCoord)
}