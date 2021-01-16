package creationaldesignpattern.prototype

/*
* Concrete Prototype
*
* The 'Concrete Prototype' class implements the cloning method.
* In addition to copying the original object's data to the clone,
* this method may also handle some edge cases of the cloning
* process related to cloning linked objects, untangling
* recursive dependencies, etc.
* */
class GolfBall(override var color:String?=null, val ball: Ball?=null) : Ball() {

    init {
        color = ball?.color
    }

    override fun clone(): Ball = GolfBall(ball=this)
}