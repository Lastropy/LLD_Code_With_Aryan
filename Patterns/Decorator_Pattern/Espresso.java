package LLD_CWA.Patterns.Decorator_Pattern;

public class Espresso implements ICoffee {
    String description = "A steaming cup of Espresso";

    @Override
    public String getDescription() {
        return this.description;
    }

    @Override
    public double getCost() {
        return 4.35;
    }
}
