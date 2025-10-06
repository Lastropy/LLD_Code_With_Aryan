package LLD_CWA.Decorator_Pattern;

public class MilkDecorator implements ICoffee{
    String description = "Extra Milk";
    ICoffee baseCoffee;

    MilkDecorator(ICoffee b){
        this.baseCoffee = b;
    }

    @Override
    public String getDescription() {
        return this.description;
    }

    @Override
    public double getCost() {
        return 1.02 + this.baseCoffee.getCost();
    }
}
