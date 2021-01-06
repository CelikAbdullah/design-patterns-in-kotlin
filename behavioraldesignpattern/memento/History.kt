package behavioraldesignpattern.memento

/*
* Caretaker
*
* The 'Caretaker' knows not only "when" and "why" to capture the
* originator's state, but also when the state should be
* restored.
* A 'Caretaker' can keep track of the originator's history by
* storing a stack of mementos. When the 'Originator' has to
* travel back in history, the 'Caretaker' fetches the topmost
* 'Memento' from the stack and passes it to the originator's
* restoration method.
*
* */

class History(private val editor:Editor) {
    /*
    * The Caretaker does not depend on the 'Concrete Memento' class.
    * Therefore, it does not have access to the state of the 'Originator'
    * which is stored inside the memento.
    *
    * It works with all mementos via the base 'Memento' interface.
    * */

    private val mementos = mutableListOf<Editor.Snapshot>()    // this could also be a Stack, Deque ...

    fun addCurrentEditorStateToHistory(){
        // ask editor to create a snapshot of its current state
        val snapshot = editor.userSavesText()
        // store that snapshot in data structure
        mementos.add(snapshot)

        //snapshot.text = "Modifying not possible"    <--- Recall: modifying the fields of the memento is not possible
    }

    fun undo(){
        // take last snapshot from data structure
        val memento = mementos.removeLastOrNull()   // Removes the last element from this mutable list and returns that removed element, or returns null if this list is empty.

        // if list is not empty
        memento?.let {
            println("Restoring text of Editor to ${memento.nameOfText()}")

            // ask editor to set its state to the state of the latest snapshot
            editor.userRestoresText(it)
        }
    }

    // a method to print all snapshots/mementos
    fun printHistoryToUser(){
        println("A list of save operations: ")
        for(memento in mementos){
            println(memento.nameOfText())
        }
    }
}