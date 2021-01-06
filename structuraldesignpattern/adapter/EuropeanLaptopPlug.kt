package structuraldesignpattern.adapter

class EuropeanLaptopPlug : EuropeanLaptopPlugInterface {
    override fun chargeEuropeanLaptops() =
        println("I charge european-style laptops because I can only fit in european sockets.")
}