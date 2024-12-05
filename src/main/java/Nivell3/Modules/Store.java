package Nivell3.Modules;

public class Store implements Callback{

    PaymentGateway paymentGateway = new PaymentGateway(this);

    public void callValidatePayment(Payment payment){
        paymentGateway.pay(payment.getMethod(), payment.getPrice());
    }

    @Override
    public void resumePayment(boolean statusPayment, Enum typePayment, double price) {
        if (statusPayment) {
            System.out.println("Payment Success\n[" + typePayment + "    " + price + "€]");
        } else {
            System.out.println("Payment cancelled");
        }
    }
}
