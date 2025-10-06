package LLD_CWA.Decorator_Pattern;

public class DecoratorDemo {
    public static void main(String[] args) {
        ICoffee coffee = new Cappuccino();
        coffee = new CreamDecorator(coffee);
        coffee = new MilkDecorator(coffee);

        System.out.println("Final Cost: "+ coffee.getCost());
    }
}
