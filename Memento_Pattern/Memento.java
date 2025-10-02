package LLD_CWA.Memento_Pattern;

public class Memento {
    private final String text;
    Memento(String txt){
        this.text = txt;
    }

    public String getText(){
        return this.text;
    }
}
