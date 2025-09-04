package LLD_CWA.Command_Pattern;

public class TurnOffCommand implements ICommand{
    TV tv;
    TurnOffCommand(TV tv){
        this.tv = tv;
    }
    public void execute(){
        tv.turnOff();
    }
}
