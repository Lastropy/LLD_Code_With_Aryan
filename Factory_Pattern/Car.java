package LLD_CWA.Factory_Pattern;

public class Car implements Vehicle{
    @Override
    public void start() {
        System.out.println("Started car");
    }

    @Override
    public void stop() {
        System.out.println("Stopped car");
    }

    @Override
    public double getMilege() {
        return 34;
    }
}
