package Nivell3.Modules;

public class Payment {

    private PaymentMethod method;
    private double price;

    public Payment(PaymentMethod method, double price) {
        this.method = method;
        this.price = price;
    }

    public PaymentMethod getMethod() {
        return method;
    }

    public double getPrice() {
        return price;
    }
}
