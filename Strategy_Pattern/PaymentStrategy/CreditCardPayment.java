package LLD_CWA.Strategy_Pattern.PaymentStrategy;

public class CreditCardPayment implements PaymentStrategy{
    public void processPayment(){
        System.out.println("Processing Credit Card Payment");
    }
}
