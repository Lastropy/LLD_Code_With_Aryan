package LLD_CWA.Command_Pattern;

public class Remote {
    ICommand onCommand, offCommand;
    void setOnCommand(ICommand command){
        onCommand = command;
    }

    void setOffCommand(ICommand command){
        offCommand = command;
    }

    void pressOnButton(){
        onCommand.execute();
    }

    void pressOffButton(){
        offCommand.execute();
    }
}
