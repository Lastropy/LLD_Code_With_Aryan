package LLD_CWA.Builder_Pattern;

public class BuilderDemo {
    public static void main(String[] args){
        CarBuilder cb = new CarBuilder();
        Car c = cb.setName("Mustang").setCost(23924422.01).setAutomatic(true).build();
        c.printSpecs();
    }
}
