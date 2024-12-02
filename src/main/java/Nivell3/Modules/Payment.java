package Nivell3.Modules;

public class Payment implements Callback{

    private PaymentMethod method;
    private double price;


    public Payment(PaymentMethod method, double price) {
        this.method = method;
        this.price = price;
    }

    public void pay() {
        boolean statusPay = (Math.random() < 0.5);
        this.resumePayment(statusPay, this.method, this.price);
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
