package structuraldesignpattern.bridge

/*
* Client
* Usually, the 'Client' is only interested in working with the 'Abstraction'.
* However, it's the job of the 'Client' to link the 'Abstraction' object with
* one of the 'Implementation' objects.
* */
class Client {

    companion object{
        @JvmStatic
        fun main(args:Array<String>){

            val winterSeason : HolidaySeason = WinterSeason()
            val winterBackPacker: Passenger = BackPacker(winterSeason)

            winterBackPacker.apply {
                chooseHolidayLocation()
                planHoliday()
                prepareForSeason()
            }
            println("----------------------------------------------------------")

            val summerSeason: HolidaySeason = SummerSeason()
            val summerBackPacker: Passenger = BackPacker(summerSeason)

            summerBackPacker.apply {
                chooseHolidayLocation()
                planHoliday()
                prepareForSeason()
            }
        }
    }

}