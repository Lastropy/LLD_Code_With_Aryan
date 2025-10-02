package LLD_CWA.Memento_Pattern;

public class TextEditor {
    private String text;
    void setText(String txt){
        this.text = txt;
    }

    String getText(){
        return this.text;
    }

    public Memento save(){
        return new Memento(this.text);
    }

    public void restore(Memento m){
        this.text = m.getText();
    }
}
