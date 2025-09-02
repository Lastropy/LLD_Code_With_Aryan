package LLD_CWA.Strategy_Pattern;

import LLD_CWA.Strategy_Pattern.PaymentStrategy.CreditCardPayment;
import LLD_CWA.Strategy_Pattern.PaymentStrategy.DebitCardPayment;
import LLD_CWA.Strategy_Pattern.PaymentStrategy.PaymentStrategy;
import LLD_CWA.Strategy_Pattern.PaymentStrategy.StripePayment;

public class StrategyDemo {
    public static void main(String[] args) {
//        PaymentStrategy creditCardPaymentStrategy = new CreditCardPayment();
//        PaymentStrategy creditCardPaymentStrategy = new DebitCardPayment();
        PaymentStrategy stripePaymentStrategy = new StripePayment();
        PaymentProcessor processor = new PaymentProcessor(stripePaymentStrategy);
        processor.pay();
    }
}
