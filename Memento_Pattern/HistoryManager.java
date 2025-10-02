package LLD_CWA.Memento_Pattern;

import java.util.Stack;

public class HistoryManager {
    private final Stack<Memento> history = new Stack<>();
    private final Stack<Memento> redoStack = new Stack<>();

    public void saveState(Memento m){
        history.push(m);
        redoStack.clear();
    }

    public Memento currentState(){
        return history.peek();
    }

    public Memento undo(Memento currentState){
        if(!history.empty()){
            redoStack.push(currentState);
            return history.pop();
        }
        return null;
    }

    public Memento redo(Memento currentState){
        if(!redoStack.empty()){
            history.push(currentState);
            return redoStack.pop();
        }
        return null;
    }
}
