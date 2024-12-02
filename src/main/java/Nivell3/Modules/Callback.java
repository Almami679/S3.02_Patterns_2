package Nivell3.Modules;

public interface Callback {

    void resumePayment(boolean statusPayment, Enum typePayment, double price);
}
