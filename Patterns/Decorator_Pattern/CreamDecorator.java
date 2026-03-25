package LLD_CWA.Patterns.Decorator_Pattern;

public class CreamDecorator implements ICoffee {
    String description = "Extra Cream";
    ICoffee baseCoffee;

    CreamDecorator(ICoffee b) {
        this.baseCoffee = b;
    }

    @Override
    public String getDescription() {
        return this.description;
    }

    @Override
    public double getCost() {
        return 2.03 + this.baseCoffee.getCost();
    }
}
