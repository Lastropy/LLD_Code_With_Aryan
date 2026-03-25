package LLD_CWA.Patterns.Strategy_Pattern.PaymentStrategy;

public class StripePayment implements PaymentStrategy {
    public void processPayment() {
        System.out.println("Processing Stripe Payment");
    }
}
