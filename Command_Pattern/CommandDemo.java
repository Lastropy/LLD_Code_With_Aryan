package LLD_CWA.Command_Pattern;

public class CommandDemo {
    public static void main(String[] args) {
        TV tv = new TV();
        ICommand onCommand = new TurnOnCommand(tv);
        ICommand offCommand = new TurnOffCommand(tv);
        Remote remote = new Remote();

        remote.setOnCommand(onCommand);
        remote.setOffCommand(offCommand);

        remote.pressOnButton();
        remote.pressOffButton();
    }
}
