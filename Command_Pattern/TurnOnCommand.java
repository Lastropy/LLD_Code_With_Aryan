package LLD_CWA.Command_Pattern;

public class TurnOnCommand implements ICommand{
    TV tv;
    TurnOnCommand(TV tv) {
        this.tv = tv;
    }
    public void execute(){
        tv.turnOn();
    }
}
