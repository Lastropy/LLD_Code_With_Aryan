package LLD_CWA.Strategy_Pattern;

import LLD_CWA.Strategy_Pattern.PaymentStrategy.PaymentStrategy;

public class PaymentProcessor {
    private PaymentStrategy paymentStrategy;
    PaymentProcessor(PaymentStrategy paymentStrategy){
        this.paymentStrategy = paymentStrategy;
    }

    void pay(){
        paymentStrategy.processPayment();
    }
}
