package creationaldesignpattern.factorymethod

/*
* Just a class that puts all pieces together.
* */
class Client {
    companion object{
        @JvmStatic
        fun main(args:Array<String>){
            val roadLogistics : Logistics = RoadLogistics()
            roadLogistics.planDelivery()

            val seaLogistics:Logistics = SeaLogistics()
            seaLogistics.planDelivery()
        }
    }
}