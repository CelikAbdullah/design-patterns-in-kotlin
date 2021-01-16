package creationaldesignpattern.prototype

/*
* Prototype Interface
*
* The 'Prototype Interface' declares the cloning methods.
* In most cases, it's a single clone() method.
* */
abstract class Ball {
    abstract var color:String?

    // clone method
    abstract fun clone(): Ball
}