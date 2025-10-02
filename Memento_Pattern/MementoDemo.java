package LLD_CWA.Memento_Pattern;

import java.util.Objects;

public class MementoDemo {
    public static void main(String[] args) {
        TextEditor notepad = new TextEditor();
        HistoryManager history = new HistoryManager();

        for (int i = 0; i < 5; i++) {
            if(!Objects.equals(notepad.getText(), "")){
                Memento snapshot = notepad.save();
                history.saveState(snapshot);
            }
            notepad.setText("Hello " + i);
            System.out.println("Current text: "+notepad.getText());
        }

        // Undo 1 time -> Hello 3
        Memento currentState = notepad.save();
        Memento previousState = history.undo(currentState);  // Undo step
        notepad.restore(previousState);
        System.out.println("Current text after Undo: "+notepad.getText());

        // Undo 1 time -> Hello 2
        currentState = notepad.save();
        previousState = history.undo(currentState);  // Undo step
        notepad.restore(previousState);
        System.out.println("Current text after Undo: "+notepad.getText());

        // Redo 1 time -> Hello 3
        currentState = notepad.save();
        Memento redoState = history.redo(currentState);  // Undo step
        notepad.restore(redoState);
        System.out.println("Current text after Redo: "+notepad.getText());
    }
}
