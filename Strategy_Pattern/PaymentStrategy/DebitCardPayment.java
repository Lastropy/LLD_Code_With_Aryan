package LLD_CWA.Strategy_Pattern.PaymentStrategy;

public class DebitCardPayment implements PaymentStrategy{
    public void processPayment(){
        System.out.println("Processing Debit Card Payment");
    }
}
