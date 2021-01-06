package structuraldesignpattern.composite

/*
* Leaf
*
* The 'Leaf is a basic element of a tree that does not have
* sub-elements. Usually, 'Leaf' components end up doing most
* of the real work, since they do not have anyone to delegate
* the work to.
* */
class Soldier(private val name: String) : ArmyComponent() {
    override fun executeOrder() = println("I am $name. I have to execute the mission.")
}