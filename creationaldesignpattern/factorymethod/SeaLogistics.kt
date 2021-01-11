package creationaldesignpattern.factorymethod

/*
* Concrete Creator
*
* A 'Concrete Creator' overrides the base factory method so it returns
* a different type of product.
* */
class SeaLogistics : Logistics() {
    /*
    * Note that the factory method does not have to
    * create new instances all the time. It can also return
    * existing objects from a cache, pool etc.
    * */
    override fun createTransport(): Transport = Ship()
}