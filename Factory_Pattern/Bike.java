package LLD_CWA.Factory_Pattern;

public class Bike implements Vehicle{
    @Override
    public void start() {
        System.out.println("Started riding Bike");
    }

    @Override
    public void stop() {
        System.out.println("Stopped Bike");
    }

    @Override
    public double getMilege() {
        return 12;
    }
}
