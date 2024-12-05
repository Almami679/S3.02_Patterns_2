package Nivell3.Modules;

public class PaymentGateway {
    private final Callback callback; //se crea un objeto interfaz

    public PaymentGateway(Callback callback){
        this.callback = callback;
    }

    public void pay(Enum typePayment, double price) {
        boolean statusPayment = (Math.random() < 0.5);
        callback.resumePayment(statusPayment, typePayment, price);

    }
}
