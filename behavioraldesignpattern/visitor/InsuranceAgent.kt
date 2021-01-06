package behavioraldesignpattern.visitor

/*
* Concrete Visitor
*
* Each 'Concrete Visitor' implements several versions of the same
* behaviors, tailored for different 'Concrete Element' classes.
*
* */

class InsuranceAgent : Visitor {

    // when accept() is called on a ResidentialBuilding object, then this method will be invoked
    override fun visitResidentialBuilding(residentialBuilding: ResidentialBuilding) {
        println("As an insurance agent, I want to sell medical insurance to the residential building.")
        residentialBuilding.negotiateMedicalInsurance()
    }

    // when accept() is called on a Bank object, then this method will be invoked
    override fun visitBank(bank: Bank) {
        println("As an insurance agent, I want to sell medical insurance to the bank.")
        bank.negotiateTheftInsurance()
    }

    // when accept() is called on a CoffeeShop object, then this method will be invoked
    override fun visitCoffeeShop(coffeeShop: CoffeeShop) {
        println("As an insurance agent, I want to sell fire and flood insurance to the coffee shop.")
        coffeeShop.negotiateFireAndFloodInsurance()
    }

}