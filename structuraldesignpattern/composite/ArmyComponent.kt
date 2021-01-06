package structuraldesignpattern.composite

/*
* Component
*
* The 'Component' contains operations that are common to both
* simple (leaf) and complex elements (composite) of the tree.
*
* */
abstract class ArmyComponent {

    // gets overridden only by the 'Composite'
    open fun add(ac:ArmyComponent): Boolean{ return false}
    open fun remove(ac: ArmyComponent) : Boolean{return false}

    // gets overridden by 'Composite' and 'Leaf'
    abstract fun executeOrder()
}