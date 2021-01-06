package structuraldesignpattern.composite

/*
* Composite/Container
*
* The 'Composite/Container' is an element that has sub-elements:
* leaves or other containers. A 'Composite/Container' does not know
* the concrete classes of its children. It works with all sub-elements
* only via the 'Component' interface.
* Upon receiving a request, a 'Composite/Container' delegates the work
* to its sub-elements, processes intermediate results and then returns
* the final result to the 'Client'.
* */
class ArmyComposite(private val name: String) : ArmyComponent() {

    private val armyComponents = mutableListOf<ArmyComponent>()

    override fun add(ac: ArmyComponent) = armyComponents.add(ac)
    override fun remove(ac: ArmyComponent) = armyComponents.remove(ac)

    /*
    * The Composite executes its primary logic in a particular way. It
    * traverses recursively through all its children, collecting and summing
    * their results. Since the composite's children pass these calls to their
    * children and so forth, the whole object tree is traversed as a result.
    * */
    override fun executeOrder() {
        println("The $name has set the goal for the next mission.")
        for (comp in armyComponents){
            comp.executeOrder()
        }
    }
}