package LLD_CWA.Decorator_Pattern;

public class Cappuccino implements ICoffee{
    String description = "A fresh cup pf Cappuccino";

    @Override
    public String getDescription() {
        return this.description;
    }

    @Override
    public double getCost() {
        return 3.92;
    }
}
