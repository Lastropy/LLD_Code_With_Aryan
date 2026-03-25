package LLD_CWA.Patterns.Strategy_Pattern;

import LLD_CWA.Patterns.Strategy_Pattern.PaymentStrategy.PaymentStrategy;

public class PaymentProcessor {
    private PaymentStrategy paymentStrategy;

    PaymentProcessor(PaymentStrategy paymentStrategy) {
        this.paymentStrategy = paymentStrategy;
    }

    void pay() {
        paymentStrategy.processPayment();
    }
}
