package behavioraldesignpattern.memento

import java.time.LocalDateTime
import java.time.format.DateTimeFormatter
import java.time.format.FormatStyle

/*
* Originator
*
* The 'Originator' class can produce snapshots of its own state, as
* well as restore its state from snapshots when needed.
* */
class Editor() {

    private var text : String = ""

    fun userTypesText(newText: String){
        text = newText
    }

    // saves the current text (state) inside a memento
    fun userSavesText() = Snapshot(text)

    // restores the originators state from a memento object
    fun userRestoresText(memento: Editor.Snapshot){
        text = memento.text
    }

    /*
    * Concrete Memento
    *
    * The 'Concrete Memento' is a value object that acts as a snapshot of the
    * originator's state.
    * It is a common practice to make the memento immutable and pass it the data
    * only once via the constructor.
    * In this implementation, the 'Memento' class is nested inside the 'Originator'.
    * This lets the 'Originator' access the fields and methods of the 'Memento',
    * even though they re declared private. On the other hand, the 'Caretaker'
    * has very limited access to the fields and methods of 'Memento' which lets
    * it store mementos in a stack but not tamper with their state.
    * * */
    class Snapshot(_text: String) {
        private val data : String = LocalDateTime.now().format(DateTimeFormatter.ofLocalizedDateTime(FormatStyle.LONG, FormatStyle.SHORT))

        var text: String = _text
            private set             // does not allow setting outside the class

        fun nameOfText(): String = "$data / $text"
    }
}