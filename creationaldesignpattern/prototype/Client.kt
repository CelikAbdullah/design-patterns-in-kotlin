package creationaldesignpattern.prototype

/*
* Client
*
* The 'Client' can produce a copy of any object that follows the
* 'Prototype Interface'.
* */
class Client {
    companion object{

        @JvmStatic
        fun main(args:Array<String>){
            // create a golf ball
            val golfBall = GolfBall()
            golfBall.color = "white"
            println("original golfball color: ${golfBall.color}")

            // clone the golf ball
            val clonedGolfBall = golfBall.clone() as GolfBall
            println("cloned golfball color: ${clonedGolfBall.color}")

            // the same can be done for TennisBall; create a tennis ball
            val tennisBall = TennisBall()
            tennisBall.color = "yellow"
            println("original tennisball color: ${tennisBall.color}")

            // clone the tennis ball
            val clonedTennisBall = tennisBall.clone() as TennisBall
            println("cloned tennisball color: ${clonedTennisBall.color}")
        }
    }
}