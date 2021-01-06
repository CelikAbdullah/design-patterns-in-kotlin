package behavioraldesignpattern.memento

class Client {
    companion object{
        @JvmStatic
        fun main(args:Array<String>){

            // originator
            val editor = Editor()

            // caretaker
            val history = History(editor)

            println("User is typing the following text:")
            editor.userTypesText("I am a programmer.")       // type something - state of Editor changes

            println("User is saving written text.")
            history.addCurrentEditorStateToHistory()                           // save the change of the state

            println("User is typing the following text:")
            editor.userTypesText("I am a programmer that likes to learn new things.")    // type something - state of Editor changes

            println("User is saving written text.")
            history.addCurrentEditorStateToHistory()                                                       // save the change of the state

            println("User is typing the following text:")
            editor.userTypesText("I am programmer that likes to learn new things and try them out.")   // type something - state of Editor changes
            println("User is saving written text.")
            history.addCurrentEditorStateToHistory()                  // save the change of the state

            println("++++++++++++++++++++++ Printing all the history ++++++++++++++++++++++")
            history.printHistoryToUser()

            println("++++++++++++++++++++++ Undo typing ++++++++++++++++++++++")
            history.undo()
            history.undo()
        }
    }
}