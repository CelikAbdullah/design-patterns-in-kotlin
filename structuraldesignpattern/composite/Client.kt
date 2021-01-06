package structuraldesignpattern.composite

/*
* Client
*
* The 'Client' works with all elements through the 'Component'
* interface. As a result, the 'Client' can work in the same way
* with both simple (leaf) or complex elements (composite) of the
* tree.
* */
class Client {
    companion object{
        @JvmStatic
        fun main(args:Array<String>){

            /*
            * Setting up the army structure:
            * Here, our army consists of a division which has a brigade containing
            * of one platoon that a squad. Within the squad, we have soldiers as
            * basic elements.
            * ( The structure could be more complex but I decided to keep it simple )
            * */
            val division : ArmyComponent = ArmyComposite("Division 1")
            val brigade : ArmyComponent = ArmyComposite("Brigade 1")
            val platoon : ArmyComponent = ArmyComposite("Platoon 1")
            val squad : ArmyComponent = ArmyComposite("Squad 1")
            val soldier1 : ArmyComponent = Soldier("Michael")
            val soldier2 : ArmyComponent = Soldier("Tobias")
            val soldier3 : ArmyComponent = Soldier("Laura")
            val soldier4 : ArmyComponent = Soldier("Hannelore")

            squad.apply {
                add(soldier1)
                add(soldier2)
                add(soldier3)
                add(soldier4)
            }

            platoon.add(squad)
            brigade.add(platoon)
            division.add(brigade)

            // the client can deal with the whole tree-structure
            division.executeOrder()

            // the client can deal with a part of the tree-structure
            brigade.executeOrder()

            // the client can deal with one of the leaf elements
            soldier1.executeOrder()
        }
    }
}